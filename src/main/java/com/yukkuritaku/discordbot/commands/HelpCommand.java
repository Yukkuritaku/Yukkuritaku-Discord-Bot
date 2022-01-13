package com.yukkuritaku.discordbot.commands;

import com.yukkuritaku.discordbot.DiscordBot;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public final class HelpCommand extends BaseCommand{

    public HelpCommand() {
        super(new Color(ColorUtils.rainbow(System.currentTimeMillis(), 10, 0, 1)),
                "help",
                "このボットのヘルプコマンドです。",
                null,
                List.of());
    }

    @Override
    protected void onMessageCommandReceived(@NotNull MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        EmbedBuilder builder = new EmbedBuilder()
                .setTitle("ヘルプメニュー")
                .setColor(ColorUtils.rainbow(System.currentTimeMillis(), 10, 0, 1));
        List<Object> listeners = DiscordBot.getJDA().getRegisteredListeners();

        channel.sendMessageEmbeds(builder.build()).queue();
    }

    @Override
    protected void onSlashCommandReceived(@NotNull SlashCommandEvent event) {
        MessageChannel channel = event.getChannel();
        EmbedBuilder builder = new EmbedBuilder()
                .setTitle("ヘルプメニュー")
                .setColor(ColorUtils.rainbow(System.currentTimeMillis(), 10, 0, 1));
        List<Object> listeners = DiscordBot.getJDA().getRegisteredListeners();
        List<BaseCommand> commands = new ArrayList<>();
        for (Object o : listeners){
            if (o instanceof BaseCommand baseCommand){
                commands.add(baseCommand);
            }
        }



        channel.sendMessageEmbeds(builder.build()).queue();
    }

    @Override
    public @Nullable String getUrl() {
        return null;
    }
}
