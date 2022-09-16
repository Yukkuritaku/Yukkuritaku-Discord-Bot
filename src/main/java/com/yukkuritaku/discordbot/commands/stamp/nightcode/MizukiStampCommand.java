package com.yukkuritaku.discordbot.commands.stamp.nightcode;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class MizukiStampCommand extends StampCommand {

    private static final List<Pair<String, String>> MIZUKI_STAMPS = List.of(
            //[キャラランクスタンプ]
            //今を楽しもう♪
            Pair.of("stamp0520", "[キャラランクスタンプ] 今を楽しもう♪"),
            //ボクはずっとボクだよ
            Pair.of("stamp0031", "[キャラランクスタンプ] ボクはずっとボクだよ"),

            //[イベントスタンプ]
            //おかしいな...
            Pair.of("stamp0492", "[イベントスタンプ] おかしいな..."),
            //...あーあ
            Pair.of("stamp0444", "[イベントスタンプ] ...あーあ"),
            //ボクからも...お願い！
            //瑞希かわいいね
            Pair.of("stamp0542", "[イベントスタンプ] ボクからも...お願い！"),

            //楽しいよ　すごく
            Pair.of("stamp0552", "[イベントスタンプ] 楽しいよ　すごく"),

            //[通常スタンプ]
            //ちょっとー！(ちょっとー！（ぷんぷん）)
            Pair.of("stamp0231", "[通常スタンプ] ちょっとー！(ちょっとー！（ぷんぷん）)"),
            //かわいいでしょ？
            Pair.of("stamp0230", "[通常スタンプ] かわいいでしょ？"),
            //じゃあね～♪
            Pair.of("stamp0229", "[通常スタンプ] じゃあね～♪"),
            //ごめんね！
            Pair.of("stamp0228", "[通常スタンプ] ごめんね！"),
            //楽しかったね
            Pair.of("stamp0227", "[通常スタンプ] 楽しかったね"),
            //いいね！
            Pair.of("stamp0226", "[通常スタンプ] いいね！"),
            //そんな...
            Pair.of("stamp0225", "[通常スタンプ] そんな..."),
            //ふふっ
            Pair.of("stamp0224", "[通常スタンプ] ふふっ"),
            //へー！
            Pair.of("stamp0223", "[通常スタンプ] へー！"),
            //いけるよね？
            Pair.of("stamp0222", "[通常スタンプ] いけるよね？"),
            //よろしく～
            Pair.of("stamp0221", "[通常スタンプ] よろしく～")
    );

    public MizukiStampCommand() {
        super(UnitType.NIGHTCODE_AT_25_00,
                ColorUtils.MIZUKI,
                "stampmizuki",
                "瑞希のスタンプからどれかが選ばれるか選択するよ",
                new String[] {"mizuki", "mzk", "みずき", "みずきちゃん", "みずきくん", "瑞希", "瑞希ちゃん", "瑞希くん", "暁山瑞希", "amia"},
                MIZUKI_STAMPS);
    }
}
