package hero.roland.events;

import java.util.List;
import java.util.Map;

import hero.roland.Main;
import hero.roland.formations.Unit;
import hero.roland.formations.BattleMap;
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
        String eventName = event.getFocusedOption().getName();
        if (eventName.equals("bn-user")) {
            String currentInput = event.getFocusedOption().getValue();
            List<Command.Choice> choices = Main.dataHandler().allMembers().values().stream()
                .filter(gm -> gm.igName() != null && gm.igName().toLowerCase().contains(currentInput.toLowerCase()))
                .sorted((gm1, gm2) -> gm1.igName().compareToIgnoreCase(gm2.igName()))
                .limit(25)
                .map(gm -> new Command.Choice(gm.igName(), gm.igName()))
                .toList();
            event.replyChoices(choices).queue();
        } else if (List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13").contains(eventName)) {
            List<Command.Choice> choices = Unit.getUnitIdMap().entrySet().stream()
                .filter(unit -> unit.getValue().fullName().toLowerCase().contains(event.getFocusedOption().getValue().toLowerCase()))
                .sorted((u1, u2) -> u1.getValue().fullName().compareToIgnoreCase(u2.getValue().fullName()))
                .limit(25)
                .map(unit -> new Command.Choice(unit.getValue().fullName(), unit.getKey()))
                .toList();
            event.replyChoices(choices).queue();
        } else if (eventName.equals("map")) {
            List<Command.Choice> choices = BattleMap.getMapIdMap().values().stream()
                .filter(map -> map.id().toLowerCase().contains(event.getFocusedOption().getValue().toLowerCase()))
                .sorted((m1, m2) -> m1.id().compareToIgnoreCase(m2.id()))
                .limit(25)
                .map(map -> new Command.Choice(map.mapName(), map.id()))
                .toList();
            event.replyChoices(choices).queue();
        }
    }
}