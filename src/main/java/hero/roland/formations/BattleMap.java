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
    FRONTIER {
        @Override public String enemyFilename() { return "BattleMapFrontierEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapFrontierPlayer.png"; }
    },
    FRONTIER_TOWN {
        @Override public String enemyFilename() { return "BattleMapFrontierTownEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapFrontierTownPlayer.png"; }
    },
    INSTALLATION_17 {
        @Override public String enemyFilename() { return "BattleMapI17Enemy.png"; }
        @Override public String playerFilename() { return "BattleMapI17Player.png"; }
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
    RAIDER {
        @Override public String enemyFilename() { return "BattleMapRaiderEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapRaiderPlayer.png"; }
    },
    SEALAND {
        @Override public String enemyFilename() { return "BattleMapSealandEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapSealandPlayer.png"; }
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
            case "frontier" -> FRONTIER;
            case "frontier_town" -> FRONTIER_TOWN;
            case "i17" -> INSTALLATION_17;
            case "jungle" -> JUNGLE;
            case "ocean" -> OCEAN;
            case "outpost" -> OUTPOST;
            case "raider" -> RAIDER;
            case "sealand" -> SEALAND;
            case "snow" -> SNOW;
            default -> throw new FormationException("Unknown BattleMap ID: `" + s + "`\nValid IDs are: `arena`, `bay`, `cave`, `city`, `frontier`, `frontier_town`, `i17`, `jungle`, `ocean`, `outpost`, `raider`, `sealand`, `snow`.");
        };
    }
}
