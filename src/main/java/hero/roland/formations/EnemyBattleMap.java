package hero.roland.formations;

enum EnemyBattleMap {
    BAY {
        @Override public String filename() { return "BattleMapBayEnemy.png"; }
    },
    CAVE {
        @Override public String filename() { return "BattleMapCaveEnemy.png"; }
    },
    CITY {
        @Override public String filename() { return "BattleMapCityEnemy.png"; }
    },
    JUNGLE {
        @Override public String filename() { return "BattleMapJungleEnemy.png"; }
    },
    OCEAN {
        @Override public String filename() { return "BattleMapOceanEnemy.png"; }
    },
    OUTPOST {
        @Override public String filename() { return "BattleMapOutpostEnemy.png"; }
    },
    SNOW {
        @Override public String filename() { return "BattleMapSnowEnemy.png"; }
    };
    public String filePathString() { return "/maps/" + filename(); }
    abstract public String filename();
    public int x() { return 277; }
    public int y() { return 359; }
    public static EnemyBattleMap fromId(String s) {
        return switch (s) {
            case "bay" -> BAY;
            case "cave" -> CAVE;
            case "city" -> CITY;
            case "jungle" -> JUNGLE;
            case "ocean" -> OCEAN;
            case "outpost" -> OUTPOST;
            case "snow" -> SNOW;
            default -> throw new IllegalArgumentException("Unknown BattleMap ID: " + s);
        };
    }
}
