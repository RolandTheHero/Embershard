package hero.roland.events;

import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;

public interface StringSelectEvent {
    public void run(StringSelectInteractionEvent event);
}

class GuideStringSelect implements StringSelectEvent {
    @Override public void run(StringSelectInteractionEvent event) {
        String selected = event.getValues().get(0);
        var guidePage = hero.roland.messages.GuidePages.pages.get(selected);
        event.editMessageEmbeds(guidePage.toEmbed())
            .setComponents(guidePage.components())
            .queue();
    }
}