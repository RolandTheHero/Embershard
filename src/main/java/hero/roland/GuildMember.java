package hero.roland;

public class GuildMember {
    private long id;
    private String igName;
    private String raidPolicy;

    public GuildMember(long id, String igName, String raidPolicy) {
        this.id = id;
        this.igName = igName;
        this.raidPolicy = raidPolicy;
    }

    public long id() { return id; }
    public String igName() { return igName; }
    public String raidPolicy() { return raidPolicy; }

    public void setIgName(String igName) { this.igName = igName; }
    public void setRaidPolicy(String raidPolicy) { this.raidPolicy = raidPolicy; }

    public String toString() {
        return "GuildMember{id=" + id + ", igName=" + igName + "}";
    }
}
