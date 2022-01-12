package com.yukkuritaku.discordbot.commands.stamp.wonderlands;

import com.yukkuritaku.discordbot.commands.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class RuiStampCommand extends StampCommand {

    private static final List<Pair<String, String>> RUI_STAMPS = List.of(
            //[キャラランクスタンプ]
            //悪くないね
            Pair.of("stamp0516", "[キャラランクスタンプ] 悪くないね"),

            //素晴らしい
            Pair.of("stamp0027", "[キャラランクスタンプ] 素晴らしい"),

            //[イベントスタンプ]
            //楽しみだなぁ
            Pair.of("stamp0491", "[イベントスタンプ] 楽しみだなぁ"),
            //いいねえ！
            Pair.of("stamp0449", "[イベントスタンプ] いいねえ！"),
            //派手にいこう！
            Pair.of("stamp0423", "[イベントスタンプ] 派手にいこう！"),

            //[通常スタンプ]
            //共にいこう！（共にいこうじゃないか！）
            Pair.of("stamp0414", "[通常スタンプ] 共にいこう！（共にいこうじゃないか！）"),
            //じゃあね！（星3類くんの顔）
            Pair.of("stamp0189", "[通常スタンプ] じゃあね！（星3類くんの顔）"),
            //ショウタイムだ（では、ショウタイムだ）
            Pair.of("stamp0188", "[通常スタンプ] ショウタイムだ（では、ショウタイムだ）"),
            //またお会いしよう！
            Pair.of("stamp0187", "[通常スタンプ] またお会いしよう！"),
            //悪かったね
            Pair.of("stamp0186", "[通常スタンプ] 悪かったね"),
            //ありがとう
            Pair.of("stamp0185", "[通常スタンプ] ありがとう"),
            //素晴らしいね！
            Pair.of("stamp0184", "[通常スタンプ] 素晴らしいね！"),
            //ふーん...
            Pair.of("stamp0183", "[通常スタンプ] ふーん..."),
            //フフフ
            Pair.of("stamp0182", "[通常スタンプ] フフフ"),
            //おや？
            Pair.of("stamp0181", "[通常スタンプ] おや？"),
            //よろしく
            Pair.of("stamp0180", "[通常スタンプ] よろしく")
    );

    public RuiStampCommand() {
        super(UnitType.WONDER_LANDS_SHOWTIME,
                ColorUtils.RUI,
                "stamprui",
                "類のスタンプからどれかが選ばれるか選択するよ",
                new String[]{"rui", "るいくん", "るい", "類", "類くん", "神代類", "神代類くん", "ひとりぼっちの錬金術師"},
                RUI_STAMPS);
    }
}
