package hero.roland.events;

import java.util.List;

import hero.roland.Main;
import hero.roland.data.GuildMember;
import hero.roland.messages.GuidePage;
import hero.roland.messages.GuidePages;
import hero.roland.messages.MessageReplier;
import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.components.label.Label;
import net.dv8tion.jda.api.components.textinput.TextInput;
import net.dv8tion.jda.api.components.textinput.TextInputStyle;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.modals.Modal;

public interface ButtonEvent {
    public void run(ButtonInteractionEvent event);
}

class EditPolicyButton implements ButtonEvent {
    @Override public void run(ButtonInteractionEvent event) {
        // editpolicy:USERID
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can only edit your own raid policy!").setEphemeral(true).queue();
            return;
        }
        GuildMember gm = Main.dataHandler().load(userIdWhoMustRun);

        Modal.Builder modalBuilder = Modal.create("editpolicymodal:" + event.getMessageIdLong(), "Edit Raid Policy");
        if (gm.igName() == null) {
            TextInput nameInput = TextInput.create("name", TextInputStyle.SHORT)
                .setRequired(true)
                .setPlaceholder("Your Battle Nations username")
                .setMinLength(1)
                .setMaxLength(25)
                .build();
            modalBuilder.addComponents(Label.of("Set In-Game Name", nameInput));
        }
        TextInput policyInput = TextInput.create("policy", TextInputStyle.PARAGRAPH)
            .setRequired(false)
            .setPlaceholder("Let people know what encounters they can or can't take, etc. Leave blank to clear...")
            .setValue(gm.raidPolicy())
            .setMaxLength(500)
            .build();
        
        Modal modal = modalBuilder.addComponents(Label.of("New Raid Policy", policyInput)).build();
        event.replyModal(modal).queue();
    }
}
class ScrollViewButton implements ButtonEvent {
    @Override public void run(ButtonInteractionEvent event) {
        // scrollview:USERID:PAGE:SHOWALL
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can't control this pagination! Use the `/list` command to open your own.").setEphemeral(true).queue();
            return;
        }
        boolean showAll = Boolean.parseBoolean(buttonId[3]);
        List<GuildMember> list = ListCommand.getMembersWithPolicy(showAll);
        int currentPage = (Integer.parseInt(buttonId[2]) % list.size() + list.size()) % list.size(); // Wrap around
        MessageEmbed userListEmbed = MessageReplier.getPaginatedMemberList(list, currentPage, showAll);
        Main.jda().retrieveUserById(list.get(currentPage).id()).queue(user -> {
            MessageEmbed policyEmbed = MessageReplier.getPolicyReply(user);
            Button leftLeft = Button.secondary("scrollview:" + event.getUser().getId() + ":" + (currentPage - 3) + ":" + showAll, "<<<");
            Button left = Button.secondary("scrollview:" + event.getUser().getId() + ":" + (currentPage - 1) + ":" + showAll, "<");
            Button right = Button.secondary("scrollview:" + event.getUser().getId() + ":" + (currentPage + 1) + ":" + showAll, ">");
            Button rightRight = Button.secondary("scrollview:" + event.getUser().getId() + ":" + (currentPage + 3) + ":" + showAll, ">>>");
            event.deferEdit().setEmbeds(policyEmbed, userListEmbed)
                .setComponents(ActionRow.of(leftLeft, left, right, rightRight))
                .queue();
        });
    }
}
class ScrollGoldButton implements ButtonEvent {
    @Override public void run(ButtonInteractionEvent event) {
        // scrollgold:USERID:PAGE
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can't control this pagination!").setEphemeral(true).queue();
            return;
        }
        int page = Integer.parseInt(buttonId[2]);
        MessageReplier.goldLeaderboardReply(Main.dataHandler().load(userIdWhoMustRun), page, event.deferEdit());
    }
}
class GuidesButton implements ButtonEvent {
    @Override public void run(ButtonInteractionEvent event) {
        // guideselect:USERID:PAGEID
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can't control this guide! Use the `/guides` command to open your own.").setEphemeral(true).queue();
            return;
        }
        String pageId = buttonId[2];
        GuidePage guidePage = GuidePages.getPage(pageId, userIdWhoMustRun);
        event.editMessageEmbeds(guidePage.toEmbed())
            .setComponents(guidePage.components())
            .queue();
    }
}