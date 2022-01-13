package com.yukkuritaku.discordbot.commands.stamp.wonderlands;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class TsukasaStampCommand extends StampCommand {

    private static final List<Pair<String, String>> TSUKASA_STAMPS = List.of(
            //[キャラランクスタンプ]
            //オレについてこい！
            Pair.of("stamp0513", "[キャラランクスタンプ] オレについてこい！"),

            //あいつらがいたからだ
            Pair.of("stamp0024", "[キャラランクスタンプ] あいつらがいたからだ"),

            //[イベントスタンプ]
            //素晴らしいな！
            Pair.of("stamp0450", "[イベントスタンプ] 素晴らしいな！"),

            //[通常スタンプ]
            //もちろんフルコンだな！
            Pair.of("stamp0003", "[通常スタンプ] もちろんフルコンだな！"),
            //オイィィ！
            Pair.of("stamp0413", "[通常スタンプ] オイィィ！（つっこみ・ィの処遇は任せます……）"),
            //ショウの時間だ！（キリッ）
            Pair.of("stamp0412", "[通常スタンプ] ショウの時間だ！（キリッ）"),
            //さらば！
            Pair.of("stamp0157", "[通常スタンプ] さらば！"),
            //すまん...
            Pair.of("stamp0156", "[通常スタンプ] すまん..."),
            //感謝する！
            Pair.of("stamp0155", "[通常スタンプ] 感謝する！"),
            //いい調子じゃないか！
            Pair.of("stamp0154", "[通常スタンプ] いい調子じゃないか！"),
            //く...
            Pair.of("stamp0153", "[通常スタンプ] く..."),
            //ハッハッハッ！
            Pair.of("stamp0152", "[通常スタンプ] ハッハッハッ！"),
            //なぬっ！？
            Pair.of("stamp0151", "[通常スタンプ] なぬっ！？"),
            //もっとできるだろ！
            Pair.of("stamp0150", "[通常スタンプ] もっとできるだろ！"),
            //オレだ！
            Pair.of("stamp0149", "[通常スタンプ] オレだ！")
    );

    public TsukasaStampCommand() {
        super(UnitType.WONDER_LANDS_SHOWTIME, ColorUtils.TSUKASA,
                "stamptsukasa",
                "司のスタンプからどれかが選ばれるか選択するよ",
                new String[] {"tsukasa", "tks", "つかさ", "つかさくん", "司", "司くん", "天馬司", "天馬司くん", "未来のスター"},
                TSUKASA_STAMPS);
    }
}
