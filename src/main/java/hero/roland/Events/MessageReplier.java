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
    
    static public MessageEmbed getPaginatedMemberList(List<GuildMember> members, int page) {
        if (members.size() == 0) { throw new IllegalArgumentException("No members with raid policies."); }
        StringBuilder desc = new StringBuilder("```");
        for (int i = -2; i <= 2; i++) {
            int p = ((page + i) % members.size() + members.size()) % members.size();
            GuildMember gm = members.get(p);
            if (i == 0) desc.append(String.format(" >  %d. %s", p + 1, gm.igName()));
            else desc.append(String.format("-   %d. %s", p + 1, gm.igName()));
            if (i != 2) desc.append("\n");
        }
        desc.append("```");
        MessageEmbed embed = new EmbedBuilder()
            .setDescription(desc.toString())
            .setFooter("Only displaying members with both username and policy set")
            .setColor(Color.CYAN)
            .build();
        return embed;
    }
    static public void getListViewButtonRow() {

    }
}
