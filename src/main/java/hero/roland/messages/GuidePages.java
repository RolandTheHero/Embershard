package hero.roland.messages;

import java.util.Map;

import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.components.selections.StringSelectMenu;

public abstract class GuidePages {
    static private final GuidePage HOME = new GuidePage(
        "Battle Nations Guides",
        "Learn about Battle Nations tips. Choose a topic using the dropdown menu to learn more.\n\nIf any information is missing or is incorrect, please message <@278366004348977153>.",
        "New guides will be added soon",
        null,
        null,
        ActionRow.of(
            StringSelectMenu.create("guideselect")
                .setPlaceholder("Select a guide")
                .addOption("Raiding Resources", "raiding-resources", "What are the best spots to raid for resources?")
                .build()
        )
    );
    static private final GuidePage RAIDING_RESOURCES = new GuidePage(
        "Guides: Raiding Resources",
        "Select a resource below to learn more. If a resource is not listed, it is not possible (yet) to collect it by raiding.\nGuides are available for the following resources:\n* Stone\n* Wood",
        null,
        null,
        null,
        ActionRow.of(
            StringSelectMenu.create("guideselect")
                .setPlaceholder("Select a resource")
                .addOption("Stone", "raiding-resources-stone")
                .addOption("Wood", "raiding-resources-wood")
                //.addOption("Iron", "raiding-resources-iron")
                //.addOption("Coal", "raiding-resources-coal")
                //.addOption("Oil", "raiding-resources-oil")
                //.addOption("Lumber", "raiding-resources-lumber")
                .build()
        ),
        ActionRow.of(
            Button.secondary("guideselect:home", "Back")
        )
    );
    static private final GuidePage RAIDING_STONE = new GuidePage(
        "Guides: Raiding Resources - Stone",
        "**Bigfoot Country** (Level 46+): 150 stone\n**Blade's Base** (Level ??+): 62 stone, 4 iron\n**Tronk's Base** (Level 14+): 50 stone\n**Warlord Gantas' Fortress** (Level ??+): 20 stone, 5 wood, 10 iron",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/f/fe/Resource-stone.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445373352511537214/stonelocations.png?ex=69301c54&is=692ecad4&hm=9a2c9698d2f847822a75ff2f5fc4ca67946e1931301e381f990c2a798ed6e49b&",
        ActionRow.of(
            Button.secondary("guideselect:raiding-resources", "Back")
        )
    );
    static private final GuidePage RAIDING_WOOD = new GuidePage(
        "Guides: Raiding Resources - Wood",
        "This page is a work in progress!\n\n**Raider Farms** (Level ??+): 150 wood",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/8/88/Resource-wood.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:raiding-resources", "Back")
        )
    );

    static public Map<String, GuidePage> pages = Map.of(
        "home", HOME,
        "raiding-resources", RAIDING_RESOURCES,
        "raiding-resources-stone", RAIDING_STONE,
        "raiding-resources-wood", RAIDING_WOOD
    );
}

