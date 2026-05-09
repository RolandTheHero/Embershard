package hero.roland.formations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public enum BattleMap {
    ARENA("arena", "Arena") {
        @Override public String enemyFilename() { return "BattleMapArenaEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapArenaPlayer.png"; }
    },
    BAY("bay", "Bay") {
        @Override public String enemyFilename() { return "BattleMapBayEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapBayPlayer.png"; }
    },
    CAVE("cave", "Cave") {
        @Override public String enemyFilename() { return "BattleMapCaveEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapCavePlayer.png"; }
    },
    CITY("city", "City") {
        @Override public String enemyFilename() { return "BattleMapCityEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapCityPlayer.png"; }
    },
    FRONTIER("frontier", "Frontier") {
        @Override public String enemyFilename() { return "BattleMapFrontierEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapFrontierPlayer.png"; }
    },
    FRONTIER_TOWN("frontier_town", "Frontier Town") {
        @Override public String enemyFilename() { return "BattleMapFrontierTownEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapFrontierTownPlayer.png"; }
    },
    INSTALLATION_17("i17", "Installation 17") {
        @Override public String enemyFilename() { return "BattleMapI17Enemy.png"; }
        @Override public String playerFilename() { return "BattleMapI17Player.png"; }
    },
    JUNGLE("jungle", "Jungle") {
        @Override public String enemyFilename() { return "BattleMapJungleEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapJunglePlayer.png"; }
    },
    OCEAN("ocean", "Ocean") {
        @Override public String enemyFilename() { return "BattleMapOceanEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapOceanPlayer.png"; }
    },
    OUTPOST("outpost", "Outpost") {
        @Override public String enemyFilename() { return "BattleMapOutpostEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapOutpostPlayer.png"; }
    },
    RAIDER("raider", "Raider") {
        @Override public String enemyFilename() { return "BattleMapRaiderEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapRaiderPlayer.png"; }
    },
    SEALAND("sealand", "Sealand") {
        @Override public String enemyFilename() { return "BattleMapSealandEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapSealandPlayer.png"; }
    },
    SNOW("snow", "Snow") {
        @Override public String enemyFilename() { return "BattleMapSnowEnemy.png"; }
        @Override public String playerFilename() { return "BattleMapSnowPlayer.png"; }
    };

    static final private Map<String, BattleMap> MAP_IDS = Arrays.stream(values()).collect(Collectors.toMap(BattleMap::id, m -> m));
    static public Map<String, BattleMap> getMapIdMap() { return Collections.unmodifiableMap(MAP_IDS); }

    public String id() { return id; }
    public String mapName() { return mapName; }
    public String enemyFilePath() { return "/maps/" + enemyFilename(); }
    public String playerFilePath() { return "/maps/" + playerFilename(); }
    abstract public String enemyFilename();
    abstract public String playerFilename();
    public int x() { return 277; }
    public int y() { return 359; }

    private final String id;
    private final String mapName;

    BattleMap(String id, String mapName) {
        this.id = id;
        this.mapName = mapName;
    }
    public static BattleMap fromId(String s) {
        BattleMap map = MAP_IDS.get(s);
        if (map == null) throw new FormationException("Invalid map id: `" + s + "`.");
        return map;
    }
}
