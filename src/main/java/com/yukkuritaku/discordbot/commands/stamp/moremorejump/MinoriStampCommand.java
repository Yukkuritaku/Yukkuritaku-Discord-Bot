package com.yukkuritaku.discordbot.commands.stamp.moremorejump;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class MinoriStampCommand extends StampCommand {

    private static final List<Pair<String, String>> MINORI_STAMPS = List.of(
            //[キャラランクスタンプ]
            //同じ空気吸ってる！
            Pair.of("stamp0505", "[キャラランクスタンプ] 同じ空気吸ってる！"),
            //もっともっともーっと！
            Pair.of("stamp0016", "[キャラランクスタンプ] もっともっともーっと！"),

            //[イベントスタンプ]
            //みんなでやろう！
            Pair.of("stamp0496", "[イベントスタンプ] みんなでやろう！"),
            //歌おうと思いましゅ！
            Pair.of("stamp0461", "[イベントスタンプ] 歌おうと思いましゅ！"),
            //初めて見た...！
            Pair.of("stamp0433", "[イベントスタンプ] 初めて見た...！"),

            //[通常スタンプ]
            //もう1回！
            Pair.of("stamp0011", "[通常スタンプ] もう1回！"),
            //届けたいな(希望を届けたいな！)
            Pair.of("stamp0097", "[通常スタンプ] 届けたいな(希望を届けたいな！)"),
            //もっともっとがんばるよ！
            Pair.of("stamp0096", "[通常スタンプ] もっともっとがんばるよ！"),
            //またね！
            Pair.of("stamp0095", "[通常スタンプ] またね！"),
            //ごめんなさい
            Pair.of("stamp0094", "[通常スタンプ] ごめんなさい"),
            //ありがとう(ありがとうございます！)
            Pair.of("stamp0093", "[通常スタンプ] ありがとう(ありがとうございます！)"),
            //さすが！
            Pair.of("stamp0092", "[通常スタンプ] さすが！"),
            //えーん
            Pair.of("stamp0091", "[通常スタンプ] えーん"),
            //えへへ
            Pair.of("stamp0090", "[通常スタンプ] えへへ"),
            //はっ！
            Pair.of("stamp0089", "[通常スタンプ] はっ！"),
            //がんばろう！
            Pair.of("stamp0088", "[通常スタンプ] がんばろう！"),
            //よろしくね(よろしくお願いします！)
            Pair.of("stamp0087", "[通常スタンプ] よろしくね(よろしくお願いします！)")
    );

    public MinoriStampCommand() {
        super(UnitType.MORE_MORE_JUMP,
                ColorUtils.MINORI,
                "stampminori",
                "みのりちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[]{"minori", "mnr", "みのりちゃん", "みのり", "花里みのり", "花里みのりちゃん"},
                MINORI_STAMPS);
    }
}
