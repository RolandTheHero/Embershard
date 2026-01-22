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
        // scrollview:USERID:NAMEFILTER:PAGE
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can't control this pagination!").setEphemeral(true).queue();
            return;
        }
        String nameFilter = buttonId[2];
        List<GuildMember> membersWithPolicy = ListCommand.getMembersWithPolicy(true).stream()
            .filter(gm -> gm.igName() != null && gm.igName().toLowerCase().contains(nameFilter.toLowerCase()))
            .toList();
        if (membersWithPolicy.isEmpty()) {
            event.deferEdit().setEmbeds(MessageReplier.noPoliciesEmbed(), MessageReplier.getPaginatedMemberList(membersWithPolicy, 0, "Showing usernames containing `" + nameFilter + "`"))
                .setComponents()
                .queue();
            return;
        }
        int currentPage = (Integer.parseInt(buttonId[3]) % membersWithPolicy.size() + membersWithPolicy.size()) % membersWithPolicy.size(); // Wrap around
        MessageEmbed userListEmbed = MessageReplier.getPaginatedMemberList(membersWithPolicy, currentPage, "Showing usernames containing `" + nameFilter + "`");
        Main.jda().retrieveUserById(membersWithPolicy.get(currentPage).id()).queue(user -> {
            MessageEmbed policyEmbed = MessageReplier.getPolicyReply(user);
            Button leftLeft = Button.secondary("scrollview:" + event.getUser().getId() + ":" + nameFilter + ":" + (currentPage - 3), "<<<");
            Button left = Button.secondary("scrollview:" + event.getUser().getId() + ":" + nameFilter + ":" + (currentPage - 1), "<");
            Button right = Button.secondary("scrollview:" + event.getUser().getId() + ":" + nameFilter + ":" + (currentPage + 1), ">");
            Button rightRight = Button.secondary("scrollview:" + event.getUser().getId() + ":" + nameFilter + ":" + (currentPage + 3), ">>>");
            event.deferEdit().setEmbeds(policyEmbed, userListEmbed)
                .setComponents(ActionRow.of(leftLeft, left, right, rightRight))
                .queue();
        });
    }
}
class ScrollListButton implements ButtonEvent {
    @Override public void run(ButtonInteractionEvent event) {
        // scrolllist:USERID:PAGE:SHOWALL
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can't control this pagination! Use the `/list` command to open your own.").setEphemeral(true).queue();
            return;
        }
        boolean showAll = Boolean.parseBoolean(buttonId[3]);
        List<GuildMember> list = ListCommand.getMembersWithPolicy(showAll);
        String footerMessage = ListCommand.listFooter(showAll);
        if (list.isEmpty()) {
            event.deferEdit().setEmbeds(MessageReplier.noPoliciesEmbed(), MessageReplier.getPaginatedMemberList(list, 0, footerMessage))
                .setComponents()
                .queue();
            return;
        }
        int currentPage = (Integer.parseInt(buttonId[2]) % list.size() + list.size()) % list.size(); // Wrap around
        MessageEmbed userListEmbed = MessageReplier.getPaginatedMemberList(list, currentPage, footerMessage);
        Main.jda().retrieveUserById(list.get(currentPage).id()).queue(user -> {
            MessageEmbed policyEmbed = MessageReplier.getPolicyReply(user);
            Button leftLeft = Button.secondary("scrolllist:" + event.getUser().getId() + ":" + (currentPage - 3) + ":" + showAll, "<<<");
            Button left = Button.secondary("scrolllist:" + event.getUser().getId() + ":" + (currentPage - 1) + ":" + showAll, "<");
            Button right = Button.secondary("scrolllist:" + event.getUser().getId() + ":" + (currentPage + 1) + ":" + showAll, ">");
            Button rightRight = Button.secondary("scrolllist:" + event.getUser().getId() + ":" + (currentPage + 3) + ":" + showAll, ">>>");
            event.deferEdit().setEmbeds(policyEmbed, userListEmbed)
                .setComponents(ActionRow.of(leftLeft, left, right, rightRight))
                .queue();
        });
    }
}
/**
 * @deprecated See {@link GoldCommand}
 */
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
class ToggleFormationButton implements ButtonEvent {
    @Override public void run(ButtonInteractionEvent event) {
        // toggleformation:USERID:ISENEMY
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can only toggle your own formation view!").setEphemeral(true).queue();
            return;
        }
        var footer = event.getMessage().getEmbeds().get(0).getFooter();
        String dataString = footer == null ? "" : footer.getText();
        boolean isEnemy = Boolean.parseBoolean(buttonId[2]);
        event.editMessageEmbeds(MessageReplier.formationEmbed(dataString).appendDescription("\n\nPlease wait while your data string is being parsed...").build()).setComponents()
            .queue(interaction -> MessageReplier.formationReply(interaction, dataString, isEnemy));
    }
}
class EditFormationButton implements ButtonEvent {
    @Override public void run(ButtonInteractionEvent event) {
        // editformation:USERID:IS_ENEMY
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can only edit your own formation! Copy the data string and use the `/formation` command with it to make your own.").setEphemeral(true).queue();
            return;
        }
        var footer = event.getMessage().getEmbeds().get(0).getFooter();
        String dataString = footer == null ? null : footer.getText();
        TextInput dataInput = TextInput.create("data", TextInputStyle.PARAGRAPH)
            .setRequired(false)
            .setPlaceholder("map=bay,3=ironclad_battleship,5=monster_grouper, ...")
            .setValue(dataString)
            .setMaxLength(500)
            .build();
        Modal modal = Modal.create("editformationmodal:" + buttonId[2], "Edit Formation")
            .addComponents(Label.of("Formation Data", dataInput))
            .build();
        event.replyModal(modal).queue();
    }
}
class FinishFormationButton implements ButtonEvent {
    @Override public void run(ButtonInteractionEvent event) {
        // finishformation:USERID
        String[] buttonId = event.getButton().getCustomId().split(":");
        long userIdWhoMustRun = Long.parseLong(buttonId[1]);
        if (userIdWhoMustRun != event.getUser().getIdLong()) {
            event.reply("You can only finish your own formation!").setEphemeral(true).queue();
            return;
        }
        if (event.getMessage().getEmbeds().getFirst().getImage() == null) {
            event.deferEdit().queue();
            event.getMessage().delete().queue();
        } else event.editMessageEmbeds().setComponents().queue();
    }
}