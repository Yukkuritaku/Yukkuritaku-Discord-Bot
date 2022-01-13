package com.yukkuritaku.discordbot.commands.stamp.vividbadsquad;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public class ToyaStampCommand extends StampCommand {

    private static final List<Pair<String, String>> TOYA_STAMPS = List.of(
            //[キャラランクスタンプ]
            //照れるな
            Pair.of("stamp0512", "[キャラランクスタンプ] 照れるな"),
            //歌うのが好きだ
            Pair.of("stamp0023", "[キャラランクスタンプ] 歌うのが好きだ"),

            //[イベントスタンプ]
            //いい経験になった
            Pair.of("stamp0497", "[イベントスタンプ] いい経験になった"),
            //俺は俺の道を進む
            Pair.of("stamp0429", "[イベントスタンプ] 俺は俺の道を進む"),

            //[通常スタンプ]
            //一緒に歌うか？
            Pair.of("stamp0148", "[通常スタンプ] 一緒に歌うか？"),
            //やりすぎだ
            Pair.of("stamp0147", "[通常スタンプ] やりすぎだ"),
            //...じゃあ
            Pair.of("stamp0146", "[通常スタンプ] ...じゃあ"),
            //悪かった
            Pair.of("stamp0145", "[通常スタンプ] 悪かった"),
            //ありがとう
            Pair.of("stamp0144", "[通常スタンプ] ありがとう"),
            //いいと思う
            Pair.of("stamp0143", "[通常スタンプ] いいと思う"),
            //......
            Pair.of("stamp0142", "[通常スタンプ] ......"),
            //...よかった
            Pair.of("stamp0141", "[通常スタンプ] ...よかった"),
            //...っ！
            Pair.of("stamp0140", "[通常スタンプ] ...っ！"),
            //うまくいくといいな
            Pair.of("stamp0139", "[通常スタンプ] うまくいくといいな"),
            //どうも
            Pair.of("stamp0138", "[通常スタンプ] どうも")
    );

    public ToyaStampCommand() {
        super(UnitType.VIVID_BAD_SQUAD,
                ColorUtils.TOYA,
                "stamptoya",
                "冬弥のスタンプからどれかが選ばれるか選択するよ",
                //とーやととーやくんは咲希ちゃんが使ってたセリフにあったはずなので入れています、無かったら消します...
                new String[] {"toya", "とうや", "とうやくん", "とーや", "とーやくん", "冬弥", "冬弥くん", "青柳冬弥", "青柳冬弥くん"},
                TOYA_STAMPS);
    }
}
