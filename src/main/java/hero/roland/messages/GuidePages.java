package hero.roland.messages;

import java.util.HashMap;
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
                .addOption("Boss Formations", "boss-formations", "What are the best unit formations to take down bosses?")
                .build()
        )
    );
    static private final GuidePage RAIDING_RESOURCES = new GuidePage(
        "Guides: Raiding Resources",
        "Select a resource below to learn more. If a resource is not listed, it is not possible (yet) to collect it by raiding.\nGuides are available for the following resources:\n* Stone\n* Wood\n* Iron\n* Coal\n* Oil\n* Lumber",
        null,
        null,
        null,
        ActionRow.of(
            StringSelectMenu.create("guideselect")
                .setPlaceholder("Select a resource")
                .addOption("Stone", "raiding-resources-stone")
                .addOption("Wood", "raiding-resources-wood")
                .addOption("Iron", "raiding-resources-iron")
                .addOption("Coal", "raiding-resources-coal")
                .addOption("Oil", "raiding-resources-oil")
                .addOption("Lumber", "raiding-resources-lumber")
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
        "**Raider Farms** (Level ??+): 150 wood\n**Greenborough** (Level ??+): 50 wood, 30 lumber",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/8/88/Resource-wood.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:raiding-resources", "Back")
        )
    );
    static private final GuidePage RAIDING_IRON = new GuidePage(
        "Guides: Raiding Resources - Iron",
        "**Greenborough** (Level ??+): 30 iron, 6 stone, 5 wood\n**Warlord Gantas' Fortress** (Level ??+): 10 iron, 20 stone, 5 wood",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/b/b0/Resource-iron.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:raiding-resources", "Back")
        )
    );
    static private final GuidePage RAIDING_COAL = new GuidePage(
        "Guides: Raiding Resources - Coal",
        "**Sarin's Base** (Level ??+): 20 coal, 8 stone",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/4/44/Resource-coal.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:raiding-resources", "Back")
        )
    );
    static private final GuidePage RAIDING_OIL = new GuidePage(
        "Guides: Raiding Resources - Oil",
        "**Greenborough** (Level ??+): 40 oil, 6 stone",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/9/9e/Resource-oil.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:raiding-resources", "Back")
        )
    );
    static private final GuidePage RAIDING_LUMBER = new GuidePage(
        "Guides: Raiding Resources - Lumber",
        "**Greenborough** (Level ??+): 30 lumber, 50 wood",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/7/7c/Resource-lumber.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:raiding-resources", "Back")
        )
    );
    static private final GuidePage BOSS_FORMATIONS = new GuidePage(
        "Guides: Boss Formations",
        "This information is regarding the repeatable versions of bosses. Choose a boss below to learn more.",
        null,
        null,
        null,
        ActionRow.of(
            StringSelectMenu.create("guideselect")
                .setPlaceholder("Select a boss")
                .addOption("Ancient Construct", "boss-formations-ancient-construct")
                .addOption("Dreadnought", "boss-formations-dreadnought")
                .addOption("The Kraken", "boss-formations-kraken")
                .addOption("Ancient Sentinel", "boss-formations-ancient-sentinel")
                .build()
        ),
        ActionRow.of(
            Button.secondary("guideselect:home", "Back")
        )
    );
    static private final GuidePage BOSS_FORMATIONS_ANCIENT_CONSTRUCT = new GuidePage(
        "Guides: Boss Formations - Ancient Construct",
        "**Free to Play**: Use a minimum of seven Tank Killers at rank four or higher in two 2x2 blocks, with the last unit being any kind of tank, " + 
        "or use eight Tank Killers if you have eight. Make sure to use the front row Tank Killers first because they have the highest chance to be destroyed." + 
        "\n**Pay to Win**: Use Super Tanks in the front row to block for Tank Killers. Place two Demomen on the back row and use their triple shot attack after the Tank Killers have been used.",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/2/26/Hero_ancient_robot_icon.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445564481743880212/image.png?ex=6930ce55&is=692f7cd5&hm=8d16bac4f58e6d0c9920e1abcf741b583c71d6e0d759a918f3d02ebb0c1c3a2b&",
        ActionRow.of(
            Button.secondary("guideselect:boss-formations", "Back")
        )
    );
    static private final GuidePage BOSS_FORMATIONS_DREADNOUGHT = new GuidePage(
        "Guides: Boss Formations - Dreadnought",
        "*Make sure all units are at least rank four!*\n\n" + 
        "**Free to Play**: Place three Buoys in the front row to absorb damage. Beside them, a Baby Grouper (using the Nibble attack) to take out the Submarines. " + 
        "Behind the Buoys and the Baby Grouper, you can fit seven Raptor-Class Battleships. Use the battleships' Bombard attack to deal damage to the Dreadnought." + 
        "\n**Pay to Win**: The formation used is the same as the Free to Play formation, but replace the Baby Grouper with a Monster Grouper and the Raptor-Class Battleships with Mammoth-Class Battleships.",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/2/24/Boss_ship_dreadnaught_icon.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445566599066288238/image.png?ex=6930d04e&is=692f7ece&hm=39fa8ff5735659b7909d0f09462dcb1ba619ea52dacf0a548f311584b5fa3b33&",
        ActionRow.of(
            Button.secondary("guideselect:boss-formations", "Back")
        )
    );
    static private final GuidePage BOSS_FORMATIONS_KRAKEN = new GuidePage(
        "Guides: Boss Formations - The Kraken",
        "Coming soon!",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/f/f6/Boss_kraken_body_nowater.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:boss-formations", "Back")
        )
    );
    static private final GuidePage BOSS_FORMATIONS_ANCIENT_SENTINEL = new GuidePage(
        "Guides: Boss Formations - Ancient Sentinel",
        "Just use Veterans.",
        "This is an upcoming boss",
        "https://static.wikia.nocookie.net/battlenations/images/5/55/Hero_ancient_BossFull_icon.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:boss-formations", "Back")
        )
    );

    static public Map<String, GuidePage> pages = new HashMap<>();
    static {
        pages.put("home", HOME);
        pages.put("raiding-resources", RAIDING_RESOURCES);
        pages.put("raiding-resources-stone", RAIDING_STONE);
        pages.put("raiding-resources-wood", RAIDING_WOOD);
        pages.put("raiding-resources-iron", RAIDING_IRON);
        pages.put("raiding-resources-coal", RAIDING_COAL);
        pages.put("raiding-resources-oil", RAIDING_OIL);
        pages.put("raiding-resources-lumber", RAIDING_LUMBER);
        pages.put("boss-formations", BOSS_FORMATIONS);
        pages.put("boss-formations-ancient-construct", BOSS_FORMATIONS_ANCIENT_CONSTRUCT);
        pages.put("boss-formations-dreadnought", BOSS_FORMATIONS_DREADNOUGHT);
        pages.put("boss-formations-kraken", BOSS_FORMATIONS_KRAKEN);
        pages.put("boss-formations-ancient-sentinel", BOSS_FORMATIONS_ANCIENT_SENTINEL);
    }
}

