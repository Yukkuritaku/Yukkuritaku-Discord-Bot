package com.yukkuritaku.discordbot.commands.stamp;

import com.yukkuritaku.discordbot.commands.BaseCommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.internal.utils.tuple.Pair;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
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
    protected void onMessageCommandReceived(@NotNull MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        List<Pair<String, String>> stampType = getReturnPrefix();
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

    @Override
    protected void onSlashCommandReceived(@NotNull SlashCommandInteractionEvent event) {
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
