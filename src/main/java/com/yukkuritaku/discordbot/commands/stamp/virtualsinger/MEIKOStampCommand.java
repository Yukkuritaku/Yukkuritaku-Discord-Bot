package com.yukkuritaku.discordbot.commands.stamp.virtualsinger;

import com.yukkuritaku.discordbot.commands.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public class MEIKOStampCommand extends StampCommand {

    private static final List<Pair<String, String>> MEIKO_STAMPS = List.of(
            //[キャラランクスタンプ]
            //まだまだいくわよ！
            Pair.of("stamp0525", "[キャラランクスタンプ] まだまだいくわよ！"),
            //応援ありがとう♪
            Pair.of("stamp0046", "[キャラランクスタンプ] 応援ありがとう♪"),

            //[通常スタンプ]
            //すごいね (この顔かわいいよね)
            Pair.of("stamp0007", "[通常スタンプ] すごいね"),
            //始めましょ（さあ、始めましょ！）
            Pair.of("stamp0296", "[通常スタンプ] 始めましょ（さあ、始めましょ！）"),
            //一息つきましょ？
            Pair.of("stamp0295", "[通常スタンプ] 一息つきましょ？"),
            //楽しい時間だったわね
            Pair.of("stamp0294", "[通常スタンプ] 楽しい時間だったわね"),
            //じゃあね
            Pair.of("stamp0293", "[通常スタンプ] じゃあね"),
            //ごめんね
            Pair.of("stamp0292", "[通常スタンプ] ごめんね"),
            //ありがとう！
            Pair.of("stamp0291", "[通常スタンプ] ありがとう！"),
            //はぁ...
            Pair.of("stamp0290", "[通常スタンプ] はぁ..."),
            //ふふ
            Pair.of("stamp0289", "[通常スタンプ] ふふ"),
            //えっ！？
            Pair.of("stamp0288", "[通常スタンプ] えっ！？"),
            //ファイト！
            Pair.of("stamp0287", "[通常スタンプ] ファイト！"),
            //よろしくね♪
            Pair.of("stamp0286", "[通常スタンプ] よろしくね♪")
    );

    public MEIKOStampCommand() {
        super(UnitType.VIRTUAL_SINGER,
                ColorUtils.MEIKO,
                "stampmeiko",
                "MEIKOさんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"meiko", "meikosan", "めいこ", "めいこさん", "メイコ", "メイコさん"},
                MEIKO_STAMPS);
    }
}
