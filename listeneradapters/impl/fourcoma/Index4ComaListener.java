package net.yukkuritaku.discordbot.listeneradapters.impl.fourcoma;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.yukkuritaku.discordbot.commands.fourcoma.impl.Random4ComaCommand;
import net.yukkuritaku.discordbot.main.Main;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import org.jetbrains.annotations.NotNull;

public class Index4ComaListener extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        try {
            if (args[0].equalsIgnoreCase(Main.PREFIX + "4coma") && args[1].equalsIgnoreCase("parseindex")) {
                System.out.println("trying");
                try {
                    Random4ComaCommand.Random4Coma random4Coma = Random4ComaCommand.Random4Coma.searchIndex(Integer.parseInt(args[2]) + -1);
                    EmbedBuilder embedBuilder = new EmbedBuilder();
                    embedBuilder.setDescription(random4Coma.toString());
                    embedBuilder.setImage(random4Coma.getURL());
                    embedBuilder.setColor(ColorUtils.createRainbow(360));
                    event.getChannel().sendMessage(embedBuilder.build()).queue();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    event.getChannel().sendMessage(e + "int値に変換できません！").queue();
                }
            }
            //ArrayIndexOutOfBoundsException
        }catch (Exception ignored){

        }
    }
}
