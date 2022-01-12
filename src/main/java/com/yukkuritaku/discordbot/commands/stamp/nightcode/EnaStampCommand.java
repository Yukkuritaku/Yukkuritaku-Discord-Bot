package com.yukkuritaku.discordbot.commands.stamp.nightcode;

import com.yukkuritaku.discordbot.commands.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class EnaStampCommand extends StampCommand {

    private static final List<Pair<String, String>> ENA_STAMPS = List.of(
            //[キャラランクスタンプ]
            //馬鹿にしやがって
            Pair.of("stamp0519", "[キャラランクスタンプ] 馬鹿にしやがって"),
            //いいねついてる♪
            Pair.of("stamp0030", "[キャラランクスタンプ] いいねついてる♪"),

            //[イベントスタンプ]
            //やるじゃん
            Pair.of("stamp0454", "[イベントスタンプ] やるじゃん"),
            //まだ諦めたくない
            Pair.of("stamp0430", "[イベントスタンプ] まだ諦めたくない"),

            //[通常スタンプ]
            //(自撮り)
            Pair.of("stamp0220", "[通常スタンプ] (自撮り)"),
            //ねむい...
            Pair.of("stamp0219", "[通常スタンプ] ねむい..."),
            //またね～
            Pair.of("stamp0218", "[通常スタンプ] またね～"),
            //...ごめんってば
            Pair.of("stamp0217", "[通常スタンプ] ...ごめんってば"),
            //ありがとう！
            Pair.of("stamp0216", "[通常スタンプ] ありがとう！"),
            //よかったね♪
            Pair.of("stamp0215", "[通常スタンプ] よかったね♪"),
            //うん...
            Pair.of("stamp0214", "[通常スタンプ] うん..."),
            //えへへ
            Pair.of("stamp0213", "[通常スタンプ] えへへ"),
            //きゃっ！
            Pair.of("stamp0212", "[通常スタンプ] きゃっ！"),
            //ほどほどにがんばろ？
            Pair.of("stamp0211", "[通常スタンプ] ほどほどにがんばろ？"),
            //よろしく♪
            Pair.of("stamp0210", "[通常スタンプ] よろしく♪")
    );

    public EnaStampCommand() {
        super(UnitType.NIGHTCODE_AT_25_00,
                ColorUtils.ENA,
                "stampena",
                "えななん(東雲絵名)のスタンプからどれかが選ばれるか選択するよ",
                new String[]{"stampenanan", "enanan", "ena", "えな", "えなちゃん", "えななん", "東雲絵名", "東雲絵名ちゃん"},
                ENA_STAMPS
        );
    }
}
