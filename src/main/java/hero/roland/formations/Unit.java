package hero.roland.formations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public enum Unit {
    UNKNOWN("orange_question_mark", "?") {
        @Override public String frontFilePath() { return "/units/orange_question_mark.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 32; }
        @Override public int frontY() { return 95; }
    },
    RECON_VEHICLE("apc", "Recon Vehicle") {
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 105; }
        @Override public int backY() { return 111; }
    },
    BOOM_BOOM("boomboom", "Boom Boom") {
        @Override public int frontX() { return 41; }
        @Override public int frontY() { return 124; }
    },
    RAIDER_BRAWLER("brawlerraider", "Raider Brawler") {
        @Override public int frontX() { return 46; }
        @Override public int frontY() { return 141; }
        @Override public int backY() { return 135; }
    },
    DUST_WALKER("dustwalkerraider", "Dust Walker") {
        @Override public int frontX() { return 47; }
        @Override public int frontY() { return 122; }
        @Override public int backY() { return 130; }
        @Override public int backX() { return 40; }
    },
    FIREBREATHER("firebreather", "Firebreather") {
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 136; }
        @Override public int backX() { return 35; }
    },
    FLAME_TURRET("flameturret", "Flame Turret") {
        @Override public int frontX() { return 29; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 160; }
    },
    WARLORD_GANTAS("gantas", "Warlord Gantas") {
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 166; }
    },
    GUN_TRUCK("guntruck", "Gun Truck") {
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 70; }
    },
    LIGHT_TANK("lighttank", "Light Tank") {
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 50; }
    },
    TEMPEST("mgtank", "Tempest") {
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 111; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 120; }
    },
    MAMMOTH_RIDER("mammothraider", "Mammoth Rider") {
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 184; }
        @Override public int backY() { return 165; }
    },
    WOLF_BOMBADIER("swbombadier", "Wolf Bombadier, Wolf Thunder") {
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 40; }
    },
    WOLF_DEFENDER("swdefender", "Wolf Defender, Wolf Spartan") {
        @Override public int frontX() { return 37; }
        @Override public int frontY() { return 106; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 123; }
    },
    WOLF_DEVASTATOR("swdevastator", "Wolf Devastator, Wolf Annihilator") {
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 35; }
    },
    WOLF_ENFORCER("swenforcer", "Wolf Enforcer, Wolf Judge") {
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 127; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 120; }
    },
    WOLF_GRENADIER("swgrenadier", "Wolf Grenadier, Elite Wolf Grenadier") {
        @Override public int frontX() { return 34; }
        @Override public int frontY() { return 112; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 120; }
    },
    WOLF_THUG("swthug", "Wolf Thug, Wolf Howler") {
        @Override public int frontX() { return 41; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 35; }
    },
    WOLF_ARMORED_TRUCK("swarmoredtruck", "Wolf Armored Truck, Alpha Wolf Truck") { // Front & Back
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 125; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 123; }
    },
    WOLF_SCRAPPER("swscrapper", "Wolf Scrapper, Wolf Chopper") {
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 133; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 150; }
    },
    SNIPER("sniper2", "Sniper") {
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 109; }
    },
    SUPER_TANK("supertank", "Super Tank") {
        @Override public int frontX() { return 78; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 85; }
    },
    MEERKAT("tow", "Meerkat") {
        @Override public int frontX() { return 51; }
        @Override public int frontY() { return 114; }
    },
    FLYING_DEXTER_FRAGMENT("air_ancient_fragment", "Flying Dexter Fragment") {
        @Override public int frontX() { return 96; }
        @Override public int frontY() { return 258; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 262; }
    },
    UH1B_SKYRAPTOR("air_attack_helicopter", "UH-1B SkyRaptor") {
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 172; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 160; }
    },
    Z218_BOMBER("air_bomber", "Z2-18 Bomber") {
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 185; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 168; }
    },
    THUNDERCLOUD_F10("air_corsair", "Thundercloud F10") {
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 136; }
        @Override public int backY() { return 145; }
    },
    V14_MAVERICK("air_jet_fighter", "V-14 Maverick") {
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 156; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 140; }
    },
    FALCONS_NEST("air_raider_zeppelin", "Falcon's Nest") {
        @Override public String id() { return "air_raider_zeppelin"; }
        @Override public int frontX() { return 99; }
        @Override public int frontY() { return 181; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 215; }
    },
    PROTO_HUNTER("air_s_trooper_zombie", "Specimen f01 \"Proto-Hunter\"") {
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 192; }
        @Override public int backY() { return 187; }
    },
    SPECIMEN_HUNTER("air_s_trooper_zombie_b", "Specimen f02 \"Hunter\"") {
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    ADVANCED_HUNTER("air_s_trooper_zombie_c", "Specimen f03 \"Advanced Hunter\"") {
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    ARCHETYPE_HUNTER("air_s_trooper_zombie_d", "Specimen f04 \"Archetype Hunter\"") {
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    SPIDERWASP_DRONE("air_spiderwasp_striker", "Spiderwasp Drone") {
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 190; }
        @Override public int backX() { return 40; }
    },
    ROYAL_SPIDERWASP_DRONE("air_spiderwasp_striker_70", "Royal Spiderwasp Drone") {
        @Override public int frontX() { return SPIDERWASP_DRONE.frontX(); }
        @Override public int frontY() { return SPIDERWASP_DRONE.frontY() - 1; }
        @Override public int backX() { return SPIDERWASP_DRONE.backX(); }
        @Override public int backY() { return SPIDERWASP_DRONE.backY(); }
    },
    SILVERWOLF_CROP_BUSTER("air_sw_plane", "Silverwolf Crop Buster") {
        @Override public int frontX() { return 83; }
        @Override public int frontY() { return 155; }
        @Override public int backX() { return 107; }
        @Override public int backY() { return 170; }
    },
    SILVERWOLF_CHUNOOK_HELICOPTER("air_sw_whirlybird", "Silverwolf Chunook Helicopter") {
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 219; }
        @Override public int backX() { return 93; }
        @Override public int backY() { return 205; }
    },
    B10_WILD_BOAR("air_warthog", "B10 Wild Boar") {
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 66; }
        @Override public int backY() { return 120; }
    },
    L60_HAWKER_HURRICANE("air_ww2_fighter", "L-60 Hawker Hurricane") {
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 149; }
        @Override public int backY() { return 137; }
    },
    ARMORED_FORTRESS("armoredfortress", "Armored Fortress") { // Front & Back
        @Override public String id() { return "armoredfortress"; }
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 170; }
        @Override public int backY() { return 177; }
    },
    ARMORED_RAIDER_MAMMOTH("armoredmammoth", "Armored Raider Mammoth") { // Front
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 200; }
    },
    ARMORED_PILLBOX("armoredpillbox", "Armored Pillbox") { // Front & Back
        @Override public String frontFilePath() { return "/units/armoredpillbox.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 110; }
    },
    ARSONIST("arsonist", "Arsonist") {
        @Override public String id() { return "arsonist"; }
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 148; }
        @Override public int backY() { return 130; }
    },
    LIGHT_ARTILLERY("artillery", "Light Artillery") {
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 121; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    ASSASSINATOR("assassinator", "Assassinater") { // Front & Back (Name is a typo in-game)
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 135; }
    },
    BAZOOKA_SQUAD("bazookaTeam", "Bazooka Squad") {
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 114; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 130; }
    },
    BIO_GRENADIER("biogrenadier", "Bio Grenadier") {
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 30; }
    },
    BLOCKHOUSE("blockhouses_idle", "Blockhouse") {
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 142; }
        @Override public int backY() { return 125; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_LEFT("boss_goliath_tank_leftside", "Multi-Launch Rocket System (Left)") { // Front
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 318; }
    },
    GOLIATH_TANK("boss_goliath_tank_main", "Goliath Tank") { // Front
        @Override public int frontX() { return 122; }
        @Override public int frontY() { return 380; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_RIGHT("boss_goliath_tank_rightside", "Multi-Launch Rocket System (Right)") { // Front
        @Override public int frontX() { return 37; }
        @Override public int frontY() { return 266; }
    },
    THE_KRAKEN("boss_kraken_body", "The Kraken") { // Front
        @Override public int frontX() { return 151; }
        @Override public int frontY() { return 161; }
    },
    KRAKEN_TENTACLE("boss_kraken_arm", "Kraken Tentacle") { // Front & Back
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 206; }
        @Override public int backX() { return 85; }
    },
    DREADNOUGHT("boss_ship_dreadnought", "Dreadnought") { // Front
        @Override public int frontX() { return 107; }
        @Override public int frontY() { return 313; }
    },
    SPIDERWASP_QUEEN("boss_spiderwasp_queen", "Spiderwasp Queen") { // Front & Back
        @Override public int frontX() { return 134; }
        @Override public int frontY() { return 237; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 222; }
    },
    WOLF_CRUEL_BUS("cannonschoolbus", "Wolf Cruel Bus, Magic Cruel Bus") { // Front & Back
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 146; }
        @Override public int backX() { return 60; }
    },
    RAIDER_CANNONEER("cannonraider", "Raider Cannon Recruit, Raider Cannoneer, Raider Bombadier") { // Front & Back
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 130; }
    },
    RAIDER_CHAMPION("championraider", "Raider Champion") { // Front & Back
        @Override public int frontX() { return 64; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 35; }
    },
    CHEMICAL_SPRINKLER("chemsprinkler", "Chemical Sprinkler") { // Front & Back
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 156; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 150; }
    },
    CHEM_TROOPER("chemtrooper", "Chem Trooper") { // Front & Back
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 131; }
    },
    RANGER("commando", "Ranger") { // Front & Back
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 124; }
        @Override public int backY() { return 115; }
    },
    PEACE_KEEPER("crowdcontrol", "Peace Keeper") { // Front & Back
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 128; }
    },
    CONCRETE_WALL_A("def_barricade_cementwall", "Concrete Wall (Variant 1)") { // Front & Back
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 110; }
        @Override public int backY() { return 120; }
    },
    CONCRETE_WALL_B("def_barricade_concretewall", "Concrete Wall (Variant 2)") { // Front & Back
        @Override public String frontFilePath() { return "/units/def_barricade_concretewall.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 124; }
    },
    SANDBAGS("def_barricade_sandbags", "Sandbags") { // Front & Back
        @Override public String frontFilePath() { return "/units/def_barricade_sandbags.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 95; }
    },
    BUOY("def_buoy", "Buoy") {
        @Override public String frontFilePath() { return "/units/def_buoy.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 25; }
        @Override public int frontY() { return 121; }
    },
    PORTABLE_ELECTRIC_FENCE("def_fence_electric", "Portable Electric Fence") { // Front & Back
        @Override public String frontFilePath() { return "/units/def_fence_electric.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 20; }
        @Override public int backY() { return 145; }
    },
    FLOATING_MINE("def_mine", "Floating Mine") { // Front & Back
        @Override public String frontFilePath() { return "/units/def_mine.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 33; }
        @Override public int frontY() { return 96; }
    },
    RAIDER_FENCE("def_raiderbarricade", "Raider Fence, Raider Wall") { // Front
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 132; }
    },
    SPIDERWASP_EGG("def_spiderwasp_egg", "Spiderwasp Egg") { // Front & Back
        @Override public String frontFilePath() { return "/units/def_spiderwasp_egg.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 126; }
    },
    REINFORCED_CONCRETE_WALL("def_wall_concrete_60", "Reinforced Concrete Wall") { // Front & Back
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 114; }
        @Override public int backX() { return 57; }
        @Override public int backY() { return 128; }
    },
    WHIRLPOOL("def_whirlpool", "Whirlpool") { // Front & Back
        @Override public String frontFilePath() { return "/units/def_whirlpool.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 88; }
        @Override public int frontY() { return 91; }
    },
    DEMOLITIONIST("demolitionist", "Demolitionist") { // Front & Back
        @Override public int frontX() { return 34; }
        @Override public int frontY() { return 117; }
    },
    IMPERIAL_DRAGOON("dragoon", "Imperial Dragoon") { // Front & Back
        @Override public int frontX() { return 87; }
        @Override public int frontY() { return 110; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 155; }
    },
    DUNE_RIDER("dunerider", "Dune Rider") { // Front & Back
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 132; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 115; }
    },
    ELDER_SANDWORM("eldersandworm", "Elder Sandworm") { // Front
        @Override public int frontX() { return 96; }
        @Override public int frontY() { return 157; }
    },
    LIGHTNING_TROOPER("electrotrooper", "Lightning Trooper") { // Front & Back
        @Override public int frontX() { return 30; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 120; }
    },
    FLAME_TROOPER("flametrooper", "Flame Trooper") { // Front & Back
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 122; }
    },
    HORNET("fliegerhaust", "Hornet") { // Front & Back
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 135; }
    },
    GRENADIER("grenadier", "Grenadier") { // Front & Back
        @Override public int frontX() { return 39; }
        @Override public int frontY() { return 127; }
    },
    WATCHTOWER("guardtower_battle", "Watchtower") { // Front & Back
        @Override public String frontFilePath() { return "/units/guardtower_battle.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 87; }
        @Override public int frontY() { return 189; }
    },
    GUNNER("gunner", "Gunner") { // Front & Back
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 113; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 105; }
    },
    HEAVY_CHEMICAL_TANK("heavychemtank", "Heavy Chemical Tank") {
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 134; }
        @Override public int backY() { return 138; }
    },
    BRIMSTONE("heavylauncher", "Brimstone") {
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 150; }
    },
    HEAVY_ARTILLERY("heavyartillery", "Heavy Artillery") { // Front & Back
        @Override public int frontX() { return 92; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 150; }
    },
    HEAVY_TANK("heavytank", "Heavy Tank") { // Front & Back
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 74; }
        @Override public int backY() { return 140; }
    },
    ANCIENT_CONSTRUCT("hero_ancient_robot", "Ancient Construct") { // Front
        @Override public int frontX() { return 207; }
        @Override public int frontY() { return 279; }
    },
    MELEE_WEAPON_SYSTEM("hero_ancient_robot_2_arm_left", "Melee Weapon System") { // Front
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 349; }
    },
    RANGED_WEAPON_SYSTEM("hero_ancient_robot_2_arm_right", "Ranged Weapon System") { // Front
        @Override public int frontX() { return 149; }
        @Override public int frontY() { return 368; }
    },
    ANCIENT_SENTINEL("hero_ancient_robot_2_body", "Ancient Sentinel") { // Front
        @Override public int frontX() { return 132; }
        @Override public int frontY() { return 447; }
    },
    EXPERIMENTAL_CONSTRUCT("hero_i17_ancient_robot_clone", "Experimental Construct") { // Front
        @Override public int frontX() { return 208; }
        @Override public int frontY() { return 279; }
    },
    HITMAN("hitman", "Hitman") { // Front & Back
        @Override public int frontX() { return 23; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 40; }
    },
    HUNTER("hunter", "Hunter") { // Front & Back
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 128; }
    },
    RAILGUN_TANK("i17_veh_tank_railgun", "Railgun Tank") { // Front & Back
        @Override public int frontX() { return 87; }
        @Override public int frontY() { return 149; }
        @Override public int backY() { return 160; }
    },
    HUMVEE("jeep", "Humvee") { // Front & Back
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 116; }
    },
    JUGGERNAUT("juggernaut", "Juggernaut") { // Front & Back
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 135; }
    },
    HAILSTORM("katyusha", "Hailstorm") { // Front & Back
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 107; }
        @Override public int backY() { return 115; }
    },
    LIGHT_CHEMICAL_TANK("ltchemtank", "Light Chemical Tank") { // Front & Back
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 120; }
    },
    FIREDRAKE("ltflametank", "Firedrake") { // Front & Back
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 113; }
        @Override public int backY() { return 116; }
    },
    MEDIUM_TANK("mediumtank", "Medium Tank") { // Front & Back
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 109; }
        @Override public int backX() { return 62; }
        @Override public int backY() { return 125; }
    },
    PEACEMAKER("megaartillery", "Peacemaker") { // Front & Back
        @Override public int frontX() { return 119; }
        @Override public int frontY() { return 180; }
        @Override public int backX() { return 98; }
        @Override public int backY() { return 206; }
    },
    ARMADILLO("mgshield", "Armadillo") { // Front & Back
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 107; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 120; }
    },
    MINI_TANK("minitank", "Mini Tank") { // Front & Back
        @Override public int frontX() { return 38; }
        @Override public int frontY() { return 109; }
    },
    HEAVY_GUNNER("minigunner", "Heavy Gunner") { // Front & Back
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 121; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 125; }
    },
    ROCKET_TRUCK("mlrs", "Rocket Truck") { // Front & Back
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 113; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 122; }
    },
    MORTAR_TEAM("mortarteam", "Mortar Team") { // Front & Back
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 117; }
        @Override public int backY() { return 110; }
    },
    ARIES("mtart", "Aries") { // Front & Back
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 125; }
    },
    THE_ROCK("natbarricade_01", "The Rock") { // Front & Back
        @Override public String frontFilePath() { return "/units/natbarricade_01.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 31; }
        @Override public int frontY() { return 87; }
    },
    STONE_SLAB("natbarricade_02", "Stone Slab") { // Front & Back
        @Override public String frontFilePath() { return "/units/natbarricade_02.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 109; }
    },
    LINE_OF_ROCKS("natbarricade_03", "Line of Rocks") { // Front & Back
        @Override public String frontFilePath() { return "/units/natbarricade_03.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 118; }
    },
    GRANITE_BOULDER("natbarricade_04", "Granite Boulder") { // Front & Back
        @Override public String frontFilePath() { return "/units/natbarricade_04.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 137; }
    },
    DEBRIS("natbarricade_debris", "Debris") { // Front & Back
        @Override public String frontFilePath() { return "/units/natbarricade_debris.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 140; }
    },
    FALLEN_LOG("natbarricade_log", "Fallen Log") { // Front & Back
        @Override public String frontFilePath() { return "/units/natbarricade_log.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 107; }
    },
    NINJA_TROOPER("ninjatrooper", "Ninja Trooper") { // Front & Back
        @Override public int frontX() { return 36; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 33; }
        @Override public int backY() { return 140; }
    },
    JUNIOR_OFFICER("officer", "Junior Officer") { // Front & Back
        @Override public int frontX() { return 17; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 125; }
    },
    PILLBOX("pillbox", "Pillbox") { // Front & Back
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 128; }
    },
    HEAVY_RECON("premiumapc", "Heavy Recon Vehicle") { // Front & Back
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 139; }
        @Override public int backX() { return 83; }
        @Override public int backY() { return 125; }
    },
    RAIDER_WARRIOR("raider", "Raider Grunt, Raider Warrior") { // Front & Back
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 131; }
        @Override public int backX() { return 30; }
    },
    TRONK("raiderlieutboom", "Tronk") { // Front
        @Override public int frontX() { return 101; }
        @Override public int frontY() { return 146; }
    },
    CRAZY_BLADES("raiderlieutgirl", "Crazy Blades") { // Front
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 135; }
    },
    SARIN("raiderlieutthin", "Sarin") { // Front
        @Override public int frontX() { return 93; }
        @Override public int frontY() { return 163; }
    },
    RAIDER_WATCHTOWER("raiderwatchtower", "Raider Watchtower, Sturdy Watchtower, Deadly Watchtower") { // Front
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 164; }
    },
    COMMANDO("ranger", "Commando") { // Front & Back
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 119; }
    },
    RAT_KING("ratbrown", "Rat King") { // Front
        @Override public int frontX() { return 21; }
        @Override public int frontY() { return 57; }
    },
    MANGY_RAT("ratgrey", "Mangy Rat") { // Front
        @Override public int frontX() { return 21; }
        @Override public int frontY() { return 57; }
    },
    JET_SKI("rb_ship_jetski", "Jet Ski") { // Front & Back
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 116; }
    },
    POWER_BOAT("rb_ship_speedboat", "Power Boat") { // Front & Back
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 110; }
    },
    ARMORED_TUG("rb_ship_tugboat", "Armored Tug") { // Front
        @Override public int frontX() { return 71; }
        @Override public int frontY() { return 180; }
    },
    RPG_TROOPER("rpg", "RPG Trooper") { // Front & Back
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 125; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 130; }
    },
    ARCTIC_TROOPER("s_arctic_trooper", "Arctic Trooper") { // Front & Back
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 132; }
        @Override public int backX() { return 45; }
    },
    ARCTIC_TROOPER_2("s_arctic_trooper_rebel", "Arctic Trooper (Rebel)") { // Front
        @Override public int frontX() { return ARCTIC_TROOPER.frontX(); }
        @Override public int frontY() { return ARCTIC_TROOPER.frontY(); }
    },
    BIGFOOT("s_bigfoot_adult", "Bigfoot") { // Front & Back
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 147; }
    },
    BIGFOOT_WARRIOR("s_bigfoot_adult_55", "Bigfoot Warrior") { // Front & Back
        @Override public int frontX() { return BIGFOOT.frontX(); }
        @Override public int frontY() { return BIGFOOT.frontY(); }
    },
    YOUNG_BIGFOOT("s_bigfoot_child", "Young Bigfoot") { // Front & Back
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 124; }
        @Override public int backY() { return 120; }
    },
    APEX_MAULER("s_bigfoot_zombie_super_player", "Specimen i02 \"Apex Mauler\"") { // Front & Back
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 146; }
    },
    SPECIMEN_MAULER("s_bigfoot_zombie_player", "Specimen i01 \"Mauler\"") {
        @Override public int frontX() { return APEX_MAULER.frontX(); }
        @Override public int frontY() { return APEX_MAULER.frontY(); }
    },
    BOAR_VETERAN("s_boar_boarus_rex_55", "Boar Veteran") { // Front & Back
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 131; }
        @Override public int backY() { return 165; }
    },
    ALPHA_BOAR("s_boar_large", "Alpha Boar") { // Front & Back
        @Override public int frontX() { return 51; }
        @Override public int frontY() { return 110; }
    },
    WILD_BOAR("s_boar_medium", "Wild Boar") { // Front & Back
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 100; }
        @Override public int backY() { return 105; }
    },
    BOAR_PIGLET("s_boar_small", "Boar Piglet") { // Front & Back
        @Override public int frontX() { return 27; }
        @Override public int frontY() { return 82; }
        @Override public int backY() { return 95; }
    },
    IMPERIAL_PEACEMONGER("s_bountyhunter", "Imperial Peacemonger") { // Front & Back
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 151; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 145; }
    },
    COMMANDO_2("s_commando_rebel", "Commando (Rebel)") { // Front
        @Override public int frontX() { return COMMANDO.frontX(); }
        @Override public int frontY() { return 122; }
    },
    LIGHTNING_TOWER("s_def_tesla_coil", "Lightning Tower") { // Front & Back
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 217; }
    },
    SALAMANDER("s_flame_heavy", "Salamander") { // Front & Back
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 143; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 135; }
    },
    SILVER_WOLF_GOLDEN_EAGLE("s_guy_sniper", "Silver Wolf Golden Eagle (Level 5)") { // Front & Back
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 108; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 115; }
    },
    MAMMOTH_SEER("s_mammoth_king_55", "Mammoth Seer") { // Front & Back
        @Override public int frontX() { return 102; }
        @Override public int frontY() { return 140; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 175; }
    },
    MAMMOTH_ELDER("s_mammoth_large", "Mammoth Elder") { // Front & Back
        @Override public int frontX() { return MAMMOTH_SEER.frontX(); }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return MAMMOTH_SEER.backX(); }
        @Override public int backY() { return MAMMOTH_SEER.backY(); }
    },
    MAMMOTH("s_mammoth_medium", "Mammoth") { // Front & Back
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 128; }
        @Override public int backY() { return 140; }
    },
    MAMMOTH_TUSKLING("s_mammoth_small", "Mammoth Tuskling") { // Front & Back
        @Override public int frontX() { return 38; }
        @Override public int frontY() { return 98; }
        @Override public int backY() { return 115; }
    },
    BOARUS_REX("s_matriarchboar", "Boarus Rex, Boarus Rex II") { // Front
        @Override public int frontX() { return 74; }
        @Override public int frontY() { return 131; }
    },
    FIELD_AGENT("s_midrange_agent", "Field Agent") { // Front & Back
        @Override public int frontX() { return 38; }
        @Override public int frontY() { return 145; }
        @Override public int backY() { return 130; }
    },
    TURTLESHELLER("s_mortar_turtleshell", "Turtlesheller") { // Front & Back
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 153; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    PORTABLE_WALL("s_portablewall", "Portable Wall") { // Front & Back
        @Override public String frontFilePath() { return "/units/s_portablewall.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 104; }
        @Override public int backY() { return 106; }
    },
    PORTABLE_WALL_2("s_portablewall_rebel", "Portable Wall (Rebel)") {
        @Override public int frontX() { return PORTABLE_WALL.frontX(); }
        @Override public int frontY() { return PORTABLE_WALL.frontY() + 4; }
    },
    BRUTAL_CANNONEER("s_raider_bombadier_55", "Brutal Cannoneer, Brutal Bombadier") { // Front
        @Override public int frontX() { return 51; }
        @Override public int frontY() { return 138; }
    },
    BIG_BADA_BOOM("s_raider_boomboom_55", "Big Bada Boom") { // Front
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 125; }
    },
    BRUTAL_BRAWLER("s_raider_brawler_55", "Brutal Brawler") { // Front
        @Override public int frontX() { return RAIDER_BRAWLER.frontX(); }
        @Override public int frontY() { return RAIDER_BRAWLER.frontY(); }
    },
    BRUTAL_CHAMPION("s_raider_champion_55", "Brutal Champion, Noble Champion") { // Front
        @Override public int frontX() { return RAIDER_CHAMPION.frontX(); }
        @Override public int frontY() { return RAIDER_CHAMPION.frontY(); }
    },
    DUSTWALKER_DERVISH("s_raider_dustwalker_55", "Dustwalker Dervish") { // Front
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 123; }
    },
    SEARING_FIREBREATHER("s_raider_firebreather_55", "Searing Firebreather") { // Front
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 128; }
    },
    RAIDER_RIFLEMAN("s_raider_infantry_55", "Raider Rifleman") { // Front
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 129; }
    },
    RAIDER_SKIRMISHER("s_raider_raptorrider", "Raider Skirmisher, Tough Raider Skirmisher") { // Front & Back
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 170; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 195; }
    },
    ELITE_SKIRMISHER("s_raider_raptor_rider_55", "Elite Skirmisher, Ruthless Skirmisher") { // Front
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 170; }
    },
    RAIDER_OUTCAST("s_raider_sniper", "Raider Outcast, Tough Raider Outcast") { // Front & Back
        @Override public int frontX() { return 103; }
        @Override public int frontY() { return 127; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    ELITE_OUTCAST("s_raider_sniper_55", "Elite Outcast") { // Front
        @Override public int frontX() { return 103; }
        @Override public int frontY() { return 127; }
    },
    WILD_RAPTOR("s_raptor_large", "Wild Raptor, Scythetooth Raptor, Raptor Lord") { // Front & Back
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 138; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 160; }
    },
    RAPTOR("s_raptor_medium", "Raptor") { // Front & Back - Different to BATTLE_RAPTOR
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 75; }
        @Override public int backY() { return 130; }
    },
    YOUNG_RAPTOR("s_raptor_small", "Young Raptor") { // Front & Back
        @Override public int frontX() { return 27; }
        @Override public int frontY() { return 93; }
        @Override public int backX() { return 32; }
        @Override public int backY() { return 100; }
    },
    PRIMORDIAL_RAPTOR("s_raptor_tough_55", "Primordial Raptor") { // Front & Back
        @Override public int frontX() { return WILD_RAPTOR.frontX(); }
        @Override public int frontY() { return WILD_RAPTOR.frontY(); }
        @Override public int backX() { return WILD_RAPTOR.backX(); }
        @Override public int backY() { return WILD_RAPTOR.backY(); }
    },
    PROTO_SHREDDER("s_raptor_zombie", "Specimen g01 \"Proto-Shredder\"") { // Front & Back
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 95; }
        @Override public int backY() { return 145; }
    },
    SPECIMEN_SHREDDER("s_raptor_zombie_b", "Specimen g02 \"Shredder\"") { // Front & Back
        @Override public int frontX() { return PROTO_SHREDDER.frontX(); }
        @Override public int frontY() { return PROTO_SHREDDER.frontY(); }
        @Override public int backX() { return PROTO_SHREDDER.backX(); }
        @Override public int backY() { return PROTO_SHREDDER.backY(); }
    },
    ADVANCED_SHREDDER("s_raptor_zombie_c", "Specimen g03 \"Advanced Shredder\"") { // Front & Back
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return PROTO_SHREDDER.frontY(); }
        @Override public int backX() { return PROTO_SHREDDER.backX(); }
        @Override public int backY() { return PROTO_SHREDDER.backY(); }
    },
    ARCHETYPE_SHREDDER("s_raptor_zombie_d", "Specimen g04 \"Archetype Shredder\"") { // Front & Back
        @Override public int frontX() { return PROTO_SHREDDER.frontX(); }
        @Override public int frontY() { return PROTO_SHREDDER.frontY(); }
        @Override public int backX() { return PROTO_SHREDDER.backX(); }
        @Override public int backY() { return PROTO_SHREDDER.backY(); }
    },
    WANDERING_SAMURAI("s_samurai", "Wandering Samurai") { // Front & Back
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 40; }
    },
    SANDBAG_PILE("s_sandbags", "Sandbag Pile") { // Front & Back
        @Override public String frontFilePath() { return "/units/s_sandbags.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 86; }
    },
    SANDWORM_GUARDIAN("s_sandworm_55", "Sandworm Guardian") { // Front & Back
        @Override public int frontX() { return 113; }
        @Override public int frontY() { return 186; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 215; }
    },
    EMPEROR_SANDWORM("s_sandworm_emperor", "Emperor Sandworm, The Ridgy-Didge") { // Front
        @Override public int frontX() { return 180; }
        @Override public int frontY() { return 252; }
    },
    GROUNDSHAKER("s_sandworm_large", "Groundshaker") { // Front & Back
        @Override public int frontX() { return 114; }
        @Override public int frontY() { return SANDWORM_GUARDIAN.frontY(); }
        @Override public int backX() { return SANDWORM_GUARDIAN.backX(); }
        @Override public int backY() { return SANDWORM_GUARDIAN.backY(); }
    },
    IRONHIDE_SANDWORM("s_sandworm_medium", "Ironhide Sandworm") { // Front & Back
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 159; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 190; }
    },
    SPIDERWASP_STRIKER("s_spiderwasp_spitter", "Spiderwasp Striker") { // Front & Back
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 87; }
        @Override public int backY() { return 122; }
    },
    ROYAL_SPIDERWASP_STRIKER("s_spiderwasp_spitter_70", "Royal Spiderwasp Striker") { // Front & Back
        @Override public int frontX() { return SPIDERWASP_STRIKER.frontX(); }
        @Override public int frontY() { return SPIDERWASP_STRIKER.frontY(); }
        @Override public int backX() { return SPIDERWASP_STRIKER.backX(); }
        @Override public int backY() { return SPIDERWASP_STRIKER.backY(); }
    },
    SPIDERWASP_WARRIOR("s_spiderwasp_warrior", "Spiderwasp Warrior") { // Front & Back
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 155; }
        @Override public int backX() { return 98; }
        @Override public int backY() { return 136; }
    },
    ROYAL_SPIDERWASP_WARRIOR("s_spiderwasp_warrior_70", "Royal Spiderwasp Warrior") { // Front & Back
        @Override public int frontX() { return SPIDERWASP_WARRIOR.frontX(); }
        @Override public int frontY() { return SPIDERWASP_WARRIOR.frontY(); }
        @Override public int backX() { return SPIDERWASP_WARRIOR.backX(); }
        @Override public int backY() { return SPIDERWASP_WARRIOR.backY(); }
    },
    SPIDERWASP_WORKER("s_spiderwasp_worker", "Spiderwasp Worker") { // Front & Back
        @Override public int frontX() { return 78; }
        @Override public int frontY() { return 161; }
        @Override public int backY() { return 147; }
    },
    ROYAL_SPIDERWASP_WORKER("s_spiderwasp_worker_70", "Royal Spiderwasp Worker") { // Front & Back
        @Override public int frontX() { return SPIDERWASP_WORKER.frontX(); }
        @Override public int frontY() { return SPIDERWASP_WORKER.frontY(); }
        @Override public int backX() { return SPIDERWASP_WORKER.backX(); }
        @Override public int backY() { return SPIDERWASP_WORKER.backY(); }
    },
    BIG_GAME_HUNTER("s_trooper_biggamehunter", "Big Game Hunter") { // Front & Back
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 118; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 125; }
    },
    CRYO_TROOPER("s_trooper_cryo", "Cryo Trooper") { // Front & Back
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 58; }
        @Override public int backY() { return 150; }
    },
    LIGHTNING_DRAGOON("s_trooper_dragoon_heavy", "Lightning Dragoon") { // Front & Back
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 135; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 150; }
    },
    ELEMENTAL_TROOPER("s_trooper_fire_ice", "Elemental Trooper") { // Front & Back
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 125; }
    },
    AERO_JETPACK_TROOPER("s_trooper_jetpack", "Aero Jetpack Trooper") { // Front & Back
        @Override public int frontX() { return 44; }
        @Override public int frontY() { return 159; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 130; }
    },
    PLASMA_TROOPER("s_trooper_plasma", "Plasma Trooper") { // Front & Back
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 128; }
    },
    RAILGUN_TROOPER("s_trooper_railgun", "Railgun Trooper") { // Front & Back
        @Override public int frontX() { return 93; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 60; }
    },
    GUERRILLA("s_trooper_saboteur_heavy", "Guerrilla") { // Front & Back
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 130; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 140; }
    },
    SPECIAL_AGENT("s_trooper_specialagent", "Special Agent") { // Front & Back
        @Override public int frontX() { return 41; }
        @Override public int frontY() { return 154; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 140; }
    },
    VETERAN("s_trooper_veteran", "Veteran") { // Front & Back
        @Override public int frontX() { return 39; }
        @Override public int frontY() { return 172; }
        @Override public int backX() { return 53; }
        @Override public int backY() { return 163; }
    },
    VETERAN_2("s_trooper_veteran_rebel", "Veteran (Rebel)") { // Front
        @Override public int frontX() { return VETERAN.frontX(); }
        @Override public int frontY() { return VETERAN.frontY(); }
        @Override public int backX() { return VETERAN.backX(); }
        @Override public int backY() { return VETERAN.backY(); }
    },
    PROTO_CREEPER("s_trooper_zombie", "Specimen b01 \"Proto-Creeper\"") { // Front & Back
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 122; }
    },
    SPECIMEN_CREEPER("s_trooper_zombie_b", "Specimen b02 \"Creeper\"") { // Front & Back
        @Override public int frontX() { return PROTO_CREEPER.frontX(); }
        @Override public int frontY() { return PROTO_CREEPER.frontY(); }
        @Override public int backX() { return PROTO_CREEPER.backX(); }
        @Override public int backY() { return PROTO_CREEPER.backY(); }
    },
    ADVANCED_CREEPER("s_trooper_zombie_c", "Specimen b03 \"Advanced Creeper\"") { // Front & Back
        @Override public int frontX() { return PROTO_CREEPER.frontX(); }
        @Override public int frontY() { return PROTO_CREEPER.frontY(); }
        @Override public int backX() { return PROTO_CREEPER.backX(); }
        @Override public int backY() { return PROTO_CREEPER.backY(); }
    },
    ARCHETYPE_CREEPER("s_trooper_zombie_d", "Specimen b04 \"Archetype Creeper\"") { // Front & Back
        @Override public int frontX() { return PROTO_CREEPER.frontX(); }
        @Override public int frontY() { return PROTO_CREEPER.frontY(); }
        @Override public int backX() { return PROTO_CREEPER.backX(); }
        @Override public int backY() { return PROTO_CREEPER.backY(); }
    },
    PROTO_CANNONEER("s_trooper_zombie_cannon", "Specimen c01 \"Proto-Cannoneer\"") { // Front & Back
        @Override public int frontX() { return 39; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 122; }
    },
    SPECIMEN_CANNONEER("s_trooper_zombie_cannon_b", "Specimen c02 \"Cannoneer\"") { // Front & Back
        @Override public int frontX() { return PROTO_CANNONEER.frontX(); }
        @Override public int frontY() { return PROTO_CANNONEER.frontY(); }
        @Override public int backX() { return PROTO_CANNONEER.backX(); }
        @Override public int backY() { return PROTO_CANNONEER.backY(); }
    },
    ADVANCED_CANNONEER("s_trooper_zombie_cannon_c", "Specimen c03 \"Advanced Cannoneer\"") { // Front & Back
        @Override public int frontX() { return PROTO_CANNONEER.frontX(); }
        @Override public int frontY() { return PROTO_CANNONEER.frontY(); }
        @Override public int backX() { return PROTO_CANNONEER.backX(); }
        @Override public int backY() { return PROTO_CANNONEER.backY(); }
    },
    ARCHETYPE_CANNONEER("s_trooper_zombie_cannon_d", "Specimen c04 \"Archetype Cannoneer\"") { // Front & Back
        @Override public int frontX() { return PROTO_CANNONEER.frontX(); }
        @Override public int frontY() { return PROTO_CANNONEER.frontY(); }
        @Override public int backX() { return PROTO_CANNONEER.backX(); }
        @Override public int backY() { return PROTO_CANNONEER.backY(); }
    },
    PROTO_STALKER("s_trooper_zombie_ninja", "Specimen d01 \"Proto-Stalker\"") { // Front & Back
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 101; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 110; }
    },
    SPECIMEN_STALKER("s_trooper_zombie_ninja_b", "Specimen d02 \"Stalker\"") { // Front & Back
        @Override public int frontX() { return PROTO_STALKER.frontX() + 18; }
        @Override public int frontY() { return PROTO_STALKER.frontY() + 1; }
        @Override public int backX() { return PROTO_STALKER.backX(); }
        @Override public int backY() { return PROTO_STALKER.backY(); }
    },
    ADVANCED_STALKER("s_trooper_zombie_ninja_c", "Specimen d03 \"Advanced Stalker\"") { // Front & Back
        @Override public int frontX() { return PROTO_STALKER.frontX(); }
        @Override public int frontY() { return PROTO_STALKER.frontY(); }
        @Override public int backX() { return PROTO_STALKER.backX(); }
        @Override public int backY() { return PROTO_STALKER.backY(); }
    },
    ARCHETYPE_STALKER("s_trooper_zombie_ninja_d", "Specimen d04 \"Archetype Stalker\"") { // Front & Back
        @Override public int frontX() { return PROTO_STALKER.frontX(); }
        @Override public int frontY() { return PROTO_STALKER.frontY(); }
        @Override public int backX() { return PROTO_STALKER.backX(); }
        @Override public int backY() { return PROTO_STALKER.backY(); }
    },
    APEX_STALKER("s_trooper_zombie_ninja_super", "Specimen d05 \"Apex Stalker\"") { // Front & Back
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 120; }
        @Override public int backY() { return 113; }
    },
    PROTO_CRAWLER("s_trooper_zombie_spider", "Specimen h01 \"Proto-Crawler\"") { // Front & Back
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 82; }
        @Override public int backY() { return 118; }
    },
    SPECIMEN_CRAWLER("s_trooper_zombie_spider_b", "Specimen h02 \"Crawler\"") { // Front & Back
        @Override public int frontX() { return PROTO_CRAWLER.frontX(); }
        @Override public int frontY() { return PROTO_CRAWLER.frontY(); }
        @Override public int backX() { return PROTO_CRAWLER.backX(); }
        @Override public int backY() { return PROTO_CRAWLER.backY(); }
    },
    ADVANCED_CRAWLER("s_trooper_zombie_spider_c", "Specimen h03 \"Advanced Crawler\"") { // Front & Back
        @Override public int frontX() { return PROTO_CRAWLER.frontX(); }
        @Override public int frontY() { return PROTO_CRAWLER.frontY(); }
        @Override public int backX() { return PROTO_CRAWLER.backX(); }
        @Override public int backY() { return PROTO_CRAWLER.backY(); }
    },
    ARCHETYPE_CRAWLER("s_trooper_zombie_spider_d", "Specimen h04 \"Archetype Crawler\"") { // Front & Back
        @Override public int frontX() { return PROTO_CRAWLER.frontX(); }
        @Override public int frontY() { return PROTO_CRAWLER.frontY(); }
        @Override public int backX() { return PROTO_CRAWLER.backX(); }
        @Override public int backY() { return PROTO_CRAWLER.backY(); }
    },
    PROTO_BULLFROG("s_trooper_zombie_spitter", "Specimen a01 \"Proto-Bullfrog\"") { // Front & Back
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 102; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 115; }
    },
    SPECIMEN_BULLFROG("s_trooper_zombie_spitter_b", "Specimen a02 \"Bullfrog\"") { // Front & Back
        @Override public int frontX() { return PROTO_BULLFROG.frontX() + 21; }
        @Override public int frontY() { return PROTO_BULLFROG.frontY(); }
        @Override public int backX() { return PROTO_BULLFROG.backX(); }
        @Override public int backY() { return PROTO_BULLFROG.backY(); }
    },
    ADVANCED_BULLFROG("s_trooper_zombie_spitter_c", "Specimen a03 \"Advanced Bullfrog\"") { // Front & Back
        @Override public int frontX() { return PROTO_BULLFROG.frontX(); }
        @Override public int frontY() { return PROTO_BULLFROG.frontY(); }
        @Override public int backX() { return PROTO_BULLFROG.backX(); }
        @Override public int backY() { return PROTO_BULLFROG.backY(); }
    },
    ARCHETYPE_BULLFROG("s_trooper_zombie_spitter_d", "Specimen a04 \"Archetype Bullfrog\"") { // Front & Back
        @Override public int frontX() { return PROTO_BULLFROG.frontX(); }
        @Override public int frontY() { return PROTO_BULLFROG.frontY(); }
        @Override public int backX() { return PROTO_BULLFROG.backX(); }
        @Override public int backY() { return PROTO_BULLFROG.backY(); }
    },
    APEX_BULLFROG("s_trooper_zombie_spitter_super", "Specimen a05 \"Apex Bullfrog\"") { // Front & Back
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 118; }
        @Override public int backX() { return 83; }
        @Override public int backY() { return 115; }
    },
    PROTO_COLOSSUS("s_trooper_zombie_tank", "Specimen e01 \"Colossus\"") { // Front & Back
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 78; }
        @Override public int backY() { return 130; }
    },
    ARCHETYPE_COLOSSUS("s_trooper_zombie_tank_b", "Specimen e01 \"Colossus\", Specimen e02 \"Archetype Colossus\"") { // Front & Back
        @Override public int frontX() { return PROTO_COLOSSUS.frontX(); }
        @Override public int frontY() { return PROTO_COLOSSUS.frontY(); }
        @Override public int backX() { return PROTO_COLOSSUS.backX(); }
        @Override public int backY() { return PROTO_COLOSSUS.backY(); }
    },
    APEX_COLOSSUS("s_trooper_zombie_tank_super", "Specimen e03 \"Apex Colossus\"") { // Front & Back
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 133; }
        @Override public int backX() { return PROTO_COLOSSUS.backX(); }
        @Override public int backY() { return PROTO_COLOSSUS.backY() + 9; }
    },
    SABOTEUR("saboteur", "Saboteur") { // Front & Back
        @Override public int frontX() { return 26; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 123; }
    },
    SANDWORM_GRUBLING("sandwormsm", "Sandworm Grubling") { // Front & Back
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 133; }
        @Override public int backX() { return 36; }
        @Override public int backY() { return 153; }
    },
    SCOUT_BIKE("scoutbike", "Scout Bike") { // Front & Back
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 109; }
        @Override public int backX() { return 70; }
    },
    MONSTER_GROUPER("sea_grouper", "Monster Grouper") { // Front & Back
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 130; }
    },
    BABY_GROUPER("sea_grouper_baby", "Baby Grouper") { // Front & Back
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 95; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 100; }
    },
    ELDER_GROUPER("sea_grouper_adult", "Elder Grouper") { // Front
        @Override public int frontX() { return MONSTER_GROUPER.frontX(); }
        @Override public int frontY() { return MONSTER_GROUPER.frontY(); }
        @Override public int backX() { return MONSTER_GROUPER.backX(); }
        @Override public int backY() { return MONSTER_GROUPER.backY(); }
    },
    BATTLESHIP_RAPTORCLASS("ship_battleship_med", "Battleship Raptor-Class") { // Front & Back
        @Override public int frontX() { return 79; }
        @Override public int frontY() { return 178; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    BATTLESHIP_MAMMOTHCLASS("ship_battleship_super", "Battleship Mammoth-Class") { // Front & Back
        @Override public int frontX() { return 74; }
        @Override public int frontY() { return 187; }
        @Override public int backX() { return 75; }
        @Override public int backY() { return 150; }
    },
    DESTROYER("ship_destroyer_med", "Destroyer") { // Front & Back
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 120; }
    },
    GUNBOAT("ship_gunboat", "Gunboat") { // Front & Back
        @Override public int frontX() { return 71; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 122; }
    },
    MINELAYER_DESTROYER("ship_minelayer", "Minelayer Destroyer") { // Front & Back
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 132; }
        @Override public int backY() { return 125; }
    },
    MINI_SUB("ship_mini_sub", "Mini Sub") { // Front & Back
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 82; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 90; }
    },
    NAVY_TROOPER("ship_raft_trooper", "Navy Trooper") { // Front & Back
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 110; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 105; }
    },
    SUBMARINE("ship_submarine", "Submarine") { // Front & Back
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 108; }
        @Override public int backX() { return 75; }
        @Override public int backY() { return 104; }
    },
    TACTICAL_SUBMARINE("ship_tactical_sub", "Tactical Submarine") { // Front & Back
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 92; }
    },
    SHOCK_TROOPER("shocktrooper", "Shock Trooper") { // Front & Back
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 110; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 120; }
    },
    RIOT_TROOPER("shotgunner", "Riot Trooper") { // Front & Back
        @Override public int frontX() { return 24; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 125; }
    },
    SHARPSHOOTER("sniper", "Sharpshooter") { // Front & Back
        @Override public int frontX() { return 37; }
        @Override public int frontY() { return 105; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 107; }
    },
    MORTAR_TRUCK("specialmortar", "Mortar Truck") { // Front & Back
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 107; }
    },
    EARTHSHAKER("superartillery", "Earthshaker") { // Front & Back
        @Override public int frontX() { return 91; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 175; }
    },
    MARKSMAN("supersniper", "Marksman") { // Front & Back
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 113; }
        @Override public int backX() { return 59; }
        @Override public int backY() { return 127; }
    },
    WOLF_PICKUP("swmgpickup", "Wolf Pickup, Wolf Gun Truck") { // Front & Back
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 128; }
    },
    WOLF_PUNISHER("sw_guy_bat", "Wolf Punisher") { // Front & Back
        @Override public int frontX() { return 44; }
        @Override public int frontY() { return 138; }
        @Override public int backX() { return 52; }
    },
    WOLF_PUNISHER_2("sw_guy_bat_5", "Wolf Punisher (Level 5)") { // Front
        @Override public int frontX() { return WOLF_PUNISHER.frontX(); }
        @Override public int frontY() { return WOLF_PUNISHER.frontY(); }
    },
    WOLF_GRENADIER_2("sw_guy_grenade_5", "Wolf Grenadier (Level 5)") { // Front & Back
        @Override public int frontX() { return WOLF_GRENADIER.frontX(); }
        @Override public int frontY() { return WOLF_GRENADIER.frontY(); }
        @Override public int backX() { return WOLF_GRENADIER.backX(); }
        @Override public int backY() { return WOLF_GRENADIER.backY(); }
    },
    LASER_WOLF("sw_guy_laser", "Laser Wolf") { // Front & Back
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 131; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 135; }
    },
    WOLF_SCRAPPER_2("sw_guy_machete_5", "Wolf Scrapper (Level 5)") { // Front
        @Override public int frontX() { return WOLF_SCRAPPER.frontX(); }
        @Override public int frontY() { return WOLF_SCRAPPER.frontY(); }
    },
    WOLF_DEVASTATOR_2("sw_guy_rpg_5", "Wolf Devastator (Level 5)") { // Front
        @Override public int frontX() { return WOLF_DEVASTATOR.frontX(); }
        @Override public int frontY() { return WOLF_DEVASTATOR.frontY(); }
    },
    SILVER_WOLF_SLINGER("sw_guy_slingshot", "Silver Wolf Slinger") { // Front & Back
        @Override public int frontX() { return 73; }
        @Override public int frontY() { return 160; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 190; }
    },
    SILVER_WOLF_GOLDEN_EAGLE_2("sw_guy_sniper", "Silver Wolf Golden Eagle") { // Front
        @Override public int frontX() { return SILVER_WOLF_GOLDEN_EAGLE.frontX(); }
        @Override public int frontY() { return SILVER_WOLF_GOLDEN_EAGLE.frontY(); }
        @Override public int backX() { return SILVER_WOLF_GOLDEN_EAGLE.backX(); }
        @Override public int backY() { return SILVER_WOLF_GOLDEN_EAGLE.backY(); }
    },
    WOLF_THUG_2("sw_guy_uzi_5", "Wolf Thug (Level 5)") { // Front
        @Override public int frontX() { return WOLF_THUG.frontX(); }
        @Override public int frontY() { return WOLF_THUG.frontY(); }
    },
    SILVER_WOLF_ARTILLERY("sw_veh_artillery", "Silver Wolf Artillery, Silver Wolf Rainmaker") { // Front & Back
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 121; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 130; }
    },
    WOLF_BOMBADIER_2("sw_veh_artillery_5", "Wolf Bombadier (Level 5)") { // Front
        @Override public int frontX() { return WOLF_BOMBADIER.frontX(); }
        @Override public int frontY() { return WOLF_BOMBADIER.frontY(); }
    },
    SILVER_WOLF_FURY("sw_veh_catapult", "Silver Wolf Fury, Imperial Fury") { // Front & Back
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 174; }
        @Override public int backY() { return 198; }
    },
    WOLF_PICKUP_2("sw_veh_pickup_5", "Wolf Pickup (Level 5)") { // Front
        @Override public int frontX() { return WOLF_PICKUP.frontX(); }
        @Override public int frontY() { return WOLF_PICKUP.frontY(); }
    },
    CONVERTED_GARBAGE_TRUCK("sw_veh_rockettruck", "Converted Garbage Truck, Recycled Garbage Truck") { // Front & Back
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 64; }
        @Override public int backY() { return 144; }
    },
    SILVER_WOLF_ROLLER("sw_veh_steamroller", "Silver Wolf Roller, Silver Wolf Crusher") { // Front & Back
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 168; }
        @Override public int backY() { return 130; }
    },
    TANK_KILLER("tankkiller", "Tank Killer") { // Front & Back
        @Override public int frontX() { return 92; }
        @Override public int frontY() { return 111; }
        @Override public int backX() { return 72; }
        @Override public int backY() { return 148; }
    },
    TROOPER("trooper", "Trooper") { // Front & Back
        @Override public int frontX() { return 47; }
        @Override public int frontY() { return 112; }
        @Override public int backX() { return 32; }
        @Override public int backY() { return 130; }
    },
    SOPWITH_SPIDERWASP("veh_air_biplane", "Sopwith Spiderwasp") { // Front & Back
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 143; }
        @Override public int backX() { return 66; }
        @Override public int backY() { return 137; }
    },
    ZRS6_DIRIGIBLE("veh_air_dirigible", "ZRS-6 Dirigible") { // Front & Back
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 189; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 160; }
    },
    BC1_SNAKE("veh_air_helicopter", "BC-1 Snake") { // Front & Back
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 204; }
        @Override public int backX() { return 127; }
        @Override public int backY() { return 181; }
    },
    BC3_COBRA("air_helicopter_new", "BC-3 Cobra") { // Front & Back
        @Override public int frontX() { return BC1_SNAKE.frontX(); }
        @Override public int frontY() { return BC1_SNAKE.frontY() - 5; }
        @Override public int backX() { return BC1_SNAKE.backX(); }
        @Override public int backY() { return BC1_SNAKE.backY(); }
    },
    EXPERIMENT_X17("veh_ancient_robot_clone_trap_mission", "Experiment X17") { // Front & Back
        @Override public int frontX() { return 86; }
        @Override public int frontY() { return 139; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 185; }
    },
    DEXTER_FRAGMENT("veh_ancient_robot_player", "Dexter Fragment, Sinister Fragment") { // Front & Back
        @Override public int frontX() { return EXPERIMENT_X17.frontX(); }
        @Override public int frontY() { return EXPERIMENT_X17.frontY(); }
        @Override public int backX() { return EXPERIMENT_X17.backX(); }
        @Override public int backY() { return EXPERIMENT_X17.backY(); }
    },
    ANTIAIRCRAFT_FLAK_GUN("veh_anti_aircraft_gun_premium", "Anti-Aircraft Flak Gun") { // Front & Back
        @Override public int frontX() { return 79; }
        @Override public int frontY() { return 175; }
        @Override public int backY() { return 184; }
    },
    ANTIAIRCRAFT_TURRET("veh_anti_aircraft_gun_regular", "Anti-Aircraft Turret") { // Front & Back
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 64; }
        @Override public int backY() { return 175; }
    },
    BRUTALIZER("veh_anti_armor", "Brutalizer") { // Front & Back
        @Override public int frontX() { return 88; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 114; }
        @Override public int backY() { return 160; }
    },
    DEATH_FROM_ABOVE("veh_artillery_napalm", "Death From Above") { // Front & Back
        @Override public int frontX() { return 91; }
        @Override public int frontY() { return 152; }
        @Override public int backX() { return 89; }
        @Override public int backY() { return 192; }
    },
    BOOM_BUS("veh_boombus", "Boom Bus") { // Front & Back
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 158; }
        @Override public int backX() { return 102; }
        @Override public int backY() { return 153; }
    },
    ARTILLERY_PLASMA_CANNON("veh_cannon_plasma", "Artillery Plasma Cannon") { // Front & Back
        @Override public int frontX() { return 93; }
        @Override public int frontY() { return 160; }
        @Override public int backX() { return 78; }
        @Override public int backY() { return 188; }
    },
    NOMAD_ELEMENTAL_ROVER("veh_elemental_rover", "Nomad Elemental Rover") { // Front & Back
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 130; }
        @Override public int backX() { return 92; }
        @Override public int backY() { return 125; }
    },
    T16_AERO_BIKE("veh_hoverbike", "T16 Aero Bike") { // Front & Back
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 145; }
        @Override public int backX() { return 86; }
        @Override public int backY() { return 135; }
    },
    ANTIGRAVITY_TANK("veh_hovertank", "Anti-Gravity Tank") { // Front & Back
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 162; }
        @Override public int backY() { return 159; }
    },
    UNMANNED_FLAME_TURRET("veh_ign_turret_flame", "Unmanned Flame Turret") { // Front & Back
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 140; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 150; }
    },
    UNMANNED_LASER_TURRET("veh_ign_turret_laser", "Unmanned Laser Turret") { // Front & Back
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 160; }
    },
    UNMANNED_MACHINE_GUN_TURRET("veh_ign_turret_mgun", "Unmanned Machine Gun Turret") { // Front & Back
        @Override public int frontX() { return 92; }
        @Override public int frontY() { return 148; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 175; }
    },
    ACES_650CC("veh_motorcycle_advanced", "Aces 650cc") { // Front & Back
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 157; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 120; }
    },
    PLASMA_TURRET("veh_plasma_turret", "Plasma Turret") { // Front & Back
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 156; }
        @Override public int backX() { return 67; }
        @Override public int backY() { return 176; }
    },
    RAIDER_MAMMOTH_TANK("veh_raider_mammoth_armored_55", "Mammoth Tank (Raider), Savage Mammoth Tank") { // Front
        @Override public int frontX() { return ARMORED_RAIDER_MAMMOTH.frontX(); }
        @Override public int frontY() { return ARMORED_RAIDER_MAMMOTH.frontY(); }
    },
    TOTAL_WAR_MAMMOTH("veh_raider_mammoth_rockets_55", "Total War Mammoth") { // Front
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 195; }
    },
    RAIDER_WAR_MAMMOTH("veh_raider_rocketmammoth", "Raider War Mammoth, Tough Raider War Mammoth") { // Front & Back
        @Override public int frontX() { return 89; }
        @Override public int frontY() { return TOTAL_WAR_MAMMOTH.frontY(); }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 185; }
    },
    ARCTIC_TANK("veh_tank_arctic", "Arctic Tank") { // Front & Back
        @Override public int frontX() { return 95; }
        @Override public int frontY() { return 153; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 142; }
    },
    HEAVY_ARCTIC_TANK("veh_tank_arctic_heavy", "Heavy Arctic Tank") { // Front & Back
        @Override public int frontX() { return 112; }
        @Override public int frontY() { return 182; }
        @Override public int backX() { return 103; }
        @Override public int backY() { return 159; }
    },
    HEAVY_ARCTIC_TANK_2("veh_tank_arctic_heavy_rebel", "Heavy Arctic Tank (Rebel)") { // Front
        @Override public int frontX() { return HEAVY_ARCTIC_TANK.frontX(); }
        @Override public int frontY() { return HEAVY_ARCTIC_TANK.frontY(); }
    },
    BASILISK("veh_tank_basilisk", "Basilisk") { // Front & Back
        @Override public int frontX() { return 73; }
        @Override public int frontY() { return 143; }
    },
    FROSTBITE("veh_tank_cryo", "Frostbite") { // Front & Back
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 74; }
        @Override public int backY() { return 125; }
    },
    DRAGON("veh_tank_flame_heavy", "Dragon") { // Front & Back
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 147; }
        @Override public int backX() { return 72; }
        @Override public int backY() { return 140; }
    },
    HEAVIER_TANK("veh_tank_heavier", "Heavier Tank") { // Front & Back
        @Override public int frontX() { return 97; }
        @Override public int frontY() { return 137; }
        @Override public int backY() { return 150; }
    },
    LASER_TANK("veh_tank_laser", "Laser Tank") { // Front & Back
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 153; }
        @Override public int backX() { return 95; }
        @Override public int backY() { return 160; }
    },
    MEGA_TANK("veh_tank_mega", "Mega Tank") { // Front & Back
        @Override public int frontX() { return 101; }
        @Override public int frontY() { return 151; }
        @Override public int backX() { return 95; }
        @Override public int backY() { return 160; }
    },
    MEGA_TANK_2("veh_tank_mega_rebel", "Mega Tank (Rebel)") { // Front
        @Override public int frontX() { return MEGA_TANK.frontX(); }
        @Override public int frontY() { return MEGA_TANK.frontY(); }
    },
    PLASMA_TANK("veh_tank_plasma", "Plasma Tank") { // Front & Back
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 147; }
        @Override public int backX() { return 107; }
        @Override public int backY() { return 136; }
    },
    SNOW_CRUSHER("veh_tank_snowplow", "Snow Crusher") { // Front & Back
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 167; }
        @Override public int backX() { return 115; }
        @Override public int backY() { return 135; }
    },
    LIGHTNING_TANK("veh_tank_tesla", "Lightning Tank") { // Front & Back
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 145; }
    },
    ZOEYS_TREBUCHET("veh_trebuchet", "Zoey's Trebuchet") { // Front & Back
        @Override public int frontX() { return 79; }
        @Override public int frontY() { return 190; }
        @Override public int backX() { return 88; }
        @Override public int backY() { return 165; }
    },
    PUMA("wheeledtank", "Puma") { // Front & Back
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 114; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 110; }
    },
    SC2_PELICAN("air_seaplane", "SC-2 Pelican") { // Front & Back
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 140; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 136; }
    },
    HEAVY_GUNBOAT("ship_gunboat_rebel", "Heavy Gunboat") { // Front
        @Override public int frontX() { return GUNBOAT.frontX(); }
        @Override public int frontY() { return GUNBOAT.frontY(); }
    },
    SHADOW_CLASS_SUBMARINE("ship_submarine_rebel", "Shadow Class Submarine") { // Front
        @Override public int frontX() { return SUBMARINE.frontX(); }
        @Override public int frontY() { return SUBMARINE.frontY(); }
    },
    SUPREME_DESTROYER("ship_destroyer_med_rebel", "Supreme Destroyer") { // Front
        @Override public int frontX() { return DESTROYER.frontX(); }
        @Override public int frontY() { return DESTROYER.frontY(); }
    },
    BATTLESHIP_MASTODONCLASS("ship_battleship_med_rebel", "Battleship Mastodon Class") { // Front
        @Override public int frontX() { return BATTLESHIP_RAPTORCLASS.frontX(); }
        @Override public int frontY() { return BATTLESHIP_RAPTORCLASS.frontY() + 4; }
    },
    BATTLESHIP_BEHEMOTHCLASS("ship_battleship_super_rebel", "Battleship Behemoth Class") { // Front
        @Override public int frontX() { return BATTLESHIP_MAMMOTHCLASS.frontX(); }
        @Override public int frontY() { return BATTLESHIP_MAMMOTHCLASS.frontY() + 2; }
    },
    ATMOSPHERIC_DIVING_TROOPER("ship_scuba_trooper", "Atmospheric Diving Trooper") { // Front & Back
        @Override public int frontX() { return 85; }
        @Override public int frontY() { return 110; }
    },
    IRONCLAD_BATTLESHIP("ship_ironclad", "Ironclad Battleship") { // Front & Back
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 135; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 105; }
    },
    PHALANX_TANK("veh_phalanx_tank_player", "Phalanx Tank") { // Front & Back
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 165; }
        @Override public int backX() { return 68; }
        @Override public int backY() { return 175; }
    },
    MELEE_SENTINEL_FRAGMENT("veh_ancient_robot_2_player_left", "Melee Sentinel Fragment") { // Front & Back
        @Override public int frontX() { return 83; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 56; }
        @Override public int backY() { return 128; }
    },
    RANGED_SENTINEL_FRAGMENT("veh_ancient_robot_2_player_right", "Ranged Sentinel Fragment") { // Front & Back
        @Override public int frontX() { return MELEE_SENTINEL_FRAGMENT.frontX() - 33; }
        @Override public int frontY() { return MELEE_SENTINEL_FRAGMENT.frontY(); }
        @Override public int backX() { return MELEE_SENTINEL_FRAGMENT.backX(); }
        @Override public int backY() { return MELEE_SENTINEL_FRAGMENT.backY() - 15; }
    },
    THE_WIMP("s_trooper_underdog", "The Wimp") { // Front & Back
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 118; }
        @Override public int backX() { return 52; }
        @Override public int backY() { return 122; }
    },
    UD4L_GUNSHIP("air_assaultcraft", "UD-4L Gunship") { // Front & Back
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 179; }
        @Override public int backX() { return 92; }
        @Override public int backY() { return 163; }
    },
    F51_HELL_FIRE("air_flame_helicopter", "F-51 Hell Fire") { // Front & Back
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 174; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 164; }
    },
    V47_KITTYHAWK("air_jet_fighter_2", "V47 KittyHawk") { // Front & Back
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 148; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 125; }
    },
    C17_WINGED_MAMMOTH("air_osprey_helicopter", "C17 Winged Mammoth") { // Front & Back
        @Override public int frontX() { return 104; }
        @Override public int frontY() { return 218; }
        @Override public int backX() { return 126; }
        @Override public int backY() { return 208; }
    },
    RSB17_SHADOW_HORNET("air_stealth_fighter2", "RS-B17 Shadow Hornet") { // Front & Back
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 165; }
        @Override public int backX() { return 82; }
        @Override public int backY() { return 154; }
    },
    RS17_SHADOWWASP("air_stealth_fighter", "RS17 Shadowwasp") { // Front & Back
        @Override public int frontX() { return RSB17_SHADOW_HORNET.frontX(); }
        @Override public int frontY() { return RSB17_SHADOW_HORNET.frontY(); }
        @Override public int backX() { return RSB17_SHADOW_HORNET.backX(); }
        @Override public int backY() { return RSB17_SHADOW_HORNET.backY(); }
    },
    TRIWING_TERROR("air_triplane", "Tri-Wing Terror") { // Front & Back
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 170; }
        @Override public int backX() { return 74; }
        @Override public int backY() { return 167; }
    },
    B10C_BOAR_II("air_warthog_2", "B10-C Boar II") { // Front & Back
        @Override public int frontX() { return B10_WILD_BOAR.frontX(); }
        @Override public int frontY() { return B10_WILD_BOAR.frontY(); }
        @Override public int backX() { return B10_WILD_BOAR.backX(); }
        @Override public int backY() { return B10_WILD_BOAR.backY(); }
    },
    LEGENDARY_BOAR("ancient_boar_player", "Legendary Boar") { // Front & Back
        @Override public int frontX() { return 105; }
        @Override public int frontY() { return 160; }
        @Override public int backX() { return 99; }
        @Override public int backY() { return 181; }
    },
    LEGENDARY_MAMMOTH("ancient_mammoth", "Legendary Mammoth") { // Front & Back
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 175; }
        @Override public int backX() { return 71; }
        @Override public int backY() { return 186; }
    },
    LEGENDARY_RAPTOR("s_ancient_raptor_player", "Legendary Raptor") { // Front & Back
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 160; }
        @Override public int backX() { return 102; }
        @Override public int backY() { return 180; }
    },
    LEGENDARY_SANDWORM("s_ancient_sandworm", "Legendary Sandworm") { // Front & Back
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 265; }
        @Override public int backX() { return 58; }
        @Override public int backY() { return 232; }
    },
    MAMMOTH_ARTILLERY("s_mammoth_player_artillery", "Mammoth Artillery") { // Front & Back
        @Override public int frontX() { return 86; }
        @Override public int frontY() { return 196; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 203; }
    },
    MAMMOTH_TANK("s_mammoth_player_tank", "Mammoth Tank") { // Front & Back
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 192; }
        @Override public int backX() { return 73; }
        @Override public int backY() { return 182; }
    },
    FRONTIER_CHUCKER("catapult", "Frontier Chucker") { // Front & Back
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 72; }
        @Override public int backY() { return 118; }
    },
    DEADEYE("s_sniper_special_heavy", "Deadeye") { // Front & Back
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 145; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 135; }
    },
    RADIO_TECH("s_trooper_missilestrike", "Radio Tech") { // Front & Back
        @Override public int frontX() { return 36; }
        @Override public int frontY() { return 130; }
        @Override public int backX() { return 45; }
    },
    UNICORN_TROOPER("s_unicorn_trooper", "Unicorn Trooper") { // Front & Back
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 128; }
        @Override public int backY() { return 135; }
    },
    WEAPON_TECHNICIAN("s_scientist", "Weapon Technician") { // Front & Back
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 125; }
        @Override public int backY() { return 120; }
    },
    TF2_SCOUT("tf2_hero_scout", "(TF2) Scout") { // Front & Back
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 130; }
        @Override public int backX() { return 38; }
        @Override public int backY() { return 135; }
    },
    TF2_SOLDIER("tf2_hero_soldier", "(TF2) Soldier") { // Front & Back
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 145; }
        @Override public int backX() { return 45; }
    },
    TF2_HEAVY("tf2_hero_heavy", "(TF2) Heavy") { // Front & Back
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 165; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 170; }
    },
    TF2_DEMOMAN("tf2_hero_demoman", "(TF2) Demoman") { // Front & Back
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 155; }
        @Override public int backX() { return 40; }
    },
    TF2_PYRO("tf2_hero_pyro", "(TF2) Pyro") { // Front & Back
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 135; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 145; }
    },
    TEST_DUMMY("dummy", "Test Dummy") { // Front & Back
        @Override public String frontFilePath() { return "/units/dummy.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 125; }
    },
    MECHANIZED_TROOPER("s_armored_trooper", "Mechanized Trooper") {
        @Override public int frontX() { return 97; }
        @Override public int frontY() { return 176; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 182; }
    },
    MECHANIZED_ARTILLERY("veh_artillery_mech", "Mechanized Artillery") {
        @Override public int frontX() { return 114; }
        @Override public int frontY() { return 167; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 199; }
    },
    AURORA("hero_aurora", "Aurora") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 20; }
        @Override public int backY() { return 145; }
    },
    BRONSON("hero_cast_bronson", "Bronson") { // Front
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 150; }
    },
    DOUG("swbrute", "Doug") { // Front
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 138; }
    },
    CASSIDY("cassidy", "Cassidy") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 20; }
        @Override public int backY() { return 140; }
    },
    CASSIDY_RAILGUN("hero_cast_cassidy_railgun", "Cassidy (Railgun)") { // Back
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 170; }
    },
    PERKINS("hero_cast_perkins", "Perkins") { // Front & Back
        @Override public int frontX() { return 23; }
        @Override public int frontY() { return 130; }
    },
    ELDER_TAOS("taos", "Elder Taos") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 140; }
    },
    FLOYD("floyd", "Floyd") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 130; }
    },
    LT_MORGAN("morgan", "Lt. Morgan") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 160; }
    },
    MR_PURRFACE("purrface", "Mr. Purrface") { // Front & Back
        @Override public int frontX() { return 18; }
        @Override public int frontY() { return 80; }
    },
    PERCIVAL("percival", "Percival") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 140; }
    },
    SGT_RAMSEY("ramsey", "Sgt. Ramsey") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 42; }
        @Override public int backY() { return 125; }
    },
    SHERIFF_COLT("sheriffcolt", "Sheriff Colt") { // Back
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 138; }
    },
    THE_RAIDER_KIDS("raiderkidstank", "The Raider Kids") { // Front & Back
        @Override public int frontX() { return MINI_TANK.frontX(); }
        @Override public int frontY() { return MINI_TANK.frontY() + 10; }
    },
    YOUNG_ASHE("youngashe", "Young Ashe") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 155; }
    },
    GENERAL_ASHE("generalashe", "General Ashe") { // Front & Back
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 145; }
    },
    ZOEY("zoey", "Zoey") { // Back
        @Override public int frontX() { return 0; }
        @Override public int frontY() { return 0; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 135; }
    },
    OUTSIDER_BEGONE_BOMBARD("raiderbombardcannon", "\"Outsider Begone\" Bombard") { // Front
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 152; }
    },
    RAMSEY_HOSTAGE("ramseyhostage", "Ramsey (Hostage)") { // Front
        @Override public int frontX() { return 30; }
        @Override public int frontY() { return 120; }
    },
    CIVILIAN("unarmedcivilian", "Civilian") { // Front
        @Override public int frontX() { return 30; }
        @Override public int frontY() { return 135; }
    },
    CIVILIAN_FEMALE("civilian_unarmed_female", "Civilian (Female)") { // Front
        @Override public int frontX() { return 27; }
        @Override public int frontY() { return 135; }
    },
    FRONTIER_BRUSHFIRE("fireworkstruck", "Frontier Brushfire") { // Front & Back
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 135; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 118; }
    },
    FRONTIER_TRACTOR("tractor", "Frontier Tractor") { // Front & Back
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 123; }
    },
    FRONTIER_ENGINEER("frdynamiteguy", "Frontier Engineer") {
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 42; }
        @Override public int backY() { return 122; }
    },
    FRONTIER_HUNTER("frhunter", "Frontier Hunter") {
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 115; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 120; }
    },
    FRONTIER_LUMBERJACK("frlumberjack", "Frontier Lumberjack") {
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 25; }
        @Override public int backY() { return 120; }
    },
    FRONTIER_MINUTEMAN("frminuteman", "Frontier Minuteman") {
        @Override public int frontX() { return 38; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 20; }
        @Override public int backY() { return 120; }
    },
    FRONTIER_PYRO("frpyro", "Frontier Pyro") {
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 125; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 117; }
    },
    XT04_EXPERIMENTAL_LASER_TANK("lasertank", "\"XT-04\" Experimental Laser Tank") { // Front & Back
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 110; }
        @Override public int backX() { return 75; }
        @Override public int backY() { return 113; }
    },
    XT11_EXPERIMENTAL_LASER_JEEP("laserjeep", "\"XT-11\" Experimental Laser Jeep") { // Front & Back
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 114; }
        @Override public int backX() { return 67; }
        @Override public int backY() { return 103; }
    },
    LASER_TECHNICIAN("lasertechnician", "Laser Technician") { // Front & Back
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 37; }
        @Override public int backY() { return 125; }
    },
    MALFUNCTIONING_LASER("mallaser", "Malfunctioning Laser") { // Front
        @Override public int frontX() { return 32; }
        @Override public int frontY() { return 122; }
    },
    MALFUNCTIONING_ROBOT("hero_malfunctioning_robot", "Malfunctioning Robot") { // Front
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 142; }
    },
    ANCIENT_SENTRY("veh_ancient_sentry", "Ancient Sentry") { // Front & Back
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 200; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 180; }
    },
    LASER_SNIPER("s_laser_sniper", "Laser Sniper") { // Front & Back
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 118; }
        @Override public int backX() { return 68; }
        @Override public int backY() { return 105; }
    },
    LASER_TROOPER("s_laser_trooper", "Laser Trooper") { // Front & Back
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 125; }
        @Override public int backX() { return 39; }
        @Override public int backY() { return 132; }
    },
    M2014_LASER_GUNNER("s_laser_machingun", "M2014 Laser Gunner") { // Front & Back
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 115; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 127; }
    },
    ARMOR_MULCHER("def_saw_trap", "Armor Mulcher") { // Front & Back
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 38; }
        @Override public int backY() { return 128; }
    },
    ATTACK_DRONE("air_drone", "Attack Drone") { // Front & Back
        @Override public int frontX() { return 38; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 130; }
    },
    BIGFOOT_SHAMAN("s_bigfoot_shaman", "Bigfoot Shaman") { // Front & Back
        @Override public int frontX() { return 87; }
        @Override public int frontY() { return 158; }
        @Override public int backX() { return 77; }
        @Override public int backY() { return 155; }
    },
    BLOOD_NINJA("s_ninja_red", "Blood Ninja") {
        @Override public int frontX() { return NINJA_TROOPER.frontX(); }
        @Override public int frontY() { return NINJA_TROOPER.frontY(); }
        @Override public int backX() { return NINJA_TROOPER.backX(); }
        @Override public int backY() { return NINJA_TROOPER.backY(); }
    },
    SHINOBI("s_ninja_white", "Shinobi") {
        @Override public int frontX() { return NINJA_TROOPER.frontX(); }
        @Override public int frontY() { return NINJA_TROOPER.frontY(); }
        @Override public int backX() { return NINJA_TROOPER.backX(); }
        @Override public int backY() { return NINJA_TROOPER.backY(); }
    },
    BORABORA_HOVERCRAFT("veh_hovercraft", "Bora-Bora Hovercraft") {
        @Override public int frontX() { return 74; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 84; }
        @Override public int backY() { return 117; }
    },
    DEMOLISHER("veh_demolisher", "Demolisher") {
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 220; }
        @Override public int backX() { return 76; }
        @Override public int backY() { return 238; }
    },
    EAGLE_EYE("s_hunter_eagleeye", "Eagle Eye") {
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 133; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 130; }
    },
    DEADSHOT("s_sniper_elite_white", "Codename: Deadshot") {
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 118; }
        @Override public int backX() { return 53; }
        @Override public int backY() { return 137; }
    },
    HELLSHOT("s_sniper_elite_black", "Codename: Hellshot") {
        @Override public int frontX() { return DEADSHOT.frontX(); }
        @Override public int frontY() { return DEADSHOT.frontY(); }
        @Override public int backX() { return DEADSHOT.backX(); }
        @Override public int backY() { return DEADSHOT.backY(); }
    },
    KILLSHOT("s_sniper_elite_yellow", "Codename: Killshot") {
        @Override public int frontX() { return DEADSHOT.frontX(); }
        @Override public int frontY() { return DEADSHOT.frontY(); }
        @Override public int backX() { return DEADSHOT.backX(); }
        @Override public int backY() { return DEADSHOT.backY(); }
    },
    DEATHMONGER("s_warmonger_black", "Deathmonger") {
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 170; }
        @Override public int backX() { return 84; }
        @Override public int backY() { return 151; }
    },
    PAINMONGER("s_warmonger_white", "Painmonger") {
        @Override public int frontX() { return DEATHMONGER.frontX(); }
        @Override public int frontY() { return DEATHMONGER.frontY(); }
        @Override public int backX() { return DEATHMONGER.backX(); }
        @Override public int backY() { return DEATHMONGER.backY(); }
    },
    WARMONGER("s_warmonger_yellow", "Warmonger") {
        @Override public int frontX() { return DEATHMONGER.frontX(); }
        @Override public int frontY() { return DEATHMONGER.frontY(); }
        @Override public int backX() { return DEATHMONGER.backX(); }
        @Override public int backY() { return DEATHMONGER.backY(); }
    },
    FLAMES_OF_LOVE_ARCHER("s_raider_flame_archer", "Flames of Love Archer") {
        @Override public int frontX() { return 83; }
        @Override public int frontY() { return 135; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 140; }
    },
    AD7_BIGFOOT_SKYBUS("air_cargo_plane", "AD7 Bigfoot SkyBus") {
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 184; }
        @Override public int backX() { return 105; }
        @Override public int backY() { return 164; }
    },
    ARMORED_SUV("veh_armored_suv", "Armored SUV") {
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 112; }
        @Override public int backY() { return 125; }
    },
    GOLD_TANK("goldheavytank", "Gold Tank") {
        @Override public int frontX() { return HEAVY_TANK.frontX(); }
        @Override public int frontY() { return HEAVY_TANK.frontY(); }
        @Override public int backX() { return HEAVY_TANK.backX(); }
        @Override public int backY() { return HEAVY_TANK.backY(); }
    },
    HEAVY_GRENADIER("s_trooper_gatlinggrenadier", "Heavy Grenadier") {
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 118; }
    },
    IMITATION_FRAGMENT("veh_ancient_robot_player_clone", "Imitation Fragment") {
        @Override public int frontX() { return DEXTER_FRAGMENT.frontX(); }
        @Override public int frontY() { return DEXTER_FRAGMENT.frontY(); }
        @Override public int backX() { return DEXTER_FRAGMENT.backX(); }
        @Override public int backY() { return DEXTER_FRAGMENT.backY(); }
    },
    JEDREK_THE_CRUSHER("s_trooper_strongman", "Jedrek the Crusher") {
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 48; }
        @Override public int backY() { return 136; }
    },
    L7_SANDWORM_DRILL("veh_anti_railgun_drill", "L7 Sandworm Drill") {
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 158; }
        @Override public int backX() { return 98; }
        @Override public int backY() { return 125; }
    },
    MISSILE_DEFENSE_SYSTEM("def_missile_defense", "Missile Defense") {
        @Override public String frontFilePath() { return "/units/def_missile_defense.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 109; }
    },
    PLASMA_FIELD_TECHNICIAN("i17_guy_weapon_experiment_player", "Plasma Field Technician") {
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 38; }
        @Override public int backY() { return 123; }
    },
    RAIDER_RECRUIT("s_raider_recruit_player", "Raider Recruit") { // Front & Back
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 152; }
        @Override public int backX() { return 58; }
        @Override public int backY() { return 145; }
    },
    RAIDER_SUMMONER("s_raider_sandworm_shaman", "Raider Summoner") { // Front & Back
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 140; }
        @Override public int backX() { return 58; }
        @Override public int backY() { return 138; }
    },
    RAILGUN_BUGGY("i17_veh_railgun_buggy", "Railgun Buggy") { // Front & Back
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 151; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 118; }
    },
    RAILGUN_SNIPER("s_sniper_railgun", "Railgun Sniper") { // Front & Back
        @Override public int frontX() { return 64; }
        @Override public int frontY() { return 100; }
        @Override public int backX() { return 40; }
    },
    RAILGUN_TECH("i17_guy_railgun", "Railgun Tech") { // Front & Back
        @Override public int frontX() { return 74; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 52; }
        @Override public int backY() { return 130; }
    },
    BATTLE_RAPTOR("raptor", "Battle Raptor") { // Front & Back
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 125; }
        @Override public int backX() { return 95; }
        @Override public int backY() { return 155; }
    },
    RUDDOCK_THE_RED_NOSED_RAPTOR("s_raptor_rednose", "Ruddock the Red Nosed Raptor") { // Front & Back
        @Override public int frontX() { return BATTLE_RAPTOR.frontX(); }
        @Override public int frontY() { return BATTLE_RAPTOR.frontY(); }
        @Override public int backX() { return BATTLE_RAPTOR.backX(); }
        @Override public int backY() { return BATTLE_RAPTOR.backY(); }
    },
    SUPREME_MINI_TANK("veh_tank_mini_super", "Supreme Mini Tank") { // Front & Back
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 64; }
        @Override public int backY() { return 130; }
    },
    TANK_CRUSHER("veh_monster", "Tank Crusher") { // Front & Back
        @Override public int frontX() { return 95; }
        @Override public int frontY() { return 170; }
        @Override public int backX() { return 102; }
        @Override public int backY() { return 146; }
    },
    THRESHER_TANK("veh_sw_tank", "Thresher Tank") { // Front & Back
        @Override public int frontX() { return 119; }
        @Override public int frontY() { return 167; }
        @Override public int backX() { return 135; }
        @Override public int backY() { return 143; }
    },
    UNMANNED_SCRAM_CANNON_TURRET("veh_scram_cannon_turret", "Unmanned Scram Cannon Turret") {
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 190; }
        @Override public int backX() { return 108; }
        @Override public int backY() { return 148; }
    },
    ZOMBIE_HUNTER("s_zombie_hunter", "Zombie Hunter") {
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 67; }
    },
    ZOMBIE_SLAYER("s_zombie_hunter2", "Zombie Slayer") {
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 140; }
        @Override public int backX() { return 36; }
        @Override public int backY() { return 140; }
    },
    CARGO_SHIP("ship_cargoship", "Cargo Ship") {
        @Override public String frontFilePath() { return "/units/ship_cargoship.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 140; }
    },
    MILITIA("militia", "Militia") {
        @Override public String frontFilePath() { return "/units/front/trooper_front.png"; }
        @Override public String backFilePath() { return "/units/back/militia_back.png"; }
        @Override public int frontX() { return TROOPER.frontX(); }
        @Override public int frontY() { return TROOPER.frontY(); }
        @Override public int backX() { return TROOPER.backX(); }
        @Override public int backY() { return TROOPER.backY(); }
    },
    RED_FLAG("def_flag", "RED Flag") {
        @Override public String frontFilePath() { return "/units/def_flag.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 15; }
        @Override public int frontY() { return 160; }
    },
    NT1_MECHANICAL_TANK("veh_tank_mech", "NT-1 Mechanical Tank") {
        @Override public int frontX() { return 104; }
        @Override public int frontY() { return 196; }
        @Override public int backX() { return 102; }
        @Override public int backY() { return 185; }
    },
    TEST("this_id_does_not_exist", "Empty, None, Null, Void, Blank") {
        @Override public int frontX() { return -0; }
        @Override public int frontY() { return -0; }
    };

    static final private Map<String, Unit> UNIT_IDS = Arrays.stream(values()).collect(Collectors.toMap(Unit::id, u -> u));
    static public Map<String, Unit> getUnitIdMap() { return Collections.unmodifiableMap(UNIT_IDS); }

    private final String id;
    private final String fullName;
    public String id() { return id; }
    public String fullName() { return fullName; }
    public String frontFilePath() { return "/units/front/" + id() + "_front.png"; }
    public String backFilePath() { return "/units/back/" + id() + "_back.png"; }
    abstract public int frontX();
    abstract public int frontY();
    public int backX() { return frontX(); }
    public int backY() { return frontY(); }

    Unit(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public static Unit fromId(String s) {
        Unit unit = UNIT_IDS.get(s);
        if (unit == null) return UNKNOWN;
        return unit;
    }
}