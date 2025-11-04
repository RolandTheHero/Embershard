package hero.roland.Events;

import java.util.Map;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class EventListener extends ListenerAdapter {
    final private Map<String, SlashEvent> slashEvents = Map.of(
        "view", new ViewCommand(),
        "setname", new SetIgNameCommand(),
        "list", new ListCommand(),
        "gold", new GoldCommand()
    );
    @Override public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        String eventName = event.getName();
        SlashEvent scmd = slashEvents.get(eventName);
        if (scmd == null) throw new IllegalArgumentException("No such slash command: " + eventName);
        scmd.run(event);
    }

    final private Map<String, ButtonEvent> buttonEvents = Map.of(
        "editpolicy", new EditPolicyButton(),
        "scrollview", new ScrollViewButton()
    );
    @Override public void onButtonInteraction(ButtonInteractionEvent event) {
        String buttonId = event.getButton().getCustomId().split(":")[0];
        ButtonEvent bcmd = buttonEvents.get(buttonId);
        if (bcmd == null) throw new IllegalArgumentException("No such button command: " + buttonId);
        bcmd.run(event);
    }

    final private Map<String, ModalEvent> modalEvents = Map.of(
        "editpolicymodal", new EditPolicyModal()
    );
    @Override public void onModalInteraction(ModalInteractionEvent event) {
        String modalId = event.getModalId().split(":")[0];
        ModalEvent mcmd = modalEvents.get(modalId);
        if (mcmd == null) throw new IllegalArgumentException("No such modal command: " + modalId);
        mcmd.run(event);
    }
}
