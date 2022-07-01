package com.yukkuritaku.discordbot.commands.stamp.nightcode;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class KanadeStampCommand extends StampCommand {

    private static final List<Pair<String, String>> KANADE_STAMPS = List.of(
            //[キャラランクスタンプ]
            //25時、ナイトコードで。
            Pair.of("stamp0517", "[キャラランクスタンプ] 25時、ナイトコードで。"),
            //わたしが作らなくちゃ...
            Pair.of("stamp0028", "[キャラランクスタンプ] わたしが作らなくちゃ..."),

            //[イベントスタンプ]
            //やらなくちゃ
            Pair.of("stamp0500", "[イベントスタンプ] やらなくちゃ"),
            //こういうことなんだね
            Pair.of("stamp0451", "[イベントスタンプ] こういうことなんだね"),
            //...楽しいな
            Pair.of("stamp0547", "[イベントスタンプ] ...楽しいな"),

            //[通常スタンプ]
            //もう少し...
            Pair.of("stamp0200", "[通常スタンプ] もう少し..."),
            //...(カップ麺)
            Pair.of("stamp0199", "[通常スタンプ] ...(カップ麺)"),
            //曲、作らないと...
            Pair.of("stamp0198", "[通常スタンプ] 曲、作らないと..."),
            //...ごめん
            Pair.of("stamp0197", "[通常スタンプ] ...ごめん"),
            //ありがとう
            Pair.of("stamp0196", "[通常スタンプ] ありがとう"),
            //いい音だったよ
            Pair.of("stamp0195", "[通常スタンプ] いい音だったよ"),
            //...そう
            Pair.of("stamp0194", "[通常スタンプ] ...そう"),
            //...いいね
            Pair.of("stamp0193", "[通常スタンプ] ...いいね"),
            //...え
            Pair.of("stamp0192", "[通常スタンプ] ...え"),
            //がんばって
            Pair.of("stamp0191", "[通常スタンプ] がんばって"),
            //...よろしく
            Pair.of("stamp0190", "[通常スタンプ] ...よろしく"),
            //じゃ...
            Pair.of("stamp0010", "[通常スタンプ] じゃ...")
    );

    public KanadeStampCommand() {
        super(UnitType.NIGHTCODE_AT_25_00,
                ColorUtils.KANADE,
                "stampkanade",
                "奏ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[]{"kanade", "knd", "かなで", "かなでちゃん", "奏ちゃん", "奏", "宵崎奏", "宵崎奏ちゃん", "K"},
                KANADE_STAMPS);
    }


}
