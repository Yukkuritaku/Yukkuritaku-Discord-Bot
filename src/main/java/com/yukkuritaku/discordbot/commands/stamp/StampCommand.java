package com.yukkuritaku.discordbot.commands.stamp;

import com.yukkuritaku.discordbot.DiscordBot;
import com.yukkuritaku.discordbot.commands.BaseCommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.internal.utils.tuple.Pair;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public abstract class StampCommand extends BaseCommand {

    private final UnitType unitType;

    public StampCommand(@NotNull UnitType unitType,
                        @NotNull Color color,
                        @NotNull String commandName,
                        @NotNull String commandDescription,
                        @NotNull String[] aliases,
                        @NotNull List<Pair<String, String>> stampPrefix) {
        super(color, commandName, commandDescription, aliases, stampPrefix);
        this.unitType = unitType;
    }

    /**
     * このスタンプコマンドがどのユニットに属しているかを返します。
     *
     * @return どのユニットに属しているか
     */
    public final UnitType getUnitType() {
        return unitType;
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Message message = event.getMessage();
        MessageChannel channel = event.getChannel();
        String contentRaw = message.getContentRaw();
        //複数の空白行を取得
        String[] splitRaw = contentRaw.split("\\s+");
        List<Pair<String, String>> stampType = getReturnPrefix();
        if (splitRaw[0].equalsIgnoreCase(DiscordBot.PREFIX + getCommandName()) ||
                Arrays.stream(this.getAliases()).anyMatch(s -> splitRaw[0].equalsIgnoreCase(DiscordBot.PREFIX + s))) {
            if (splitRaw.length == 1) {
                int randomStamp = RANDOM.nextInt(stampType.size());
                String id = stampType.get(randomStamp).getLeft();
                String replacedId = id.replace("stamp", "");
                String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp" +
                        replacedId + "_rip/stamp" + replacedId + "/stamp" + replacedId + ".png";
                EmbedBuilder builder = new EmbedBuilder();
                builder.setImage(url);
                builder.setColor(this.getColor());
                channel.sendMessageEmbeds(builder.build()).queue();
            }
        }
    }

    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {
        if (!event.getName().equals(this.getCommandName())) {
            return;
        }
        var optionMapping = event.getOption("prefix");
        if (optionMapping != null) {
            String id = optionMapping.getAsString();
            String replacedId = id.replace("stamp", "");
            String url = String.format(getUrl(), replacedId, replacedId, replacedId);
            checkUrl(event, url);
            EmbedBuilder builder = new EmbedBuilder();
            builder.setImage(url);
            builder.setColor(this.getColor());
            event.replyEmbeds(builder.build()).queue();
        } else {
            List<Pair<String, String>> stampType = getReturnPrefix();
            int randomStamp = RANDOM.nextInt(stampType.size());
            String id = stampType.get(randomStamp).getLeft();
            String replacedId = id.replace("stamp", "");
            String url = String.format(getUrl(), replacedId, replacedId, replacedId);
            EmbedBuilder builder = new EmbedBuilder();
            builder.setImage(url);
            builder.setColor(this.getColor());
            event.replyEmbeds(builder.build()).queue();
        }
    }

    @NotNull
    @Override
    public String getUrl() {
        String format = "%s";
        return "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp" + format + "_rip/stamp" + format + "/stamp" + format + ".png";
    }
}
