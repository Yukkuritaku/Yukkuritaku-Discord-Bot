package com.yukkuritaku.discordbot.commands.stamp.moremorejump;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class HarukaStampCommand extends StampCommand {

    private static final List<Pair<String, String>> HARUKA_STAMPS = List.of(
            //[キャラランクスタンプ]
            //みんなで乗り越えよう！
            Pair.of("stamp0506", "[キャラランクスタンプ] みんなで乗り越えよう！"),

            //希望をみんなに！
            Pair.of("stamp0017", "[キャラランクスタンプ] 希望をみんなに！"),

            //[イベントスタンプ]
            //全力でやろう！
            Pair.of("stamp0498", "[イベントスタンプ] 全力でやろう！"),
            //いただきます
            Pair.of("stamp0448", "[イベントスタンプ] いただきます"),
            //よかった...！
            Pair.of("stamp0541", "[イベントスタンプ] よかった...！"),

            //[通常スタンプ]
            //練習しないと
            Pair.of("stamp0387", "[通常スタンプ] 練習しないと(しっかり練習しないと)"),
            //かわいい...！
            Pair.of("stamp0386", "[通常スタンプ] かわいい...！"),
            //さようなら
            Pair.of("stamp0106", "[通常スタンプ] さようなら"),
            //すみません...
            Pair.of("stamp0105", "[通常スタンプ] すみません..."),
            //ありがとう
            Pair.of("stamp0104", "[通常スタンプ] ありがとう"),
            //よくできたね(よくできたわね)
            Pair.of("stamp0103", "[通常スタンプ] よくできたね(よくできたわね)"),
            //そう...
            Pair.of("stamp0102", "[通常スタンプ] そう..."),
            //ふふ
            Pair.of("stamp0101", "[通常スタンプ] ふふ"),
            //驚いた(驚いたわ)
            Pair.of("stamp0100", "[通常スタンプ] 驚いた(驚いたわ)"),
            //頑張りましょう
            Pair.of("stamp0099", "[通常スタンプ] 頑張りましょう"),
            //よろしく(よろしくお願いします)
            Pair.of("stamp0098", "[通常スタンプ] よろしく(よろしくお願いします)")
    );


    public HarukaStampCommand() {
        super(UnitType.MORE_MORE_JUMP,
                ColorUtils.HARUKA,
                "stampharuka",
                "遥ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[]{"haruka", "hrk", "はるか", "はるかちゃん", "遥ちゃん", "遥", "桐谷遥", "桐谷遥ちゃん"},
                HARUKA_STAMPS
        );
    }
}
