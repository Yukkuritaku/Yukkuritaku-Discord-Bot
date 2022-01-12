package com.yukkuritaku.discordbot.commands.stamp.virtualsinger;

import com.yukkuritaku.discordbot.commands.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RinStampCommand extends StampCommand {

    private static final List<Pair<String, String>> RIN_STAMPS = List.of(
            //[キャラランクスタンプ]
            //めいっぱい楽しもう
            Pair.of("stamp0522", "[キャラランクスタンプ] めいっぱい楽しもう"),
            //早く歌いたーい！
            Pair.of("stamp0038", "[キャラランクスタンプ] 早く歌いたーい！"),

            //[通常スタンプ]
            //がんばろー！
            Pair.of("stamp0002", "[通常スタンプ] がんばろー！"),
            //よろしく！
            Pair.of("stamp0417", "[通常スタンプ] よろしく！"),
            //いいね！（レンと同じポーズ）
            Pair.of("stamp0252", "[通常スタンプ] いいね！（レンと同じポーズ）"),
            //えへへ
            Pair.of("stamp0251", "[通常スタンプ] えへへ"),
            //元気にいこー！
            Pair.of("stamp0250", "[通常スタンプ] 元気にいこー！"),
            //またねー！
            Pair.of("stamp0249", "[通常スタンプ] またねー！"),
            //ごめんなさ～い！
            Pair.of("stamp0248", "[通常スタンプ] ごめんなさ～い！"),
            //ありがとう！
            Pair.of("stamp0247", "[通常スタンプ] ありがとう！"),
            //よかったね！
            Pair.of("stamp0246", "[通常スタンプ] よかったね！"),
            //しくしく...
            Pair.of("stamp0245", "[通常スタンプ] しくしく..."),
            //イェーイ！
            Pair.of("stamp0244", "[通常スタンプ] イェーイ！"),
            //ええっ！？
            Pair.of("stamp0243", "[通常スタンプ] ええっ！？")
    );

    public RinStampCommand() {
        super(UnitType.VIRTUAL_SINGER,
                ColorUtils.RIN,
                "stamprin",
                "リンちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"rin", "りん", "りんちゃん", "リン", "リンちゃん", "鏡音リン", "鏡音リンちゃん",
                        //"りんちゃんなう！", "リンちゃんなう！", "りんちゃんなう", "リンちゃんなう"
                },
                RIN_STAMPS);
    }
}
