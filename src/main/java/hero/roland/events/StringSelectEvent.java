package hero.roland.events;

import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;

public interface StringSelectEvent {
    public void run(StringSelectInteractionEvent event);
}

class GuideStringSelect implements StringSelectEvent {
    @Override public void run(StringSelectInteractionEvent event) {
        // guideselect:USERID
        String[] stringSelectId = event.getComponent().getCustomId().split(":");
        long userId = Long.parseLong(stringSelectId[1]);
        if (userId != event.getUser().getIdLong()) {
            event.reply("You can't control this guide! Use the `/guides` command to open your own.").setEphemeral(true).queue();
            return;
        }
        String selected = event.getValues().get(0);
        var guidePage = hero.roland.messages.GuidePages.getPage(selected, userId);
        event.editMessageEmbeds(guidePage.toEmbed())
            .setComponents(guidePage.components())
            .queue();
    }
}