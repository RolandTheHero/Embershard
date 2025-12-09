package hero.roland.messages;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.components.selections.StringSelectMenu;

public abstract class GuidePages {
    static private final Function<Long, GuidePage> HOME = userId -> new GuidePage(
        "Battle Nations Guides",
        "Learn about Battle Nations tips. Choose a topic using the dropdown menu to learn more.\n\nIf any information is missing or is incorrect, please message <@278366004348977153>.",
        "New guides will be added soon",
        null,
        null,
        ActionRow.of(
            StringSelectMenu.create("guideselect:" + userId)
                .setPlaceholder("Select a guide")
                .addOption("Raiding Resources", "raiding-resources", "What are the best spots to raid for resources?")
                .addOption("Boss Formations", "boss-formations", "What are the best unit formations to take down bosses?")
                .addOption("Infection Rates", "infection-rates", "Which units should I infect?")
                .addOption("Other Guides", "other", "Links to other guides created by the Battle Nations community.")
                .build()
        )
    );
    static private final Function<Long, GuidePage> RAIDING_RESOURCES = userId -> new GuidePage(
        "Guides: Raiding Resources",
        "Select a resource below to learn more. If a resource is not listed, it is not possible (yet) to collect it by raiding.\nGuides are available for the following resources:\n* Stone\n* Wood\n* Iron\n* Coal\n* Oil\n* Lumber",
        null,
        null,
        null,
        ActionRow.of(
            StringSelectMenu.create("guideselect:" + userId)
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
            Button.secondary("guideselect:" + userId + ":home", "Back")
        )
    );
    static private final Function<Long, GuidePage> RAIDING_STONE = userId -> new GuidePage(
        "Guides: Raiding Resources - Stone",
        "**Bigfoot Country** (Level 46+): 150 stone\n**Blade's Base** (Level ??+): 62 stone, 4 iron\n**Tronk's Base** (Level 14+): 50 stone\n**Warlord Gantas' Fortress** (Level ??+): 20 stone, 5 wood, 10 iron",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/f/fe/Resource-stone.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445373352511537214/stonelocations.png?ex=69301c54&is=692ecad4&hm=9a2c9698d2f847822a75ff2f5fc4ca67946e1931301e381f990c2a798ed6e49b&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":raiding-resources", "Back")
        )
    );
    static private final Function<Long, GuidePage> RAIDING_WOOD = userId -> new GuidePage(
        "Guides: Raiding Resources - Wood",
        "**Raider Farms** (Level ??+): 120 wood\n**Greenborough** (Level ??+): 50 wood, 30 lumber",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/8/88/Resource-wood.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445950908289781841/woodlocations.png?ex=69323639&is=6930e4b9&hm=8e2518651e01656a265341720b6b5ca1c63dcf58ab1dd85a39d2b12988f5e711&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":raiding-resources", "Back")
        )
    );
    static private final Function<Long, GuidePage> RAIDING_IRON = userId -> new GuidePage(
        "Guides: Raiding Resources - Iron",
        "**Greenborough** (Level ??+): 30 iron, 6 stone, 5 wood\n**Warlord Gantas' Fortress** (Level ??+): 10 iron, 20 stone, 5 wood",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/b/b0/Resource-iron.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445958063554035944/ironlocations.png?ex=69323ce2&is=6930eb62&hm=2d3e0c11bba74985e4507df0c6231779fdb737ddf372fa819daa8f5e1bf3158e&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":raiding-resources", "Back")
        )
    );
    static private final Function<Long, GuidePage> RAIDING_COAL = userId -> new GuidePage(
        "Guides: Raiding Resources - Coal",
        "**Sarin's Base** (Level ??+): 20 coal, 8 stone, 5 wood",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/4/44/Resource-coal.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445959942577324102/coallocations.png?ex=69323ea2&is=6930ed22&hm=dd35b5e5340e92bf1bf80ea893cfc89a0ed5d8a3f461a95068710722c3c8a493&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":raiding-resources", "Back")
        )
    );
    static private final Function<Long, GuidePage> RAIDING_OIL = userId -> new GuidePage(
        "Guides: Raiding Resources - Oil",
        "**Greenborough** (Level ??+): 40 oil, 6 stone",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/9/9e/Resource-oil.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445954887962595488/oillocations.png?ex=693239ed&is=6930e86d&hm=1937ec8a097f5165eb39022f725d36c03aad71e28127ec3278014bd9680260dd&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":raiding-resources", "Back")
        )
    );
    static private final Function<Long, GuidePage> RAIDING_LUMBER = userId -> new GuidePage(
        "Guides: Raiding Resources - Lumber",
        "**Greenborough** (Level ??+): 30 lumber, 50 wood",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/7/7c/Resource-lumber.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445961173160689756/lumberlocations.png?ex=69323fc8&is=6930ee48&hm=3b46ef90011d8284ef90f829b0a883d44e9f9fb3b199a9d6108a8623282f8f42&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":raiding-resources", "Back")
        )
    );
    static private final Function<Long, GuidePage> BOSS_FORMATIONS = userId -> new GuidePage(
        "Guides: Boss Formations",
        "This information is regarding the repeatable versions of bosses. Choose a boss below to learn more.",
        null,
        null,
        null,
        ActionRow.of(
            StringSelectMenu.create("guideselect:" + userId)
                .setPlaceholder("Select a boss")
                .addOption("Ancient Construct", "boss-formations-ancient-construct")
                .addOption("Dreadnought", "boss-formations-dreadnought")
                .addOption("The Kraken", "boss-formations-kraken")
                .addOption("Ancient Sentinel", "boss-formations-ancient-sentinel")
                .build()
        ),
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":home", "Back")
        )
    );
    static private final Function<Long, GuidePage> BOSS_FORMATIONS_ANCIENT_CONSTRUCT = userId -> new GuidePage(
        "Guides: Boss Formations - Ancient Construct",
        "**Free to Play**: Use a minimum of seven Tank Killers at rank four or higher in two 2x2 blocks, with the last unit being any kind of tank, " + 
        "or use eight Tank Killers if you have eight. Make sure to use the front row Tank Killers first because they have the highest chance to be destroyed." + 
        "\n**Pay to Win**: Use Super Tanks in the front row to block for Tank Killers. Place two Demomen on the back row and use their triple shot attack after the Tank Killers have been used.",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/2/26/Hero_ancient_robot_icon.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445564481743880212/image.png?ex=6930ce55&is=692f7cd5&hm=8d16bac4f58e6d0c9920e1abcf741b583c71d6e0d759a918f3d02ebb0c1c3a2b&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":boss-formations", "Back")
        )
    );
    static private final Function<Long, GuidePage> BOSS_FORMATIONS_DREADNOUGHT = userId -> new GuidePage(
        "Guides: Boss Formations - Dreadnought",
        "*Make sure all units are at least rank four!*\n\n" + 
        "**Free to Play**: Place three Buoys in the front row to absorb damage. Beside them, a Baby Grouper (using the Nibble attack) to take out the Submarines ideally in one attack. " + 
        "Behind the Buoys and the Baby Grouper, you can fit seven Raptor-Class Battleships. Use the battleships' Bombard attack to deal damage to the Dreadnought." + 
        "\n**Pay to Win**: The formation used is the same as the Free to Play formation, but replace the Baby Grouper with a Monster Grouper and the Raptor-Class Battleships with Mammoth-Class Battleships.",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/2/24/Boss_ship_dreadnaught_icon.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1445566599066288238/image.png?ex=6930d04e&is=692f7ece&hm=39fa8ff5735659b7909d0f09462dcb1ba619ea52dacf0a548f311584b5fa3b33&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":boss-formations", "Back")
        )
    );
    static private final Function<Long, GuidePage> BOSS_FORMATIONS_KRAKEN = userId -> new GuidePage(
        "Guides: Boss Formations - The Kraken",
        "*Make sure all units are at least rank four!*\n\n" +
        "**Formation**: Use three Buoys in the front, and two Baby or Monster Groupers on the side. Place Raptor- or Mammoth-Class Battleships on the edges. " +
        "The Buoys and Groupers have great resistance to Crushing, Piercing and Fire damage, so will last longer against the Kraken and its Tentacle's attacks. " +
        "The Kraken's Acidic Ink does the most damage to units at the forefront, so Buoys are ideal to absorb this damage.\n" +
        "**Strategy**: Continuously use the Bombard attack from your battleships to hit the Kraken head. If the Bombard attack is unavailable, use the Broadside attack only if the attack can actually target the Kraken head. The residual (splash) damage from Broadside is little and the Mammoth-Class' machine gun or Grouper can be used instead.",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/f/f6/Boss_kraken_body_nowater.png",
        "https://cdn.discordapp.com/attachments/1041212643958071336/1447083991185358909/image.png?ex=6936557d&is=693503fd&hm=0e9bed767cf459863448317a16e52ec25f9949d86b45ae24909c9cc81f251907&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":boss-formations", "Back")
        )
    );
    static private final Function<Long, GuidePage> BOSS_FORMATIONS_ANCIENT_SENTINEL = userId -> new GuidePage(
        "Guides: Boss Formations - Ancient Sentinel",
        "Just use Veterans.",
        "This is an upcoming boss",
        "https://static.wikia.nocookie.net/battlenations/images/5/55/Hero_ancient_BossFull_icon.png",
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":boss-formations", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES = userId -> new GuidePage(
        "Guides: Infection Rates",
        "You can spend five Black Nanopods in the Infection Test Facility to turn an injured unit into an Infected unit. Each unit has different chances to turn into different Infected units. The full infection rate table can also be found [here](https://battlenations.miraheze.org/wiki/The_Infected#Infection_Rates).\nChoose a specimen type to learn which units to infect for your desired Infected.",
        null,
        "https://static.wikia.nocookie.net/battlenations/images/f/fa/Comp_mil_hospital_zombies_icon.png",
        null,
        ActionRow.of(
            StringSelectMenu.create("guideselect:" + userId)
                .setPlaceholder("Select an Infected type")
                .addOption("Bullfrogs (\"Specimen a\")", "infection-rates-a")
                .addOption("Creepers (\"Specimen b\")", "infection-rates-b")
                .addOption("Cannoneers (\"Specimen c\")", "infection-rates-c")
                .addOption("Stalkers (\"Specimen d\")", "infection-rates-d")
                .addOption("Colossi (\"Specimen e\")", "infection-rates-e")
                .addOption("Hunters (\"Specimen f\")", "infection-rates-f")
                .addOption("Shredders (\"Specimen g\")", "infection-rates-g")
                .addOption("Crawlers (\"Specimen h\")", "infection-rates-h")
                .addOption("Maulers (\"Specimen i\")", "infection-rates-i")
                .build()
        ),
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":home", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_A = userId -> new GuidePage(
        "Guides: Infection Rates - Bullfrogs (\"Specimen a\")",
        null,
        null,
        null,
        "https://cdn.discordapp.com/attachments/1041212643958071336/1447767699777130531/bullfrogrates.png?ex=6938d23d&is=693780bd&hm=42e909d92a126f93f3135f98af3ddc1ef96f447a7cbc78bdc1ba96b803110d0f&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_B = userId -> new GuidePage(
        "Guides: Infection Rates - Creepers (\"Specimen b\")",
        null,
        null,
        null,
        "https://cdn.discordapp.com/attachments/1041212643958071336/1448099476580597760/creeperrates.png?ex=693a073b&is=6938b5bb&hm=3fe9ebb35068ff61ac2c988470a5ed7b39f585769487b8f31ad843f83815f550&",
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_C = userId -> new GuidePage(
        "Guides: Infection Rates - Cannoneers (\"Specimen c\")",
        "Coming soon.",
        null,
        null,
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_D = userId -> new GuidePage(
        "Guides: Infection Rates - Stalkers (\"Specimen d\")",
        "Coming soon.",
        null,
        null,
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_E = userId -> new GuidePage(
        "Guides: Infection Rates - Colossi (\"Specimen e\")",
        "Coming soon.",
        null,
        null,
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_F = userId -> new GuidePage(
        "Guides: Infection Rates - Hunters (\"Specimen f\")",
        "Coming soon.",
        null,
        null,
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_G = userId -> new GuidePage(
        "Guides: Infection Rates - Shredders (\"Specimen g\")",
        "Coming soon.",
        null,
        null,
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_H = userId -> new GuidePage(
        "Guides: Infection Rates - Crawlers (\"Specimen h\")",
        "Coming soon.",
        null,
        null,
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> INFECTION_RATES_I = userId -> new GuidePage(
        "Guides: Infection Rates - Maulers (\"Specimen i\")",
        "Coming soon.",
        null,
        null,
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":infection-rates", "Back")
        )
    );
    static private final Function<Long, GuidePage> OTHER = userId -> new GuidePage(
        "Other Guides",
        "The following are externally created guides that you may find useful:\n" +
        "* [Detailed Leveling Guide](https://docs.google.com/spreadsheets/d/e/2PACX-1vQSn1Krwu5fDOtmC4wcbyS1brc7NCJJpqljSB0zlQFYHjs62JFh0CbFy-LqJcao3xt-iqCze17HFHRm/pubhtml)\n" +
        "* [Tier 2 Resources Efficiency Sheet](https://docs.google.com/spreadsheets/d/1BXizD0CArTvn36QPLhJASkJ4FrdS_Va1M1_K_WJbmAE)\n" + 
        "* [Unit Guide](https://docs.google.com/document/d/11NxaG86XYPrvQk6CTV6HFQnJ24_Zm0CA6v2A5_vxLu0)*",
        "* No longer maintained, updated or accurate",
        null,
        null,
        ActionRow.of(
            Button.secondary("guideselect:" + userId + ":home", "Back")
        )
    );

    static private Map<String, Function<Long, GuidePage>> pages = new HashMap<>();
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
        pages.put("infection-rates", INFECTION_RATES);
        pages.put("infection-rates-a", INFECTION_RATES_A);
        pages.put("infection-rates-b", INFECTION_RATES_B);
        pages.put("infection-rates-c", INFECTION_RATES_C);
        pages.put("infection-rates-d", INFECTION_RATES_D);
        pages.put("infection-rates-e", INFECTION_RATES_E);
        pages.put("infection-rates-f", INFECTION_RATES_F);
        pages.put("infection-rates-g", INFECTION_RATES_G);
        pages.put("infection-rates-h", INFECTION_RATES_H);
        pages.put("infection-rates-i", INFECTION_RATES_I);
        pages.put("other", OTHER);
    }
    static public GuidePage getPage(String pageId, long userId) {
        return pages.get(pageId).apply(userId);
    }
}

