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

    
    DRAGON {
        @Override public String filePathString() { return super.filePathString() + "Veh_tank_flame_heavy_front.png"; }
        @Override public int x() { return 67; }
        @Override public int y() { return 142; }
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


            case "veh_tank_flame_heavy" -> DRAGON;
            case "wheeledTank" -> PUMA;
            default -> throw new IllegalArgumentException("Unknown Unit ID: " + s);
        };
    }
}