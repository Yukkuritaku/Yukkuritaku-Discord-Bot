package com.yukkuritaku.discordbot.commands;

import com.yukkuritaku.discordbot.DiscordBot;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;

public class HelpCommand extends BaseCommand{

    public HelpCommand() {
        super(new Color(ColorUtils.rainbow(System.currentTimeMillis(), 10, 0, 1)),
                "help",
                "このボットのヘルプコマンドです。",
                new String[0],
                List.of());
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Message message = event.getMessage();
        MessageChannel channel = event.getChannel();
        String contentRaw = message.getContentRaw();
        String[] splitRaw = contentRaw.split("\\s+");
        if (splitRaw[0].equalsIgnoreCase(DiscordBot.PREFIX + getCommandName())){
            EmbedBuilder builder = new EmbedBuilder()
                    .setTitle("ヘルプメニュー")
                    .setColor(ColorUtils.rainbow(System.currentTimeMillis(), 10, 0, 1));
            DiscordBot.getRegisteredStampCommands().forEach(baseCommand ->
                    builder.appendDescription("`"+ baseCommand.getCommandName() + "`").appendDescription(", "));
            channel.sendMessageEmbeds(builder.build()).queue();
        }
    }

    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {

    }

    @Override
    public @Nullable String getUrl() {
        return null;
    }
}
