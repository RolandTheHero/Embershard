package hero.roland.events;

import java.util.Map;

import hero.roland.Main;
import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.CommandAutoCompleteInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.Command;

public class EventListener extends ListenerAdapter {
    final private Map<String, SlashEvent> slashEvents = Map.of(
        "view", new ViewCommand(),
        "setname", new SetIgNameCommand(),
        "list", new ListCommand(),
        "guides", new GuidesCommand(),
        "formation", new FormationCommand()
    );
    @Override public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        String eventName = event.getName();
        SlashEvent scmd = slashEvents.get(eventName);
        if (scmd == null) throw new IllegalArgumentException("No such slash command: " + eventName);
        scmd.run(event);
    }

    final private Map<String, ButtonEvent> buttonEvents = Map.of(
        "editpolicy", new EditPolicyButton(),
        "scrollview", new ScrollViewButton(),
        "scrolllist", new ScrollListButton(),
        "guideselect", new GuidesButton(),
        "flipformation", new FlipFormationButton(),
        "editformation", new EditFormationButton(),
        "finishformation", new FinishFormationButton()
    );
    @Override public void onButtonInteraction(ButtonInteractionEvent event) {
        String buttonId = event.getButton().getCustomId().split(":")[0];
        ButtonEvent bcmd = buttonEvents.get(buttonId);
        if (bcmd == null) throw new IllegalArgumentException("No such button command: " + buttonId);
        bcmd.run(event);
    }

    final private Map<String, ModalEvent> modalEvents = Map.of(
        "editpolicymodal", new EditPolicyModal(),
        "editformationmodal", new EditFormationModal()
    );
    @Override public void onModalInteraction(ModalInteractionEvent event) {
        String modalId = event.getModalId().split(":")[0];
        ModalEvent mcmd = modalEvents.get(modalId);
        if (mcmd == null) throw new IllegalArgumentException("No such modal command: " + modalId);
        mcmd.run(event);
    }

    final private Map<String, StringSelectEvent> stringSelectEvents = Map.of(
        "guideselect", new GuideStringSelect()
    );
    @Override public void onStringSelectInteraction(StringSelectInteractionEvent event) {
        String selectId = event.getComponentId().split(":")[0];
        StringSelectEvent sscmd = stringSelectEvents.get(selectId);
        if (sscmd == null) throw new IllegalArgumentException("No such string select command: " + selectId);
        sscmd.run(event);
    }

    @Override public void onCommandAutoCompleteInteraction(CommandAutoCompleteInteractionEvent event) {
        if (event.getFocusedOption().getName().equals("bn-user")) {
            String currentInput = event.getFocusedOption().getValue();
            var choices = Main.dataHandler().allMembers().values().stream()
                .filter(gm -> gm.igName() != null && gm.igName().toLowerCase().contains(currentInput.toLowerCase()))
                .sorted((gm1, gm2) -> gm1.igName().compareToIgnoreCase(gm2.igName()))
                .limit(25)
                .map(gm -> new Command.Choice(gm.igName(), gm.igName()))
                .toList();
            event.replyChoices(choices).queue();
        }
    }
}