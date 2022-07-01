package com.yukkuritaku.discordbot.commands.stamp.vividbadsquad;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class AnStampCommand extends StampCommand {

    private static final List<Pair<String, String>> AN_STAMPS = List.of(
            //[キャラランクスタンプ]
            //最高のイベントを作ろう
            Pair.of("stamp0510", "[キャラランクスタンプ] 最高のイベントを作ろう"),
            //最高の相棒だよ！
            Pair.of("stamp0021", "[キャラランクスタンプ] 最高の相棒だよ！"),

            //[イベントスタンプ]
            //やるしかない！
            Pair.of("stamp0490", "[イベントスタンプ] やるしかない！"),
            //信じるよ！
            Pair.of("stamp0425", "[イベントスタンプ] 信じるよ！"),
            //あー！
            Pair.of("stamp0544", "[イベントスタンプ] あー！"),

            //[通常スタンプ]
            //へー（じっと目）
            Pair.of("stamp0411", "[通常スタンプ] へー（じっと目）"),
            //たよっていいからね
            Pair.of("stamp0410", "[通常スタンプ] たよっていいからね"),
            //じゃあね！
            Pair.of("stamp0409", "[通常スタンプ] じゃあね！"),
            //ごめん！
            Pair.of("stamp0408", "[通常スタンプ] ごめん！"),
            //ありがとう！
            Pair.of("stamp0407", "[通常スタンプ] ありがとう！"),
            //いいね！
            Pair.of("stamp0406", "[通常スタンプ] いいね！"),
            //そんな...！
            Pair.of("stamp0405", "[通常スタンプ] そんな...！"),
            //いいじゃん！
            Pair.of("stamp0404", "[通常スタンプ] いいじゃん！"),
            //わっ！？
            Pair.of("stamp0403", "[通常スタンプ] わっ！？"),
            //いっしょにがんばろうね！
            Pair.of("stamp0402", "[通常スタンプ] いっしょにがんばろうね！"),
            //やっほー！
            Pair.of("stamp0126", "[通常スタンプ] やっほー！")

    );

    public AnStampCommand() {
        super(UnitType.VIVID_BAD_SQUAD,
                ColorUtils.AN,
                "stampan",
                "杏ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[]{"an", "あん", "あんちゃん", "杏", "杏ちゃん", "白石杏", "白石杏ちゃん"},
                AN_STAMPS);
    }
}
