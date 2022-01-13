package com.yukkuritaku.discordbot.commands.stamp.nightcode;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class MafuyuStampCommand extends StampCommand {

    private static final List<Pair<String, String>> MAFUYU_STAMPS = List.of(

            //[キャラランクスタンプ]
            //見つけてくれてありがとう
            Pair.of("stamp0518", "[キャラランクスタンプ] 見つけてくれてありがとう"),
            //いい子、ね...
            Pair.of("stamp0029", "[キャラランクスタンプ] いい子、ね..."),

            //[イベントスタンプ]
            //う...
            Pair.of("stamp0460", "[イベントスタンプ] う..."),
            //よくわからない
            Pair.of("stamp0422", "[イベントスタンプ] よくわからない"),

            //[通常スタンプ]
            //ひとりになりたい...(裏の表情、虚無の顔)
            Pair.of("stamp0416", "[通常スタンプ] ひとりになりたい...(裏の表情、虚無の顔)"),
            //...(裏の表情、虚無の顔)
            Pair.of("stamp0415", "[通常スタンプ] ...(裏の表情、虚無の顔)"),
            //またね！
            Pair.of("stamp0209", "[通常スタンプ] またね！"),
            //ごめんなさい
            Pair.of("stamp0208", "[通常スタンプ] ごめんなさい"),
            //ありがとう
            Pair.of("stamp0207", "[通常スタンプ] ありがとう"),
            //よかったね！
            Pair.of("stamp0206", "[通常スタンプ] よかったね！"),
            //あ...
            Pair.of("stamp0205", "[通常スタンプ] あ..."),
            //うれしいな
            Pair.of("stamp0204", "[通常スタンプ] うれしいな"),
            //きゃっ！
            Pair.of("stamp0203", "[通常スタンプ] きゃっ！"),
            //いっしょにがんばろうね！
            Pair.of("stamp0202", "[通常スタンプ] いっしょにがんばろうね！"),
            //よろしくね
            Pair.of("stamp0201", "[通常スタンプ] よろしくね")
    );

    public MafuyuStampCommand() {
        super(UnitType.NIGHTCODE_AT_25_00,
                ColorUtils.MAFUYU,
                "stampmafuyu",
                "まふゆちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"mahuyu", "mhy", "mafuyu", "mfy", "まふゆちゃん", "まふゆ", "よくわからない", "yokuwakaranai", "朝比奈まふゆ", "朝比奈まふゆちゃん", "雪"},
                MAFUYU_STAMPS);
    }
}
