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
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        String[] splitRaw = event.getMessage().getContentRaw().split("\\s+");
        MessageChannel channel = event.getChannel();

        EmbedBuilder builder = new EmbedBuilder()
                .setTitle("コマンドリスト")
                .setColor(ColorUtils.rainbow(System.currentTimeMillis(), 10, 0, 1));
        List<Object> listeners = DiscordBot.getJDA().getRegisteredListeners();
        List<BaseCommand> commands = new ArrayList<>();
        for (Object o : listeners){
            if (o instanceof BaseCommand baseCommand){
                commands.add(baseCommand);
            }
        }
        if (splitRaw.length == 2){
            String cmdName = splitRaw[1];
            Optional<BaseCommand> command = commands.stream()
                    .filter(baseCommand ->
                            cmdName.equals(baseCommand.getCommandName()) ||
                                    (baseCommand.getAliases() != null && Arrays.asList(baseCommand.getAliases()).contains(cmdName))
                    ).findFirst();
            if (command.isPresent()){
                EmbedBuilder commandDescription = new EmbedBuilder();
                commandDescription.setTitle("コマンド詳細");
                commandDescription.addField(command.get().getCommandName(), command.get().getCommandDescription(), false);
                commandDescription.addField("Aliases", Arrays.toString(command.get().getAliases()), false);
                channel.sendMessageEmbeds(commandDescription.build()).queue();
            }else {
                EmbedBuilder error = new EmbedBuilder()
                        .setTitle("Error")
                        .setDescription("コマンドが見つかりませんでした。検索しようとしたコマンド: " + cmdName);
                channel.sendMessageEmbeds(error.build()).queue();
            }
        }else {
            commands.forEach(baseCommand -> builder.appendDescription("`" + baseCommand.getCommandName() + "`, "));
            channel.sendMessageEmbeds(builder.build()).queue();
        }
    }

    @Override
    protected void onSlashCommandReceived(@NotNull SlashCommandEvent event) {
        var option = event.getOption("command_name");
        EmbedBuilder builder = new EmbedBuilder()
                .setTitle("コマンドリスト")
                .setColor(ColorUtils.rainbow(System.currentTimeMillis(), 10, 0, 1));
        List<Object> listeners = DiscordBot.getJDA().getRegisteredListeners();
        List<BaseCommand> commands = new ArrayList<>();
        for (Object o : listeners){
            if (o instanceof BaseCommand baseCommand){
                commands.add(baseCommand);
            }
        }
        if (option == null) {
            commands.forEach(baseCommand -> builder.appendDescription("`" + baseCommand.getCommandName() + "`, "));
        }else {
            String cmdName = option.getAsString();
            Optional<BaseCommand> command = commands.stream()
                    .filter(baseCommand ->
                    cmdName.equals(baseCommand.getCommandName()) ||
                            (baseCommand.getAliases() != null && Arrays.asList(baseCommand.getAliases()).contains(cmdName))
                    )
                    .findFirst();
            if (command.isPresent()){
                EmbedBuilder commandDescription = new EmbedBuilder();
                commandDescription.setTitle("コマンド詳細");
                commandDescription.addField(command.get().getCommandName(), command.get().getCommandDescription(), false);
                commandDescription.addField("Aliases", Arrays.toString(command.get().getAliases()), false);
                event.replyEmbeds(commandDescription.build()).queue();
            }else {
                EmbedBuilder error = new EmbedBuilder()
                        .setTitle("Error")
                        .setDescription("コマンドが見つかりませんでした。検索しようとしたコマンド: " + option.getAsString());
                event.replyEmbeds(error.build()).queue();
            }
        }

    }

    @Override
    public @Nullable String getUrl() {
        return null;
    }
}
