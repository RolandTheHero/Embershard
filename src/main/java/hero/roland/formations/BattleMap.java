package hero.roland.formations;

enum BattleMap {
    ARENA {
        @Override public String enemyFilename() { return "BattleMapArenaEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapArenaPlayer.png"; }
    },
    BAY {
        @Override public String enemyFilename() { return "BattleMapBayEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapBayPlayer.png"; }
    },
    CAVE {
        @Override public String enemyFilename() { return "BattleMapCaveEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapCavePlayer.png"; }
    },
    CITY {
        @Override public String enemyFilename() { return "BattleMapCityEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapCityPlayer.png"; }
    },
    JUNGLE {
        @Override public String enemyFilename() { return "BattleMapJungleEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapJunglePlayer.png"; }
    },
    OCEAN {
        @Override public String enemyFilename() { return "BattleMapOceanEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapOceanPlayer.png"; }
    },
    OUTPOST {
        @Override public String enemyFilename() { return "BattleMapOutpostEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapOutpostPlayer.png"; }
    },
    SNOW {
        @Override public String enemyFilename() { return "BattleMapSnowEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapSnowPlayer.png"; }
    };
    public String enemyFilePath() { return "/maps/" + enemyFilename(); }
    public String playerFilePath() { return "/maps/" + playerFilename(); }
    abstract public String enemyFilename();
    abstract public String playerFilename();
    public int x() { return 277; }
    public int y() { return 359; }
    public static BattleMap fromId(String s) {
        return switch (s) {
            case "arena" -> ARENA;
            case "bay" -> BAY;
            case "cave" -> CAVE;
            case "city" -> CITY;
            case "jungle" -> JUNGLE;
            case "ocean" -> OCEAN;
            case "outpost" -> OUTPOST;
            case "snow" -> SNOW;
            default -> throw new FormationException("Unknown BattleMap ID: `" + s + "`\nValid IDs are: `arena`, `bay`, `cave`, `city`, `jungle`, `ocean`, `outpost`, `snow`.");
        };
    }
}
