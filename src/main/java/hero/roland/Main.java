package hero.roland;

import hero.roland.data.DataHandler;
import hero.roland.data.JSONDataHandler;
import hero.roland.events.EventListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.OptionType;

public class Main {
    static private DataHandler dataHandler = new JSONDataHandler();
    static private JDA jda = JDABuilder.createDefault(Token.TOKEN).build();
    public static void main(String[] args) {
        jda.addEventListener(new EventListener());

        jda.updateCommands().addCommands(
            Commands.slash("view", "View the raid policy of a member. Edit your own raid policy by using this command on yourself.")
                .addOption(OptionType.USER, "discord-user", "The Discord member to view the policy of.", false)
                .addOption(OptionType.STRING, "bn-user", "The Battle Nations username of the member to view the policy of.", false),
            Commands.slash("setname", "Set your in-game name.")
                .addOption(OptionType.STRING, "name", "Your in-game name.", true),
            Commands.slash("list", "List all members who have set a name and raid policy.")
                .addOption(OptionType.BOOLEAN, "all", "Show all members regardless of their name or raid policy set.", false),
            // Commands.slash("gold", "View the gold leaderboard or set your amount of gold.")
            //     .addOption(OptionType.INTEGER, "amount", "Update the amount of gold you possess.", false),
            Commands.slash("guides", "View the Battle Nations guides."),
            Commands.slash("formation", "Create a custom formation image.")
                .addOption(OptionType.STRING, "data", "The formation data string to load.", false)
        ).queue();
    }
    static public DataHandler dataHandler() { return dataHandler; }
    static public JDA jda() { return jda; }
}