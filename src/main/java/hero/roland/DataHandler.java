package hero.roland;

import java.util.Map;

public interface DataHandler {
    public void save(GuildMember member);
    public GuildMember load(long id);
    public Map<Long, GuildMember> allMembers();
}
