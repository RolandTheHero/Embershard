package hero.roland.events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.utils.FileUpload;

import java.awt.Color;
import java.util.List;

import javax.imageio.ImageIO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import hero.roland.Main;
import hero.roland.data.GuildMember;
import hero.roland.formations.Formation;
import hero.roland.formations.FormationException;
import hero.roland.messages.*;

public interface SlashEvent {
    public void run(SlashCommandInteractionEvent event);
}

record ViewCommand() implements SlashEvent {
    @Override public void run(SlashCommandInteractionEvent event) {
        var discordUserOption = event.getOption("discord-user");
        var bnUserOption = event.getOption("bn-user");
        User discordUserToView;
        String bnUserToView;
        if (discordUserOption != null) discordUserToView = discordUserOption.getAsUser();
        else discordUserToView = null;
        if (bnUserOption != null) bnUserToView = bnUserOption.getAsString();
        else bnUserToView = null;
        if (discordUserToView == null && bnUserToView == null) { // No arguments supplied, show own policy
            MessageReplier.viewPolicyReply(event.getUser(), event.getUser(), event.deferReply());
            return;
        }
        if (discordUserToView != null && bnUserToView != null) { // Both arguments supplied, error
            event.reply("Please provide either a Discord user or a Battle Nations username, not both!").setEphemeral(true).queue();
            return;
        }
        if (discordUserToView != null) { // View by Discord user
            MessageReplier.viewPolicyReply(event.getUser(), discordUserToView, event.deferReply());
            return;
        }
        // Search by Battle Nations username
        List<GuildMember> searchResults = Main.dataHandler().allMembers().values().stream()
            .filter(gm -> gm.igName() != null && gm.igName().toLowerCase().contains(bnUserToView.toLowerCase()))
            .sorted((gm1, gm2) -> gm1.igName().compareToIgnoreCase(gm2.igName()))
            .toList();
        if (searchResults.isEmpty()) {
            event.reply("No members found with the Battle Nations username containing `" + bnUserToView + "`.").queue();
            return;
        }
        Main.jda().retrieveUserById(searchResults.get(0).id()).queue(user -> {
            if (searchResults.size() == 1) {
                MessageReplier.viewPolicyReply(event.getUser(), user, event.deferReply());
                return;
            }
            MessageEmbed policyEmbed = MessageReplier.getPolicyReply(user);
            MessageEmbed embed = MessageReplier.getPaginatedMemberList(searchResults, 0, "Showing usernames containing `" + bnUserToView + "`");
            event.replyEmbeds(policyEmbed, embed)
                .setComponents(ActionRow.of(
                    Button.secondary("scrollview:" + event.getUser().getId() + ":" + bnUserToView + ":-3", "<<<"),
                    Button.secondary("scrollview:" + event.getUser().getId() + ":" + bnUserToView + ":-1", "<"),
                    Button.secondary("scrollview:" + event.getUser().getId() + ":" + bnUserToView + ":1", ">"),
                    Button.secondary("scrollview:" + event.getUser().getId() + ":" + bnUserToView + ":3", ">>>")
                ))
                .queue();
        });
    }
}
record SetIgNameCommand() implements SlashEvent {
    @Override public void run(SlashCommandInteractionEvent event) {
        var nameOption = event.getOption("name");
        String igName = "";
        String replyMessage;
        if (nameOption != null) igName = nameOption.getAsString();
        Color colour = Color.CYAN;
        if (igName.length() > 25) {
            replyMessage = event.getMember().getAsMention() + ", please keep your in-game name at no more than 25 characters.";
            colour = Color.RED;
        } else {
            GuildMember gm = Main.dataHandler().load(event.getUser().getIdLong());
            gm.setIgName(igName);
            Main.dataHandler().save(gm);
            replyMessage = igName.isEmpty() ? 
                event.getMember().getAsMention() + ", your in-game name has been cleared." :
                event.getMember().getAsMention() + ", your in-game name is set to `" + igName + "`.";
        }

        MessageEmbed embed = new EmbedBuilder()
            .setTitle("Set In-Game Name")
            .setDescription(replyMessage)
            .setColor(colour)
            .build();
        event.replyEmbeds(embed).queue();
    }
}
record ListCommand() implements SlashEvent {
    @Override public void run(SlashCommandInteractionEvent event) {
        var showAllOption = event.getOption("all");
        boolean showAll = showAllOption == null ? false : showAllOption.getAsBoolean();
        List<GuildMember> membersWithPolicy = getMembersWithPolicy(showAll);
        String footerMessage = listFooter(showAll);
        MessageEmbed embed = MessageReplier.getPaginatedMemberList(membersWithPolicy, 0, footerMessage);
        if (membersWithPolicy.isEmpty()) {
            event.replyEmbeds(MessageReplier.noPoliciesEmbed(), embed).queue();
            return;
        }
        Main.jda().retrieveUserById(membersWithPolicy.getFirst().id()).queue(user -> {
            MessageEmbed userEmbed = MessageReplier.getPolicyReply(user);
            Button leftLeft = Button.secondary("scrolllist:" + event.getUser().getId() + ":-3:" + showAll, "<<<");
            Button left = Button.secondary("scrolllist:" + event.getUser().getId() + ":-1:" + showAll, "<");
            Button right = Button.secondary("scrolllist:" + event.getUser().getId() + ":1:" + showAll, ">");
            Button rightRight = Button.secondary("scrolllist:" + event.getUser().getId() + ":3:" + showAll, ">>>");
            event.replyEmbeds(userEmbed, embed)
                .setComponents(ActionRow.of(leftLeft, left, right, rightRight))
                .queue();
        });
    }
    static public String listFooter(boolean showAll) {
        return showAll ? "Displaying all members" : "Only displaying members with policy set";
    }
    static public List<GuildMember> getMembersWithPolicy(boolean showAll) {
        return Main.dataHandler().allMembers().values().stream()
            .filter(gm -> showAll || (gm.raidPolicy() != null && gm.igName() != null))
            .sorted((gm1, gm2) -> {
                if (gm1.igName() == null && gm2.igName() == null) return 0;
                if (gm1.igName() == null) return 1;
                if (gm2.igName() == null) return -1;
                return gm1.igName().compareToIgnoreCase(gm2.igName());
            })
            .toList();
    }
}
/**
 * @deprecated This command is no longer used since the game has implemented the Guilds feature.
 */
record GoldCommand() implements SlashEvent {
    @Override public void run(SlashCommandInteractionEvent event) {
        GuildMember gm = Main.dataHandler().load(event.getUser().getIdLong());
        var amountOption = event.getOption("amount");
        if (amountOption == null) { // View leaderboard
            MessageReplier.goldLeaderboardReply(gm, event.deferReply());
            return;
        }
        long amount = amountOption.getAsLong();
        if (amount < 0) amount = 0;
        else if (amount > 999_999_999L) amount = 999_999_999L;
        gm.setGold(amount);
        Main.dataHandler().save(gm);

        MessageEmbed embed = new EmbedBuilder()
            .setTitle("Gold")
            .setDescription(String.format("%s, your gold amount has been updated to <:gold:1435206410429403180>%,d.", event.getMember().getAsMention(), amount))
            .setColor(Color.CYAN)
            .build();
        event.replyEmbeds(embed).setEphemeral(true).queue();
    }
}
record GuidesCommand() implements SlashEvent {
    @Override public void run(SlashCommandInteractionEvent event) {
        GuidePage page = GuidePages.getPage("home", event.getUser().getIdLong());
        event.replyEmbeds(page.toEmbed())
            .setComponents(page.components())
            .queue();
    }
}
record FormationCommand() implements SlashEvent {
    @Override public void run(SlashCommandInteractionEvent event) {
        var dataOption = event.getOption("data");
        if (dataOption == null) {
            MessageEmbed embed = new EmbedBuilder()
                .setTitle("Formation Help")
                .setDescription("The `/formation` command allows you to generate a custom formation image to share.\n\n" +
                    "To create a formation, you need to provide a data string that describes the formation. " +
                    "When referring to units, their unit ID is used. Refer [here](https://docs.google.com/document/d/1NapO41-zFrOWCp8DI0VfLYA3OYWQd2ZjLqsNzepZ1pI/edit?usp=sharing) for a list of unit IDs.\n\n" +
                    "An example of a valid data string is:\n" +
                    "`map=city,12=heavyartillery,3=heavytank,10=assassinator,5=def_barricade_sandbags,1=def_barricade_sandbags`"
                )
                .setImage("https://static.wikia.nocookie.net/battlenations/images/2/2b/GridNumbers.png")
                .setColor(Color.CYAN)
                .build();
            event.replyEmbeds(embed).queue();
            return;
        }
        String dataString = dataOption.getAsString().replaceAll("`", "");
        String generatedMessage = "`" + dataString + "`";
        EmbedBuilder unbuiltEmbed = new EmbedBuilder()
            .setTitle("Formation")
            .setDescription(generatedMessage + "\n\nPlease wait a moment while your string is being parsed...")
            .setImage("attachment://formation.png")
            .setColor(Color.CYAN);
        event.replyEmbeds(unbuiltEmbed.build()).queue(interaction -> {
            try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
                Formation formation = Formation.fromDataString(dataString);
                ImageIO.write(formation.toImage(), "png", os);
                interaction.editOriginalEmbeds(unbuiltEmbed.setDescription(generatedMessage).build())
                    .setAttachments(FileUpload.fromData(os.toByteArray(), "formation.png"))
                    .setComponents(ActionRow.of(
                        Button.secondary("toggleformation:" + event.getUser().getId() + ":true", "Toggle View")
                    ))
                    .queue();
            } catch (IOException e) {
                interaction.editOriginalEmbeds(unbuiltEmbed.setDescription(generatedMessage + "\n\nAn error occurred while generating the formation image. Please try again.").build())
                    .queue();
            } catch (FormationException e) {
                interaction.editOriginalEmbeds(unbuiltEmbed.setDescription(generatedMessage + "\n\n" + e.getMessage()).build())
                    .queue();
            }
        });
    }
}