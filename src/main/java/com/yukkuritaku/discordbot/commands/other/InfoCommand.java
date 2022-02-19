package com.yukkuritaku.discordbot.commands.other;

import com.yukkuritaku.discordbot.DiscordBot;
import com.yukkuritaku.discordbot.commands.BaseCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;

public final class InfoCommand extends BaseCommand {

    private static final EmbedBuilder DESCRIPTION = new EmbedBuilder()
            .setTitle("このBotの詳細、バージョン")
            .addField("詳細", "昔作っていたプロセカのお遊びボットを最新JDAに移植したものです。", false)
            .addField("Version", "このBotのバージョン: "
                            + DiscordBot.VERSION + "、JDAのバージョン: " + DiscordBot.JDA_VERSION,
                    false)
            .addField("Changelog", """
                        0.10: 志歩ちゃんのスタンプ「頼りにしてるよ」を追加。
                        """, false);

    public InfoCommand() {
        super(new Color(ColorUtils.rainbow(System.currentTimeMillis(), 10, 0, 1)),
                "info", "このBotの詳細を確認します。", new String[]{"i"}, List.of());
    }

    @Override
    protected void onMessageCommandReceived(@NotNull MessageReceivedEvent event) {
        event.getChannel().sendMessageEmbeds(DESCRIPTION.build()).queue();
    }

    @Override
    protected void onSlashCommandReceived(@NotNull SlashCommandInteractionEvent event) {
        event.replyEmbeds(DESCRIPTION.build()).addActionRow(Button.link("https://github.com/Yukkuritaku/Yukkuritaku-Discord-Bot",
                "このボットのソースコード")).queue();
    }

    @Override
    public @Nullable String getUrl() {
        return null;
    }
}
