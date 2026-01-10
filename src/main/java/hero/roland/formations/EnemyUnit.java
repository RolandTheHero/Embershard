package hero.roland.formations;

public enum EnemyUnit {
    UNKNOWN {
        @Override public String filename() { return "Orange_question_mark.png"; }
        @Override public int x() { return 32; }
        @Override public int y() { return 95; }
    },
    RECON_VEHICLE {
        @Override public String filename() { return "APC_front.png"; }
        @Override public int x() { return 60; }
        @Override public int y() { return 105; }
    },
    BOOM_BOOM {
        @Override public String filename() { return "BoomBoom_front.png"; }
        @Override public int x() { return 41; }
        @Override public int y() { return 124; }
    },
    RAIDER_BRAWLER {
        @Override public String filename() { return "BrawlerRaider_front.png"; }
        @Override public int x() { return 46; }
        @Override public int y() { return 141; }
    },
    DUST_WALKER {
        @Override public String filename() { return "DustwalkerRaider_front.png"; }
        @Override public int x() { return 47; }
        @Override public int y() { return 122; }
    },
    FIREBREATHER {
        @Override public String filename() { return "FireBreather_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 136; }
    },
    FLAME_TURRET {
        @Override public String filename() { return "FlameTurret_front.png"; }
        @Override public int x() { return 29; }
        @Override public int y() { return 141; }
    },
    WARLORD_GANTAS {
        @Override public String filename() { return "Gantas_front.png"; }
        @Override public int x() { return 82; }
        @Override public int y() { return 166; }
    },
    GUN_TRUCK {
        @Override public String filename() { return "Guntruck_front.png"; }
        @Override public int x() { return 60; }
        @Override public int y() { return 117; }
    },
    LIGHT_TANK {
        @Override public String filename() { return "LightTank_grey_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 117; }
    },
    TEMPEST {
        @Override public String filename() { return "MGTank_front.png"; }
        @Override public int x() { return 55; }
        @Override public int y() { return 111; }
    },
    MAMMOTH_RIDER {
        @Override public String filename() { return "MammothRaider.png"; }
        @Override public int x() { return 72; }
        @Override public int y() { return 184; }
    },
    WOLF_BOMBADIER {
        @Override public String filename() { return "SWBombadier_front.png"; }
        @Override public int x() { return 72; }
        @Override public int y() { return 120; }
    },
    WOLF_DEFENDER {
        @Override public String filename() { return "SWDefender_front.png"; }
        @Override public int x() { return 37; }
        @Override public int y() { return 106; }
    },
    WOLF_DEVASTATOR {
        @Override public String filename() { return "SWDevastator_front.png"; }
        @Override public int x() { return 53; }
        @Override public int y() { return 123; }
    },
    WOLF_ENFORCER {
        @Override public String filename() { return "SWEnforcer_front.png"; }
        @Override public int x() { return 56; }
        @Override public int y() { return 127; }
    },
    WOLF_GRENADIER {
        @Override public String filename() { return "SWGrenadier_front.png"; }
        @Override public int x() { return 34; }
        @Override public int y() { return 112; }
    },
    WOLF_THUG {
        @Override public String filename() { return "SWThug_front.png"; }
        @Override public int x() { return 41; }
        @Override public int y() { return 120; }
    },
    WOLF_ARMORED_TRUCK {
        @Override public String filename() { return "SWarmoredTruck_front.png"; }
        @Override public int x() { return 57; }
        @Override public int y() { return 125; }
    },
    WOLF_SCRAPPER {
        @Override public String filename() { return "SWscrapper_front.png"; }
        @Override public int x() { return 52; }
        @Override public int y() { return 133; }
    },
    SNIPER {
        @Override public String filename() { return "Sniper2_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 109; }
    },
    SUPER_TANK {
        @Override public String filename() { return "Supertank_fr.png"; }
        @Override public int x() { return 78; }
        @Override public int y() { return 141; }
    },
    MEERKAT {
        @Override public String filename() { return "TOW_front.png"; }
        @Override public int x() { return 51; }
        @Override public int y() { return 114; }
    },
    FLYING_DEXTER_FRAGMENT {
        @Override public String filename() { return "Air_ancient_fragment_front.png"; }
        @Override public int x() { return 96; }
        @Override public int y() { return 258; }
    },
    UH1B_SKYRAPTOR {
        @Override public String filename() { return "Air_attack_helicopter_front.png"; }
        @Override public int x() { return 75; }
        @Override public int y() { return 172; }
    },
    Z218_BOMBER {
        @Override public String filename() { return "Air_bomber_front.png"; }
        @Override public int x() { return 84; }
        @Override public int y() { return 185; }
    },
    THUNDERCLOUD_F10 {
        @Override public String filename() { return "Air_corsair_front.png"; }
        @Override public int x() { return 63; }
        @Override public int y() { return 136; }
    },
    V14_MAVERICK {
        @Override public String filename() { return "Air_jet_fighter_front.png"; }
        @Override public int x() { return 69; }
        @Override public int y() { return 156; }
    },
    FALCONS_NEST {
        @Override public String filename() { return "Air_raider_zeppelin_front.png"; }
        @Override public int x() { return 99; }
        @Override public int y() { return 181; }
    },
    PROTO_HUNTER {
        @Override public String filename() { return "Air_s_trooper_zombie_front.png"; }
        @Override public int x() { return 49; }
        @Override public int y() { return 192; }
    },
    ADVANCED_HUNTER {
        @Override public String filename() { return "Air_s_trooper_zombie_c_front.png"; }
        @Override public int x() { return 49; }
        @Override public int y() { return 192; }
    },
    ARCHETYPE_HUNTER {
        @Override public String filename() { return "Air_s_trooper_zombie_d_front.png"; }
        @Override public int x() { return 49; }
        @Override public int y() { return 192; }
    },
    SPIDERWASP_DRONE {
        @Override public String filename() { return "Air_spiderwasp_striker_front.png"; }
        @Override public int x() { return 63; }
        @Override public int y() { return 190; }
    },
    ROYAL_SPIDERWASP_DRONE {
        @Override public String filename() { return "Air_spiderwasp_striker_70_front.png"; }
        @Override public int x() { return 63; }
        @Override public int y() { return 189; }
    },
    SILVERWOLF_CROP_BUSTER {
        @Override public String filename() { return "Air_sw_plane_front.png"; }
        @Override public int x() { return 83; }
        @Override public int y() { return 155; }
    },
    SILVERWOLF_CHUNOOK_HELICOPTER {
        @Override public String filename() { return "Air_sw_whirlybird_front.png"; }
        @Override public int x() { return 65; }
        @Override public int y() { return 219; }
    },
    B10_WILD_BOAR {
        @Override public String filename() { return "Air_warthog_front.png"; }
        @Override public int x() { return 70; }
        @Override public int y() { return 150; }
    },
    L60_HAWKER_HURRICANE {
        @Override public String filename() { return "Air_ww2_fighter_front.png"; }
        @Override public int x() { return 67; }
        @Override public int y() { return 149; }
    },
    ARMORED_FORTRESS {
        @Override public String filename() { return "ArmoredFortress_front.png"; }
        @Override public int x() { return 76; }
        @Override public int y() { return 170; }
    },
    ARMORED_RAIDER_MAMMOTH {
        @Override public String filename() { return "ArmoredMammoth_front.png"; }
        @Override public int x() { return 100; }
        @Override public int y() { return 200; }
    },
    ARMORED_PILLBOX {
        @Override public String filename() { return "ArmoredPillbox.png"; }
        @Override public int x() { return 49; }
        @Override public int y() { return 110; }
    },
    ARSONIST {
        @Override public String filename() { return "Arsonist_front.png"; }
        @Override public int x() { return 42; }
        @Override public int y() { return 148; }
    },
    LIGHT_ARTILLERY {
        @Override public String filename() { return "Artillery_grey_front.png"; }
        @Override public int x() { return 106; }
        @Override public int y() { return 121; }
    },
    ASSASSINATOR {
        @Override public String filename() { return "Assassinator_front.png"; }
        @Override public int x() { return 69; }
        @Override public int y() { return 129; }
    },
    BAZOOKA_SQUAD {
        @Override public String filename() { return "BazookaTeam_front.png"; }
        @Override public int x() { return 67; }
        @Override public int y() { return 114; }
    },
    BIO_GRENADIER {
        @Override public String filename() { return "BioGrenadier_front.png"; }
        @Override public int x() { return 43; }
        @Override public int y() { return 119; }
    },
    BLOCKHOUSE {
        @Override public String filename() { return "Blockhouses_idle_front.png"; }
        @Override public int x() { return 55; }
        @Override public int y() { return 142; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_LEFT {
        @Override public String filename() { return "Boss_goliath_tank_leftside_front.png"; }
        @Override public int x() { return 77; }
        @Override public int y() { return 318; }
    },
    GOLIATH_TANK {
        @Override public String filename() { return "Boss_goliath_tank_main_front.png"; }
        @Override public int x() { return 122; }
        @Override public int y() { return 380; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_RIGHT {
        @Override public String filename() { return "Boss_goliath_tank_rightside_front.png"; }
        @Override public int x() { return 37; }
        @Override public int y() { return 266; }
    },
    THE_KRAKEN {
        @Override public String filename() { return "Boss_kraken_body_Crop.png"; }
        @Override public int x() { return 151; }
        @Override public int y() { return 161; }
    },
    KRAKEN_TENTACLE {
        @Override public String filename() { return "Boss_kraken_arm_front_Crop.png"; }
        @Override public int x() { return 40; }
        @Override public int y() { return 206; }
    },
    DREADNOUGHT {
        @Override public String filename() { return "Boss_ship_dreadnought_front.png"; }
        @Override public int x() { return 107; }
        @Override public int y() { return 313; }
    },
    SPIDERWASP_QUEEN {
        @Override public String filename() { return "Boss_spiderwasp_queen_front.png"; }
        @Override public int x() { return 134; }
        @Override public int y() { return 237; }
    },
    WOLF_CRUEL_BUS {
        @Override public String filename() { return "CannonSchoolBus_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 146; }
    },
    RAIDER_CANNONEER {
        @Override public String filename() { return "Cannonraider_front.png"; }
        @Override public int x() { return 54; }
        @Override public int y() { return 137; }
    },
    RAIDER_CHAMPION {
        @Override public String filename() { return "Championraider_front.png"; }
        @Override public int x() { return 64; }
        @Override public int y() { return 137; }
    },
    CHEMICAL_SPRINKLER {
        @Override public String filename() { return "ChemSprinkler_front.png"; }
        @Override public int x() { return 42; }
        @Override public int y() { return 156; }
    },
    CHEM_TROOPER {
        @Override public String filename() { return "ChemTrooper_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 131; }
    },
    RANGER {
        @Override public String filename() { return "Commando_grey_front.png"; }
        @Override public int x() { return 35; }
        @Override public int y() { return 124; }
    },
    PEACE_KEEPER {
        @Override public String filename() { return "CrowdControl_front.png"; }
        @Override public int x() { return 53; }
        @Override public int y() { return 123; }
    },
    CONCRETE_WALL_A {
        @Override public String filename() { return "Def_barricade_cementWall_front.png"; }
        @Override public int x() { return 55; }
        @Override public int y() { return 110; }
    },
    CONCRETE_WALL_B {
        @Override public String filename() { return "Def_barricade_concreteWall_front.png"; }
        @Override public int x() { return 84; }
        @Override public int y() { return 124; }
    },
    SANDBAGS {
        @Override public String filename() { return "Def_barricade_sandbags_front.png"; }
        @Override public int x() { return 66; }
        @Override public int y() { return 95; }
    },
    BUOY {
        @Override public String filename() { return "Def_buoy.png"; }
        @Override public int x() { return 25; }
        @Override public int y() { return 121; }
    },
    PORTABLE_ELECTRIC_FENCE {
        @Override public String filename() { return "Def_fence_electric_front.png"; }
        @Override public int x() { return 65; }
        @Override public int y() { return 122; }
    },
    FLOATING_MINE {
        @Override public String filename() { return "Def_mine.png"; }
        @Override public int x() { return 33; }
        @Override public int y() { return 96; }
    },
    RAIDER_FENCE {
        @Override public String filename() { return "Def_raiderbarricade.png"; }
        @Override public int x() { return 77; }
        @Override public int y() { return 132; }
    },
    SPIDERWASP_EGG {
        @Override public String filename() { return "Def_spiderwasp_egg_front.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 126; }
    },
    REINFORCED_CONCRETE_WALL {
        @Override public String filename() { return "Def_wall_concrete_60_front.png"; }
        @Override public int x() { return 69; }
        @Override public int y() { return 114; }
    },
    WHIRLPOOL {
        @Override public String filename() { return "Def_whirlpool.png"; }
        @Override public int x() { return 88; }
        @Override public int y() { return 91; }
    },
    DEMOLITIONIST {
        @Override public String filename() { return "Demolitionist_front.png"; }
        @Override public int x() { return 34; }
        @Override public int y() { return 117; }
    },
    IMPERIAL_DRAGOON {
        @Override public String filename() { return "Dragoon_front.png"; }
        @Override public int x() { return 87; }
        @Override public int y() { return 110; }
    },
    DUNE_RIDER {
        @Override public String filename() { return "Dunerider_grey_front.png"; }
        @Override public int x() { return 70; }
        @Override public int y() { return 132; }
    },
    ELDER_SANDWORM {
        @Override public String filename() { return "ElderSandworm.png"; }
        @Override public int x() { return 96; }
        @Override public int y() { return 157; }
    },
    LIGHTNING_TROOPER {
        @Override public String filename() { return "ElectroTrooper_front.png"; }
        @Override public int x() { return 30; }
        @Override public int y() { return 129; }
    },
    FLAME_TROOPER {
        @Override public String filename() { return "Flametrooper_grey_front.png"; }
        @Override public int x() { return 35; }
        @Override public int y() { return 122; }
    },
    HORNET {
        @Override public String filename() { return "Fliegerhaust_front.png"; }
        @Override public int x() { return 81; }
        @Override public int y() { return 119; }
    },
    GRENADIER {
        @Override public String filename() { return "Grenadier_front.png"; }
        @Override public int x() { return 39; }
        @Override public int y() { return 127; }
    },
    WATCHTOWER {
        @Override public String filename() { return "GuardTower_battle.png"; }
        @Override public int x() { return 87; }
        @Override public int y() { return 189; }
    },
    GUNNER {
        @Override public String filename() { return "Gunner_grey_front.png"; }
        @Override public int x() { return 57; }
        @Override public int y() { return 113; }
    },
    HEAVY_CHEMICAL_TANK {
        @Override public String filename() { return "HeavyChemTank_front.png"; }
        @Override public int x() { return 65; }
        @Override public int y() { return 134; }
    },
    BRIMSTONE {
        @Override public String filename() { return "HeavyLauncher_front.png"; }
        @Override public int x() { return 69; }
        @Override public int y() { return 137; }
    },
    HEAVY_ARTILLERY {
        @Override public String filename() { return "Heavyartillery_front.png"; }
        @Override public int x() { return 92; }
        @Override public int y() { return 116; }
    },
    HEAVY_TANK {
        @Override public String filename() { return "Heavytank_front_grey.png"; }
        @Override public int x() { return 67; }
        @Override public int y() { return 129; }
    },
    ANCIENT_CONSTRUCT {
        @Override public String filename() { return "Hero_ancient_robot_front.png"; }
        @Override public int x() { return 207; }
        @Override public int y() { return 279; }
    },
    MELEE_WEAPON_SYSTEM {
        @Override public String filename() { return "Hero_ancient_robot_2_arm_left_front.png"; }
        @Override public int x() { return 106; }
        @Override public int y() { return 349; }
    },
    RANGED_WEAPON_SYSTEM {
        @Override public String filename() { return "Hero_ancient_robot_2_arm_right_front.png"; }
        @Override public int x() { return 149; }
        @Override public int y() { return 368; }
    },
    ANCIENT_SENTINEL {
        @Override public String filename() { return "Hero_ancient_robot_2_body.png"; }
        @Override public int x() { return 132; }
        @Override public int y() { return 447; }
    },
    EXPERIMENTAL_CONSTRUCT {
        @Override public String filename() { return "Hero_i17_ancient_robot_clone_front.png"; }
        @Override public int x() { return 208; }
        @Override public int y() { return 279; }
    },
    HITMAN {
        @Override public String filename() { return "Hitman_front.png"; }
        @Override public int x() { return 23; }
        @Override public int y() { return 134; }
    },
    HUNTER {
        @Override public String filename() { return "Hunter_front.png"; }
        @Override public int x() { return 57; }
        @Override public int y() { return 120; }
    },
    RAILGUN_TANK {
        @Override public String filename() { return "I17_veh_tank_railgun_front.png"; }
        @Override public int x() { return 87; }
        @Override public int y() { return 149; }
    },
    HUMVEE {
        @Override public String filename() { return "Jeep_grey_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 116; }
    },
    JUGGERNAUT {
        @Override public String filename() { return "Juggernaut_front.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 123; }
    },
    HAILSTORM {
        @Override public String filename() { return "Katyusha_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 107; }
    },
    LIGHT_CHEMICAL_TANK {
        @Override public String filename() { return "LtChemTank_front.png"; }
        @Override public int x() { return 45; }
        @Override public int y() { return 128; }
    },
    FIREDRAKE {
        @Override public String filename() { return "LtFlameTank_front.png"; }
        @Override public int x() { return 72; }
        @Override public int y() { return 113; }
    },
    MEDIUM_TANK {
        @Override public String filename() { return "Mediumtank_front_grey.png"; }
        @Override public int x() { return 68; }
        @Override public int y() { return 109; }
    },
    PEACEMAKER {
        @Override public String filename() { return "MegaArtillery_front.png"; }
        @Override public int x() { return 119; }
        @Override public int y() { return 180; }
    },
    ARMADILLO {
        @Override public String filename() { return "MgShield_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 107; }
    },
    MINI_TANK {
        @Override public String filename() { return "MiniTank_front.png"; }
        @Override public int x() { return 38; }
        @Override public int y() { return 109; }
    },
    HEAVY_GUNNER {
        @Override public String filename() { return "Minigunner_front.png"; }
        @Override public int x() { return 56; }
        @Override public int y() { return 121; }
    },
    ROCKET_TRUCK {
        @Override public String filename() { return "Mlrs_grey_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 113; }
    },
    MORTAR_TEAM {
        @Override public String filename() { return "Mortarteam_grey_front.png"; }
        @Override public int x() { return 40; }
        @Override public int y() { return 117; }
    },
    ARIES {
        @Override public String filename() { return "MtArt_front.png"; }
        @Override public int x() { return 156; }
        @Override public int y() { return 198; }
    },
    THE_ROCK {
        @Override public String filename() { return "NatBarricade_01.png"; }
        @Override public int x() { return 31; }
        @Override public int y() { return 87; }
    },
    STONE_SLAB {
        @Override public String filename() { return "NatBarricade_02.png"; }
        @Override public int x() { return 52; }
        @Override public int y() { return 109; }
    },
    LINE_OF_ROCKS {
        @Override public String filename() { return "NatBarricade_03.png"; }
        @Override public int x() { return 63; }
        @Override public int y() { return 118; }
    },
    GRANITE_BOULDER {
        @Override public String filename() { return "NatBarricade_04.png"; }
        @Override public int x() { return 75; }
        @Override public int y() { return 137; }
    },
    DEBRIS {
        @Override public String filename() { return "NatBarricade_debris.png"; }
        @Override public int x() { return 80; }
        @Override public int y() { return 140; }
    },
    FALLEN_LOG {
        @Override public String filename() { return "NatBarricade_log.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 107; }
    },
    NINJA_TROOPER {
        @Override public String filename() { return "NinjaTrooper_front.png"; }
        @Override public int x() { return 36; }
        @Override public int y() { return 128; }
    },
    JUNIOR_OFFICER {
        @Override public String filename() { return "Officer_front.png"; }
        @Override public int x() { return 17; }
        @Override public int y() { return 119; }
    },
    PILLBOX {
        @Override public String filename() { return "Pillbox_front.png"; }
        @Override public int x() { return 53; }
        @Override public int y() { return 128; }
    },
    HEAVY_RECON {
        @Override public String filename() { return "PremiumAPC_front.png"; }
        @Override public int x() { return 61; }
        @Override public int y() { return 139; }
    },
    RAIDER_WARRIOR {
        @Override public String filename() { return "Raider_front.png"; }
        @Override public int x() { return 52; }
        @Override public int y() { return 131; }
    },
    TRONK {
        @Override public String filename() { return "RaiderLieutBoom.png"; }
        @Override public int x() { return 101; }
        @Override public int y() { return 146; }
    },
    CRAZY_BLADES {
        @Override public String filename() { return "RaiderLieutGirl.png"; }
        @Override public int x() { return 40; }
        @Override public int y() { return 135; }
    },
    SARIN {
        @Override public String filename() { return "RaiderLieutThin.png"; }
        @Override public int x() { return 93; }
        @Override public int y() { return 163; }
    },
    RAIDER_WATCHTOWER {
        @Override public String filename() { return "Raiderwatchtowerfront.png"; }
        @Override public int x() { return 54; }
        @Override public int y() { return 164; }
    },
    COMMANDO {
        @Override public String filename() { return "Ranger_front.png"; }
        @Override public int x() { return 48; }
        @Override public int y() { return 119; }
    },
    RAT_KING {
        @Override public String filename() { return "RatBrown.png"; }
        @Override public int x() { return 21; }
        @Override public int y() { return 57; }
    },
    MANGY_RAT {
        @Override public String filename() { return "RatGrey.png"; }
        @Override public int x() { return 21; }
        @Override public int y() { return 57; }
    },
    JET_SKI {
        @Override public String filename() { return "Rb_ship_jetski_front.png"; }
        @Override public int x() { return 43; }
        @Override public int y() { return 116; }
    },
    POWER_BOAT {
        @Override public String filename() { return "Rb_ship_speedboat_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 141; }
    },
    ARMORED_TUG {
        @Override public String filename() { return "Rb_ship_tugboat_front.png"; }
        @Override public int x() { return 71; }
        @Override public int y() { return 180; }
    },
    RPG_TROOPER {
        @Override public String filename() { return "Rpg_front.png"; }
        @Override public int x() { return 75; }
        @Override public int y() { return 125; }
    },
    ARCTIC_TROOPER {
        @Override public String filename() { return "S_arctic_trooper_front.png"; }
        @Override public int x() { return 56; }
        @Override public int y() { return 132; }
    },
    ARCTIC_TROOPER_2 {
        @Override public String filename() { return "S_arctic_trooper_rebel_front.png"; }
        @Override public int x() { return 56; }
        @Override public int y() { return 132; }
    },
    BIGFOOT {
        @Override public String filename() { return "S_bigfoot_adult_front.png"; }
        @Override public int x() { return 61; }
        @Override public int y() { return 147; }
    },
    BIGFOOT_WARRIOR {
        @Override public String filename() { return "S_bigfoot_adult_55_front.png"; }
        @Override public int x() { return 61; }
        @Override public int y() { return 147; }
    },
    YOUNG_BIGFOOT {
        @Override public String filename() { return "S_bigfoot_child_front.png"; }
        @Override public int x() { return 61; }
        @Override public int y() { return 124; }
    },
    APEX_MAULER {
        @Override public String filename() { return "S_bigfoot_zombie_super_player_front.png"; }
        @Override public int x() { return 60; }
        @Override public int y() { return 146; }
    },
    BOAR_VETERAN {
        @Override public String filename() { return "S_boar_boarus_rex_55_front.png"; }
        @Override public int x() { return 75; }
        @Override public int y() { return 131; }
    },
    ALPHA_BOAR {
        @Override public String filename() { return "S_boar_large_front.png"; }
        @Override public int x() { return 51; }
        @Override public int y() { return 110; }
    },
    WILD_BOAR {
        @Override public String filename() { return "S_boar_medium_front.png"; }
        @Override public int x() { return 40; }
        @Override public int y() { return 100; }
    },
    BOAR_PIGLET {
        @Override public String filename() { return "S_boar_small_front.png"; }
        @Override public int x() { return 27; }
        @Override public int y() { return 82; }
    },
    IMPERIAL_PEACEMONGER {
        @Override public String filename() { return "S_bountyHunter_front.png"; }
        @Override public int x() { return 84; }
        @Override public int y() { return 151; }
    },
    COMMANDO_2 {
        @Override public String filename() { return "S_commando_rebel_front.png"; }
        @Override public int x() { return 48; }
        @Override public int y() { return 122; }
    },
    LIGHTNING_TOWER {
        @Override public String filename() { return "S_def_tesla_coil_front.png"; }
        @Override public int x() { return 55; }
        @Override public int y() { return 217; }
    },
    SALAMANDER {
        @Override public String filename() { return "S_flame_heavy_front.png"; }
        @Override public int x() { return 62; }
        @Override public int y() { return 143; }
    },
    SILVER_WOLF_GOLDEN_EAGLE {
        @Override public String filename() { return "S_guy_sniper_front.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 108; }
    },
    MAMMOTH_SEER {
        @Override public String filename() { return "S_mammoth_king_55_front.png"; }
        @Override public int x() { return 102; }
        @Override public int y() { return 140; }
    },
    MAMMOTH_ELDER {
        @Override public String filename() { return "S_mammoth_large_front.png"; }
        @Override public int x() { return 102; }
        @Override public int y() { return 141; }
    },
    MAMMOTH {
        @Override public String filename() { return "S_mammoth_medium_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 128; }
    },
    MAMMOTH_TUSKLING {
        @Override public String filename() { return "S_mammoth_small_front.png"; }
        @Override public int x() { return 38; }
        @Override public int y() { return 98; }
    },
    BOARUS_REX {
        @Override public String filename() { return "S_matriarchBoar_front.png"; }
        @Override public int x() { return 74; }
        @Override public int y() { return 131; }
    },
    FIELD_AGENT {
        @Override public String filename() { return "S_midrange_agent_front.png"; }
        @Override public int x() { return 38; }
        @Override public int y() { return 145; }
    },
    TURTLESHELLER {
        @Override public String filename() { return "S_mortar_turtleShell_front.png"; }
        @Override public int x() { return 67; }
        @Override public int y() { return 153; }
    },
    PORTABLE_WALL {
        @Override public String filename() { return "S_portableWall_front.png"; }
        @Override public int x() { return 76; }
        @Override public int y() { return 104; }
    },
    BRUTAL_CANNONEER {
        @Override public String filename() { return "S_raider_bombadier_55_front.png"; }
        @Override public int x() { return 51; }
        @Override public int y() { return 138; }
    },
    BIG_BADA_BOOM {
        @Override public String filename() { return "S_raider_boomboom_55_front.png"; }
        @Override public int x() { return 42; }
        @Override public int y() { return 125; }
    },
    BRUTAL_BRAWLER {
        @Override public String filename() { return "S_raider_brawler_55_front.png"; }
        @Override public int x() { return 46; }
        @Override public int y() { return 141; }
    },
    BRUTAL_CHAMPION {
        @Override public String filename() { return "S_raider_champion_55_front.png"; }
        @Override public int x() { return 64; }
        @Override public int y() { return 137; }
    },
    DUSTWALKER_DERVISH {
        @Override public String filename() { return "S_raider_dustwalker_55_front.png"; }
        @Override public int x() { return 48; }
        @Override public int y() { return 123; }
    },
    SEARING_FIREBREATHER {
        @Override public String filename() { return "S_raider_firebreather_55_front.png"; }
        @Override public int x() { return 48; }
        @Override public int y() { return 128; }
    },
    RAIDER_RIFLEMAN {
        @Override public String filename() { return "S_raider_infantry_55_front.png"; }
        @Override public int x() { return 56; }
        @Override public int y() { return 129; }
    },
    RAIDER_SKIRMISHER {
        @Override public String filename() { return "S_raider_raptorRider_front.png"; }
        @Override public int x() { return 81; }
        @Override public int y() { return 170; }
    },
    ELITE_SKIRMISHER {
        @Override public String filename() { return "S_raider_raptor_rider_55_front.png"; }
        @Override public int x() { return 81; }
        @Override public int y() { return 170; }
    },
    RAIDER_OUTCAST {
        @Override public String filename() { return "S_raider_sniper_front.png"; }
        @Override public int x() { return 103; }
        @Override public int y() { return 127; }
    },
    ELITE_OUTCAST {
        @Override public String filename() { return "S_raider_sniper_55_front.png"; }
        @Override public int x() { return 103; }
        @Override public int y() { return 127; }
    },




    DRAGON {
        @Override public String filename() { return "Veh_tank_flame_heavy_front.png"; }
        @Override public int x() { return 66; }
        @Override public int y() { return 147; }
    },
    PUMA {
        @Override public String filename() { return "WheeledTank_front.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 114; }
    };
    public String filePathString() { return "/units/front/" + filename(); }
    abstract public String filename();
    abstract public int x();
    abstract public int y();
    public static EnemyUnit fromId(String s) {
        return switch (s) {
            case "APC" -> RECON_VEHICLE;
            case "BoomBoom" -> BOOM_BOOM;
            case "BrawlerRaider" -> RAIDER_BRAWLER;
            case "DustwalkerRaider" -> DUST_WALKER;
            case "FireBreather" -> FIREBREATHER;
            case "FlameTurret" -> FLAME_TURRET;
            case "Gantas" -> WARLORD_GANTAS;
            case "Guntruck" -> GUN_TRUCK;
            case "LightTank_grey" -> LIGHT_TANK;
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
            case "Sniper2_front_dle" -> SNIPER;
            case "Supertank" -> SUPER_TANK;
            case "TOW" -> MEERKAT;
            case "air_ancient_fragment" -> FLYING_DEXTER_FRAGMENT;
            case "air_attack_helicopter" -> UH1B_SKYRAPTOR;
            case "air_bomber" -> Z218_BOMBER;
            case "air_corsair" -> THUNDERCLOUD_F10;
            case "air_jet_fighter" -> V14_MAVERICK;
            case "air_raider_zeppelin" -> FALCONS_NEST;
            case "air_s_trooper_zombie" -> PROTO_HUNTER;
            case "air_s_trooper_zombie_b" -> null;
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
            case "artillery_grey" -> LIGHT_ARTILLERY;
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
            case "commando_grey" -> RANGER;
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
            case "dunerider_grey" -> DUNE_RIDER;
            case "elderSandworm" -> ELDER_SANDWORM;
            case "electroTrooper" -> LIGHTNING_TROOPER;
            case "flametrooper_grey" -> FLAME_TROOPER;
            case "fliegerhaust" -> HORNET;
            case "grenadier" -> GRENADIER;
            case "guardTower_battle" -> WATCHTOWER;
            case "gunner_grey" -> GUNNER;
            case "heavyChemTank" -> HEAVY_CHEMICAL_TANK;
            case "heavyLauncher" -> BRIMSTONE;
            case "heavyartillery" -> HEAVY_ARTILLERY;
            case "heavytank_front_grey" -> HEAVY_TANK;
            case "hero_ancient_robot" -> ANCIENT_CONSTRUCT;
            case "hero_ancient_robot_2_arm_left" -> MELEE_WEAPON_SYSTEM;
            case "hero_ancient_robot_2_arm_right" -> RANGED_WEAPON_SYSTEM;
            case "hero_ancient_robot_2_body" -> ANCIENT_SENTINEL;
            case "hero_i17_ancient_robot_clone" -> EXPERIMENTAL_CONSTRUCT;
            case "hero_spiderwasp_queen" -> SPIDERWASP_QUEEN; // For some reason two IDs link the Spiderwasp Queen, other being 'boss_spiderwasp_queen'
            case "hitman" -> HITMAN;
            case "hunter" -> HUNTER;
            case "i17_veh_tank_railgun" -> RAILGUN_TANK;
            case "jeep_grey" -> HUMVEE;
            case "juggernaut" -> JUGGERNAUT;
            case "katyusha" -> HAILSTORM;
            case "ltChemTank" -> LIGHT_CHEMICAL_TANK;
            case "ltFlameTank" -> FIREDRAKE;
            case "mediumtank_front_grey" -> MEDIUM_TANK;
            case "megaArtillery" -> PEACEMAKER;
            case "mgShield" -> ARMADILLO;
            case "miniTank" -> MINI_TANK;
            case "minigunner" -> HEAVY_GUNNER;
            case "mlrs_grey" -> ROCKET_TRUCK;
            case "mortarteam_grey" -> MORTAR_TEAM;
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
            case "S_bigfoot_adult_55" -> BIGFOOT_WARRIOR;
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

            case "veh_tank_flame_heavy" -> DRAGON;
            case "wheeledTank" -> PUMA;
            default -> UNKNOWN;
        };
    }
}