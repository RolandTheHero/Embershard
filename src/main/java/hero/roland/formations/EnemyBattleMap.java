package hero.roland.formations;

enum EnemyBattleMap {
    BAY {
        @Override public String filePathString() { return super.filePathString() + "BattleMapBayEnemy.png"; }
    },
    CAVE {
        @Override public String filePathString() { return super.filePathString() + "BattleMapCaveEnemy.png"; }
    },
    CITY {
        @Override public String filePathString() { return super.filePathString() + "BattleMapCityEnemy.png"; }
    },
    JUNGLE {
        @Override public String filePathString() { return super.filePathString() + "BattleMapJungleEnemy.png"; }
    },
    OCEAN {
        @Override public String filePathString() { return super.filePathString() + "BattleMapOceanEnemy.png"; }
    },
    OUTPOST {
        @Override public String filePathString() { return super.filePathString() + "BattleMapOutpostEnemy.png"; }
    },
    SNOW {
        @Override public String filePathString() { return super.filePathString() + "BattleMapSnowEnemy.png"; }
    };
    public String filePathString() { return "/maps/"; }
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
