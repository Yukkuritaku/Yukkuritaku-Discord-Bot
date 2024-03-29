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
                        0.11: 司のスタンプ「ハッピーエンドにするぞ！」を追加。4コマの94話を追加。
                        0.12: えななんのスタンプ「逃げたくない...」と雫ちゃんのスタンプ「魔法みたいだわ！」を追加。4コマの95, 96, 97話を追加。
                        0.13: 初音ミク(25時、ナイトコードで。)のスタンプ「あ...」と司のスタンプ「待たせたな！」と一歌ちゃんのスタンプ「届いて...！」を追加。
                        4コマの98、99、100、101、102話を追加。
                        0.14: 遥ちゃんのスタンプ「よかった...！」と瑞希のスタンプ「ボクからも...お願い！」と彰人くんのスタンプ「よくわからねえな」と
                        杏ちゃんのスタンプ「あー！」とまふゆちゃんのスタンプ「...あったかいんだ」と寧々ちゃんのスタンプ「やるしかないの...！？」と
                        奏ちゃんのスタンプ「...楽しいな」を追加。
                        4コマの103、104、105、106、107、108、109、110、111、112、113、114話を追加。
                        0.15: url修正
                        0.16: 杏ちゃんのスタンプ「みんな、大好き！」と咲希ちゃんのスタンプ「まだー－できる！」と冬弥くんのスタンプ「手加減はしない」と
                        愛莉ちゃんのスタンプ「実力を見せてもらうわ」と瑞希のスタンプ「楽しいよ　すごく」と志歩ちゃんのスタンプ「最後まで全力で！」と
                        えななんのスタンプ「うっ...！」を追加。
                        4コマの114、115、116、117、118、119、120、121、122、123、124、125、126、127話を追加。
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
