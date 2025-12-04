package hero.roland.messages;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.entities.MessageEmbed;

public record GuidePage(String title, String description, String footer, String thumbnailUrl, String imageUrl, ActionRow... components) {
    public MessageEmbed toEmbed() {
        return new EmbedBuilder()
            .setTitle(title)
            .setDescription(description)
            .setFooter(footer)
            .setThumbnail(thumbnailUrl)
            .setImage(imageUrl)
            .setColor(Color.CYAN)
            .build();
    }
}
