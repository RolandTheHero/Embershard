package hero.roland;

public class GuildMember {
    private long id;
    private String igName;
    private String raidPolicy;
    private long gold;

    public GuildMember(long id, String igName, String raidPolicy, long gold) {
        this.id = id;
        this.igName = igName;
        this.raidPolicy = raidPolicy;
        this.gold = gold;
    }

    public long id() { return id; }
    public String igName() { return igName; }
    public String raidPolicy() { return raidPolicy; }
    public long gold() { return gold; }

    public void setIgName(String igName) { this.igName = igName; }
    public void setRaidPolicy(String raidPolicy) { this.raidPolicy = raidPolicy; }
    public void setGold(long gold) { this.gold = gold; }

    public String toString() {
        return "GuildMember{id=" + id + ", igName=" + igName + "}";
    }
}
