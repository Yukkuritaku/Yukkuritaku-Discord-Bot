package com.yukkuritaku.discordbot.commands.stamp.leoneed;

import com.yukkuritaku.discordbot.commands.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public class IchikaStampCommand extends StampCommand {

    private static final List<Pair<String, String>> ICHIKA_STAMPS = List.of(
            //[キャラランクスタンプ]
            //大好きな友達だよ
            Pair.of("stamp0501", "[キャラランクスタンプ] 大好きな友達だよ"),
            //ずっと一緒にいようね
            Pair.of("stamp0012", "[キャラランクスタンプ] ずっと一緒にいようね"),

            //[イベントスタンプ]
            //照れるな
            Pair.of("stamp0495", "[イベントスタンプ] 照れるな"),
            //最後までいこう！
            Pair.of("stamp0459", "[イベントスタンプ] 最後までいこう！"),
            //もっと歌っていたいな
            Pair.of("stamp0443", "[イベントスタンプ] もっと歌っていたいな"),

            //[通常スタンプ]
            //ありがとう
            Pair.of("stamp0008", "[通常スタンプ] ありがとう"),
            //じゃあ、いこうか
            Pair.of("stamp0382", "[通常スタンプ] じゃあ、いこうか"),
            //一緒にできてよかった
            Pair.of("stamp0381", "[通常スタンプ] 一緒にできてよかった"),
            //みんなすごいね
            Pair.of("stamp0056", "[通常スタンプ] みんなすごいね"),
            //また今度
            Pair.of("stamp0055", "[通常スタンプ] また今度"),
            //ごめん...
            Pair.of("stamp0054", "[通常スタンプ] ごめん..."),
            //いい歌だったよ
            Pair.of("stamp0053", "[通常スタンプ] いい歌だったよ"),
            //はぁ...
            Pair.of("stamp0052", "[通常スタンプ] はぁ..."),
            //ふふ
            Pair.of("stamp0051", "[通常スタンプ] ふふ"),
            //びっくりした...
            Pair.of("stamp0050", "[通常スタンプ] びっくりした..."),
            //一緒にがんばろう
            Pair.of("stamp0049", "[通常スタンプ] 一緒にがんばろう"),
            //よろしく
            Pair.of("stamp0048", "[通常スタンプ] よろしく")
    );

    public IchikaStampCommand() {
        super(UnitType.LEO_NEED,
                ColorUtils.ICHIKA,
                "stampichika",
                "一歌ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"ichika", "いちか", "いちかちゃん", "一歌", "一歌ちゃん", "星乃一歌", "星乃一歌ちゃん", "いっちゃん"},
                ICHIKA_STAMPS);
    }
}
