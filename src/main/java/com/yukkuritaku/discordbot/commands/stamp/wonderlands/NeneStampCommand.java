package com.yukkuritaku.discordbot.commands.stamp.wonderlands;

import com.yukkuritaku.discordbot.commands.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public class NeneStampCommand extends StampCommand {

    private static final List<Pair<String, String>> NENE_STAMPS = List.of(
            //[キャラランクスタンプ]
            //ビームの的にするから
            Pair.of("stamp0515", "[キャラランクスタンプ] ビームの的にするから"),
            //なんか文句あんの？
            Pair.of("stamp0026", "[キャラランクスタンプ] なんか文句あんの？"),

            //[イベントスタンプ]
            //死ぬかと思った...
            Pair.of("stamp0457", "[イベントスタンプ] 死ぬかと思った..."),
            //わたしが一番楽しもう！
            Pair.of("stamp0426", "[イベントスタンプ] わたしが一番楽しもう！"),

            //[通常スタンプ]
            //(寧々だヨーの圧がある顔のみ)
            Pair.of("stamp0179", "[通常スタンプ] (寧々だヨーの圧がある顔のみ)"),
            //...ふーん
            Pair.of("stamp0178", "[通常スタンプ] ...ふーん"),
            //じゃあね
            Pair.of("stamp0177", "[通常スタンプ] じゃあね"),
            //ごめん...
            Pair.of("stamp0176", "[通常スタンプ] ごめん..."),
            //...ありがと
            Pair.of("stamp0175", "[通常スタンプ] ...ありがと"),
            //いい歌だった
            Pair.of("stamp0174", "[通常スタンプ] いい歌だった"),
            //ん...
            Pair.of("stamp0173", "[通常スタンプ] ん..."),
            //ふふ
            Pair.of("stamp0172", "[通常スタンプ] ふふ"),
            //え...
            Pair.of("stamp0171", "[通常スタンプ] え..."),
            //やれるでしょ
            Pair.of("stamp0170", "[通常スタンプ] やれるでしょ"),
            //...なに
            Pair.of("stamp0169", "[通常スタンプ] ...なに")
    );

    public NeneStampCommand() {
        super(UnitType.WONDER_LANDS_SHOWTIME,
                ColorUtils.NENE,
                "stampnene",
                "寧々ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[]{"nene", "nenechan", "ねね", "ねねちゃん", "寧々", "寧々ちゃん", "草薙寧々", "草薙寧々ちゃん"},
                NENE_STAMPS);
    }
}
