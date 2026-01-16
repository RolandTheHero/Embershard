package hero.roland.formations;

public enum Unit {
    UNKNOWN {
        @Override public String id() { return "Orange_question_mark"; }
        @Override public String frontFilePath() { return "/units/Orange_question_mark.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 32; }
        @Override public int frontY() { return 95; }
    },
    RECON_VEHICLE {
        @Override public String id() { return "APC"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 105; }
        @Override public int backY() { return 111; }
    },
    BOOM_BOOM {
        @Override public String id() { return "BoomBoom"; }
        @Override public int frontX() { return 41; }
        @Override public int frontY() { return 124; }
    },
    RAIDER_BRAWLER {
        @Override public String id() { return "BrawlerRaider"; }
        @Override public int frontX() { return 46; }
        @Override public int frontY() { return 141; }
        @Override public int backY() { return 135; }
    },
    DUST_WALKER {
        @Override public String id() { return "DustwalkerRaider"; }
        @Override public int frontX() { return 47; }
        @Override public int frontY() { return 122; }
        @Override public int backY() { return 130; }
        @Override public int backX() { return 40; }
    },
    FIREBREATHER {
        @Override public String id() { return "FireBreather"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 136; }
        @Override public int backX() { return 35; }
    },
    FLAME_TURRET {
        @Override public String id() { return "FlameTurret"; }
        @Override public int frontX() { return 29; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 160; }
    },
    WARLORD_GANTAS {
        @Override public String id() { return "Gantas"; }
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 166; }
    },
    GUN_TRUCK {
        @Override public String id() { return "Guntruck"; }
        @Override public int frontX() { return 60; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 70; }
    },
    LIGHT_TANK {
        @Override public String id() { return "LightTank"; }
        @Override public int frontX() { return 58; }
        @Override public int frontY() { return 117; }
        @Override public int backX() { return 50; }
    },
    TEMPEST {
        @Override public String id() { return "MGTank"; }
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 111; }
        @Override public int backX() { return 60; }
        @Override public int backY() { return 120; }
    },
    MAMMOTH_RIDER {
        @Override public String id() { return "MammothRaider"; }
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 184; }
        @Override public int backY() { return 165; }
    },
    WOLF_BOMBADIER {
        @Override public String id() { return "SWBombadier"; }
        @Override public int frontX() { return 72; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 40; }
    },
    WOLF_DEFENDER {
        @Override public String id() { return "SWDefender"; }
        @Override public int frontX() { return 37; }
        @Override public int frontY() { return 106; }
    },
    WOLF_DEVASTATOR {
        @Override public String id() { return "SWDevastator"; }
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 35; }
    },
    WOLF_ENFORCER {
        @Override public String id() { return "SWEnforcer"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 127; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 120; }
    },
    WOLF_GRENADIER {
        @Override public String id() { return "SWGrenadier"; }
        @Override public int frontX() { return 34; }
        @Override public int frontY() { return 112; }
        @Override public int backX() { return 30; }
        @Override public int backY() { return 120; }
    },
    WOLF_THUG {
        @Override public String id() { return "SWThug"; }
        @Override public int frontX() { return 41; }
        @Override public int frontY() { return 120; }
        @Override public int backX() { return 35; }
    },
    WOLF_ARMORED_TRUCK {
        @Override public String id() { return "SWarmoredTruck"; }
        @Override public int frontX() { return 57; }
        @Override public int frontY() { return 125; }
    },
    WOLF_SCRAPPER {
        @Override public String id() { return "SWscrapper"; }
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 133; }
        @Override public int backX() { return 35; }
        @Override public int backY() { return 150; }
    },
    SNIPER {
        @Override public String id() { return "Sniper2"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 109; }
    },
    SUPER_TANK {
        @Override public String id() { return "Supertank"; }
        @Override public int frontX() { return 78; }
        @Override public int frontY() { return 141; }
        @Override public int backX() { return 85; }
    },
    MEERKAT {
        @Override public String id() { return "TOW"; }
        @Override public int frontX() { return 51; }
        @Override public int frontY() { return 114; }
    },
    FLYING_DEXTER_FRAGMENT {
        @Override public String id() { return "Air_ancient_fragment"; }
        @Override public int frontX() { return 96; }
        @Override public int frontY() { return 258; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 262; }
    },
    UH1B_SKYRAPTOR {
        @Override public String id() { return "Air_attack_helicopter"; }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 172; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 160; }
    },
    Z218_BOMBER {
        @Override public String id() { return "Air_bomber"; }
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 185; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 168; }
    },
    THUNDERCLOUD_F10 {
        @Override public String id() { return "Air_corsair"; }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 136; }
        @Override public int backY() { return 145; }
    },
    V14_MAVERICK {
        @Override public String id() { return "Air_jet_fighter"; }
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 156; }
        @Override public int backX() { return 90; }
        @Override public int backY() { return 140; }
    },
    FALCONS_NEST {
        @Override public String id() { return "Air_raider_zeppelin"; }
        @Override public int frontX() { return 99; }
        @Override public int frontY() { return 181; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 215; }
    },
    PROTO_HUNTER {
        @Override public String id() { return "Air_s_trooper_zombie"; }
        @Override public int frontX() { return 49; }
        @Override public int frontY() { return 192; }
        @Override public int backY() { return 187; }
    },
    SPECIMEN_HUNTER {
        @Override public String id() { return "Air_s_trooper_zombie_b"; }
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    ADVANCED_HUNTER {
        @Override public String id() { return "Air_s_trooper_zombie_c"; }
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    ARCHETYPE_HUNTER {
        @Override public String id() { return "Air_s_trooper_zombie_d"; }
        @Override public int frontX() { return PROTO_HUNTER.frontX(); }
        @Override public int frontY() { return PROTO_HUNTER.frontY(); }
        @Override public int backY() { return PROTO_HUNTER.backY(); }
    },
    SPIDERWASP_DRONE {
        @Override public String id() { return "Air_spiderwasp_striker"; }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 190; }
        @Override public int backX() { return 40; }
    },
    ROYAL_SPIDERWASP_DRONE {
        @Override public String id() { return "Air_spiderwasp_striker_70"; }
        @Override public int frontX() { return SPIDERWASP_DRONE.frontX(); }
        @Override public int frontY() { return SPIDERWASP_DRONE.frontY() - 1; }
        @Override public int backX() { return SPIDERWASP_DRONE.backX(); }
        @Override public int backY() { return SPIDERWASP_DRONE.backY(); }
    },
    SILVERWOLF_CROP_BUSTER {
        @Override public String id() { return "Air_sw_plane"; }
        @Override public int frontX() { return 83; }
        @Override public int frontY() { return 155; }
        @Override public int backX() { return 107; }
        @Override public int backY() { return 170; }
    },
    SILVERWOLF_CHUNOOK_HELICOPTER {
        @Override public String id() { return "Air_sw_whirlybird"; }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 219; }
        @Override public int backX() { return 93; }
        @Override public int backY() { return 205; }
    },
    B10_WILD_BOAR {
        @Override public String id() { return "Air_warthog"; }
        @Override public int frontX() { return 70; }
        @Override public int frontY() { return 150; }
        @Override public int backX() { return 66; }
        @Override public int backY() { return 120; }
    },
    L60_HAWKER_HURRICANE {
        @Override public String id() { return "Air_ww2_fighter"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 149; }
        @Override public int backY() { return 137; }
    },
    ARMORED_FORTRESS {
        @Override public String id() { return "armoredFortress"; }
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 170; }
        @Override public int backY() { return 177; }
    },
    ARMORED_RAIDER_MAMMOTH { // Front
        @Override public String id() { return "ArmoredMammoth"; }
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 200; }
    },
    ARMORED_PILLBOX { // Front & Back
        @Override public String id() { return "armoredPillbox"; }
        @Override public String frontFilePath() { return "/units/ArmoredPillbox.png"; }
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
        @Override public String id() { return "bioGrenadier"; }
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
        @Override public String id() { return "Boss_goliath_tank_leftside"; }
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 318; }
    },
    GOLIATH_TANK { // Front
        @Override public String id() { return "Boss_goliath_tank_main"; }
        @Override public int frontX() { return 122; }
        @Override public int frontY() { return 380; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_RIGHT { // Front
        @Override public String id() { return "Boss_goliath_tank_rightside"; }
        @Override public int frontX() { return 37; }
        @Override public int frontY() { return 266; }
    },
    THE_KRAKEN { // Front
        @Override public String id() { return "Boss_kraken_body"; }
        @Override public int frontX() { return 151; }
        @Override public int frontY() { return 161; }
    },
    KRAKEN_TENTACLE { // Front & Back
        @Override public String id() { return "Boss_kraken_arm"; }
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 206; }
        @Override public int backX() { return 85; }
    },
    DREADNOUGHT { // Front
        @Override public String id() { return "Boss_ship_dreadnought"; }
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
        @Override public String id() { return "cannonSchoolBus"; }
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
        @Override public String id() { return "chemSprinkler"; }
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 156; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 150; }
    },
    CHEM_TROOPER { // Front & Back
        @Override public String id() { return "chemTrooper"; }
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
        @Override public String id() { return "crowdControl"; }
        @Override public int frontX() { return 53; }
        @Override public int frontY() { return 123; }
        @Override public int backX() { return 45; }
        @Override public int backY() { return 128; }
    },
    CONCRETE_WALL_A { // Front & Back
        @Override public String id() { return "def_barricade_cementWall"; }
        @Override public int frontX() { return 55; }
        @Override public int frontY() { return 110; }
        @Override public int backY() { return 120; }
    },
    CONCRETE_WALL_B { // Front & Back
        @Override public String id() { return "def_barricade_concreteWall"; }
        @Override public String frontFilePath() { return "/units/Def_barricade_concreteWall.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 124; }
    },
    SANDBAGS { // Front & Back
        @Override public String id() { return "def_barricade_sandbags"; }
        @Override public String frontFilePath() { return "/units/Def_barricade_sandbags.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 95; }
    },
    BUOY {
        @Override public String id() { return "def_buoy"; }
        @Override public String frontFilePath() { return "/units/Def_buoy.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 25; }
        @Override public int frontY() { return 121; }
    },
    PORTABLE_ELECTRIC_FENCE {
        @Override public String id() { return "def_fence_electric"; }
        @Override public String frontFilePath() { return "/units/Def_fence_electric.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 122; }
        @Override public int backX() { return 20; }
        @Override public int backY() { return 145; }
    },
    FLOATING_MINE { // Front & Back
        @Override public String id() { return "def_mine"; }
        @Override public String frontFilePath() { return "/units/Def_mine.png"; }
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
        @Override public String frontFilePath() { return "/units/Def_spiderwasp_egg.png"; }
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
        @Override public String frontFilePath() { return "/units/Def_whirlpool.png"; }
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
        @Override public String id() { return "elderSandworm"; }
        @Override public int frontX() { return 96; }
        @Override public int frontY() { return 157; }
    },
    LIGHTNING_TROOPER { // Front & Back
        @Override public String id() { return "electroTrooper"; }
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
        @Override public String id() { return "guardTower_battle"; }
        @Override public String frontFilePath() { return "/units/GuardTower_battle.png"; }
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
        @Override public String id() { return "heavyChemTank"; }
        @Override public int frontX() { return 65; }
        @Override public int frontY() { return 134; }
        @Override public int backY() { return 138; }
    },
    BRIMSTONE {
        @Override public String id() { return "heavyLauncher"; }
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
        @Override public String id() { return "Hero_ancient_robot"; }
        @Override public int frontX() { return 207; }
        @Override public int frontY() { return 279; }
    },
    MELEE_WEAPON_SYSTEM { // Front
        @Override public String id() { return "Hero_ancient_robot_2_arm_left"; }
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 349; }
    },
    RANGED_WEAPON_SYSTEM { // Front
        @Override public String id() { return "Hero_ancient_robot_2_arm_right"; }
        @Override public int frontX() { return 149; }
        @Override public int frontY() { return 368; }
    },
    ANCIENT_SENTINEL { // Front
        @Override public String id() { return "Hero_ancient_robot_2_body"; }
        @Override public int frontX() { return 132; }
        @Override public int frontY() { return 447; }
    },
    EXPERIMENTAL_CONSTRUCT { // Front
        @Override public String id() { return "Hero_i17_ancient_robot_clone"; }
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
        @Override public String id() { return "ltChemTank"; }
        @Override public int frontX() { return 45; }
        @Override public int frontY() { return 128; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 120; }
    },
    FIREDRAKE { // Front & Back
        @Override public String id() { return "ltFlameTank"; }
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
        @Override public String id() { return "megaArtillery"; }
        @Override public int frontX() { return 119; }
        @Override public int frontY() { return 180; }
        @Override public int backX() { return 98; }
        @Override public int backY() { return 206; }
    },
    ARMADILLO { // Front & Back
        @Override public String id() { return "mgShield"; }
        @Override public int frontX() { return 50; }
        @Override public int frontY() { return 107; }
        @Override public int backX() { return 40; }
        @Override public int backY() { return 120; }
    },
    MINI_TANK { // Front & Back
        @Override public String id() { return "miniTank"; }
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
        @Override public String id() { return "mtArt"; }
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 116; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 125; }
    },
    THE_ROCK { // Front & Back
        @Override public String id() { return "natBarricade_01"; }
        @Override public String frontFilePath() { return "/units/NatBarricade_01.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 31; }
        @Override public int frontY() { return 87; }
    },
    STONE_SLAB { // Front & Back
        @Override public String id() { return "natBarricade_02"; }
        @Override public String frontFilePath() { return "/units/NatBarricade_02.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 52; }
        @Override public int frontY() { return 109; }
    },
    LINE_OF_ROCKS { // Front & Back
        @Override public String id() { return "natBarricade_03"; }
        @Override public String frontFilePath() { return "/units/NatBarricade_03.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 63; }
        @Override public int frontY() { return 118; }
    },
    GRANITE_BOULDER { // Front & Back
        @Override public String id() { return "natBarricade_04"; }
        @Override public String frontFilePath() { return "/units/NatBarricade_04.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 75; }
        @Override public int frontY() { return 137; }
    },
    DEBRIS { // Front & Back
        @Override public String id() { return "natBarricade_debris"; }
        @Override public String frontFilePath() { return "/units/NatBarricade_debris.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 140; }
    },
    FALLEN_LOG { // Front & Back
        @Override public String id() { return "natBarricade_log"; }
        @Override public String frontFilePath() { return "/units/NatBarricade_log.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 59; }
        @Override public int frontY() { return 107; }
    },
    NINJA_TROOPER { // Front & Back
        @Override public String id() { return "ninjaTrooper"; }
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
        @Override public String id() { return "premiumAPC"; }
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
        @Override public String id() { return "RaiderLieutBoom"; }
        @Override public int frontX() { return 101; }
        @Override public int frontY() { return 146; }
    },
    CRAZY_BLADES { // Front
        @Override public String id() { return "RaiderLieutGirl"; }
        @Override public int frontX() { return 40; }
        @Override public int frontY() { return 135; }
    },
    SARIN { // Front
        @Override public String id() { return "RaiderLieutThin"; }
        @Override public int frontX() { return 93; }
        @Override public int frontY() { return 163; }
    },
    RAIDER_WATCHTOWER { // Front
        @Override public String id() { return "Raiderwatchtower"; }
        @Override public int frontX() { return 54; }
        @Override public int frontY() { return 164; }
    },
    COMMANDO { // Front & Back
        @Override public String id() { return "ranger"; }
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 119; }
    },
    RAT_KING { // Front
        @Override public String id() { return "RatBrown"; }
        @Override public int frontX() { return 21; }
        @Override public int frontY() { return 57; }
    },
    MANGY_RAT { // Front
        @Override public String id() { return "RatGrey"; }
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
        @Override public String id() { return "S_arctic_trooper_rebel"; }
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
        @Override public String id() { return "s_bountyHunter"; }
        @Override public int frontX() { return 84; }
        @Override public int frontY() { return 151; }
        @Override public int backX() { return 55; }
        @Override public int backY() { return 145; }
    },
    COMMANDO_2 { // Front
        @Override public String id() { return "S_commando_rebel"; }
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
        @Override public String id() { return "S_matriarchBoar"; }
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
        @Override public String id() { return "s_mortar_turtleShell"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 153; }
        @Override public int backX() { return 70; }
        @Override public int backY() { return 145; }
    },
    PORTABLE_WALL { // Front & Back
        @Override public String id() { return "s_portableWall"; }
        @Override public String frontFilePath() { return "/units/S_portableWall.png"; }
        @Override public String backFilePath() { return frontFilePath(); }
        @Override public int frontX() { return 76; }
        @Override public int frontY() { return 104; }
        @Override public int backY() { return 106; }
    },
    BRUTAL_CANNONEER { // Front
        @Override public String id() { return "S_raider_bombadier_55"; }
        @Override public int frontX() { return 51; }
        @Override public int frontY() { return 138; }
    },
    BIG_BADA_BOOM { // Front
        @Override public String id() { return "S_raider_boomboom_55"; }
        @Override public int frontX() { return 42; }
        @Override public int frontY() { return 125; }
    },
    BRUTAL_BRAWLER { // Front
        @Override public String id() { return "S_raider_brawler_55"; }
        @Override public int frontX() { return RAIDER_BRAWLER.frontX(); }
        @Override public int frontY() { return RAIDER_BRAWLER.frontY(); }
    },
    BRUTAL_CHAMPION { // Front
        @Override public String id() { return "S_raider_champion_55"; }
        @Override public int frontX() { return RAIDER_CHAMPION.frontX(); }
        @Override public int frontY() { return RAIDER_CHAMPION.frontY(); }
    },
    DUSTWALKER_DERVISH { // Front
        @Override public String id() { return "S_raider_dustwalker_55"; }
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 123; }
    },
    SEARING_FIREBREATHER { // Front
        @Override public String id() { return "S_raider_firebreather_55"; }
        @Override public int frontX() { return 48; }
        @Override public int frontY() { return 128; }
    },
    RAIDER_RIFLEMAN { // Front
        @Override public String id() { return "S_raider_infantry_55"; }
        @Override public int frontX() { return 56; }
        @Override public int frontY() { return 129; }
    },
    RAIDER_SKIRMISHER { // Front & Back
        @Override public String id() { return "s_raider_raptorRider"; }
        @Override public int frontX() { return 81; }
        @Override public int frontY() { return 170; }
        @Override public int backX() { return 100; }
        @Override public int backY() { return 195; }
    },
    ELITE_SKIRMISHER { // Front
        @Override public String id() { return "S_raider_raptor_rider_55"; }
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
        @Override public String id() { return "S_raider_sniper_55"; }
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
        @Override public String id() { return "S_sandworm_emperor"; }
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
        @Override public String id() { return "s_trooper_bigGameHunter"; }
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
        @Override public String id() { return "s_trooper_specialAgent"; }
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
        @Override public String id() { return "S_trooper_veteran_rebel"; }
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
        @Override public String id() { return "sandwormSm"; }
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
        @Override public String id() { return "superArtillery"; }
        @Override public int frontX() { return 91; }
        @Override public int frontY() { return 142; }
        @Override public int backX() { return 65; }
        @Override public int backY() { return 175; }
    },
    MARKSMAN { // Front & Back
        @Override public String id() { return "superSniper"; }
        @Override public int frontX() { return 77; }
        @Override public int frontY() { return 113; }
        @Override public int backX() { return 59; }
        @Override public int backY() { return 127; }
    },
    WOLF_PICKUP { // Front & Back
        @Override public String id() { return "swMGPickup"; }
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
        @Override public String id() { return "Sw_guy_bat_5"; }
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
        @Override public String id() { return "Sw_guy_machete_5"; }
        @Override public int frontX() { return WOLF_SCRAPPER.frontX(); }
        @Override public int frontY() { return WOLF_SCRAPPER.frontY(); }
    },
    WOLF_DEVASTATOR_2 { // Front
        @Override public String id() { return "Sw_guy_rpg_5"; }
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
        @Override public String id() { return "Sw_guy_uzi_5"; }
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
        @Override public String id() { return "Sw_veh_artillery_5"; }
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
        @Override public String id() { return "Sw_veh_pickup_5"; }
        @Override public int frontX() { return WOLF_PICKUP.frontX(); }
        @Override public int frontY() { return WOLF_PICKUP.frontY(); }
    },
    CONVERTED_GARBAGE_TRUCK { // Front & Back
        @Override public String id() { return "sw_veh_rocketTruck"; }
        @Override public int frontX() { return 67; }
        @Override public int frontY() { return 134; }
        @Override public int backX() { return 64; }
        @Override public int backY() { return 144; }
    },
    WOLF_ROLLER { // Front & Back
        @Override public String id() { return "sw_veh_steamRoller"; }
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
        @Override public String id() { return "veh_boomBus"; }
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
        @Override public String id() { return "Veh_raider_mammoth_armored_55"; }
        @Override public int frontX() { return ARMORED_RAIDER_MAMMOTH.frontX(); }
        @Override public int frontY() { return ARMORED_RAIDER_MAMMOTH.frontY(); }
    },
    TOTAL_WAR_MAMMOTH { // Front
        @Override public String id() { return "Veh_raider_mammoth_rockets_55"; }
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 195; }
    },
    RAIDER_WAR_MAMMOTH { // Front & Back
        @Override public String id() { return "veh_raider_rocketMammoth"; }
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
        @Override public String id() { return "Veh_tank_arctic_heavy_rebel"; }
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
        @Override public String id() { return "Veh_tank_mega_rebel"; }
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
        @Override public String id() { return "wheeledTank"; }
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
    UD4L_GUNSHIP {
        @Override public String id() { return "air_assaultcraft"; }
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 179; }
    },
    F51_HELL_FIRE {
        @Override public String id() { return "air_flame_helicopter"; }
        @Override public int frontX() { return 68; }
        @Override public int frontY() { return 174; }
    },
    V47_KITTYHAWK {
        @Override public String id() { return "air_jet_fighter_2"; }
        @Override public int frontX() { return 66; }
        @Override public int frontY() { return 148; }
    },
    C17_WINGED_MAMMOTH {
        @Override public String id() { return "air_osprey_helicopter"; }
        @Override public int frontX() { return 104; }
        @Override public int frontY() { return 218; }
    },
    RSB17_SHADOW_HORNET {
        @Override public String id() { return "air_stealth_fighter2"; }
        @Override public int frontX() { return 90; }
        @Override public int frontY() { return 165; }
    },
    RS17_SHADOWWASP {
        @Override public String id() { return "air_stealth_fighter"; }
        @Override public int frontX() { return RSB17_SHADOW_HORNET.frontX(); }
        @Override public int frontY() { return RSB17_SHADOW_HORNET.frontY(); }
    },
    TRIWING_TERROR {
        @Override public String id() { return "air_triplane"; }
        @Override public int frontX() { return 69; }
        @Override public int frontY() { return 170; }
    },
    B10C_BOAR_II {
        @Override public String id() { return "air_warthog_2"; }
        @Override public int frontX() { return B10_WILD_BOAR.frontX(); }
        @Override public int frontY() { return B10_WILD_BOAR.frontY(); }
        @Override public int backX() { return B10_WILD_BOAR.backX(); }
        @Override public int backY() { return B10_WILD_BOAR.backY(); }
    },
    LEGENDARY_BOAR {
        @Override public String id() { return "ancient_boar_player"; }
        @Override public int frontX() { return 105; }
        @Override public int frontY() { return 160; }
    },
    LEGENDARY_MAMMOTH {
        @Override public String id() { return "ancient_mammoth"; }
        @Override public int frontX() { return 106; }
        @Override public int frontY() { return 175; }
    },
    LEGENDARY_RAPTOR {
        @Override public String id() { return "s_ancient_raptor_player"; }
        @Override public int frontX() { return 82; }
        @Override public int frontY() { return 160; }
    },
    LEGENDARY_SANDWORM {
        @Override public String id() { return "s_ancient_sandworm"; }
        @Override public int frontX() { return 100; }
        @Override public int frontY() { return 265; }
    },
    MAMMOTH_ARTILLERY {
        @Override public String id() { return "s_mammoth_player_artillery"; }
        @Override public int frontX() { return 86; }
        @Override public int frontY() { return 196; }
    },
    MAMMOTH_TANK {
        @Override public String id() { return "s_mammoth_player_tank"; }
        @Override public int frontX() { return 80; }
        @Override public int frontY() { return 192; }
    },
    TEST {
        @Override public String id() { return "this_id_does_not_exist"; }
        @Override public int frontX() { return -0; }
        @Override public int frontY() { return -0; }
    };
    abstract public String id();
    public String frontFilePath() { return "/units/front/" + id() + "_front.png"; }
    public String backFilePath() { return "/units/back/" + id() + "_back.png"; }
    //abstract String frontFilename();
    //public String backFilename() { return frontFilename(); }
    abstract public int frontX();
    abstract public int frontY();
    public int backX() { return frontX(); };
    public int backY() { return frontY(); };
    public static Unit fromId(String s) {
        // Units marked with ~ are added by me and was not included in the original list
        return switch (s) {
            case "APC" -> RECON_VEHICLE;
            case "BoomBoom" -> BOOM_BOOM;
            case "BrawlerRaider" -> RAIDER_BRAWLER;
            case "DustwalkerRaider" -> DUST_WALKER;
            case "FireBreather" -> FIREBREATHER;
            case "FlameTurret" -> FLAME_TURRET;
            case "Gantas" -> WARLORD_GANTAS;
            case "Guntruck" -> GUN_TRUCK;
            case "LightTank" -> LIGHT_TANK;
            case "MGTank" -> TEMPEST;
            case "MammothRaider" -> MAMMOTH_RIDER;
            case "SWBombadier" -> WOLF_BOMBADIER;
            case "SWDefender" -> WOLF_DEFENDER;
            case "SWDevastator" -> WOLF_DEVASTATOR;
            case "SWEnforcer" -> WOLF_ENFORCER;
            case "SWGrenadier" -> WOLF_GRENADIER;
            case "SWThug" -> WOLF_THUG;
            case "SWarmoredTruck" -> WOLF_ARMORED_TRUCK;
            case "SWscrapper" -> WOLF_SCRAPPER;
            case "Sniper2" -> SNIPER;
            case "Supertank" -> SUPER_TANK;
            case "TOW" -> MEERKAT;
            case "air_ancient_fragment" -> FLYING_DEXTER_FRAGMENT;
            case "air_attack_helicopter" -> UH1B_SKYRAPTOR;
            case "air_bomber" -> Z218_BOMBER;
            case "air_corsair" -> THUNDERCLOUD_F10;
            case "air_jet_fighter" -> V14_MAVERICK;
            case "air_raider_zeppelin" -> FALCONS_NEST;
            case "air_s_trooper_zombie" -> PROTO_HUNTER;
            case "air_s_trooper_zombie_b" -> SPECIMEN_HUNTER;
            case "air_s_trooper_zombie_c" -> ADVANCED_HUNTER;
            case "air_s_trooper_zombie_d" -> ARCHETYPE_HUNTER;
            case "air_spiderwasp_striker" -> SPIDERWASP_DRONE;
            case "air_spiderwasp_striker_70" -> ROYAL_SPIDERWASP_DRONE;
            case "air_sw_plane" -> SILVERWOLF_CROP_BUSTER;
            case "air_sw_whirlybird" -> SILVERWOLF_CHUNOOK_HELICOPTER;
            case "air_warthog" -> B10_WILD_BOAR;
            case "air_ww2_fighter" -> L60_HAWKER_HURRICANE;
            case "armoredFortress" -> ARMORED_FORTRESS;
            case "armoredMammoth" -> ARMORED_RAIDER_MAMMOTH;
            case "armoredPillbox" -> ARMORED_PILLBOX;
            case "arsonist" -> ARSONIST;
            case "artillery" -> LIGHT_ARTILLERY;
            case "assassinator" -> ASSASSINATOR;
            case "bazookaTeam" -> BAZOOKA_SQUAD;
            case "bioGrenadier" -> BIO_GRENADIER;
            case "blockhouses_idle" -> BLOCKHOUSE;
            case "boss_goliath_tank_leftside" -> MULTILAUNCH_ROCKET_SYSTEM_LEFT;
            case "boss_goliath_tank_main" -> GOLIATH_TANK;
            case "boss_goliath_tank_rightside" -> MULTILAUNCH_ROCKET_SYSTEM_RIGHT;
            case "boss_kraken_arm" -> KRAKEN_TENTACLE;
            case "boss_kraken_body" -> THE_KRAKEN;
            case "boss_ship_dreadnought" -> DREADNOUGHT;
            case "boss_spiderwasp_queen" -> SPIDERWASP_QUEEN;
            case "cannonSchoolBus" -> WOLF_CRUEL_BUS;
            case "cannonraider" -> RAIDER_CANNONEER;
            case "championraider" -> RAIDER_CHAMPION;
            case "chemSprinkler" -> CHEMICAL_SPRINKLER;
            case "chemTrooper" -> CHEM_TROOPER;
            case "commando" -> RANGER;
            case "crowdControl" -> PEACE_KEEPER;
            case "def_barricade_cementWall" -> CONCRETE_WALL_A;
            case "def_barricade_concreteWall" -> CONCRETE_WALL_B;
            case "def_barricade_sandbags" -> SANDBAGS;
            case "def_buoy" -> BUOY;
            case "def_fence_electric" -> PORTABLE_ELECTRIC_FENCE;
            case "def_mine" -> FLOATING_MINE;
            case "def_raiderbarricade" -> RAIDER_FENCE;
            case "def_spiderwasp_egg" -> SPIDERWASP_EGG;
            case "def_wall_concrete_60" -> REINFORCED_CONCRETE_WALL;
            case "def_whirlpool" -> WHIRLPOOL;
            case "demolitionist" -> DEMOLITIONIST;
            case "dragoon" -> IMPERIAL_DRAGOON;
            case "dunerider" -> DUNE_RIDER;
            case "elderSandworm" -> ELDER_SANDWORM;
            case "electroTrooper" -> LIGHTNING_TROOPER;
            case "flametrooper" -> FLAME_TROOPER;
            case "fliegerhaust" -> HORNET;
            case "grenadier" -> GRENADIER;
            case "guardTower_battle" -> WATCHTOWER;
            case "gunner" -> GUNNER;
            case "heavyChemTank" -> HEAVY_CHEMICAL_TANK;
            case "heavyLauncher" -> BRIMSTONE;
            case "heavyartillery" -> HEAVY_ARTILLERY;
            case "heavytank" -> HEAVY_TANK;
            case "hero_ancient_robot" -> ANCIENT_CONSTRUCT;
            case "hero_ancient_robot_2_arm_left" -> MELEE_WEAPON_SYSTEM;
            case "hero_ancient_robot_2_arm_right" -> RANGED_WEAPON_SYSTEM;
            case "hero_ancient_robot_2_body" -> ANCIENT_SENTINEL;
            case "hero_i17_ancient_robot_clone" -> EXPERIMENTAL_CONSTRUCT;
            case "hero_spiderwasp_queen" -> SPIDERWASP_QUEEN; // For some reason two IDs link the Spiderwasp Queen, other being 'boss_spiderwasp_queen'
            case "hitman" -> HITMAN;
            case "hunter" -> HUNTER;
            case "i17_veh_tank_railgun" -> RAILGUN_TANK;
            case "jeep" -> HUMVEE;
            case "juggernaut" -> JUGGERNAUT;
            case "katyusha" -> HAILSTORM;
            case "ltChemTank" -> LIGHT_CHEMICAL_TANK;
            case "ltFlameTank" -> FIREDRAKE;
            case "mediumtank" -> MEDIUM_TANK;
            case "megaArtillery" -> PEACEMAKER;
            case "mgShield" -> ARMADILLO;
            case "miniTank" -> MINI_TANK;
            case "minigunner" -> HEAVY_GUNNER;
            case "mlrs" -> ROCKET_TRUCK;
            case "mortarteam" -> MORTAR_TEAM;
            case "mtArt" -> ARIES;
            case "natBarricade_01" -> THE_ROCK;
            case "natBarricade_02" -> STONE_SLAB;
            case "natBarricade_03" -> LINE_OF_ROCKS;
            case "natBarricade_04" -> GRANITE_BOULDER;
            case "natBarricade_debris" -> DEBRIS;
            case "natBarricade_log" -> FALLEN_LOG;
            case "ninjaTrooper" -> NINJA_TROOPER;
            case "officer" -> JUNIOR_OFFICER;
            case "pillbox" -> PILLBOX;
            case "premiumAPC" -> HEAVY_RECON;
            case "raider" -> RAIDER_WARRIOR;
            case "raiderLuitBoom" -> TRONK;
            case "raiderLuitGirl" -> CRAZY_BLADES;
            case "raiderLuitThin" -> SARIN;
            case "raiderwatchtowerfront" -> RAIDER_WATCHTOWER;
            case "ranger" -> COMMANDO;
            case "ratBrown" -> RAT_KING;
            case "ratGrey" -> MANGY_RAT;
            case "rb_ship_jetski" -> JET_SKI;
            case "rb_ship_speedboat" -> POWER_BOAT;
            case "rb_ship_tugboat" -> ARMORED_TUG;
            case "rpg" -> RPG_TROOPER;
            case "s_arctic_trooper" -> ARCTIC_TROOPER;
            case "s_arctic_trooper_rebel" -> ARCTIC_TROOPER_2;
            case "s_bigfoot_adult" -> BIGFOOT;
            case "s_bigfoot_adult_55" -> BIGFOOT_WARRIOR;
            case "s_bigfoot_child" -> YOUNG_BIGFOOT;
            case "s_bigfoot_zombie_super_player" -> APEX_MAULER;
            case "s_boar_boarus_rex_55" -> BOAR_VETERAN;
            case "s_boar_large" -> ALPHA_BOAR;
            case "s_boar_medium" -> WILD_BOAR;
            case "s_boar_small" -> BOAR_PIGLET;
            case "s_bountyHunter" -> IMPERIAL_PEACEMONGER;
            case "s_commando_rebel" -> COMMANDO_2;
            case "s_def_tesla_coil" -> LIGHTNING_TOWER;
            case "s_flame_heavy" -> SALAMANDER;
            case "s_guy_sniper" -> SILVER_WOLF_GOLDEN_EAGLE;
            case "s_mammoth_king_55" -> MAMMOTH_SEER;
            case "s_mammoth_large" -> MAMMOTH_ELDER;
            case "s_mammoth_medium" -> MAMMOTH;
            case "s_mammoth_small" -> MAMMOTH_TUSKLING;
            case "s_matriarchBoar" -> BOARUS_REX;
            case "s_midrange_agent" -> FIELD_AGENT;
            case "s_mortar_turtleShell" -> TURTLESHELLER;
            case "s_portableWall" -> PORTABLE_WALL;
            case "TODO TODO 5" -> null; //PORTABLE_WALL_2; // Alternative sprite for portable wall
            case "s_raider_bombadier_55" -> BRUTAL_CANNONEER;
            case "s_raider_boomboom_55" -> BIG_BADA_BOOM;
            case "s_raider_brawler_55" -> BRUTAL_BRAWLER;
            case "s_raider_champion_55" -> BRUTAL_CHAMPION;
            case "s_raider_dustwalker_55" -> DUSTWALKER_DERVISH;
            case "s_raider_firebreather_55" -> SEARING_FIREBREATHER;
            case "s_raider_infantry_55" -> RAIDER_RIFLEMAN;
            case "s_raider_raptorRider" -> RAIDER_SKIRMISHER;
            case "s_raider_raptor_rider_55" -> ELITE_SKIRMISHER;
            case "s_raider_sniper" -> RAIDER_OUTCAST;
            case "s_raider_sniper_55" -> ELITE_OUTCAST;
            case "s_raptor_large" -> WILD_RAPTOR;
            case "s_raptor_medium" -> RAPTOR;
            case "s_raptor_small" -> YOUNG_RAPTOR;
            case "s_raptor_tough_55" -> PRIMORDIAL_RAPTOR;
            case "s_raptor_zombie" -> PROTO_SHREDDER;
            case "s_raptor_zombie_b" -> SPECIMEN_SHREDDER;
            case "s_raptor_zombie_c" -> ADVANCED_SHREDDER;
            case "s_raptor_zombie_d" -> ARCHETYPE_SHREDDER;
            case "s_samurai" -> WANDERING_SAMURAI;
            case "s_sandbags" -> SANDBAG_PILE;
            case "s_sandworm_55" -> SANDWORM_GUARDIAN;
            case "TODO TODO" -> null; //VOLCANO_SHAKER; // Large SANDWORM_GUARDIAN
            case "s_sandworm_emperor" -> EMPEROR_SANDWORM;
            case "s_sandworm_large" -> GROUNDSHAKER;
            case "s_sandworm_medium" -> IRONHIDE_SANDWORM;
            case "s_spiderwasp_spitter"-> SPIDERWASP_STRIKER;
            case "s_spiderwasp_spitter_70" -> ROYAL_SPIDERWASP_STRIKER;
            case "s_spiderwasp_warrior" -> SPIDERWASP_WARRIOR;
            case "s_spiderwasp_warrior_70" -> ROYAL_SPIDERWASP_WARRIOR;
            case "s_spiderwasp_worker" -> SPIDERWASP_WORKER;
            case "s_spiderwasp_worker_70" -> ROYAL_SPIDERWASP_WORKER;
            case "s_trooper_bigGameHunter" -> BIG_GAME_HUNTER;
            case "s_trooper_cryo" -> CRYO_TROOPER;
            case "s_trooper_dragoon_heavy" -> LIGHTNING_DRAGOON;
            case "s_trooper_fire_ice" -> ELEMENTAL_TROOPER;
            case "s_trooper_jetpack" -> AERO_JETPACK_TROOPER;
            case "s_trooper_plasma" -> PLASMA_TROOPER;
            case "s_trooper_railgun" -> RAILGUN_TROOPER;
            case "s_trooper_saboteur_heavy" -> GUERILLA;
            case "s_trooper_specialAgent" -> SPECIAL_AGENT;
            case "s_trooper_veteran" -> VETERAN;
            case "s_trooper_veteran_rebel" -> VETERAN_2;
            case "s_trooper_zombie" -> PROTO_CREEPER;
            case "s_trooper_zombie_b" -> SPECIMEN_CREEPER;
            case "s_trooper_zombie_c" -> ADVANCED_CREEPER;
            case "s_trooper_zombie_d" -> ARCHETYPE_CREEPER;
            case "s_trooper_zombie_cannon" -> PROTO_CANNONEER;
            case "s_trooper_zombie_cannon_b" -> SPECIMEN_CANNONEER;
            case "s_trooper_zombie_cannon_c" -> ADVANCED_CANNONEER;
            case "s_trooper_zombie_cannon_d" -> ARCHETYPE_CANNONEER;
            case "s_trooper_zombie_ninja" -> PROTO_STALKER;
            case "s_trooper_zombie_ninja_b" -> SPECIMEN_STALKER;
            case "s_trooper_zombie_ninja_c" -> ADVANCED_STALKER;
            case "s_trooper_zombie_ninja_d" -> ARCHETYPE_STALKER;
            case "s_trooper_zombie_ninja_super" -> APEX_STALKER;
            case "s_trooper_zombie_spider" -> PROTO_CRAWLER;
            case "s_trooper_zombie_spider_b" -> SPECIMEN_CRAWLER;
            case "s_trooper_zombie_spider_c" -> ADVANCED_CRAWLER;
            case "s_trooper_zombie_spider_d" -> ARCHETYPE_CRAWLER;
            case "s_trooper_zombie_spitter" -> PROTO_BULLFROG;
            case "s_trooper_zombie_spitter_b" -> SPECIMEN_BULLFROG;
            case "s_trooper_zombie_spitter_c" -> ADVANCED_BULLFROG;
            case "s_trooper_zombie_spitter_d" -> ARCHETYPE_BULLFROG;
            case "s_trooper_zombie_spitter_super" -> APEX_BULLFROG;
            case "s_trooper_zombie_tank" -> PROTO_COLOSSUS;
            case "s_trooper_zombie_tank_b" -> ARCHETYPE_COLOSSUS;
            case "s_trooper_zombie_tank_super"-> APEX_COLOSSUS;
            case "saboteur" -> SABOTEUR;
            case "sandwormSm" -> SANDWORM_GRUBLING;
            case "scoutbike" -> SCOUT_BIKE;
            case "sea_grouper" -> MONSTER_GROUPER;
            case "ship_battleship_med" -> BATTLESHIP_RAPTORCLASS;
            case "ship_battleship_super" -> BATTLESHIP_MAMMOTHCLASS;
            case "ship_destroyer_med" -> DESTROYER;
            case "ship_gunboat" -> GUNBOAT;
            case "ship_minelayer" -> MINELAYER_DESTROYER;
            case "ship_mini_sub" -> MINI_SUB;
            case "ship_raft_trooper" -> NAVY_TROOPER;
            case "ship_submarine" -> SUBMARINE;
            case "tactical_submarine" -> TACTICAL_SUBMARINE; // ~
            case "shocktrooper" -> SHOCK_TROOPER;
            case "shotgunner" -> RIOT_TROOPER;
            case "sniper" -> SHARPSHOOTER;
            case "specialmortar" -> MORTAR_TRUCK;
            case "submarine" -> SUBMARINE; // Shares the same image as 'ship_submarine'
            case "superArtillery" -> EARTHSHAKER;
            case "superSniper" -> MARKSMAN;
            case "swMGPickup" -> WOLF_PICKUP;
            case "sw_guy_bat" -> WOLF_PUNISHER;
            case "sw_guy_bat_5" -> WOLF_PUNISHER_2;
            case "sw_guy_grenade_5" -> WOLF_GRENADIER_2;
            case "sw_guy_laser" -> LASER_WOLF;
            case "sw_guy_machete_5" -> WOLF_SCRAPPER_2;
            case "sw_guy_rpg_5" -> WOLF_DEVASTATOR_2;
            case "sw_guy_slingshot" -> WOLF_SLINGER;
            case "sw_guy_sniper" -> SILVER_WOLF_GOLDEN_EAGLE_2;
            case "sw_guy_uzi_5" -> WOLF_THUG_2;
            case "sw_veh_artillery" -> WOLF_ARTILLERY;
            case "sw_veh_artillery_5" -> WOLF_BOMBADIER_2;
            case "sw_veh_catapult" -> WOLF_FURY;
            case "sw_veh_pickup_5" -> WOLF_PICKUP_2;
            case "sw_veh_rocketTruck" -> CONVERTED_GARBAGE_TRUCK;
            case "sw_veh_steamRoller" -> WOLF_ROLLER;
            case "tankkiller" -> TANK_KILLER;
            case "trooper" -> TROOPER;
            case "veh_air_biplane" -> SOPWITH_SPIDERWASP;
            case "veh_air_dirigible" -> ZRS6_DIRIGIBLE;
            case "veh_air_helicopter" -> BC1_SNAKE;
            case "bc3_cobra" -> BC3_COBRA; // ~
            case "veh_ancient_robot_clone_trap_mission" -> EXPERIMENT_X17;
            case "veh_ancient_robot_player" -> DEXTER_FRAGMENT;
            case "veh_anti_aircraft_gun_premium" -> ANTIAIRCRAFT_FLAK_GUN;
            case "veh_anti_aircraft_gun_regular" -> ANTIAIRCRAFT_TURRET;
            case "veh_anti_armor" -> BRUTALIZER;
            case "veh_artillery_napalm" -> DEATH_FROM_ABOVE;
            case "veh_boomBus" -> BOOM_BUS;
            case "veh_cannon_plasma" -> ARTILLERY_PLASMA_CANNON;
            case "veh_elemental_rover" -> NOMAD_ELEMENTAL_ROVER;
            case "veh_hoverbike" -> T16_AERO_BIKE;
            case "veh_hovertank" -> ANTIGRAVITY_TANK;
            case "veh_ign_turret_flame" -> UNMANNED_FLAME_TURRET;
            case "veh_ign_turret_laser" -> UNMANNED_LASER_TURRET;
            case "veh_ign_turret_mgun" -> UNMANNED_MACHINE_GUN_TURRET;
            case "veh_motorcycle_advanced" -> ACES_650CC;
            case "veh_plasma_turret" -> PLASMA_TURRET;
            case "veh_raider_mammoth_armored_55" -> RAIDER_MAMMOTH_TANK;
            case "veh_raider_mammoth_rockets_55" -> TOTAL_WAR_MAMMOTH;
            case "veh_raider_rocketMammoth" -> RAIDER_WAR_MAMMOTH;
            case "veh_tank_arctic" -> ARCTIC_TANK;
            case "veh_tank_arctic_heavy" -> HEAVY_ARCTIC_TANK;
            case "veh_tank_arctic_heavy_rebel" -> HEAVY_ARCTIC_TANK_2;
            case "veh_tank_basilisk" -> BASILISK;
            case "veh_tank_cryo" -> FROSTBITE;
            case "veh_tank_flame_heavy" -> DRAGON;
            case "veh_tank_heavier" -> HEAVIER_TANK;
            case "veh_tank_laser" -> LASER_TANK;
            case "veh_tank_mega" -> MEGA_TANK;
            case "veh_tank_mega_rebel" -> MEGA_TANK_2;
            case "veh_tank_plasma" -> PLASMA_TANK;
            case "veh_tank_snowplow" -> SNOW_CRUSHER;
            case "veh_tank_tesla" -> LIGHTNING_TANK;
            case "veh_trebuchet" -> ZOEYS_TREBUCHET;
            case "wheeledTank" -> PUMA;
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
            case "test_dne" -> TEST; // To test what happens if an image does not exist
            default -> UNKNOWN;
        };
    }
}