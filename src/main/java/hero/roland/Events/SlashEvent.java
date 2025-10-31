package hero.roland.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.awt.Color;
import java.util.List;

import hero.roland.GuildMember;
import hero.roland.Main;

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
        String replyMessage = event.getMember().getAsMention() + ", your in-game name has been updated.";
        if (nameOption != null) igName = nameOption.getAsString();
        Color colour = Color.GREEN;
        if (igName.length() > 25) {
            replyMessage = event.getMember().getAsMention() + ", please keep your in-game name at no more than 25 characters.";
            colour = Color.RED;
        } else {
            GuildMember gm = Main.dataHandler().load(event.getUser().getIdLong());
            gm.setIgName(igName);
            Main.dataHandler().save(gm);
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