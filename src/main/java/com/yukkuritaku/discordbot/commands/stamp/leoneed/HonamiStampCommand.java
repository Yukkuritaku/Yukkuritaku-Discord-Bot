package com.yukkuritaku.discordbot.commands.stamp.leoneed;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public class HonamiStampCommand extends StampCommand {

    private static final List<Pair<String, String>> HONAMI_STAMPS = List.of(
            //[キャラランクスタンプ]
            //あらためてよろしくね
            Pair.of("stamp0503", "[キャラランクスタンプ] あらためてよろしくね"),
            //ごめん...行くね
            Pair.of("stamp0014", "[キャラランクスタンプ] ごめん...行くね"),

            //[イベントスタンプ]
            //一緒にやらせて！
            Pair.of("stamp0493", "[イベントスタンプ] 一緒にやらせて！"),
            //もう一回やってみよう！
            Pair.of("stamp0455", "[イベントスタンプ] もう一回やってみよう！"),
            //全力を尽くします！
            Pair.of("stamp0427", "[イベントスタンプ] 全力を尽くします！"),

            //[通常スタンプ]
            //準備できた？
            Pair.of("stamp0075", "[通常スタンプ] 準備できた？"),
            //おつかれさま
            Pair.of("stamp0074", "[通常スタンプ] おつかれさま"),
            //またね
            Pair.of("stamp0073", "[通常スタンプ] またね"),
            //ごめんなさい！
            Pair.of("stamp0072", "[通常スタンプ] ごめんなさい！"),
            //ありがとう！
            Pair.of("stamp0071", "[通常スタンプ] ありがとう！"),
            //えらいえらい
            Pair.of("stamp0070", "[通常スタンプ] えらいえらい"),
            //あ...
            Pair.of("stamp0069", "[通常スタンプ] あ..."),
            //ふふ
            Pair.of("stamp0068", "[通常スタンプ] ふふ"),
            //うわぁ！
            Pair.of("stamp0067", "[通常スタンプ] うわぁ！"),
            //がんばれ♪
            Pair.of("stamp0066", "[通常スタンプ] がんばれ♪"),
            //よろしくね
            Pair.of("stamp0065", "[通常スタンプ] よろしくね")
    );

    public HonamiStampCommand() {
        super(UnitType.LEO_NEED,
                ColorUtils.HONAMI,
                "stamphonami",
                "穂波ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"honami", "ほなみ", "ほなみちゃん", "ほなちゃん", "穂波", "穂波ちゃん", "望月穂波", "望月穂波ちゃん"},
                HONAMI_STAMPS);
    }
}
