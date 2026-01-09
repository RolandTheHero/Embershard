package hero.roland.formations;

public enum EnemyUnit {
    RECON_VEHICLE {
        @Override public String filePathString() { return super.filePathString() + "APC_front.png"; }
        @Override public int x() { return 60; }
        @Override public int y() { return 105; }
    },
    BOOM_BOOM {
        @Override public String filePathString() { return super.filePathString() + "BoomBoom_front.png"; }
        @Override public int x() { return 41; }
        @Override public int y() { return 124; }
    },
    RAIDER_BRAWLER {
        @Override public String filePathString() { return super.filePathString() + "BrawlerRaider_front.png"; }
        @Override public int x() { return 46; }
        @Override public int y() { return 141; }
    },
    DUST_WALKER {
        @Override public String filePathString() { return super.filePathString() + "DustwalkerRaider_front.png"; }
        @Override public int x() { return 47; }
        @Override public int y() { return 122; }
    },
    FIREBREATHER {
        @Override public String filePathString() { return super.filePathString() + "FireBreather_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 136; }
    },
    FLAME_TURRET {
        @Override public String filePathString() { return super.filePathString() + "FlameTurret_front.png"; }
        @Override public int x() { return 29; }
        @Override public int y() { return 141; }
    },
    WARLORD_GANTAS {
        @Override public String filePathString() { return super.filePathString() + "Gantas_front.png"; }
        @Override public int x() { return 82; }
        @Override public int y() { return 166; }
    },
    GUN_TRUCK {
        @Override public String filePathString() { return super.filePathString() + "Guntruck_front.png"; }
        @Override public int x() { return 60; }
        @Override public int y() { return 117; }
    },
    LIGHT_TANK {
        @Override public String filePathString() { return super.filePathString() + "LightTank_grey_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 117; }
    },
    TEMPEST {
        @Override public String filePathString() { return super.filePathString() + "MGTank_front.png"; }
        @Override public int x() { return 55; }
        @Override public int y() { return 111; }
    },
    MAMMOTH_RIDER {
        @Override public String filePathString() { return super.filePathString() + "MammothRaider.png"; }
        @Override public int x() { return 72; }
        @Override public int y() { return 184; }
    },
    WOLF_BOMBADIER {
        @Override public String filePathString() { return super.filePathString() + "SWBombadier_front.png"; }
        @Override public int x() { return 72; }
        @Override public int y() { return 120; }
    },
    WOLF_DEFENDER {
        @Override public String filePathString() { return super.filePathString() + "SWDefender_front.png"; }
        @Override public int x() { return 37; }
        @Override public int y() { return 106; }
    },
    WOLF_DEVASTATOR {
        @Override public String filePathString() { return super.filePathString() + "SWDevastator_front.png"; }
        @Override public int x() { return 53; }
        @Override public int y() { return 123; }
    },
    WOLF_ENFORCER {
        @Override public String filePathString() { return super.filePathString() + "SWEnforcer_front.png"; }
        @Override public int x() { return 56; }
        @Override public int y() { return 127; }
    },
    WOLF_GRENADIER {
        @Override public String filePathString() { return super.filePathString() + "SWGrenadier_front.png"; }
        @Override public int x() { return 34; }
        @Override public int y() { return 112; }
    },
    WOLF_THUG {
        @Override public String filePathString() { return super.filePathString() + "SWThug_front.png"; }
        @Override public int x() { return 41; }
        @Override public int y() { return 120; }
    },
    WOLF_ARMORED_TRUCK {
        @Override public String filePathString() { return super.filePathString() + "SWarmoredTruck_front.png"; }
        @Override public int x() { return 57; }
        @Override public int y() { return 125; }
    },
    WOLF_SCRAPPER {
        @Override public String filePathString() { return super.filePathString() + "SWscrapper_front.png"; }
        @Override public int x() { return 52; }
        @Override public int y() { return 133; }
    },
    SNIPER {
        @Override public String filePathString() { return super.filePathString() + "Sniper2_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 109; }
    },
    SUPER_TANK {
        @Override public String filePathString() { return super.filePathString() + "Supertank_fr.png"; }
        @Override public int x() { return 78; }
        @Override public int y() { return 141; }
    },
    MEERKAT {
        @Override public String filePathString() { return super.filePathString() + "TOW_front.png"; }
        @Override public int x() { return 51; }
        @Override public int y() { return 114; }
    },
    FLYING_DEXTER_FRAGMENT {
        @Override public String filePathString() { return super.filePathString() + "Air_ancient_fragment_front.png"; }
        @Override public int x() { return 96; }
        @Override public int y() { return 258; }
    },
    UH1B_SKYRAPTOR {
        @Override public String filePathString() { return super.filePathString() + "Air_attack_helicopter_front.png"; }
        @Override public int x() { return 75; }
        @Override public int y() { return 172; }
    },
    Z218_BOMBER {
        @Override public String filePathString() { return super.filePathString() + "Air_bomber_front.png"; }
        @Override public int x() { return 84; }
        @Override public int y() { return 185; }
    },
    THUNDERCLOUD_F10 {
        @Override public String filePathString() { return super.filePathString() + "Air_corsair_front.png"; }
        @Override public int x() { return 63; }
        @Override public int y() { return 136; }
    },
    V14_MAVERICK {
        @Override public String filePathString() { return super.filePathString() + "Air_jet_fighter_front.png"; }
        @Override public int x() { return 69; }
        @Override public int y() { return 156; }
    },
    FALCONS_NEST {
        @Override public String filePathString() { return super.filePathString() + "Air_raider_zeppelin_front.png"; }
        @Override public int x() { return 99; }
        @Override public int y() { return 181; }
    },
    PROTO_HUNTER {
        @Override public String filePathString() { return super.filePathString() + "Air_s_trooper_zombie_front.png"; }
        @Override public int x() { return 49; }
        @Override public int y() { return 192; }
    },
    ADVANCED_HUNTER {
        @Override public String filePathString() { return super.filePathString() + "Air_s_trooper_zombie_c_front.png"; }
        @Override public int x() { return 49; }
        @Override public int y() { return 192; }
    },
    ARCHETYPE_HUNTER {
        @Override public String filePathString() { return super.filePathString() + "Air_s_trooper_zombie_d_front.png"; }
        @Override public int x() { return 49; }
        @Override public int y() { return 192; }
    },
    SPIDERWASP_DRONE {
        @Override public String filePathString() { return super.filePathString() + "Air_spiderwasp_striker_front.png"; }
        @Override public int x() { return 63; }
        @Override public int y() { return 190; }
    },
    ROYAL_SPIDERWASP_DRONE {
        @Override public String filePathString() { return super.filePathString() + "Air_spiderwasp_striker_70_front.png"; }
        @Override public int x() { return 63; }
        @Override public int y() { return 189; }
    },
    SILVERWOLF_CROP_BUSTER {
        @Override public String filePathString() { return super.filePathString() + "Air_sw_plane_front.png"; }
        @Override public int x() { return 83; }
        @Override public int y() { return 155; }
    },
    SILVERWOLF_CHUNOOK_HELICOPTER {
        @Override public String filePathString() { return super.filePathString() + "Air_sw_whirlybird_front.png"; }
        @Override public int x() { return 65; }
        @Override public int y() { return 219; }
    },
    B10_WILD_BOAR {
        @Override public String filePathString() { return super.filePathString() + "Air_warthog_front.png"; }
        @Override public int x() { return 70; }
        @Override public int y() { return 150; }
    },
    L60_HAWKER_HURRICANE {
        @Override public String filePathString() { return super.filePathString() + "Air_ww2_fighter_front.png"; }
        @Override public int x() { return 67; }
        @Override public int y() { return 149; }
    },
    ARMORED_FORTRESS {
        @Override public String filePathString() { return super.filePathString() + "ArmoredFortress_front.png"; }
        @Override public int x() { return 76; }
        @Override public int y() { return 170; }
    },
    ARMORED_RAIDER_MAMMOTH {
        @Override public String filePathString() { return super.filePathString() + "ArmoredMammoth_front.png"; }
        @Override public int x() { return 100; }
        @Override public int y() { return 200; }
    },
    ARMORED_PILLBOX {
        @Override public String filePathString() { return super.filePathString() + "ArmoredPillbox.png"; }
        @Override public int x() { return 49; }
        @Override public int y() { return 110; }
    },
    ARSONIST {
        @Override public String filePathString() { return super.filePathString() + "Arsonist_front.png"; }
        @Override public int x() { return 42; }
        @Override public int y() { return 148; }
    },
    LIGHT_ARTILLERY {
        @Override public String filePathString() { return super.filePathString() + "Artillery_grey_front.png"; }
        @Override public int x() { return 106; }
        @Override public int y() { return 121; }
    },
    ASSASSINATOR {
        @Override public String filePathString() { return super.filePathString() + "Assassinator_front.png"; }
        @Override public int x() { return 69; }
        @Override public int y() { return 129; }
    },
    BAZOOKA_SQUAD {
        @Override public String filePathString() { return super.filePathString() + "BazookaTeam_front.png"; }
        @Override public int x() { return 67; }
        @Override public int y() { return 114; }
    },
    BIO_GRENADIER {
        @Override public String filePathString() { return super.filePathString() + "BioGrenadier_front.png"; }
        @Override public int x() { return 43; }
        @Override public int y() { return 119; }
    },
    BLOCKHOUSE {
        @Override public String filePathString() { return super.filePathString() + "Blockhouses_idle_front.png"; }
        @Override public int x() { return 55; }
        @Override public int y() { return 142; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_LEFT {
        @Override public String filePathString() { return super.filePathString() + "Boss_goliath_tank_leftside_front.png"; }
        @Override public int x() { return 77; }
        @Override public int y() { return 318; }
    },
    GOLIATH_TANK {
        @Override public String filePathString() { return super.filePathString() + "Boss_goliath_tank_main_front.png"; }
        @Override public int x() { return 122; }
        @Override public int y() { return 380; }
    },
    MULTILAUNCH_ROCKET_SYSTEM_RIGHT {
        @Override public String filePathString() { return super.filePathString() + "Boss_goliath_tank_rightside_front.png"; }
        @Override public int x() { return 37; }
        @Override public int y() { return 266; }
    },
    THE_KRAKEN {
        @Override public String filePathString() { return super.filePathString() + "Boss_kraken_body_Crop.png"; }
        @Override public int x() { return 151; }
        @Override public int y() { return 161; }
    },
    KRAKEN_TENTACLE {
        @Override public String filePathString() { return super.filePathString() + "Boss_kraken_arm_front_Crop.png"; }
        @Override public int x() { return 40; }
        @Override public int y() { return 206; }
    },
    DREADNOUGHT {
        @Override public String filePathString() { return super.filePathString() + "Boss_ship_dreadnought_front.png"; }
        @Override public int x() { return 107; }
        @Override public int y() { return 313; }
    },
    SPIDERWASP_QUEEN {
        @Override public String filePathString() { return super.filePathString() + "Boss_spiderwasp_queen_front.png"; }
        @Override public int x() { return 134; }
        @Override public int y() { return 237; }
    },
    WOLF_CRUEL_BUS {
        @Override public String filePathString() { return super.filePathString() + "CannonSchoolBus_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 146; }
    },
    RAIDER_CANNONEER {
        @Override public String filePathString() { return super.filePathString() + "Cannonraider_front.png"; }
        @Override public int x() { return 54; }
        @Override public int y() { return 137; }
    },
    RAIDER_CHAMPION {
        @Override public String filePathString() { return super.filePathString() + "Championraider_front.png"; }
        @Override public int x() { return 64; }
        @Override public int y() { return 137; }
    },
    CHEMICAL_SPRINKLER {
        @Override public String filePathString() { return super.filePathString() + "ChemSprinkler_front.png"; }
        @Override public int x() { return 42; }
        @Override public int y() { return 156; }
    },
    CHEM_TROOPER {
        @Override public String filePathString() { return super.filePathString() + "ChemTrooper_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 131; }
    },
    RANGER {
        @Override public String filePathString() { return super.filePathString() + "Commando_grey_front.png"; }
        @Override public int x() { return 35; }
        @Override public int y() { return 124; }
    },
    PEACE_KEEPER {
        @Override public String filePathString() { return super.filePathString() + "CrowdControl_front.png"; }
        @Override public int x() { return 53; }
        @Override public int y() { return 123; }
    },
    CONCRETE_WALL_A {
        @Override public String filePathString() { return super.filePathString() + "Def_barricade_cementWall_front.png"; }
        @Override public int x() { return 55; }
        @Override public int y() { return 110; }
    },
    CONCRETE_WALL_B {
        @Override public String filePathString() { return super.filePathString() + "Def_barricade_concreteWall_front.png"; }
        @Override public int x() { return 84; }
        @Override public int y() { return 124; }
    },
    SANDBAGS {
        @Override public String filePathString() { return super.filePathString() + "Def_barricade_sandbags_front.png"; }
        @Override public int x() { return 66; }
        @Override public int y() { return 95; }
    },
    BUOY {
        @Override public String filePathString() { return super.filePathString() + "Def_buoy.png"; }
        @Override public int x() { return 25; }
        @Override public int y() { return 121; }
    },
    PORTABLE_ELECTRIC_FENCE {
        @Override public String filePathString() { return super.filePathString() + "Def_fence_electric_front.png"; }
        @Override public int x() { return 65; }
        @Override public int y() { return 122; }
    },
    FLOATING_MINE {
        @Override public String filePathString() { return super.filePathString() + "Def_mine.png"; }
        @Override public int x() { return 33; }
        @Override public int y() { return 96; }
    },
    RAIDER_FENCE {
        @Override public String filePathString() { return super.filePathString() + "Def_raiderbarricade.png"; }
        @Override public int x() { return 77; }
        @Override public int y() { return 132; }
    },
    SPIDERWASP_EGG {
        @Override public String filePathString() { return super.filePathString() + "Def_spiderwasp_egg_front.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 126; }
    },
    REINFORCED_CONCRETE_WALL {
        @Override public String filePathString() { return super.filePathString() + "Def_wall_concrete_60_front.png"; }
        @Override public int x() { return 69; }
        @Override public int y() { return 114; }
    },
    WHIRLPOOL {
        @Override public String filePathString() { return super.filePathString() + "Def_whirlpool.png"; }
        @Override public int x() { return 88; }
        @Override public int y() { return 91; }
    },
    DEMOLITIONIST {
        @Override public String filePathString() { return super.filePathString() + "Demolitionist_front.png"; }
        @Override public int x() { return 34; }
        @Override public int y() { return 117; }
    },
    IMPERIAL_DRAGOON {
        @Override public String filePathString() { return super.filePathString() + "Dragoon_front.png"; }
        @Override public int x() { return 87; }
        @Override public int y() { return 110; }
    },
    DUNE_RIDER {
        @Override public String filePathString() { return super.filePathString() + "Dunerider_grey_front.png"; }
        @Override public int x() { return 70; }
        @Override public int y() { return 132; }
    },
    ELDER_SANDWORM {
        @Override public String filePathString() { return super.filePathString() + "ElderSandworm.png"; }
        @Override public int x() { return 96; }
        @Override public int y() { return 157; }
    },
    LIGHTNING_TROOPER {
        @Override public String filePathString() { return super.filePathString() + "ElectroTrooper_front.png"; }
        @Override public int x() { return 30; }
        @Override public int y() { return 129; }
    },
    FLAME_TROOPER {
        @Override public String filePathString() { return super.filePathString() + "Flametrooper_grey_front.png"; }
        @Override public int x() { return 35; }
        @Override public int y() { return 122; }
    },
    HORNET {
        @Override public String filePathString() { return super.filePathString() + "Fliegerhaust_front.png"; }
        @Override public int x() { return 81; }
        @Override public int y() { return 119; }
    },
    GRENADIER {
        @Override public String filePathString() { return super.filePathString() + "Grenadier_front.png"; }
        @Override public int x() { return 39; }
        @Override public int y() { return 127; }
    },
    WATCHTOWER {
        @Override public String filePathString() { return super.filePathString() + "GuardTower_battle.png"; }
        @Override public int x() { return 87; }
        @Override public int y() { return 189; }
    },
    GUNNER {
        @Override public String filePathString() { return super.filePathString() + "Gunner_grey_front.png"; }
        @Override public int x() { return 57; }
        @Override public int y() { return 113; }
    },
    HEAVY_CHEMICAL_TANK {
        @Override public String filePathString() { return super.filePathString() + "HeavyChemTank_front.png"; }
        @Override public int x() { return 65; }
        @Override public int y() { return 134; }
    },
    BRIMSTONE {
        @Override public String filePathString() { return super.filePathString() + "HeavyLauncher_front.png"; }
        @Override public int x() { return 69; }
        @Override public int y() { return 137; }
    },
    HEAVY_ARTILLERY {
        @Override public String filePathString() { return super.filePathString() + "Heavyartillery_front.png"; }
        @Override public int x() { return 92; }
        @Override public int y() { return 116; }
    },
    HEAVY_TANK {
        @Override public String filePathString() { return super.filePathString() + "Heavytank_front_grey.png"; }
        @Override public int x() { return 67; }
        @Override public int y() { return 129; }
    },
    ANCIENT_CONSTRUCT {
        @Override public String filePathString() { return super.filePathString() + "Hero_ancient_robot_front.png"; }
        @Override public int x() { return 207; }
        @Override public int y() { return 279; }
    },
    MELEE_WEAPON_SYSTEM {
        @Override public String filePathString() { return super.filePathString() + "Hero_ancient_robot_2_arm_left_front.png"; }
        @Override public int x() { return 106; }
        @Override public int y() { return 349; }
    },
    RANGED_WEAPON_SYSTEM {
        @Override public String filePathString() { return super.filePathString() + "Hero_ancient_robot_2_arm_right_front.png"; }
        @Override public int x() { return 149; }
        @Override public int y() { return 368; }
    },
    ANCIENT_SENTINEL {
        @Override public String filePathString() { return super.filePathString() + "Hero_ancient_robot_2_body.png"; }
        @Override public int x() { return 132; }
        @Override public int y() { return 447; }
    },
    EXPERIMENTAL_CONSTRUCT {
        @Override public String filePathString() { return super.filePathString() + "Hero_i17_ancient_robot_clone_front.png"; }
        @Override public int x() { return 208; }
        @Override public int y() { return 279; }
    },
    HITMAN {
        @Override public String filePathString() { return super.filePathString() + "Hitman_front.png"; }
        @Override public int x() { return 23; }
        @Override public int y() { return 134; }
    },
    HUNTER {
        @Override public String filePathString() { return super.filePathString() + "Hunter_front.png"; }
        @Override public int x() { return 57; }
        @Override public int y() { return 120; }
    },
    RAILGUN_TANK {
        @Override public String filePathString() { return super.filePathString() + "I17_veh_tank_railgun_front.png"; }
        @Override public int x() { return 87; }
        @Override public int y() { return 149; }
    },
    HUMVEE {
        @Override public String filePathString() { return super.filePathString() + "Jeep_grey_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 116; }
    },
    JUGGERNAUT {
        @Override public String filePathString() { return super.filePathString() + "Juggernaut_front.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 123; }
    },
    HAILSTORM {
        @Override public String filePathString() { return super.filePathString() + "Katyusha_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 107; }
    },
    LIGHT_CHEMICAL_TANK {
        @Override public String filePathString() { return super.filePathString() + "LtChemTank_front.png"; }
        @Override public int x() { return 45; }
        @Override public int y() { return 128; }
    },
    FIREDRAKE {
        @Override public String filePathString() { return super.filePathString() + "LtFlameTank_front.png"; }
        @Override public int x() { return 72; }
        @Override public int y() { return 113; }
    },
    MEDIUM_TANK {
        @Override public String filePathString() { return super.filePathString() + "Mediumtank_front_grey.png"; }
        @Override public int x() { return 68; }
        @Override public int y() { return 109; }
    },
    PEACEMAKER {
        @Override public String filePathString() { return super.filePathString() + "MegaArtillery_front.png"; }
        @Override public int x() { return 119; }
        @Override public int y() { return 180; }
    },
    ARMADILLO {
        @Override public String filePathString() { return super.filePathString() + "MgShield_front.png"; }
        @Override public int x() { return 50; }
        @Override public int y() { return 107; }
    },
    MINI_TANK {
        @Override public String filePathString() { return super.filePathString() + "MiniTank_front.png"; }
        @Override public int x() { return 38; }
        @Override public int y() { return 109; }
    },
    HEAVY_GUNNER {
        @Override public String filePathString() { return super.filePathString() + "Minigunner_front.png"; }
        @Override public int x() { return 56; }
        @Override public int y() { return 121; }
    },
    ROCKET_TRUCK {
        @Override public String filePathString() { return super.filePathString() + "Mlrs_grey_front.png"; }
        @Override public int x() { return 58; }
        @Override public int y() { return 113; }
    },
    MORTAR_TEAM {
        @Override public String filePathString() { return super.filePathString() + "Mortarteam_grey_front.png"; }
        @Override public int x() { return 40; }
        @Override public int y() { return 117; }
    },
    ARIES {
        @Override public String filePathString() { return super.filePathString() + "MtArt_front.png"; }
        @Override public int x() { return 156; }
        @Override public int y() { return 198; }
    },
    THE_ROCK {
        @Override public String filePathString() { return super.filePathString() + "NatBarricade_01.png"; }
        @Override public int x() { return 31; }
        @Override public int y() { return 87; }
    },
    STONE_SLAB {
        @Override public String filePathString() { return super.filePathString() + "NatBarricade_02.png"; }
        @Override public int x() { return 52; }
        @Override public int y() { return 109; }
    },
    LINE_OF_ROCKS {
        @Override public String filePathString() { return super.filePathString() + "NatBarricade_03.png"; }
        @Override public int x() { return 63; }
        @Override public int y() { return 118; }
    },
    GRANITE_BOULDER {
        @Override public String filePathString() { return super.filePathString() + "NatBarricade_04.png"; }
        @Override public int x() { return 75; }
        @Override public int y() { return 137; }
    },
    DEBRIS {
        @Override public String filePathString() { return super.filePathString() + "NatBarricade_debris.png"; }
        @Override public int x() { return 80; }
        @Override public int y() { return 140; }
    },
    FALLEN_LOG {
        @Override public String filePathString() { return super.filePathString() + "NatBarricade_log.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 107; }
    },
    NINJA_TROOPER {
        @Override public String filePathString() { return super.filePathString() + "NinjaTrooper_front.png"; }
        @Override public int x() { return 36; }
        @Override public int y() { return 128; }
    },
    JUNIOR_OFFICER {
        @Override public String filePathString() { return super.filePathString() + "Officer_front.png"; }
        @Override public int x() { return 17; }
        @Override public int y() { return 119; }
    },
    PILLBOX {
        @Override public String filePathString() { return super.filePathString() + "Pillbox_front.png"; }
        @Override public int x() { return 53; }
        @Override public int y() { return 128; }
    },
    HEAVY_RECON {
        @Override public String filePathString() { return super.filePathString() + "PremiumAPC_front.png"; }
        @Override public int x() { return 61; }
        @Override public int y() { return 139; }
    },




    DRAGON {
        @Override public String filePathString() { return super.filePathString() + "Veh_tank_flame_heavy_front.png"; }
        @Override public int x() { return 66; }
        @Override public int y() { return 147; }
    },
    PUMA {
        @Override public String filePathString() { return super.filePathString() + "WheeledTank_front.png"; }
        @Override public int x() { return 59; }
        @Override public int y() { return 114; }
    };
    public String filePathString() { return "/units/front/"; }
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

            case "veh_tank_flame_heavy" -> DRAGON;
            case "wheeledTank" -> PUMA;
            default -> throw new IllegalArgumentException("Unknown Unit ID: " + s);
        };
    }
}