package hero.roland.Events;

import java.awt.Color;
import java.util.List;

import hero.roland.GuildMember;
import hero.roland.Main;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.requests.restaction.interactions.MessageEditCallbackAction;
import net.dv8tion.jda.api.requests.restaction.interactions.ReplyCallbackAction;

public abstract class MessageReplier {
    static public MessageEmbed getPolicyReply(User userToView) {
        GuildMember gm = Main.dataHandler().load(userToView.getIdLong());
        String igName = gm.igName() == null ? "In-game name not set" : gm.igName();
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
    static public void viewPolicyReply(User userWhoInitiated, User userToView, MessageEditCallbackAction reply) {
        MessageEmbed embed = getPolicyReply(userToView);
        reply.setEmbeds(embed);
        if (userWhoInitiated.getIdLong() == userToView.getIdLong()) { // if viewing own policy
            Button editButton = Button.secondary("editpolicy:" + userToView.getIdLong(), "Edit");
            reply.setComponents(ActionRow.of(editButton));
        }
        reply.queue();
    }
    static public void viewPolicyReply(User userWhoInitiated, User userToView, ReplyCallbackAction reply) {
        MessageEmbed embed = getPolicyReply(userToView);
        reply.setEmbeds(embed);
        if (userWhoInitiated.getIdLong() == userToView.getIdLong()) { // if viewing own policy
            Button editButton = Button.secondary("editpolicy:" + userToView.getIdLong(), "Edit");
            reply.setComponents(ActionRow.of(editButton));
        }
        reply.queue();
    }
    
    static public MessageEmbed getPaginatedMemberList(List<GuildMember> members, int page, boolean showAll) {
        int membersSize = members.size();
        if (members.isEmpty()) { throw new IllegalArgumentException("No members with raid policies."); }
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
            .setFooter(showAll ? "Displaying all members regardless of username or policy set" : "Only displaying members with both username and policy set")
            .setColor(Color.CYAN)
            .build();
        return embed;
    }
    static public void getListViewButtonRow() {

    }
}
