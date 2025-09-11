package hero.roland.Events;

import hero.roland.GuildMember;
import hero.roland.Main;
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
