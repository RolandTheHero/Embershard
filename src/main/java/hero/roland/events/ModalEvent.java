package hero.roland.events;

import hero.roland.Main;
import hero.roland.data.GuildMember;
import hero.roland.messages.MessageReplier;
import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.interactions.modals.ModalMapping;

public interface ModalEvent {
    public void run(ModalInteractionEvent event);
}

class EditPolicyModal implements ModalEvent {
    @Override public void run(ModalInteractionEvent event) {
        long userId = event.getUser().getIdLong();
        GuildMember gm = Main.dataHandler().load(userId);

        ModalMapping nameModalEntry = event.getValue("name");
        ModalMapping policyModalEntry = event.getValue("policy");
        if (nameModalEntry != null) {
            String igName = nameModalEntry.getAsString();
            gm.setIgName(igName);
        }
        String raidPolicy = policyModalEntry.getAsString();
        if (raidPolicy.isBlank()) raidPolicy = null;
        gm.setRaidPolicy(raidPolicy);
        Main.dataHandler().save(gm);

        MessageReplier.viewPolicyReply(event.getUser(), event.getUser(), event.deferEdit());
    }
}
class EditFormationModal implements ModalEvent {
    @Override public void run(ModalInteractionEvent event) {
        ModalMapping dataModalEntry = event.getValue("data");
        String data = dataModalEntry.getAsString();
        event.editMessageEmbeds(MessageReplier.formationEmbed(data).appendDescription("\n\nPlease wait while your data string is being parsed...").build())
            .queue(interaction -> MessageReplier.formationReply(interaction, data, false));
    }
}