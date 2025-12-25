package hero.roland.events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.awt.Color;
import java.util.List;

import hero.roland.Main;
import hero.roland.data.GuildMember;
import hero.roland.messages.*;

public interface SlashEvent {
    public void run(SlashCommandInteractionEvent event);
}

record ViewCommand() implements SlashEvent {
    @Override public void run(SlashCommandInteractionEvent event) {
        User userToView = event.getOption("member").getAsUser();
        MessageReplier.viewPolicyReply(event.getUser(), userToView, event.deferReply());
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
        MessageEmbed embed = MessageReplier.getPaginatedMemberList(membersWithPolicy, 0, showAll);
        if (membersWithPolicy.isEmpty()) {
            event.replyEmbeds(MessageReplier.noPoliciesEmbed(), embed).queue();
            return;
        }
        Main.jda().retrieveUserById(membersWithPolicy.getFirst().id()).queue(user -> {
            MessageEmbed userEmbed = MessageReplier.getPolicyReply(user);
            Button leftLeft = Button.secondary("scrollview:" + event.getUser().getId() + ":-3:" + showAll, "<<<");
            Button left = Button.secondary("scrollview:" + event.getUser().getId() + ":-1:" + showAll, "<");
            Button right = Button.secondary("scrollview:" + event.getUser().getId() + ":1:" + showAll, ">");
            Button rightRight = Button.secondary("scrollview:" + event.getUser().getId() + ":3:" + showAll, ">>>");
            event.replyEmbeds(userEmbed, embed)
                .setComponents(ActionRow.of(leftLeft, left, right, rightRight))
                .queue();
        });
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