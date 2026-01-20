package hero.roland.formations;

public enum Unit {
    UNKNOWN {
        @Override public String id() { return "orange_question_mark"; }
        @Override public String frontFilePath() { return "/units/orange_question_mark.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 32; }
        @Override public int frontY() { return 95; }
    },
    RECON_VEHICLE {
        @Override public String id() { return "apc"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 105; }
        @Override public int backY() { return 111; }
    },
    BOOM_BOOM {
        @Override public String id() { return "boomboom"; }
        @Override public int frontX() { return 41; }
        @Override public int frontY() { return 124; }
    },
    RAIDER_BRAWLER {
        @Override public String id() { return "brawlerraider"; }
        @Override public int frontX() { return 46; }
        @Override public int frontY() { return 141; }
        @Override public int backY() { return 135; }
    },
    DUST_WALKER {
        @Override public String id() { return "dustwalkerraider"; }
        @Override public int frontX() { return 47; }
        @Override public int frontY() { return 122; }
        @Override public int backY() { return 130; }
        @Override public int backX() { return 40; }
    },
    FIREBREATHER {
        @Override public String id() { return "firebreather"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 136; }
        @Override public int backX() { return 35; }
    },
    FLAME_TURRET {
        @Override public String id() { return "flameturret"; }
        @Override public int frontX() { return 29; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 160; }
    },
    WARLORD_GANTAS {
        @Override public String id() { return "gantas"; }
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 166; }
    },
    GUN_TRUCK {
        @Override public String id() { return "guntruck"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 70; }
    },
    LIGHT_TANK {
        @Override public String id() { return "lighttank"; }
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 50; }
    },
    TEMPEST {
        @Override public String id() { return "mgtank"; }
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 111; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 120; }
    },
    MAMMOTH_RIDER {
        @Override public String id() { return "mammothraider"; }
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 184; }
        @Override public int backY() { return 165; }
    },
    WOLF_BOMBADIER {
        @Override public String id() { return "swbombadier"; }
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 40; }
    },
    WOLF_DEFENDER {
        @Override public String id() { return "swdefender"; }
        @Override public int frontX() { return 37; }
        @Override public int frontY() { return 106; }
    },
    WOLF_DEVASTATOR {
        @Override public String id() { return "swdevastator"; }
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 35; }
    },
    WOLF_ENFORCER {
        @Override public String id() { return "swenforcer"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 127; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 120; }
    },
    WOLF_GRENADIER {
        @Override public String id() { return "swgrenadier"; }
        @Override public int frontX() { return 34; }
        @Override public int frontY() { return 112; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 120; }
    },
    WOLF_THUG {
        @Override public String id() { return "swthug"; }
        @Override public int frontX() { return 41; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 35; }
    },
    WOLF_ARMORED_TRUCK {
        @Override public String id() { return "swarmoredtruck"; }
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 125; }
    },
    WOLF_SCRAPPER {
        @Override public String id() { return "swscrapper"; }
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 133; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 150; }
    },
    SNIPER {
        @Override public String id() { return "sniper2"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 109; }
    },
    SUPER_TANK {
        @Override public String id() { return "supertank"; }
        @Override public int frontX() { return 78; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 85; }
    },
    MEERKAT {
        @Override public String id() { return "tow"; }
        @Override public int frontX() { return 51; }
        @Override public int frontY() { return 114; }
    },
    FLYING_DEXTER_FRAGMENT {
        @Override public String id() { return "air_ancient_fragment"; }
        @Override public int frontX() { return 96; }
        @Override public int frontY() { return 258; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 262; }
    },
    UH1B_SKYRAPTOR {
        @Override public String id() { return "air_attack_helicopter"; }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 172; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 160; }
    },
    Z218_BOMBER {
        @Override public String id() { return "air_bomber"; }
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 185; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 168; }
    },
    THUNDERCLOUD_F10 {
        @Override public String id() { return "air_corsair"; }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 136; }
        @Override public int backY() { return 145; }
    },
    V14_MAVERICK {
        @Override public String id() { return "air_jet_fighter"; }
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 156; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 140; }
    },
    FALCONS_NEST {
        @Override public String id() { return "air_raider_zeppelin"; }
        @Override public int frontX() { return 99; }
        @Override public int frontY() { return 181; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 215; }
    },
    PROTO_HUNTER {
        @Override public String id() { return "air_s_trooper_zombie"; }
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 192; }
        @Override public int backY() { return 187; }
    },
    SPECIMEN_HUNTER {
        @Override public String id() { return "air_s_trooper_zombie_b"; }
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    ADVANCED_HUNTER {
        @Override public String id() { return "air_s_trooper_zombie_c"; }
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    ARCHETYPE_HUNTER {
        @Override public String id() { return "air_s_trooper_zombie_d"; }
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    SPIDERWASP_DRONE {
        @Override public String id() { return "air_spiderwasp_striker"; }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 190; }
        @Override public int backX() { return 40; }
    },
    ROYAL_SPIDERWASP_DRONE {
        @Override public String id() { return "air_spiderwasp_striker_70"; }
        @Override public int frontX() { return SPIDERWASP_DRONE.frontX(); }
        @Override public int frontY() { return SPIDERWASP_DRONE.frontY() - 1; }
        @Override public int backX() { return SPIDERWASP_DRONE.backX(); }
        @Override public int backY() { return SPIDERWASP_DRONE.backY(); }
    },
    SILVERWOLF_CROP_BUSTER {
        @Override public String id() { return "air_sw_plane"; }
        @Override public int frontX() { return 83; }
        @Override public int frontY() { return 155; }
        @Override public int backX() { return 107; }
        @Override public int backY() { return 170; }
    },
    SILVERWOLF_CHUNOOK_HELICOPTER {
        @Override public String id() { return "air_sw_whirlybird"; }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 219; }
        @Override public int backX() { return 93; }
        @Override public int backY() { return 205; }
    },
    B10_WILD_BOAR {
        @Override public String id() { return "air_warthog"; }
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 66; }
        @Override public int backY() { return 120; }
    },
    L60_HAWKER_HURRICANE {
        @Override public String id() { return "air_ww2_fighter"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 149; }
        @Override public int backY() { return 137; }
    },
    ARMORED_FORTRESS {
        @Override public String id() { return "armoredfortress"; }
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 170; }
        @Override public int backY() { return 177; }
    },
    ARMORED_RAIDER_MAMMOTH { // Front
        @Override public String id() { return "armoredmammoth"; }
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 200; }
    },
    ARMORED_PILLBOX { // Front & Back
        @Override public String id() { return "armoredpillbox"; }
        @Override public String frontFilePath() { return "/units/armoredpillbox.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 110; }
    },
    ARSONIST {
        @Override public String id() { return "arsonist"; }
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 148; }
        @Override public int backY() { return 130; }
    },
    LIGHT_ARTILLERY {
        @Override public String id() { return "artillery"; }
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 121; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    ASSASSINATOR {
        @Override public String id() { return "assassinator"; }
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 135; }
    },
    BAZOOKA_SQUAD {
        @Override public String id() { return "bazookaTeam"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 114; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 130; }
    },
    BIO_GRENADIER {
        @Override public String id() { return "biogrenadier"; }
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 30; }
    },
    BLOCKHOUSE {
        @Override public String id() { return "blockhouses_idle"; }
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 142; }
        @Override public int backY() { return 125; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_LEFT { // Front
        @Override public String id() { return "boss_goliath_tank_leftside"; }
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 318; }
    },
    GOLIATH_TANK { // Front
        @Override public String id() { return "boss_goliath_tank_main"; }
        @Override public int frontX() { return 122; }
        @Override public int frontY() { return 380; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_RIGHT { // Front
        @Override public String id() { return "boss_goliath_tank_rightside"; }
        @Override public int frontX() { return 37; }
        @Override public int frontY() { return 266; }
    },
    THE_KRAKEN { // Front
        @Override public String id() { return "boss_kraken_body"; }
        @Override public int frontX() { return 151; }
        @Override public int frontY() { return 161; }
    },
    KRAKEN_TENTACLE { // Front & Back
        @Override public String id() { return "boss_kraken_arm"; }
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 206; }
        @Override public int backX() { return 85; }
    },
    DREADNOUGHT { // Front
        @Override public String id() { return "boss_ship_dreadnought"; }
        @Override public int frontX() { return 107; }
        @Override public int frontY() { return 313; }
    },
    SPIDERWASP_QUEEN { // Front & Back
        @Override public String id() { return "boss_spiderwasp_queen"; }
        @Override public int frontX() { return 134; }
        @Override public int frontY() { return 237; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 222; }
    },
    WOLF_CRUEL_BUS { // Front & Back
        @Override public String id() { return "cannonschoolbus"; }
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 146; }
        @Override public int backX() { return 60; }
    },
    RAIDER_CANNONEER { // Front & Back
        @Override public String id() { return "cannonraider"; }
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 130; }
    },
    RAIDER_CHAMPION { // Front & Back
        @Override public String id() { return "championraider"; }
        @Override public int frontX() { return 64; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 35; }
    },
    CHEMICAL_SPRINKLER { // Front & Back
        @Override public String id() { return "chemsprinkler"; }
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 156; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 150; }
    },
    CHEM_TROOPER { // Front & Back
        @Override public String id() { return "chemtrooper"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 131; }
    },
    RANGER { // Front & Back
        @Override public String id() { return "commando"; }
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 124; }
        @Override public int backY() { return 115; }
    },
    PEACE_KEEPER { // Front & Back
        @Override public String id() { return "crowdcontrol"; }
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 128; }
    },
    CONCRETE_WALL_A { // Front & Back
        @Override public String id() { return "def_barricade_cementwall"; }
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 110; }
        @Override public int backY() { return 120; }
    },
    CONCRETE_WALL_B { // Front & Back
        @Override public String id() { return "def_barricade_concretewall"; }
        @Override public String frontFilePath() { return "/units/def_barricade_concretewall.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 124; }
    },
    SANDBAGS { // Front & Back
        @Override public String id() { return "def_barricade_sandbags"; }
        @Override public String frontFilePath() { return "/units/def_barricade_sandbags.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 95; }
    },
    BUOY {
        @Override public String id() { return "def_buoy"; }
        @Override public String frontFilePath() { return "/units/def_buoy.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 25; }
        @Override public int frontY() { return 121; }
    },
    PORTABLE_ELECTRIC_FENCE {
        @Override public String id() { return "def_fence_electric"; }
        @Override public String frontFilePath() { return "/units/def_fence_electric.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 20; }
        @Override public int backY() { return 145; }
    },
    FLOATING_MINE { // Front & Back
        @Override public String id() { return "def_mine"; }
        @Override public String frontFilePath() { return "/units/def_mine.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 33; }
        @Override public int frontY() { return 96; }
    },
    RAIDER_FENCE { // Front
        @Override public String id() { return "def_raiderbarricade"; }
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 132; }
    },
    SPIDERWASP_EGG { // Front & Back
        @Override public String id() { return "def_spiderwasp_egg"; }
        @Override public String frontFilePath() { return "/units/def_spiderwasp_egg.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 126; }
    },
    REINFORCED_CONCRETE_WALL { // Front & Back
        @Override public String id() { return "def_wall_concrete_60"; }
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 114; }
        @Override public int backX() { return 57; }
        @Override public int backY() { return 128; }
    },
    WHIRLPOOL { // Front & Back
        @Override public String id() { return "def_whirlpool"; }
        @Override public String frontFilePath() { return "/units/def_whirlpool.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 88; }
        @Override public int frontY() { return 91; }
    },
    DEMOLITIONIST { // Front & Back
        @Override public String id() { return "demolitionist"; }
        @Override public int frontX() { return 34; }
        @Override public int frontY() { return 117; }
    },
    IMPERIAL_DRAGOON { // Front & Back
        @Override public String id() { return "dragoon"; }
        @Override public int frontX() { return 87; }
        @Override public int frontY() { return 110; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 155; }
    },
    DUNE_RIDER { // Front & Back
        @Override public String id() { return "dunerider"; }
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 132; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 115; }
    },
    ELDER_SANDWORM { // Front
        @Override public String id() { return "eldersandworm"; }
        @Override public int frontX() { return 96; }
        @Override public int frontY() { return 157; }
    },
    LIGHTNING_TROOPER { // Front & Back
        @Override public String id() { return "electrotrooper"; }
        @Override public int frontX() { return 30; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 120; }
    },
    FLAME_TROOPER { // Front & Back
        @Override public String id() { return "flametrooper"; }
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 122; }
    },
    HORNET { // Front & Back
        @Override public String id() { return "fliegerhaust"; }
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 135; }
    },
    GRENADIER { // Front & Back
        @Override public String id() { return "grenadier"; }
        @Override public int frontX() { return 39; }
        @Override public int frontY() { return 127; }
    },
    WATCHTOWER { // Front & Back
        @Override public String id() { return "guardtower_battle"; }
        @Override public String frontFilePath() { return "/units/guardtower_battle.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 87; }
        @Override public int frontY() { return 189; }
    },
    GUNNER { // Front & Back
        @Override public String id() { return "gunner"; }
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 113; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 105; }
    },
    HEAVY_CHEMICAL_TANK {
        @Override public String id() { return "heavychemtank"; }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 134; }
        @Override public int backY() { return 138; }
    },
    BRIMSTONE {
        @Override public String id() { return "heavylauncher"; }
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 150; }
    },
    HEAVY_ARTILLERY { // Front & Back
        @Override public String id() { return "heavyartillery"; }
        @Override public int frontX() { return 92; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 150; }
    },
    HEAVY_TANK { // Front & Back
        @Override public String id() { return "heavytank"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 74; }
        @Override public int backY() { return 140; }
    },
    ANCIENT_CONSTRUCT { // Front
        @Override public String id() { return "hero_ancient_robot"; }
        @Override public int frontX() { return 207; }
        @Override public int frontY() { return 279; }
    },
    MELEE_WEAPON_SYSTEM { // Front
        @Override public String id() { return "hero_ancient_robot_2_arm_left"; }
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 349; }
    },
    RANGED_WEAPON_SYSTEM { // Front
        @Override public String id() { return "hero_ancient_robot_2_arm_right"; }
        @Override public int frontX() { return 149; }
        @Override public int frontY() { return 368; }
    },
    ANCIENT_SENTINEL { // Front
        @Override public String id() { return "hero_ancient_robot_2_body"; }
        @Override public int frontX() { return 132; }
        @Override public int frontY() { return 447; }
    },
    EXPERIMENTAL_CONSTRUCT { // Front
        @Override public String id() { return "hero_i17_ancient_robot_clone"; }
        @Override public int frontX() { return 208; }
        @Override public int frontY() { return 279; }
    },
    HITMAN { // Front & Back
        @Override public String id() { return "hitman"; }
        @Override public int frontX() { return 23; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 40; }
    },
    HUNTER { // Front & Back
        @Override public String id() { return "hunter"; }
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 128; }
    },
    RAILGUN_TANK { // Front & Back
        @Override public String id() { return "i17_veh_tank_railgun"; }
        @Override public int frontX() { return 87; }
        @Override public int frontY() { return 149; }
        @Override public int backY() { return 160; }
    },
    HUMVEE { // Front & Back
        @Override public String id() { return "jeep"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 116; }
    },
    JUGGERNAUT { // Front & Back
        @Override public String id() { return "juggernaut"; }
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 135; }
    },
    HAILSTORM { // Front & Back
        @Override public String id() { return "katyusha"; }
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 107; }
        @Override public int backY() { return 115; }
    },
    LIGHT_CHEMICAL_TANK { // Front & Back
        @Override public String id() { return "ltchemtank"; }
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 120; }
    },
    FIREDRAKE { // Front & Back
        @Override public String id() { return "ltflametank"; }
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 113; }
        @Override public int backY() { return 116; }
    },
    MEDIUM_TANK { // Front & Back
        @Override public String id() { return "mediumtank"; }
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 109; }
        @Override public int backX() { return 62; }
        @Override public int backY() { return 125; }
    },
    PEACEMAKER { // Front & Back
        @Override public String id() { return "megaartillery"; }
        @Override public int frontX() { return 119; }
        @Override public int frontY() { return 180; }
        @Override public int backX() { return 98; }
        @Override public int backY() { return 206; }
    },
    ARMADILLO { // Front & Back
        @Override public String id() { return "mgshield"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 107; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 120; }
    },
    MINI_TANK { // Front & Back
        @Override public String id() { return "minitank"; }
        @Override public int frontX() { return 38; }
        @Override public int frontY() { return 109; }
    },
    HEAVY_GUNNER { // Front & Back
        @Override public String id() { return "minigunner"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 121; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 125; }
    },
    ROCKET_TRUCK { // Front & Back
        @Override public String id() { return "mlrs"; }
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 113; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 122; }
    },
    MORTAR_TEAM { // Front & Back
        @Override public String id() { return "mortarteam"; }
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 117; }
        @Override public int backY() { return 110; }
    },
    ARIES { // Front & Back
        @Override public String id() { return "mtart"; }
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 125; }
    },
    THE_ROCK { // Front & Back
        @Override public String id() { return "natbarricade_01"; }
        @Override public String frontFilePath() { return "/units/natbarricade_01.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 31; }
        @Override public int frontY() { return 87; }
    },
    STONE_SLAB { // Front & Back
        @Override public String id() { return "natbarricade_02"; }
        @Override public String frontFilePath() { return "/units/natbarricade_02.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 109; }
    },
    LINE_OF_ROCKS { // Front & Back
        @Override public String id() { return "natbarricade_03"; }
        @Override public String frontFilePath() { return "/units/natbarricade_03.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 118; }
    },
    GRANITE_BOULDER { // Front & Back
        @Override public String id() { return "natbarricade_04"; }
        @Override public String frontFilePath() { return "/units/natbarricade_04.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 137; }
    },
    DEBRIS { // Front & Back
        @Override public String id() { return "natbarricade_debris"; }
        @Override public String frontFilePath() { return "/units/natbarricade_debris.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 140; }
    },
    FALLEN_LOG { // Front & Back
        @Override public String id() { return "natbarricade_log"; }
        @Override public String frontFilePath() { return "/units/natbarricade_log.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 107; }
    },
    NINJA_TROOPER { // Front & Back
        @Override public String id() { return "ninjatrooper"; }
        @Override public int frontX() { return 36; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 33; }
        @Override public int backY() { return 140; }
    },
    JUNIOR_OFFICER { // Front & Back
        @Override public String id() { return "officer"; }
        @Override public int frontX() { return 17; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 125; }
    },
    PILLBOX { // Front & Back
        @Override public String id() { return "pillbox"; }
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 128; }
    },
    HEAVY_RECON { // Front & Back
        @Override public String id() { return "premiumapc"; }
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 139; }
        @Override public int backX() { return 83; }
        @Override public int backY() { return 125; }
    },
    RAIDER_WARRIOR { // Front & Back
        @Override public String id() { return "raider"; }
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 131; }
        @Override public int backX() { return 30; }
    },
    TRONK { // Front
        @Override public String id() { return "raiderlieutboom"; }
        @Override public int frontX() { return 101; }
        @Override public int frontY() { return 146; }
    },
    CRAZY_BLADES { // Front
        @Override public String id() { return "raiderlieutgirl"; }
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 135; }
    },
    SARIN { // Front
        @Override public String id() { return "raiderlieutthin"; }
        @Override public int frontX() { return 93; }
        @Override public int frontY() { return 163; }
    },
    RAIDER_WATCHTOWER { // Front
        @Override public String id() { return "raiderwatchtower"; }
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 164; }
    },
    COMMANDO { // Front & Back
        @Override public String id() { return "ranger"; }
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 119; }
    },
    RAT_KING { // Front
        @Override public String id() { return "ratbrown"; }
        @Override public int frontX() { return 21; }
        @Override public int frontY() { return 57; }
    },
    MANGY_RAT { // Front
        @Override public String id() { return "ratgrey"; }
        @Override public int frontX() { return 21; }
        @Override public int frontY() { return 57; }
    },
    JET_SKI { // Front & Back
        @Override public String id() { return "rb_ship_jetski"; }
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 116; }
    },
    POWER_BOAT { // Front & Back
        @Override public String id() { return "rb_ship_speedboat"; }
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 110; }
    },
    ARMORED_TUG { // Front
        @Override public String id() { return "rb_ship_tugboat"; }
        @Override public int frontX() { return 71; }
        @Override public int frontY() { return 180; }
    },
    RPG_TROOPER { // Front & Back
        @Override public String id() { return "rpg"; }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 125; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 130; }
    },
    ARCTIC_TROOPER { // Front & Back
        @Override public String id() { return "s_arctic_trooper"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 132; }
        @Override public int backX() { return 45; }
    },
    ARCTIC_TROOPER_2 { // Front
        @Override public String id() { return "s_arctic_trooper_rebel"; }
        @Override public int frontX() { return ARCTIC_TROOPER.frontX(); }
        @Override public int frontY() { return ARCTIC_TROOPER.frontY(); }
    },
    BIGFOOT { // Front & Back
        @Override public String id() { return "s_bigfoot_adult"; }
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 147; }
    },
    BIGFOOT_WARRIOR { // Front & Back
        @Override public String id() { return "s_bigfoot_adult_55"; }
        @Override public int frontX() { return BIGFOOT.frontX(); }
        @Override public int frontY() { return BIGFOOT.frontY(); }
    },
    YOUNG_BIGFOOT { // Front & Back
        @Override public String id() { return "s_bigfoot_child"; }
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 124; }
        @Override public int backY() { return 120; }
    },
    APEX_MAULER { // Front & Back
        @Override public String id() { return "s_bigfoot_zombie_super_player"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 146; }
    },
    BOAR_VETERAN { // Front & Back
        @Override public String id() { return "s_boar_boarus_rex_55"; }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 131; }
        @Override public int backY() { return 165; }
    },
    ALPHA_BOAR { // Front & Back
        @Override public String id() { return "s_boar_large"; }
        @Override public int frontX() { return 51; }
        @Override public int frontY() { return 110; }
    },
    WILD_BOAR { // Front & Back
        @Override public String id() { return "s_boar_medium"; }
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 100; }
        @Override public int backY() { return 105; }
    },
    BOAR_PIGLET { // Front & Back
        @Override public String id() { return "s_boar_small"; }
        @Override public int frontX() { return 27; }
        @Override public int frontY() { return 82; }
        @Override public int backY() { return 95; }
    },
    IMPERIAL_PEACEMONGER { // Front & Back
        @Override public String id() { return "s_bountyhunter"; }
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 151; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 145; }
    },
    COMMANDO_2 { // Front
        @Override public String id() { return "s_commando_rebel"; }
        @Override public int frontX() { return COMMANDO.frontX(); }
        @Override public int frontY() { return 122; }
    },
    LIGHTNING_TOWER { // Front & Back
        @Override public String id() { return "s_def_tesla_coil"; }
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 217; }
    },
    SALAMANDER { // Front & Back
        @Override public String id() { return "s_flame_heavy"; }
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 143; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 135; }
    },
    SILVER_WOLF_GOLDEN_EAGLE { // Front & Back
        @Override public String id() { return "s_guy_sniper"; }
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 108; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 115; }
    },
    MAMMOTH_SEER { // Front & Back
        @Override public String id() { return "s_mammoth_king_55"; }
        @Override public int frontX() { return 102; }
        @Override public int frontY() { return 140; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 175; }
    },
    MAMMOTH_ELDER { // Front & Back
        @Override public String id() { return "s_mammoth_large"; }
        @Override public int frontX() { return MAMMOTH_SEER.frontX(); }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return MAMMOTH_SEER.backX(); }
        @Override public int backY() { return MAMMOTH_SEER.backY(); }
    },
    MAMMOTH { // Front & Back
        @Override public String id() { return "s_mammoth_medium"; }
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 128; }
        @Override public int backY() { return 140; }
    },
    MAMMOTH_TUSKLING { // Front & Back
        @Override public String id() { return "s_mammoth_small"; }
        @Override public int frontX() { return 38; }
        @Override public int frontY() { return 98; }
        @Override public int backY() { return 115; }
    },
    BOARUS_REX { // Front
        @Override public String id() { return "s_matriarchboar"; }
        @Override public int frontX() { return 74; }
        @Override public int frontY() { return 131; }
    },
    FIELD_AGENT { // Front & Back
        @Override public String id() { return "s_midrange_agent"; }
        @Override public int frontX() { return 38; }
        @Override public int frontY() { return 145; }
        @Override public int backY() { return 130; }
    },
    TURTLESHELLER { // Front & Back
        @Override public String id() { return "s_mortar_turtleshell"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 153; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    PORTABLE_WALL { // Front & Back
        @Override public String id() { return "s_portablewall"; }
        @Override public String frontFilePath() { return "/units/s_portablewall.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 104; }
        @Override public int backY() { return 106; }
    },
    BRUTAL_CANNONEER { // Front
        @Override public String id() { return "s_raider_bombadier_55"; }
        @Override public int frontX() { return 51; }
        @Override public int frontY() { return 138; }
    },
    BIG_BADA_BOOM { // Front
        @Override public String id() { return "s_raider_boomboom_55"; }
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 125; }
    },
    BRUTAL_BRAWLER { // Front
        @Override public String id() { return "s_raider_brawler_55"; }
        @Override public int frontX() { return RAIDER_BRAWLER.frontX(); }
        @Override public int frontY() { return RAIDER_BRAWLER.frontY(); }
    },
    BRUTAL_CHAMPION { // Front
        @Override public String id() { return "s_raider_champion_55"; }
        @Override public int frontX() { return RAIDER_CHAMPION.frontX(); }
        @Override public int frontY() { return RAIDER_CHAMPION.frontY(); }
    },
    DUSTWALKER_DERVISH { // Front
        @Override public String id() { return "s_raider_dustwalker_55"; }
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 123; }
    },
    SEARING_FIREBREATHER { // Front
        @Override public String id() { return "s_raider_firebreather_55"; }
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 128; }
    },
    RAIDER_RIFLEMAN { // Front
        @Override public String id() { return "s_raider_infantry_55"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 129; }
    },
    RAIDER_SKIRMISHER { // Front & Back
        @Override public String id() { return "s_raider_raptorrider"; }
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 170; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 195; }
    },
    ELITE_SKIRMISHER { // Front
        @Override public String id() { return "s_raider_raptor_rider_55"; }
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 170; }
    },
    RAIDER_OUTCAST { // Front & Back
        @Override public String id() { return "s_raider_sniper"; }
        @Override public int frontX() { return 103; }
        @Override public int frontY() { return 127; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    ELITE_OUTCAST { // Front
        @Override public String id() { return "s_raider_sniper_55"; }
        @Override public int frontX() { return 103; }
        @Override public int frontY() { return 127; }
    },
    WILD_RAPTOR { // Front & Back
        @Override public String id() { return "s_raptor_large"; }
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 138; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 160; }
    },
    RAPTOR { // Front & Back - Different to BATTLE_RAPTOR
        @Override public String id() { return "s_raptor_medium"; }
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 75; }
        @Override public int backY() { return 130; }
    },
    YOUNG_RAPTOR { // Front & Back
        @Override public String id() { return "s_raptor_small"; }
        @Override public int frontX() { return 27; }
        @Override public int frontY() { return 93; }
        @Override public int backX() { return 32; }
        @Override public int backY() { return 100; }
    },
    PRIMORDIAL_RAPTOR { // Front & Back
        @Override public String id() { return "s_raptor_tough_55"; }
        @Override public int frontX() { return WILD_RAPTOR.frontX(); }
        @Override public int frontY() { return WILD_RAPTOR.frontY(); }
        @Override public int backX() { return WILD_RAPTOR.backX(); }
        @Override public int backY() { return WILD_RAPTOR.backY(); }
    },
    PROTO_SHREDDER { // Front & Back
        @Override public String id() { return "s_raptor_zombie"; }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 95; }
        @Override public int backY() { return 145; }
    },
    SPECIMEN_SHREDDER { // Front & Back
        @Override public String id() { return "s_raptor_zombie_b"; }
        @Override public int frontX() { return PROTO_SHREDDER.frontX(); }
        @Override public int frontY() { return PROTO_SHREDDER.frontY(); }
        @Override public int backX() { return PROTO_SHREDDER.backX(); }
        @Override public int backY() { return PROTO_SHREDDER.backY(); }
    },
    ADVANCED_SHREDDER { // Front & Back
        @Override public String id() { return "s_raptor_zombie_c"; }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return PROTO_SHREDDER.frontY(); }
        @Override public int backX() { return PROTO_SHREDDER.backX(); }
        @Override public int backY() { return PROTO_SHREDDER.backY(); }
    },
    ARCHETYPE_SHREDDER { // Front & Back
        @Override public String id() { return "s_raptor_zombie_d"; }
        @Override public int frontX() { return PROTO_SHREDDER.frontX(); }
        @Override public int frontY() { return PROTO_SHREDDER.frontY(); }
        @Override public int backX() { return PROTO_SHREDDER.backX(); }
        @Override public int backY() { return PROTO_SHREDDER.backY(); }
    },
    WANDERING_SAMURAI { // Front & Back
        @Override public String id() { return "s_samurai"; }
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 40; }
    },
    SANDBAG_PILE { // Front & Back
        @Override public String id() { return "s_sandbags"; }
        @Override public String frontFilePath() { return "/units/s_sandbags.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 86; }
    },
    SANDWORM_GUARDIAN { // Front & Back
        @Override public String id() { return "s_sandworm_55"; }
        @Override public int frontX() { return 113; }
        @Override public int frontY() { return 186; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 215; }
    },
    EMPEROR_SANDWORM { // Front
        @Override public String id() { return "s_sandworm_emperor"; }
        @Override public int frontX() { return 180; }
        @Override public int frontY() { return 252; }
    },
    GROUNDSHAKER { // Front & Back
        @Override public String id() { return "s_sandworm_large"; }
        @Override public int frontX() { return 114; }
        @Override public int frontY() { return SANDWORM_GUARDIAN.frontY(); }
        @Override public int backX() { return SANDWORM_GUARDIAN.backX(); }
        @Override public int backY() { return SANDWORM_GUARDIAN.backY(); }
    },
    IRONHIDE_SANDWORM { // Front & Back
        @Override public String id() { return "s_sandworm_medium"; }
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 159; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 190; }
    },
    SPIDERWASP_STRIKER { // Front & Back
        @Override public String id() { return "s_spiderwasp_spitter"; }
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 87; }
        @Override public int backY() { return 122; }
    },
    ROYAL_SPIDERWASP_STRIKER { // Front & Back
        @Override public String id() { return "s_spiderwasp_spitter_70"; }
        @Override public int frontX() { return SPIDERWASP_STRIKER.frontX(); }
        @Override public int frontY() { return SPIDERWASP_STRIKER.frontY(); }
        @Override public int backX() { return SPIDERWASP_STRIKER.backX(); }
        @Override public int backY() { return SPIDERWASP_STRIKER.backY(); }
    },
    SPIDERWASP_WARRIOR { // Front & Back
        @Override public String id() { return "s_spiderwasp_warrior"; }
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 155; }
        @Override public int backX() { return 98; }
        @Override public int backY() { return 136; }
    },
    ROYAL_SPIDERWASP_WARRIOR { // Front & Back
        @Override public String id() { return "s_spiderwasp_warrior_70"; }
        @Override public int frontX() { return SPIDERWASP_WARRIOR.frontX(); }
        @Override public int frontY() { return SPIDERWASP_WARRIOR.frontY(); }
        @Override public int backX() { return SPIDERWASP_WARRIOR.backX(); }
        @Override public int backY() { return SPIDERWASP_WARRIOR.backY(); }
    },
    SPIDERWASP_WORKER { // Front & Back
        @Override public String id() { return "s_spiderwasp_worker"; }
        @Override public int frontX() { return 78; }
        @Override public int frontY() { return 161; }
        @Override public int backY() { return 147; }
    },
    ROYAL_SPIDERWASP_WORKER { // Front & Back
        @Override public String id() { return "s_spiderwasp_worker_70"; }
        @Override public int frontX() { return SPIDERWASP_WORKER.frontX(); }
        @Override public int frontY() { return SPIDERWASP_WORKER.frontY(); }
        @Override public int backX() { return SPIDERWASP_WORKER.backX(); }
        @Override public int backY() { return SPIDERWASP_WORKER.backY(); }
    },
    BIG_GAME_HUNTER { // Front & Back
        @Override public String id() { return "s_trooper_biggamehunter"; }
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 118; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 125; }
    },
    CRYO_TROOPER { // Front & Back
        @Override public String id() { return "s_trooper_cryo"; }
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 58; }
        @Override public int backY() { return 150; }
    },
    LIGHTNING_DRAGOON { // Front & Back
        @Override public String id() { return "s_trooper_dragoon_heavy"; }
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 135; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 150; }
    },
    ELEMENTAL_TROOPER { // Front & Back
        @Override public String id() { return "s_trooper_fire_ice"; }
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 125; }
    },
    AERO_JETPACK_TROOPER { // Front & Back
        @Override public String id() { return "s_trooper_jetpack"; }
        @Override public int frontX() { return 44; }
        @Override public int frontY() { return 159; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 130; }
    },
    PLASMA_TROOPER { // Front & Back
        @Override public String id() { return "s_trooper_plasma"; }
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 128; }
    },
    RAILGUN_TROOPER { // Front & Back
        @Override public String id() { return "s_trooper_railgun"; }
        @Override public int frontX() { return 93; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 60; }
    },
    GUERILLA { // Front & Back
        @Override public String id() { return "s_trooper_saboteur_heavy"; }
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 130; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 140; }
    },
    SPECIAL_AGENT { // Front & Back
        @Override public String id() { return "s_trooper_specialagent"; }
        @Override public int frontX() { return 41; }
        @Override public int frontY() { return 154; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 140; }
    },
    VETERAN { // Front & Back
        @Override public String id() { return "s_trooper_veteran"; }
        @Override public int frontX() { return 39; }
        @Override public int frontY() { return 172; }
        @Override public int backX() { return 53; }
        @Override public int backY() { return 160; }
    },
    VETERAN_2 { // Front
        @Override public String id() { return "s_trooper_veteran_rebel"; }
        @Override public int frontX() { return VETERAN.frontX(); }
        @Override public int frontY() { return VETERAN.frontY(); }
    },
    PROTO_CREEPER { // Front & Back
        @Override public String id() { return "s_trooper_zombie"; }
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 122; }
    },
    SPECIMEN_CREEPER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_b"; }
        @Override public int frontX() { return PROTO_CREEPER.frontX(); }
        @Override public int frontY() { return PROTO_CREEPER.frontY(); }
        @Override public int backX() { return PROTO_CREEPER.backX(); }
        @Override public int backY() { return PROTO_CREEPER.backY(); }
    },
    ADVANCED_CREEPER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_c"; }
        @Override public int frontX() { return PROTO_CREEPER.frontX(); }
        @Override public int frontY() { return PROTO_CREEPER.frontY(); }
        @Override public int backX() { return PROTO_CREEPER.backX(); }
        @Override public int backY() { return PROTO_CREEPER.backY(); }
    },
    ARCHETYPE_CREEPER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_d"; }
        @Override public int frontX() { return PROTO_CREEPER.frontX(); }
        @Override public int frontY() { return PROTO_CREEPER.frontY(); }
        @Override public int backX() { return PROTO_CREEPER.backX(); }
        @Override public int backY() { return PROTO_CREEPER.backY(); }
    },
    PROTO_CANNONEER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_cannon"; }
        @Override public int frontX() { return 39; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 122; }
    },
    SPECIMEN_CANNONEER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_cannon_b"; }
        @Override public int frontX() { return PROTO_CANNONEER.frontX(); }
        @Override public int frontY() { return PROTO_CANNONEER.frontY(); }
        @Override public int backX() { return PROTO_CANNONEER.backX(); }
        @Override public int backY() { return PROTO_CANNONEER.backY(); }
    },
    ADVANCED_CANNONEER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_cannon_c"; }
        @Override public int frontX() { return PROTO_CANNONEER.frontX(); }
        @Override public int frontY() { return PROTO_CANNONEER.frontY(); }
        @Override public int backX() { return PROTO_CANNONEER.backX(); }
        @Override public int backY() { return PROTO_CANNONEER.backY(); }
    },
    ARCHETYPE_CANNONEER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_cannon_d"; }
        @Override public int frontX() { return PROTO_CANNONEER.frontX(); }
        @Override public int frontY() { return PROTO_CANNONEER.frontY(); }
        @Override public int backX() { return PROTO_CANNONEER.backX(); }
        @Override public int backY() { return PROTO_CANNONEER.backY(); }
    },
    PROTO_STALKER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_ninja"; }
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 101; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 110; }
    },
    SPECIMEN_STALKER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_ninja_b"; }
        @Override public int frontX() { return PROTO_STALKER.frontX() + 18; }
        @Override public int frontY() { return PROTO_STALKER.frontY() + 1; }
        @Override public int backX() { return PROTO_STALKER.backX(); }
        @Override public int backY() { return PROTO_STALKER.backY(); }
    },
    ADVANCED_STALKER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_ninja_c"; }
        @Override public int frontX() { return PROTO_STALKER.frontX(); }
        @Override public int frontY() { return PROTO_STALKER.frontY(); }
        @Override public int backX() { return PROTO_STALKER.backX(); }
        @Override public int backY() { return PROTO_STALKER.backY(); }
    },
    ARCHETYPE_STALKER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_ninja_d"; }
        @Override public int frontX() { return PROTO_STALKER.frontX(); }
        @Override public int frontY() { return PROTO_STALKER.frontY(); }
        @Override public int backX() { return PROTO_STALKER.backX(); }
        @Override public int backY() { return PROTO_STALKER.backY(); }
    },
    APEX_STALKER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_ninja_super"; }
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 120; }
        @Override public int backY() { return 113; }
    },
    PROTO_CRAWLER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spider"; }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 119; }
        @Override public int backX() { return 82; }
        @Override public int backY() { return 118; }
    },
    SPECIMEN_CRAWLER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spider_b"; }
        @Override public int frontX() { return PROTO_CRAWLER.frontX(); }
        @Override public int frontY() { return PROTO_CRAWLER.frontY(); }
        @Override public int backX() { return PROTO_CRAWLER.backX(); }
        @Override public int backY() { return PROTO_CRAWLER.backY(); }
    },
    ADVANCED_CRAWLER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spider_c"; }
        @Override public int frontX() { return PROTO_CRAWLER.frontX(); }
        @Override public int frontY() { return PROTO_CRAWLER.frontY(); }
        @Override public int backX() { return PROTO_CRAWLER.backX(); }
        @Override public int backY() { return PROTO_CRAWLER.backY(); }
    },
    ARCHETYPE_CRAWLER { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spider_d"; }
        @Override public int frontX() { return PROTO_CRAWLER.frontX(); }
        @Override public int frontY() { return PROTO_CRAWLER.frontY(); }
        @Override public int backX() { return PROTO_CRAWLER.backX(); }
        @Override public int backY() { return PROTO_CRAWLER.backY(); }
    },
    PROTO_BULLFROG { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spitter"; }
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 102; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 115; }
    },
    SPECIMEN_BULLFROG { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spitter_b"; }
        @Override public int frontX() { return PROTO_BULLFROG.frontX() + 21; }
        @Override public int frontY() { return PROTO_BULLFROG.frontY(); }
        @Override public int backX() { return PROTO_BULLFROG.backX(); }
        @Override public int backY() { return PROTO_BULLFROG.backY(); }
    },
    ADVANCED_BULLFROG { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spitter_c"; }
        @Override public int frontX() { return PROTO_BULLFROG.frontX(); }
        @Override public int frontY() { return PROTO_BULLFROG.frontY(); }
        @Override public int backX() { return PROTO_BULLFROG.backX(); }
        @Override public int backY() { return PROTO_BULLFROG.backY(); }
    },
    ARCHETYPE_BULLFROG { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spitter_d"; }
        @Override public int frontX() { return PROTO_BULLFROG.frontX(); }
        @Override public int frontY() { return PROTO_BULLFROG.frontY(); }
        @Override public int backX() { return PROTO_BULLFROG.backX(); }
        @Override public int backY() { return PROTO_BULLFROG.backY(); }
    },
    APEX_BULLFROG { // Front & Back
        @Override public String id() { return "s_trooper_zombie_spitter_super"; }
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 118; }
        @Override public int backX() { return 83; }
        @Override public int backY() { return 115; }
    },
    PROTO_COLOSSUS { // Front & Back
        @Override public String id() { return "s_trooper_zombie_tank"; }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 78; }
        @Override public int backY() { return 130; }
    },
    ARCHETYPE_COLOSSUS { // Front & Back
        @Override public String id() { return "s_trooper_zombie_tank_b"; }
        @Override public int frontX() { return PROTO_COLOSSUS.frontX(); }
        @Override public int frontY() { return PROTO_COLOSSUS.frontY(); }
        @Override public int backX() { return PROTO_COLOSSUS.backX(); }
        @Override public int backY() { return PROTO_COLOSSUS.backY(); }
    },
    APEX_COLOSSUS { // Front & Back
        @Override public String id() { return "s_trooper_zombie_tank_super"; }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 133; }
        @Override public int backX() { return PROTO_COLOSSUS.backX(); }
        @Override public int backY() { return PROTO_COLOSSUS.backY() + 9; }
    },
    SABOTEUR { // Front & Back
        @Override public String id() { return "saboteur"; }
        @Override public int frontX() { return 26; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 123; }
    },
    SANDWORM_GRUBLING { // Front & Back
        @Override public String id() { return "sandwormsm"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 133; }
        @Override public int backX() { return 36; }
        @Override public int backY() { return 153; }
    },
    SCOUT_BIKE { // Front & Back
        @Override public String id() { return "scoutbike"; }
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 109; }
        @Override public int backX() { return 70; }
    },
    MONSTER_GROUPER { // Front & Back
        @Override public String id() { return "sea_grouper"; }
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 130; }
    },
    BATTLESHIP_RAPTORCLASS { // Front & Back
        @Override public String id() { return "ship_battleship_med"; }
        @Override public int frontX() { return 79; }
        @Override public int frontY() { return 178; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    BATTLESHIP_MAMMOTHCLASS { // Front & Back
        @Override public String id() { return "ship_battleship_super"; }
        @Override public int frontX() { return 74; }
        @Override public int frontY() { return 187; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 155; }
    },
    DESTROYER { // Front & Back
        @Override public String id() { return "ship_destroyer_med"; }
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 120; }
    },
    GUNBOAT { // Front & Back
        @Override public String id() { return "ship_gunboat"; }
        @Override public int frontX() { return 71; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 122; }
    },
    MINELAYER_DESTROYER { // Front & Back
        @Override public String id() { return "ship_minelayer"; }
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 132; }
        @Override public int backY() { return 125; }
    },
    MINI_SUB { // Front & Back
        @Override public String id() { return "ship_mini_sub"; }
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 82; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 90; }
    },
    NAVY_TROOPER { // Front & Back
        @Override public String id() { return "ship_raft_trooper"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 110; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 105; }
    },
    SUBMARINE { // Front & Back
        @Override public String id() { return "ship_submarine"; }
        @Override public int frontX() { return 43; }
        @Override public int frontY() { return 108; }
        @Override public int backX() { return 75; }
        @Override public int backY() { return 104; }
    },
    TACTICAL_SUBMARINE { // Front & Back
        @Override public String id() { return "ship_tactical_sub"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 129; }
        @Override public int backX() { return 92; }
    },
    SHOCK_TROOPER { // Front & Back
        @Override public String id() { return "shocktrooper"; }
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 110; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 120; }
    },
    RIOT_TROOPER { // Front & Back
        @Override public String id() { return "shotgunner"; }
        @Override public int frontX() { return 24; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 125; }
    },
    SHARPSHOOTER { // Front & Back
        @Override public String id() { return "sniper"; }
        @Override public int frontX() { return 37; }
        @Override public int frontY() { return 105; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 107; }
    },
    MORTAR_TRUCK { // Front & Back
        @Override public String id() { return "specialmortar"; }
        @Override public int frontX() { return 61; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 107; }
    },
    EARTHSHAKER { // Front & Back
        @Override public String id() { return "superartillery"; }
        @Override public int frontX() { return 91; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 175; }
    },
    MARKSMAN { // Front & Back
        @Override public String id() { return "supersniper"; }
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 113; }
        @Override public int backX() { return 59; }
        @Override public int backY() { return 127; }
    },
    WOLF_PICKUP { // Front & Back
        @Override public String id() { return "swmgpickup"; }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 128; }
    },
    WOLF_PUNISHER { // Front & Back
        @Override public String id() { return "sw_guy_bat"; }
        @Override public int frontX() { return 44; }
        @Override public int frontY() { return 138; }
        @Override public int backX() { return 52; }
    },
    WOLF_PUNISHER_2 { // Front
        @Override public String id() { return "sw_guy_bat_5"; }
        @Override public int frontX() { return WOLF_PUNISHER.frontX(); }
        @Override public int frontY() { return WOLF_PUNISHER.frontY(); }
    },
    WOLF_GRENADIER_2 { // Front & Back
        @Override public String id() { return "sw_guy_grenade_5"; }
        @Override public int frontX() { return WOLF_GRENADIER.frontX(); }
        @Override public int frontY() { return WOLF_GRENADIER.frontY(); }
        @Override public int backX() { return WOLF_GRENADIER.backX(); }
        @Override public int backY() { return WOLF_GRENADIER.backY(); }
    },
    LASER_WOLF { // Front & Back
        @Override public String id() { return "sw_guy_laser"; }
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 131; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 135; }
    },
    WOLF_SCRAPPER_2 { // Front
        @Override public String id() { return "sw_guy_machete_5"; }
        @Override public int frontX() { return WOLF_SCRAPPER.frontX(); }
        @Override public int frontY() { return WOLF_SCRAPPER.frontY(); }
    },
    WOLF_DEVASTATOR_2 { // Front
        @Override public String id() { return "sw_guy_rpg_5"; }
        @Override public int frontX() { return WOLF_DEVASTATOR.frontX(); }
        @Override public int frontY() { return WOLF_DEVASTATOR.frontY(); }
    },
    WOLF_SLINGER { // Front & Back
        @Override public String id() { return "sw_guy_slingshot"; }
        @Override public int frontX() { return 73; }
        @Override public int frontY() { return 160; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 190; }
    },
    SILVER_WOLF_GOLDEN_EAGLE_2 { // Front
        @Override public String id() { return "sw_guy_sniper"; }
        @Override public int frontX() { return SILVER_WOLF_GOLDEN_EAGLE.frontX(); }
        @Override public int frontY() { return SILVER_WOLF_GOLDEN_EAGLE.frontY(); }
        @Override public int backX() { return SILVER_WOLF_GOLDEN_EAGLE.backX(); }
        @Override public int backY() { return SILVER_WOLF_GOLDEN_EAGLE.backY(); }
    },
    WOLF_THUG_2 { // Front
        @Override public String id() { return "sw_guy_uzi_5"; }
        @Override public int frontX() { return WOLF_THUG.frontX(); }
        @Override public int frontY() { return WOLF_THUG.frontY(); }
    },
    WOLF_ARTILLERY { // Front & Back
        @Override public String id() { return "sw_veh_artillery"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 121; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 130; }
    },
    WOLF_BOMBADIER_2 { // Front
        @Override public String id() { return "sw_veh_artillery_5"; }
        @Override public int frontX() { return WOLF_BOMBADIER.frontX(); }
        @Override public int frontY() { return WOLF_BOMBADIER.frontY(); }
    },
    WOLF_FURY { // Front & Back
        @Override public String id() { return "sw_veh_catapult"; }
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 174; }
        @Override public int backY() { return 198; }
    },
    WOLF_PICKUP_2 { // Front
        @Override public String id() { return "sw_veh_pickup_5"; }
        @Override public int frontX() { return WOLF_PICKUP.frontX(); }
        @Override public int frontY() { return WOLF_PICKUP.frontY(); }
    },
    CONVERTED_GARBAGE_TRUCK { // Front & Back
        @Override public String id() { return "sw_veh_rockettruck"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 64; }
        @Override public int backY() { return 144; }
    },
    WOLF_ROLLER { // Front & Back
        @Override public String id() { return "sw_veh_steamroller"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 168; }
        @Override public int backY() { return 130; }
    },
    TANK_KILLER { // Front & Back
        @Override public String id() { return "tankkiller"; }
        @Override public int frontX() { return 92; }
        @Override public int frontY() { return 111; }
        @Override public int backX() { return 72; }
        @Override public int backY() { return 148; }
    },
    TROOPER { // Front & Back
        @Override public String id() { return "trooper"; }
        @Override public int frontX() { return 47; }
        @Override public int frontY() { return 112; }
        @Override public int backX() { return 32; }
        @Override public int backY() { return 130; }
    },
    SOPWITH_SPIDERWASP { // Front & Back
        @Override public String id() { return "veh_air_biplane"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 143; }
        @Override public int backX() { return 66; }
        @Override public int backY() { return 137; }
    },
    ZRS6_DIRIGIBLE { // Front & Back
        @Override public String id() { return "veh_air_dirigible"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 189; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 160; }
    },
    BC1_SNAKE { // Front & Back
        @Override public String id() { return "veh_air_helicopter"; }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 204; }
        @Override public int backX() { return 127; }
        @Override public int backY() { return 181; }
    },
    BC3_COBRA { // Front & Back
        @Override public String id() { return "air_helicopter_new"; }
        @Override public int frontX() { return BC1_SNAKE.frontX(); }
        @Override public int frontY() { return BC1_SNAKE.frontY() - 5; }
        @Override public int backX() { return BC1_SNAKE.backX(); }
        @Override public int backY() { return BC1_SNAKE.backY(); }
    },
    EXPERIMENT_X17 { // Front & Back
        @Override public String id() { return "veh_ancient_robot_clone_trap_mission"; }
        @Override public int frontX() { return 86; }
        @Override public int frontY() { return 139; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 185; }
    },
    DEXTER_FRAGMENT { // Front & Back
        @Override public String id() { return "veh_ancient_robot_player"; }
        @Override public int frontX() { return EXPERIMENT_X17.frontX(); }
        @Override public int frontY() { return EXPERIMENT_X17.frontY(); }
        @Override public int backX() { return EXPERIMENT_X17.backX(); }
        @Override public int backY() { return EXPERIMENT_X17.backY(); }
    },
    ANTIAIRCRAFT_FLAK_GUN { // Front & Back
        @Override public String id() { return "veh_anti_aircraft_gun_premium"; }
        @Override public int frontX() { return 79; }
        @Override public int frontY() { return 175; }
        @Override public int backY() { return 184; }
    },
    ANTIAIRCRAFT_TURRET { // Front & Back
        @Override public String id() { return "veh_anti_aircraft_gun_regular"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 64; }
        @Override public int backY() { return 175; }
    },
    BRUTALIZER { // Front & Back
        @Override public String id() { return "veh_anti_armor"; }
        @Override public int frontX() { return 88; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 114; }
        @Override public int backY() { return 160; }
    },
    DEATH_FROM_ABOVE { // Front & Back
        @Override public String id() { return "veh_artillery_napalm"; }
        @Override public int frontX() { return 91; }
        @Override public int frontY() { return 152; }
        @Override public int backX() { return 89; }
        @Override public int backY() { return 192; }
    },
    BOOM_BUS { // Front & Back
        @Override public String id() { return "veh_boombus"; }
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 158; }
        @Override public int backX() { return 102; }
        @Override public int backY() { return 153; }
    },
    ARTILLERY_PLASMA_CANNON { // Front & Back
        @Override public String id() { return "veh_cannon_plasma"; }
        @Override public int frontX() { return 93; }
        @Override public int frontY() { return 160; }
        @Override public int backX() { return 78; }
        @Override public int backY() { return 188; }
    },
    NOMAD_ELEMENTAL_ROVER { // Front & Back
        @Override public String id() { return "veh_elemental_rover"; }
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 130; }
        @Override public int backX() { return 92; }
        @Override public int backY() { return 125; }
    },
    T16_AERO_BIKE { // Front & Back
        @Override public String id() { return "veh_hoverbike"; }
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 145; }
        @Override public int backX() { return 86; }
        @Override public int backY() { return 135; }
    },
    ANTIGRAVITY_TANK { // Front & Back
        @Override public String id() { return "veh_hovertank"; }
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 162; }
        @Override public int backY() { return 159; }
    },
    UNMANNED_FLAME_TURRET { // Front & Back
        @Override public String id() { return "veh_ign_turret_flame"; }
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 140; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 150; }
    },
    UNMANNED_LASER_TURRET { // Front & Back
        @Override public String id() { return "veh_ign_turret_laser"; }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 160; }
    },
    UNMANNED_MACHINE_GUN_TURRET { // Front & Back
        @Override public String id() { return "veh_ign_turret_mgun"; }
        @Override public int frontX() { return 92; }
        @Override public int frontY() { return 148; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 175; }
    },
    ACES_650CC { // Front & Back
        @Override public String id() { return "veh_motorcycle_advanced"; }
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 157; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 120; }
    },
    PLASMA_TURRET { // Front & Back
        @Override public String id() { return "veh_plasma_turret"; }
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 156; }
        @Override public int backX() { return 67; }
        @Override public int backY() { return 176; }
    },
    RAIDER_MAMMOTH_TANK { // Front
        @Override public String id() { return "veh_raider_mammoth_armored_55"; }
        @Override public int frontX() { return ARMORED_RAIDER_MAMMOTH.frontX(); }
        @Override public int frontY() { return ARMORED_RAIDER_MAMMOTH.frontY(); }
    },
    TOTAL_WAR_MAMMOTH { // Front
        @Override public String id() { return "veh_raider_mammoth_rockets_55"; }
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 195; }
    },
    RAIDER_WAR_MAMMOTH { // Front & Back
        @Override public String id() { return "veh_raider_rocketmammoth"; }
        @Override public int frontX() { return 89; }
        @Override public int frontY() { return TOTAL_WAR_MAMMOTH.frontY(); }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 185; }
    },
    ARCTIC_TANK { // Front & Back
        @Override public String id() { return "veh_tank_arctic"; }
        @Override public int frontX() { return 95; }
        @Override public int frontY() { return 153; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 142; }
    },
    HEAVY_ARCTIC_TANK { // Front & Back
        @Override public String id() { return "veh_tank_arctic_heavy"; }
        @Override public int frontX() { return 112; }
        @Override public int frontY() { return 182; }
        @Override public int backX() { return 103; }
        @Override public int backY() { return 159; }
    },
    HEAVY_ARCTIC_TANK_2 { // Front
        @Override public String id() { return "veh_tank_arctic_heavy_rebel"; }
        @Override public int frontX() { return HEAVY_ARCTIC_TANK.frontX(); }
        @Override public int frontY() { return HEAVY_ARCTIC_TANK.frontY(); }
    },
    BASILISK { // Front & Back
        @Override public String id() { return "veh_tank_basilisk"; }
        @Override public int frontX() { return 73; }
        @Override public int frontY() { return 143; }
    },
    FROSTBITE { // Front & Back
        @Override public String id() { return "veh_tank_cryo"; }
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 74; }
        @Override public int backY() { return 125; }
    },
    DRAGON { // Front & Back
        @Override public String id() { return "veh_tank_flame_heavy"; }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 147; }
        @Override public int backX() { return 72; }
        @Override public int backY() { return 140; }
    },
    HEAVIER_TANK { // Front & Back
        @Override public String id() { return "veh_tank_heavier"; }
        @Override public int frontX() { return 97; }
        @Override public int frontY() { return 137; }
        @Override public int backY() { return 150; }
    },
    LASER_TANK { // Front & Back
        @Override public String id() { return "veh_tank_laser"; }
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 153; }
        @Override public int backX() { return 95; }
        @Override public int backY() { return 160; }
    },
    MEGA_TANK { // Front & Back
        @Override public String id() { return "veh_tank_mega"; }
        @Override public int frontX() { return 101; }
        @Override public int frontY() { return 151; }
        @Override public int backX() { return 95; }
        @Override public int backY() { return 160; }
    },
    MEGA_TANK_2 { // Front
        @Override public String id() { return "veh_tank_mega_rebel"; }
        @Override public int frontX() { return MEGA_TANK.frontX(); }
        @Override public int frontY() { return MEGA_TANK.frontY(); }
    },
    PLASMA_TANK { // Front & Back
        @Override public String id() { return "veh_tank_plasma"; }
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 147; }
        @Override public int backX() { return 107; }
        @Override public int backY() { return 136; }
    },
    SNOW_CRUSHER { // Front & Back
        @Override public String id() { return "veh_tank_snowplow"; }
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 167; }
        @Override public int backX() { return 115; }
        @Override public int backY() { return 135; }
    },
    LIGHTNING_TANK { // Front & Back
        @Override public String id() { return "veh_tank_tesla"; }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 137; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 145; }
    },
    ZOEYS_TREBUCHET { // Front & Back
        @Override public String id() { return "veh_trebuchet"; }
        @Override public int frontX() { return 79; }
        @Override public int frontY() { return 190; }
        @Override public int backY() { return 162; }
    },
    PUMA { // Front & Back
        @Override public String id() { return "wheeledtank"; }
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 114; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 110; }
    },
    SC2_PELICAN { // Front & Back
        @Override public String id() { return "air_seaplane"; }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 140; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 136; }
    },
    HEAVY_GUNBOAT { // Front
        @Override public String id() { return "ship_gunboat_rebel"; }
        @Override public int frontX() { return GUNBOAT.frontX(); }
        @Override public int frontY() { return GUNBOAT.frontY(); }
    },
    SHADOW_CLASS_SUBMARINE { // Front
        @Override public String id() { return "ship_submarine_rebel"; }
        @Override public int frontX() { return SUBMARINE.frontX(); }
        @Override public int frontY() { return SUBMARINE.frontY(); }
    },
    SUPREME_DESTROYER { // Front
        @Override public String id() { return "ship_destroyer_med_rebel"; }
        @Override public int frontX() { return DESTROYER.frontX(); }
        @Override public int frontY() { return DESTROYER.frontY(); }
    },
    BATTLESHIP_MASTODONCLASS { // Front
        @Override public String id() { return "ship_battleship_med_rebel"; }
        @Override public int frontX() { return BATTLESHIP_RAPTORCLASS.frontX(); }
        @Override public int frontY() { return BATTLESHIP_RAPTORCLASS.frontY() + 4; }
    },
    BATTLESHIP_BEHEMOTHCLASS { // Front
        @Override public String id() { return "ship_battleship_super_rebel"; }
        @Override public int frontX() { return BATTLESHIP_MAMMOTHCLASS.frontX(); }
        @Override public int frontY() { return BATTLESHIP_MAMMOTHCLASS.frontY(); }
    },
    ATMOSPHERIC_DIVING_TROOPER { // Front & Back
        @Override public String id() { return "ship_scuba_trooper"; }
        @Override public int frontX() { return 85; }
        @Override public int frontY() { return 110; }
    },
    IRONCLAD_BATTLESHIP { // Front & Back
        @Override public String id() { return "ship_ironclad"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 135; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 105; }
    },
    PHALANX_TANK { // Front & Back
        @Override public String id() { return "veh_phalanx_tank_player"; }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 165; }
        @Override public int backX() { return 68; }
        @Override public int backY() { return 175; }
    },
    MELEE_SENTINEL_FRAGMENT { // Front & Back
        @Override public String id() { return "veh_ancient_robot_2_player_left"; }
        @Override public int frontX() { return 83; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 138; }
    },
    RANGED_SENTINEL_FRAGMENT { // Front & Back
        @Override public String id() { return "veh_ancient_robot_2_player_right"; }
        @Override public int frontX() { return MELEE_SENTINEL_FRAGMENT.frontX() - 33; }
        @Override public int frontY() { return MELEE_SENTINEL_FRAGMENT.frontY(); }
        @Override public int backX() { return MELEE_SENTINEL_FRAGMENT.backX(); }
        @Override public int backY() { return MELEE_SENTINEL_FRAGMENT.backY() - 15; }
    },
    THE_WIMP { // Front & Back
        @Override public String id() { return "s_trooper_underdog"; }
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 118; }
        @Override public int backX() { return 52; }
        @Override public int backY() { return 122; }
    },
    UD4L_GUNSHIP { // Front & Back
        @Override public String id() { return "air_assaultcraft"; }
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 179; }
        @Override public int backX() { return 92; }
        @Override public int backY() { return 163; }
    },
    F51_HELL_FIRE { // Front & Back
        @Override public String id() { return "air_flame_helicopter"; }
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 174; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 164; }
    },
    V47_KITTYHAWK { // Front & Back
        @Override public String id() { return "air_jet_fighter_2"; }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 148; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 125; }
    },
    C17_WINGED_MAMMOTH { // Front & Back
        @Override public String id() { return "air_osprey_helicopter"; }
        @Override public int frontX() { return 104; }
        @Override public int frontY() { return 218; }
        @Override public int backX() { return 126; }
        @Override public int backY() { return 208; }
    },
    RSB17_SHADOW_HORNET { // Front & Back
        @Override public String id() { return "air_stealth_fighter2"; }
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 165; }
        @Override public int backX() { return 82; }
        @Override public int backY() { return 154; }
    },
    RS17_SHADOWWASP { // Front & Back
        @Override public String id() { return "air_stealth_fighter"; }
        @Override public int frontX() { return RSB17_SHADOW_HORNET.frontX(); }
        @Override public int frontY() { return RSB17_SHADOW_HORNET.frontY(); }
        @Override public int backX() { return RSB17_SHADOW_HORNET.backX(); }
        @Override public int backY() { return RSB17_SHADOW_HORNET.backY(); }
    },
    TRIWING_TERROR { // Front & Back
        @Override public String id() { return "air_triplane"; }
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 170; }
        @Override public int backX() { return 74; }
        @Override public int backY() { return 167; }
    },
    B10C_BOAR_II { // Front & Back
        @Override public String id() { return "air_warthog_2"; }
        @Override public int frontX() { return B10_WILD_BOAR.frontX(); }
        @Override public int frontY() { return B10_WILD_BOAR.frontY(); }
        @Override public int backX() { return B10_WILD_BOAR.backX(); }
        @Override public int backY() { return B10_WILD_BOAR.backY(); }
    },
    LEGENDARY_BOAR { // Front & Back
        @Override public String id() { return "ancient_boar_player"; }
        @Override public int frontX() { return 105; }
        @Override public int frontY() { return 160; }
        @Override public int backX() { return 99; }
        @Override public int backY() { return 181; }
    },
    LEGENDARY_MAMMOTH { // Front & Back
        @Override public String id() { return "ancient_mammoth"; }
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 175; }
        @Override public int backX() { return 71; }
        @Override public int backY() { return 186; }
    },
    LEGENDARY_RAPTOR { // Front & Back
        @Override public String id() { return "s_ancient_raptor_player"; }
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 160; }
        @Override public int backX() { return 102; }
        @Override public int backY() { return 180; }
    },
    LEGENDARY_SANDWORM { // Front & Back
        @Override public String id() { return "s_ancient_sandworm"; }
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 265; }
        @Override public int backX() { return 58; }
        @Override public int backY() { return 232; }
    },
    MAMMOTH_ARTILLERY { // Front & Back
        @Override public String id() { return "s_mammoth_player_artillery"; }
        @Override public int frontX() { return 86; }
        @Override public int frontY() { return 196; }
        @Override public int backX() { return 80; }
        @Override public int backY() { return 203; }
    },
    MAMMOTH_TANK { // Front & Back
        @Override public String id() { return "s_mammoth_player_tank"; }
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 192; }
        @Override public int backX() { return 73; }
        @Override public int backY() { return 182; }
    },
    FRONTIER_CHUCKER { // Front & Back
        @Override public String id() { return "catapult"; }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 72; }
        @Override public int backY() { return 118; }
    },
    DEADEYE { // Front & Back
        @Override public String id() { return "s_sniper_special_heavy"; }
        @Override public int frontX() { return 62; }
        @Override public int frontY() { return 145; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 135; }
    },
    RADIO_TECH { // Front & Back
        @Override public String id() { return "s_trooper_missilestrike"; }
        @Override public int frontX() { return 36; }
        @Override public int frontY() { return 130; }
        @Override public int backX() { return 45; }
    },
    UNICORN_TROOPER { // Front & Back
        @Override public String id() { return "s_unicorn_trooper"; }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 128; }
        @Override public int backY() { return 135; }
    },
    WEAPON_TECHNICIAN {
        @Override public String id() { return "s_scientist"; }
        @Override public int frontX() { return 35; }
        @Override public int frontY() { return 125; }
        @Override public int backY() { return 120; }
    },
    TF2_SCOUT {
        @Override public String id() { return "tf2_hero_scout"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 130; }
        @Override public int backX() { return 38; }
        @Override public int backY() { return 135; }
    },
    TF2_SOLDIER {
        @Override public String id() { return "tf2_hero_soldier"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 145; }
        @Override public int backX() { return 45; }
    },
    TF2_HEAVY {
        @Override public String id() { return "tf2_hero_heavy"; }
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 165; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 170; }
    },
    TF2_DEMOMAN {
        @Override public String id() { return "tf2_hero_demoman"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 155; }
        @Override public int backX() { return 40; }
    },
    TF2_PYRO {
        @Override public String id() { return "tf2_hero_pyro"; }
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 135; }
        @Override public int backX() { return 50; }
        @Override public int backY() { return 145; }
    },
    TEST {
        @Override public String id() { return "this_id_does_not_exist"; }
        @Override public int frontX() { return -0; }
        @Override public int frontY() { return -0; }
    };
    abstract public String id();
    public String frontFilePath() { return "/units/front/" + id() + "_front.png"; }
    public String backFilePath() { return "/units/back/" + id() + "_back.png"; }
    abstract public int frontX();
    abstract public int frontY();
    public int backX() { return frontX(); }
    public int backY() { return frontY(); }
    public static Unit fromId(String s) {
        // Units marked with ~ are added by me and was not included in the original list
        return switch (s) {
            case "recon_vehicle" -> RECON_VEHICLE;
            case "raider_boom_boom" -> BOOM_BOOM;
            case "raider_brawler" -> RAIDER_BRAWLER;
            case "dust_walker" -> DUST_WALKER;
            case "firebreather" -> FIREBREATHER;
            case "flame_turret" -> FLAME_TURRET;
            case "warlord_gantas" -> WARLORD_GANTAS;
            case "gun_truck" -> GUN_TRUCK;
            case "light_tank" -> LIGHT_TANK;
            case "tempest" -> TEMPEST;
            case "mammoth_rider" -> MAMMOTH_RIDER;
            case "wolf_bombadier" -> WOLF_BOMBADIER;
            case "wolf_defender" -> WOLF_DEFENDER;
            case "wolf_devastator" -> WOLF_DEVASTATOR;
            case "wolf_enforcer" -> WOLF_ENFORCER;
            case "wolf_grenadier" -> WOLF_GRENADIER;
            case "wolf_thug" -> WOLF_THUG;
            case "wolf_armored_truck" -> WOLF_ARMORED_TRUCK;
            case "wolf_scrapper" -> WOLF_SCRAPPER;
            case "sniper" -> SNIPER;
            case "super_tank" -> SUPER_TANK;
            case "meerkat" -> MEERKAT;
            case "flying_dexter_fragment" -> FLYING_DEXTER_FRAGMENT;
            case "uh1b_skyraptor" -> UH1B_SKYRAPTOR;
            case "z218_bomber" -> Z218_BOMBER;
            case "thundercloud_f10" -> THUNDERCLOUD_F10;
            case "v14_maverick" -> V14_MAVERICK;
            case "falcons_nest" -> FALCONS_NEST;
            case "proto_hunter" -> PROTO_HUNTER;
            case "specimen_hunter" -> SPECIMEN_HUNTER;
            case "advanced_hunter" -> ADVANCED_HUNTER;
            case "archetype_hunter" -> ARCHETYPE_HUNTER;
            case "spiderwasp_drone" -> SPIDERWASP_DRONE;
            case "royal_spiderwasp_drone" -> ROYAL_SPIDERWASP_DRONE;
            case "silverwolf_crop_buster" -> SILVERWOLF_CROP_BUSTER;
            case "silverwolf_chunook_helicopter" -> SILVERWOLF_CHUNOOK_HELICOPTER;
            case "b10_wild_boar" -> B10_WILD_BOAR;
            case "l60_hawker_hurricane" -> L60_HAWKER_HURRICANE;
            case "armored_fortress" -> ARMORED_FORTRESS;
            case "armored_raider_mammoth" -> ARMORED_RAIDER_MAMMOTH;
            case "armored_pillbox" -> ARMORED_PILLBOX;
            case "arsonist" -> ARSONIST;
            case "light_artillery" -> LIGHT_ARTILLERY;
            case "assassinator" -> ASSASSINATOR;
            case "bazooka_squad" -> BAZOOKA_SQUAD;
            case "bio_grenadier" -> BIO_GRENADIER;
            case "blockhouse" -> BLOCKHOUSE;
            case "goliath_tank_left" -> MULTILAUNCH_ROCKET_SYSTEM_LEFT;
            case "goliath_tank" -> GOLIATH_TANK;
            case "goliath_tank_right" -> MULTILAUNCH_ROCKET_SYSTEM_RIGHT;
            case "kraken_tentacle" -> KRAKEN_TENTACLE;
            case "kraken_body" -> THE_KRAKEN;
            case "dreadnought" -> DREADNOUGHT;
            case "spiderwasp_queen" -> SPIDERWASP_QUEEN;
            case "wolf_cruel_bus" -> WOLF_CRUEL_BUS;
            case "raider_cannoneer" -> RAIDER_CANNONEER;
            case "raider_champion" -> RAIDER_CHAMPION;
            case "chemical_sprinkler" -> CHEMICAL_SPRINKLER;
            case "chem_trooper" -> CHEM_TROOPER;
            case "ranger" -> RANGER;
            case "peace_keeper" -> PEACE_KEEPER;
            case "concrete_wall_a" -> CONCRETE_WALL_A;
            case "concrete_wall_b" -> CONCRETE_WALL_B;
            case "sandbags" -> SANDBAGS;
            case "buoy" -> BUOY;
            case "portable_electric_fence" -> PORTABLE_ELECTRIC_FENCE;
            case "floating_mine" -> FLOATING_MINE;
            case "raider_fence" -> RAIDER_FENCE;
            case "spiderwasp_egg" -> SPIDERWASP_EGG;
            case "reinforced_concrete_wall" -> REINFORCED_CONCRETE_WALL;
            case "whirlpool" -> WHIRLPOOL;
            case "demolitionist" -> DEMOLITIONIST;
            case "imperial_dragoon" -> IMPERIAL_DRAGOON;
            case "dune_rider" -> DUNE_RIDER;
            case "elder_sandworm" -> ELDER_SANDWORM;
            case "lightning_trooper" -> LIGHTNING_TROOPER;
            case "flame_trooper" -> FLAME_TROOPER;
            case "hornet" -> HORNET;
            case "grenadier" -> GRENADIER;
            case "watchtower" -> WATCHTOWER;
            case "gunner" -> GUNNER;
            case "heavy_chemical_tank" -> HEAVY_CHEMICAL_TANK;
            case "brimstone" -> BRIMSTONE;
            case "heavy_artillery" -> HEAVY_ARTILLERY;
            case "heavy_tank" -> HEAVY_TANK;
            case "ancient_construct" -> ANCIENT_CONSTRUCT;
            case "ancient_sentinel_left" -> MELEE_WEAPON_SYSTEM;
            case "ancient_sentinel_right" -> RANGED_WEAPON_SYSTEM;
            case "ancient_sentinel" -> ANCIENT_SENTINEL;
            case "experimental_construct" -> EXPERIMENTAL_CONSTRUCT;
            case "hero_spiderwasp_queen" -> SPIDERWASP_QUEEN; // For some reason two IDs link the Spiderwasp Queen, other being 'boss_spiderwasp_queen'
            case "hitman" -> HITMAN;
            case "hunter" -> HUNTER;
            case "railgun_tank" -> RAILGUN_TANK;
            case "humvee" -> HUMVEE;
            case "juggernaut" -> JUGGERNAUT;
            case "hailstorm" -> HAILSTORM;
            case "light_chemical_tank" -> LIGHT_CHEMICAL_TANK;
            case "firedrake" -> FIREDRAKE;
            case "medium_tank" -> MEDIUM_TANK;
            case "peacemaker" -> PEACEMAKER;
            case "armadillo" -> ARMADILLO;
            case "mini_tank" -> MINI_TANK;
            case "heavy_gunner" -> HEAVY_GUNNER;
            case "rocket_truck" -> ROCKET_TRUCK;
            case "mortar_team" -> MORTAR_TEAM;
            case "aries" -> ARIES;
            case "the_rock" -> THE_ROCK;
            case "stone_slab" -> STONE_SLAB;
            case "line_of_rocks" -> LINE_OF_ROCKS;
            case "granite_boulder" -> GRANITE_BOULDER;
            case "debris" -> DEBRIS;
            case "fallen_log" -> FALLEN_LOG;
            case "ninja_trooper" -> NINJA_TROOPER;
            case "junior_officer" -> JUNIOR_OFFICER;
            case "pillbox" -> PILLBOX;
            case "heavy_recon_vehicle" -> HEAVY_RECON;
            case "raider_warrior" -> RAIDER_WARRIOR;
            case "tronk" -> TRONK;
            case "crazy_blades" -> CRAZY_BLADES;
            case "sarin" -> SARIN;
            case "raider_watchtower" -> RAIDER_WATCHTOWER;
            case "commando" -> COMMANDO;
            case "rat_king" -> RAT_KING;
            case "mangy_rat" -> MANGY_RAT;
            case "jet_ski" -> JET_SKI;
            case "power_boat" -> POWER_BOAT;
            case "armored_tug" -> ARMORED_TUG;
            case "rpg_trooper" -> RPG_TROOPER;
            case "arctic_trooper" -> ARCTIC_TROOPER;
            case "arctic_trooper_rebel" -> ARCTIC_TROOPER_2;
            case "bigfoot" -> BIGFOOT;
            case "bigfoot_warrior" -> BIGFOOT_WARRIOR;
            case "young_bigfoot" -> YOUNG_BIGFOOT;
            case "apex_mauler" -> APEX_MAULER;
            case "boar_veteran" -> BOAR_VETERAN;
            case "alpha_boar" -> ALPHA_BOAR;
            case "wild_boar" -> WILD_BOAR;
            case "boar_piglet" -> BOAR_PIGLET;
            case "imperial_peacemonger" -> IMPERIAL_PEACEMONGER;
            case "commando_rebel" -> COMMANDO_2;
            case "lightning_tower" -> LIGHTNING_TOWER;
            case "salamander" -> SALAMANDER;
            case "silver_wolf_golden_eagle" -> SILVER_WOLF_GOLDEN_EAGLE;
            case "mammoth_seer" -> MAMMOTH_SEER;
            case "mammoth_elder" -> MAMMOTH_ELDER;
            case "mammoth" -> MAMMOTH;
            case "mammoth_tuskling" -> MAMMOTH_TUSKLING;
            case "boarus_rex" -> BOARUS_REX;
            case "field_agent" -> FIELD_AGENT;
            case "turtlesheller" -> TURTLESHELLER;
            case "portable_wall" -> PORTABLE_WALL;
            case "portable_wall_rebel" -> null; //PORTABLE_WALL_2; // Alternative sprite for portable wall
            case "brutal_cannoneer" -> BRUTAL_CANNONEER;
            case "big_bada_boom" -> BIG_BADA_BOOM;
            case "brutal_brawler" -> BRUTAL_BRAWLER;
            case "brutal_champion" -> BRUTAL_CHAMPION;
            case "dustwalker_dervish" -> DUSTWALKER_DERVISH;
            case "searing_firebreather" -> SEARING_FIREBREATHER;
            case "raider_rifleman" -> RAIDER_RIFLEMAN;
            case "raider_skirmisher" -> RAIDER_SKIRMISHER;
            case "elite_skirmisher" -> ELITE_SKIRMISHER;
            case "raider_outcast" -> RAIDER_OUTCAST;
            case "elite_outcast" -> ELITE_OUTCAST;
            case "wild_raptor" -> WILD_RAPTOR;
            case "raptor" -> RAPTOR;
            case "young_raptor" -> YOUNG_RAPTOR;
            case "primordial_raptor" -> PRIMORDIAL_RAPTOR;
            case "proto_shredder" -> PROTO_SHREDDER;
            case "specimen_shredder" -> SPECIMEN_SHREDDER;
            case "advanced_shredder" -> ADVANCED_SHREDDER;
            case "archetype_shredder" -> ARCHETYPE_SHREDDER;
            case "wandering_samurai" -> WANDERING_SAMURAI;
            case "sandbag_pile" -> SANDBAG_PILE;
            case "sandworm_guardian" -> SANDWORM_GUARDIAN;
            case "volcano_shaker" -> null; //VOLCANO_SHAKER; // Large SANDWORM_GUARDIAN
            case "emperor_sandworm" -> EMPEROR_SANDWORM;
            case "groundshaker" -> GROUNDSHAKER;
            case "ironhide_sandworm" -> IRONHIDE_SANDWORM;
            case "spiderwasp_striker"-> SPIDERWASP_STRIKER;
            case "royal_spiderwasp_striker" -> ROYAL_SPIDERWASP_STRIKER;
            case "spiderwasp_warrior" -> SPIDERWASP_WARRIOR;
            case "royal_spiderwasp_warrior" -> ROYAL_SPIDERWASP_WARRIOR;
            case "spiderwasp_worker" -> SPIDERWASP_WORKER;
            case "royal_spiderwasp_worker" -> ROYAL_SPIDERWASP_WORKER;
            case "big_game_hunter" -> BIG_GAME_HUNTER;
            case "cryo_trooper" -> CRYO_TROOPER;
            case "lightning_dragoon" -> LIGHTNING_DRAGOON;
            case "elemental_trooper" -> ELEMENTAL_TROOPER;
            case "aero_jetpack_trooper" -> AERO_JETPACK_TROOPER;
            case "plasma_trooper" -> PLASMA_TROOPER;
            case "railgun_trooper" -> RAILGUN_TROOPER;
            case "guerilla" -> GUERILLA;
            case "special_agent" -> SPECIAL_AGENT;
            case "veteran" -> VETERAN;
            case "veteran_rebel" -> VETERAN_2;
            case "proto_creeper" -> PROTO_CREEPER;
            case "specimen_creeper" -> SPECIMEN_CREEPER;
            case "advanced_creeper" -> ADVANCED_CREEPER;
            case "archetype_creeper" -> ARCHETYPE_CREEPER;
            case "proto_cannoneer" -> PROTO_CANNONEER;
            case "specimen_cannoneer" -> SPECIMEN_CANNONEER;
            case "advanced_cannoneer" -> ADVANCED_CANNONEER;
            case "archetype_cannoneer" -> ARCHETYPE_CANNONEER;
            case "proto_stalker" -> PROTO_STALKER;
            case "specimen_stalker" -> SPECIMEN_STALKER;
            case "advanced_stalker" -> ADVANCED_STALKER;
            case "archetype_stalker" -> ARCHETYPE_STALKER;
            case "apex_stalker" -> APEX_STALKER;
            case "proto_crawler" -> PROTO_CRAWLER;
            case "specimen_crawler" -> SPECIMEN_CRAWLER;
            case "advanced_crawler" -> ADVANCED_CRAWLER;
            case "archetype_crawler" -> ARCHETYPE_CRAWLER;
            case "proto_bullfrog" -> PROTO_BULLFROG;
            case "specimen_bullfrog" -> SPECIMEN_BULLFROG;
            case "advanced_bullfrog" -> ADVANCED_BULLFROG;
            case "archetype_bullfrog" -> ARCHETYPE_BULLFROG;
            case "apex_bullfrog" -> APEX_BULLFROG;
            case "proto_colossus" -> PROTO_COLOSSUS;
            case "archetype_colossus" -> ARCHETYPE_COLOSSUS;
            case "apex_colossus" -> APEX_COLOSSUS;
            case "saboteur" -> SABOTEUR;
            case "sandworm_grubling" -> SANDWORM_GRUBLING;
            case "scout_bike" -> SCOUT_BIKE;
            case "monster_grouper" -> MONSTER_GROUPER;
            case "battleship_raptor" -> BATTLESHIP_RAPTORCLASS;
            case "battleship_mammoth" -> BATTLESHIP_MAMMOTHCLASS;
            case "destroyer" -> DESTROYER;
            case "gunboat" -> GUNBOAT;
            case "minelayer_destroyer" -> MINELAYER_DESTROYER;
            case "mini_sub" -> MINI_SUB;
            case "navy_trooper" -> NAVY_TROOPER;
            case "tactical_submarine" -> TACTICAL_SUBMARINE; // ~
            case "shock_trooper" -> SHOCK_TROOPER;
            case "riot_trooper" -> RIOT_TROOPER;
            case "sharpshooter" -> SHARPSHOOTER;
            case "mortar_truck" -> MORTAR_TRUCK;
            case "submarine" -> SUBMARINE;
            case "earthshaker" -> EARTHSHAKER;
            case "marksman" -> MARKSMAN;
            case "wolf_pickup" -> WOLF_PICKUP;
            case "wolf_punisher" -> WOLF_PUNISHER;
            case "wolf_punisher_2" -> WOLF_PUNISHER_2;
            case "wolf_grenadier_2" -> WOLF_GRENADIER_2;
            case "laser_wolf" -> LASER_WOLF;
            case "wolf_scrapper_2" -> WOLF_SCRAPPER_2;
            case "wolf_devastator_2" -> WOLF_DEVASTATOR_2;
            case "wolf_slinger" -> WOLF_SLINGER;
            case "silver_wolf_golden_eagle_2" -> SILVER_WOLF_GOLDEN_EAGLE_2;
            case "wolf_thug_2" -> WOLF_THUG_2;
            case "wolf_artillery" -> WOLF_ARTILLERY;
            case "wolf_bombadier_2" -> WOLF_BOMBADIER_2;
            case "wolf_fury" -> WOLF_FURY;
            case "wolf_pickup_2" -> WOLF_PICKUP_2;
            case "converted_garbage_truck" -> CONVERTED_GARBAGE_TRUCK;
            case "wolf_roller" -> WOLF_ROLLER;
            case "tank_killer" -> TANK_KILLER;
            case "trooper" -> TROOPER;
            case "sopwith_spiderwasp" -> SOPWITH_SPIDERWASP;
            case "zrs6_dirigible" -> ZRS6_DIRIGIBLE;
            case "bc1_snake" -> BC1_SNAKE;
            case "bc3_cobra" -> BC3_COBRA; // ~
            case "experiment_x17" -> EXPERIMENT_X17;
            case "dexter_fragment" -> DEXTER_FRAGMENT;
            case "antiaircraft_flak_gun" -> ANTIAIRCRAFT_FLAK_GUN;
            case "antiaircraft_turret" -> ANTIAIRCRAFT_TURRET;
            case "brutalizer" -> BRUTALIZER;
            case "death_from_above" -> DEATH_FROM_ABOVE;
            case "boom_bus" -> BOOM_BUS;
            case "artillery_plasma_cannon" -> ARTILLERY_PLASMA_CANNON;
            case "nomad_elemental_rover" -> NOMAD_ELEMENTAL_ROVER;
            case "t16_aero_bike" -> T16_AERO_BIKE;
            case "antigravity_tank" -> ANTIGRAVITY_TANK;
            case "unmanned_flame_turret" -> UNMANNED_FLAME_TURRET;
            case "unmanned_laser_turret" -> UNMANNED_LASER_TURRET;
            case "unmanned_machine_gun_turret" -> UNMANNED_MACHINE_GUN_TURRET;
            case "aces_650cc" -> ACES_650CC;
            case "plasma_turret" -> PLASMA_TURRET;
            case "raider_mammoth_tank" -> RAIDER_MAMMOTH_TANK;
            case "total_war_mammoth" -> TOTAL_WAR_MAMMOTH;
            case "raider_war_mammoth" -> RAIDER_WAR_MAMMOTH;
            case "arctic_tank" -> ARCTIC_TANK;
            case "heavy_arctic_tank" -> HEAVY_ARCTIC_TANK;
            case "heavy_arctic_tank_rebel" -> HEAVY_ARCTIC_TANK_2;
            case "basilisk" -> BASILISK;
            case "frostbite" -> FROSTBITE;
            case "dragon" -> DRAGON;
            case "heavier_tank" -> HEAVIER_TANK;
            case "laser_tank" -> LASER_TANK;
            case "mega_tank" -> MEGA_TANK;
            case "mega_tank_rebel" -> MEGA_TANK_2;
            case "plasma_tank" -> PLASMA_TANK;
            case "snow_crusher" -> SNOW_CRUSHER;
            case "lightning_tank" -> LIGHTNING_TANK;
            case "zoeys_trebuchet" -> ZOEYS_TREBUCHET;
            case "puma" -> PUMA;
            case "sc2_pelican" -> SC2_PELICAN; // ~
            case "heavy_gunboat" -> HEAVY_GUNBOAT; // ~
            case "shadow_class_submarine" -> SHADOW_CLASS_SUBMARINE; // ~
            case "supreme_destroyer" -> SUPREME_DESTROYER; // ~
            case "battleship_mastodon" -> BATTLESHIP_MASTODONCLASS; // ~
            case "battleship_behemoth" -> BATTLESHIP_BEHEMOTHCLASS; // ~
            case "atmospheric_diving_trooper" -> ATMOSPHERIC_DIVING_TROOPER; // ~
            case "ironclad_battleship" -> IRONCLAD_BATTLESHIP; // ~
            case "phalanx_tank" -> PHALANX_TANK; // ~
            case "melee_sentinel_fragment" -> MELEE_SENTINEL_FRAGMENT; // ~
            case "ranged_sentinel_fragment" -> RANGED_SENTINEL_FRAGMENT; // ~
            case "the_wimp" -> THE_WIMP; // ~
            case "ud4l_gunship" -> UD4L_GUNSHIP; // ~
            case "f51_hell_fire" -> F51_HELL_FIRE; // ~
            case "v47_kittyhawk" -> V47_KITTYHAWK; // ~
            case "c17_winged_mammoth" -> C17_WINGED_MAMMOTH; // ~
            case "rsb17_shadow_hornet" -> RSB17_SHADOW_HORNET; // ~
            case "rs17_shadowwasp" -> RS17_SHADOWWASP; // ~
            case "triwing_terror" -> TRIWING_TERROR; // ~
            case "b10c_boar_ii" -> B10C_BOAR_II; // ~
            case "legendary_boar" -> LEGENDARY_BOAR; // ~
            case "legendary_mammoth" -> LEGENDARY_MAMMOTH; // ~
            case "legendary_raptor" -> LEGENDARY_RAPTOR; // ~
            case "legendary_sandworm" -> LEGENDARY_SANDWORM; // ~
            case "mammoth_artillery" -> MAMMOTH_ARTILLERY; // ~
            case "mammoth_tank" -> MAMMOTH_TANK; // ~
            case "frontier_chucker" -> FRONTIER_CHUCKER; // ~
            case "deadeye" -> DEADEYE; // ~
            case "radio_tech" -> RADIO_TECH; // ~
            case "unicorn_trooper" -> UNICORN_TROOPER; // ~
            case "weapon_technician" -> WEAPON_TECHNICIAN; // ~
            case "scout" -> TF2_SCOUT; // ~
            case "soldier" -> TF2_SOLDIER; // ~
            case "demoman" -> TF2_DEMOMAN; // ~
            case "heavy" -> TF2_HEAVY; // ~
            case "pyro" -> TF2_PYRO; // ~
            case "test_dne" -> TEST; // To test what happens if an image does not exist
            default -> UNKNOWN;
        };
    }
}