package hero.roland;

import hero.roland.Events.EventListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.OptionType;

public class Main {
    static private DataHandler dataHandler = new JSONDataHandler();
    static private JDA jda = JDABuilder.createDefault(Token.TEST_TOKEN).build();
    public static void main(String[] args) {
        jda.addEventListener(new EventListener());

        jda.updateCommands().addCommands(
            Commands.slash("view", "View the raid policy of a member. Edit your own raid policy by using this command on yourself.")
                .addOption(OptionType.USER, "member", "The member to view the policy of.", true),
            Commands.slash("set", "Set your raid policy by providing a custom message.")
                .addOption(OptionType.STRING, "message", "Your new raid policy message. Maximum 300 characters.", false),
            Commands.slash("setname", "Set your in-game name.")
                .addOption(OptionType.STRING, "name", "Your in-game name.", true),
            Commands.slash("list", "List all members who have set a raid policy.")
        ).queue();
    }
    static public DataHandler dataHandler() { return dataHandler; }
    static public JDA jda() { return jda; }
}