package com.yukkuritaku.discordbot.commands.stamp.virtualsinger;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class KAITOStampCommand extends StampCommand {

    private static final List<Pair<String, String>> KAITO_STAMPS = List.of(
            //[キャラランクスタンプ]
            //もっと盛り上がろう！
            Pair.of("stamp0526", "[キャラランクスタンプ] もっと盛り上がろう！"),
            //楽しんでくれてる？
            Pair.of("stamp0044", "[キャラランクスタンプ] 楽しんでくれてる？"),

            //[通常スタンプ]
            //うぅ...
            Pair.of("stamp0005", "[通常スタンプ] うぅ..."),
            //大丈夫だよ（イケメン顔）
            Pair.of("stamp0285", "[通常スタンプ] 大丈夫だよ（イケメン顔）"),
            //楽しかったよ
            Pair.of("stamp0284", "[通常スタンプ] 楽しかったよ"),
            //そんな...(あわわ顔)
            Pair.of("stamp0283", "[通常スタンプ] そんな...(あわわ顔)"),
            //またね
            Pair.of("stamp0282", "[通常スタンプ] またね"),
            //ごめん！
            Pair.of("stamp0281", "[通常スタンプ] ごめん！"),
            //ありがとう
            Pair.of("stamp0280", "[通常スタンプ] ありがとう"),
            //いいね！
            Pair.of("stamp0279", "[通常スタンプ] いいね！"),
            //ははっ！
            Pair.of("stamp0278", "[通常スタンプ] ははっ！"),
            //わあっ！
            Pair.of("stamp0277", "[通常スタンプ] わあっ！"),
            //がんばろう！
            Pair.of("stamp0276", "[通常スタンプ] がんばろう！"),
            //よろしく
            Pair.of("stamp0275", "[通常スタンプ] よろしく")
    );

    public KAITOStampCommand() {
        super(UnitType.VIRTUAL_SINGER,
                ColorUtils.KAITO,
                "stampkaito",
                "KAITOのスタンプからどれかが選ばれるよ",
                new String[]{"kaito", "かいと", "かいとくん", "カイト", "カイトくん"},
                KAITO_STAMPS);
    }
}
