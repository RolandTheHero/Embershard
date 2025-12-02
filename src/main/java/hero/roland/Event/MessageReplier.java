package hero.roland.Event;

import java.awt.Color;
import java.util.List;

import hero.roland.Main;
import hero.roland.dat.GuildMember;
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

    static private final int GOLD_LEADERBOARD_PAGE_SIZE = 10;
    static private int goldLeaderboardMembers = 0;
    static public MessageEmbed getGoldLeaderboardEmbed(GuildMember gmSelf, int page) {
        long totalGold = Main.dataHandler().allMembers().values().stream()
            .mapToLong(gm -> gm.gold())
            .sum();
        List<GuildMember> sortedByGold = Main.dataHandler().allMembers().values().stream()
            .filter(gm -> gm.gold() > 0)
            .sorted((gm1, gm2) -> Long.compare(gm2.gold(), gm1.gold()))
            .toList();
        goldLeaderboardMembers = sortedByGold.size();
        StringBuilder desc = new StringBuilder(
            String.format("<@%d>, you have <:gold:1435206410429403180>%,d, which is `%.2f%%` of the guild's total of <:gold:1435206410429403180>%,d.\n", 
            gmSelf.id(), gmSelf.gold(), (double) gmSelf.gold() / totalGold * 100, totalGold)
        );
        desc.append(String.format("The guild is `%.2f%%` of the way to <:gold:1435206410429403180>1,258,441,650.", (double) totalGold / 1258441650 * 100));
        desc.append("```stan\n");
        for (int rank = 1 + GOLD_LEADERBOARD_PAGE_SIZE * page; rank <= sortedByGold.size(); rank++) {
            GuildMember gm = sortedByGold.get(rank - 1); // Since rank starts from 1
            String igName = gm.igName() == null ? "<@" + gm.id() + ">" : gm.igName();
            desc.append(String.format("%2d. %-25s %,10d\n", rank, igName, gm.gold()));
            if (rank >= GOLD_LEADERBOARD_PAGE_SIZE * (page + 1)) break;
        }
        if (sortedByGold.isEmpty()) desc.append("There are no gold records yet.\n");
        desc.append("```");
        MessageEmbed embed = new EmbedBuilder()
            .setTitle("Gold Leaderboard")
            .setDescription(desc.toString())
            .setFooter("Page " + (page + 1) + " of " + Math.max(1, (goldLeaderboardMembers - 1) / GOLD_LEADERBOARD_PAGE_SIZE + 1))
            .setColor(Color.CYAN)
            .build();
        return embed;
    }
    static public void goldLeaderboardReply(GuildMember gmSelf, ReplyCallbackAction deferReply) {
        ReplyCallbackAction reply = deferReply.setEmbeds(getGoldLeaderboardEmbed(gmSelf, 0));
        Button left = Button.secondary("scrollgold:0:0", "<").asDisabled();
        Button right = Button.secondary("scrollgold:" + gmSelf.id() + ":1", ">");
        if (goldLeaderboardMembers <= GOLD_LEADERBOARD_PAGE_SIZE) right = right.asDisabled();
        reply.setComponents(ActionRow.of(left, right)).queue();
    }
    static public void goldLeaderboardReply(GuildMember gmSelf, int page, MessageEditCallbackAction editReply) {
        MessageEditCallbackAction reply = editReply.setEmbeds(getGoldLeaderboardEmbed(gmSelf, page));
        String buttonId = "scrollgold:" + gmSelf.id() + ":";
        Button left = Button.secondary(buttonId + (page - 1), "<");
        if (page <= 0) left = left.asDisabled();
        Button right = Button.secondary(buttonId + (page + 1), ">");
        if (GOLD_LEADERBOARD_PAGE_SIZE * (page + 1) >= goldLeaderboardMembers) right = right.asDisabled();
        reply.setComponents(ActionRow.of(left, right)).queue();
    }
}
