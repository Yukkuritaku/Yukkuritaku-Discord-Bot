package com.yukkuritaku.discordbot.commands.stamp.leoneed;

import com.yukkuritaku.discordbot.commands.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public class ShihoStampCommand extends StampCommand {

    private static final List<Pair<String, String>> SHIHO_STAMPS = List.of(
            //[キャラランクスタンプ]
            //今回だけだよ
            Pair.of("stamp0504", "[キャラランクスタンプ] 今回だけだよ"),
            //うん、上達してる
            Pair.of("stamp0015", "[キャラランクスタンプ] うん、上達してる"),

            //[イベントスタンプ]
            //たくさんもらったよ
            Pair.of("stamp0458", "[イベントスタンプ] たくさんもらったよ"),
            //後悔しても知らないよ
            Pair.of("stamp0445", "[イベントスタンプ] 後悔しても知らないよ"),

            //[通常スタンプ]
            //余裕でしょ
            Pair.of("stamp0086", "[通常スタンプ] 余裕でしょ"),
            //なにがしたいの（ジト目）
            Pair.of("stamp0085", "[通常スタンプ] なにがしたいの（ジト目）"),
            //じゃ
            Pair.of("stamp0084", "[通常スタンプ] じゃ"),
            //ごめん
            Pair.of("stamp0083", "[通常スタンプ] ごめん"),
            //ありがと
            Pair.of("stamp0082", "[通常スタンプ] ありがと"),
            //いい音だったよ(奏ちゃんと同じだから奏ちゃんとの絡みも来る！？だとしたら楽しみ過ぎる)
            Pair.of("stamp0081", "[通常スタンプ] いい音だったよ"),
            //はぁ...
            Pair.of("stamp0080", "[通常スタンプ] はぁ..."),
            //いい感じ
            Pair.of("stamp0079", "[通常スタンプ] いい感じ"),
            //...っ！
            Pair.of("stamp0078", "[通常スタンプ] ...っ！"),
            //がんばろう
            Pair.of("stamp0077", "[通常スタンプ] がんばろう"),
            //どうも
            Pair.of("stamp0076", "[通常スタンプ] どうも")
    );

    public ShihoStampCommand() {
        super(UnitType.LEO_NEED,
                ColorUtils.SHIHO,
                "stampshiho",
                "志歩ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"shiho", "しほ", "しほちゃん", "志歩", "志歩ちゃん", "日野森志歩", "日野森志歩ちゃん", "しぃちゃん"},
                SHIHO_STAMPS);
    }
}
