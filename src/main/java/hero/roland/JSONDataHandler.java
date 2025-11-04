package hero.roland;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDataHandler implements DataHandler {
    private Map<Long, GuildMember> members = new HashMap<>();

    public JSONDataHandler() {
        try {
            String content = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("user_data.json")));
            JSONArray arr = new JSONArray(content);
            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);
                long id = obj.getLong("id");
                String igName = obj.optString("igName", null);
                String policy = obj.optString("policy", null);
                long gold = obj.optLong("gold", 0);
                members.put(id, new GuildMember(id, igName, policy, gold));
            }
            System.out.println("Loaded " + members.size() + " members from policies.json");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            throw new RuntimeException();
        }
    }

    private void saveToFile() {
        JSONArray arr = new JSONArray();
        for (GuildMember member : members.values()) {
            JSONObject obj = new JSONObject();
            obj.put("id", member.id());
            obj.put("igName", member.igName());
            obj.put("policy", member.raidPolicy());
            if (member.gold() != 0) obj.put("gold", member.gold());
            arr.put(obj);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("policies.json"))) {
            writer.write(arr.toString(2));
            System.out.println(LocalDateTime.now() + ": Successfully updated policies.json");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    @Override
    public void save(GuildMember member) {
        if (!members.containsKey(member.id())) members.put(member.id(), member);
        saveToFile();
    }

    @Override
    public GuildMember load(long id) {
        GuildMember member = members.get(id);
        if (member != null) { return member; }
        return new GuildMember(id, null, null, 0);
    }

    @Override
    public Map<Long, GuildMember> allMembers() { return Collections.unmodifiableMap(members); }
}