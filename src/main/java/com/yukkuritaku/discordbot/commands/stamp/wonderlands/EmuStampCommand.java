package com.yukkuritaku.discordbot.commands.stamp.wonderlands;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class EmuStampCommand extends StampCommand {

    private static final List<Pair<String, String>> EMU_STAMPS = List.of(
            //[キャラランクスタンプ]
            //み～んな笑顔だねっ
            Pair.of("stamp0514", "[キャラランクスタンプ] み～んな笑顔だねっ"),
            //約束、してくれたよね
            Pair.of("stamp0025", "[キャラランクスタンプ] 約束、してくれたよね"),

            //[イベントスタンプ]
            //ジャジャーン！
            //NOTE: 愛莉ちゃんのバレンタインイベント
            Pair.of("stamp0527", "[イベントスタンプ] ジャジャーン！"),
            //勉強するぞ～！
            Pair.of("stamp0499", "[イベントスタンプ] 勉強するぞ～！"),
            //ポカポカするよ！
            Pair.of("stamp0431", "[イベントスタンプ] ポカポカするよ！"),

            //[通常スタンプ]
            //わんだほーい！
            Pair.of("stamp0168", "[通常スタンプ] わんだほーい！"),
            //わーいわーい！
            Pair.of("stamp0167", "[通常スタンプ] わーいわーい！"),
            //またねっ☆
            Pair.of("stamp0166", "[通常スタンプ] またねっ☆"),
            //ごめんなさい！
            Pair.of("stamp0165", "[通常スタンプ] ごめんなさい！"),
            //楽しかったね！
            Pair.of("stamp0164", "[通常スタンプ] 楽しかったね！"),
            //えらいえらい！
            Pair.of("stamp0163", "[通常スタンプ] えらいえらい！"),
            //困ったな～
            Pair.of("stamp0162", "[通常スタンプ] 困ったな～"),
            //わっはっはー！
            Pair.of("stamp0161", "[通常スタンプ] わっはっはー！"),
            //ええーっ！？
            Pair.of("stamp0160", "[通常スタンプ] ええーっ！？"),
            //えいえいおー！
            Pair.of("stamp0159", "[通常スタンプ] えいえいおー！"),
            //よろしくねっ☆
            Pair.of("stamp0158", "[通常スタンプ] よろしくねっ☆")
    );

    public EmuStampCommand() {
        super(UnitType.WONDER_LANDS_SHOWTIME,
                ColorUtils.EMU,
                "stampemu",
                "えむちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"emu", "えむ", "えむちゃん", "鳳えむ", "鳳えむちゃん", "わんだほーい！", "魔王様のお世話係えむむ", "ぷぎゅ", "wandahoi"},
                EMU_STAMPS);
    }
}
