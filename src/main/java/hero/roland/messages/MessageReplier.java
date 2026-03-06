package hero.roland.messages;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import hero.roland.Main;
import hero.roland.data.GuildMember;
import hero.roland.formations.Formation;
import hero.roland.formations.FormationException;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.interactions.InteractionHook;
import net.dv8tion.jda.api.utils.FileUpload;

public abstract class MessageReplier {
    static public MessageEmbed getPolicyReply(User userToView) {
        GuildMember gm = Main.dataHandler().load(userToView.getIdLong());
        String igName = gm.igName() == null ? "In-game name not set" : "`" + gm.igName() + "`";
        String raidPolicy = gm.raidPolicy() == null ? "No raid policy set." : gm.raidPolicy();
        String descHeader = String.format("Viewing the raid policy of %s (%s)\n\n", userToView.getAsMention(), igName);

        MessageEmbed embed = new EmbedBuilder()
            .setTitle("Raid Policy")
            .setThumbnail(userToView.getEffectiveAvatarUrl())
            .setDescription(descHeader)
            .appendDescription(raidPolicy)
            .setColor(Color.CYAN)
            .build();
        return embed;
    }
    static public void viewPolicyReply(User userWhoInitiated, User userToView, InteractionHook hook) {
        MessageEmbed embed = getPolicyReply(userToView);
        var action = hook.editOriginalEmbeds(embed);
        if (userWhoInitiated.getIdLong() == userToView.getIdLong()) { // if viewing own policy
            Button editButton = Button.secondary("editpolicy:" + userToView.getIdLong(), "Edit");
            action.setComponents(ActionRow.of(editButton));
        }
        action.queue();
    }
    
    static public MessageEmbed getPaginatedMemberList(List<GuildMember> members, int page, String footerMessage) {
        int membersSize = members.size();
        if (members.isEmpty()) {
            MessageEmbed embed = new EmbedBuilder()
                .setDescription("```No Results to display!```")
                .setColor(Color.CYAN)
                .build();
            return embed;
        }
        int maxNumSize = String.valueOf(membersSize).length();
        StringBuilder desc = new StringBuilder("```py");
        for (int i = -2; i <= 2; i++) {
            desc.append("\n");
            int p = ((page + i) % membersSize + membersSize) % membersSize;
            int p1 = p + 1;
            String padding = " ".repeat(maxNumSize - String.valueOf(p1).length());
            GuildMember gm = members.get(p);
            String igName = gm.igName() == null ? "<@" + gm.id() + ">" : gm.igName();
            if (i == 0) desc.append(String.format(" >   %s%d. %s", padding, p1, igName));
            else desc.append(String.format("#    %s%d. %s", padding, p1, igName));
        }
        desc.append("```");
        MessageEmbed embed = new EmbedBuilder()
            .setDescription(desc.toString())
            .setFooter(footerMessage)
            .setColor(Color.CYAN)
            .build();
        return embed;
    }
    static public MessageEmbed noPoliciesEmbed() {
        return new EmbedBuilder()
            .setTitle("Raid Policy")
            .setDescription("It looks like there are no raid policies to show! Someone needs to use the `/view` command on themselves and set one first.")
            .setColor(Color.CYAN)
            .build();
    }

    static public EmbedBuilder formationEmbed(String data) {
        EmbedBuilder embed = new EmbedBuilder()
            .setTitle("Formation")
            .setFooter(data)
            .setImage("attachment://formation.png")
            .setColor(Color.CYAN);
        return embed;
    }
    static public void formationReply(InteractionHook interaction, String data, boolean isEnemy) {
        if (data == null) data = "";
        data = data.replaceAll(" ", "").toLowerCase();
        EmbedBuilder embed = formationEmbed(data);
        long userId = interaction.getInteraction().getUser().getIdLong();
        Button finishButton = Button.primary("finishformation:" + userId, "Finish");
        Button editButton = Button.secondary("editformation:" + userId + ":" + isEnemy, "Edit");
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            ImageIO.write(Formation.fromDataString(data).toImage(isEnemy), "png", os);
            interaction.editOriginalEmbeds(embed.build())
                .setAttachments(FileUpload.fromData(os.toByteArray(), "formation.png"))
                .setComponents(
                    ActionRow.of(
                        finishButton,
                        editButton,
                        Button.secondary("flipformation:" + userId + ":" + !isEnemy, "Flip")
                    )
                ).queue();
        } catch (IOException e) {
            interaction.editOriginalEmbeds(
                MessageReplier.formationEmbed(data).setDescription("An error occurred while generating the formation image. Please try again.")
                    .build()
            ).setComponents(ActionRow.of(finishButton, editButton))
            .queue();
        } catch (FormationException e) {
            interaction.editOriginalEmbeds(
                MessageReplier.formationEmbed(data).setDescription(e.getMessage())
                    .build()
            ).setComponents(ActionRow.of(finishButton, editButton))
            .queue();
        } 
    }
}
