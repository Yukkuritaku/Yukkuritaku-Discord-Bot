package com.yukkuritaku.discordbot.commands.stamp.vividbadsquad;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class KohaneStampCommand extends StampCommand {

    private static final List<Pair<String, String>> KOHANE_STAMPS = List.of(
            //[キャラランクスタンプ]
            //できるかな...
            Pair.of("stamp0509", "[キャラランクスタンプ] できるかな..."),
            //歌うよ！
            Pair.of("stamp0020", "[キャラランクスタンプ] 歌うよ！"),

            //[イベントスタンプ]
            //いいんですか？
            Pair.of("stamp0528", "[イベントスタンプ] いいんですか？"),
            //任せて！
            Pair.of("stamp0494", "[イベントスタンプ] 任せて！"),
            //もっといける！
            Pair.of("stamp0453", "[イベントスタンプ] もっといける！"),

            //[通常スタンプ]
            //ガタガタガタ
            Pair.of("stamp0401", "[通常スタンプ] ガタガタガタ"),
            //ごめんね...！
            Pair.of("stamp0009", "[通常スタンプ] ごめんね...！"),
            //ドキドキする...！
            Pair.of("stamp0400", "[通常スタンプ] ドキドキする...！"),
            //ど、どうしよう...
            Pair.of("stamp0399", "[通常スタンプ] ど、どうしよう..."),
            //歌おうね
            Pair.of("stamp0398", "[通常スタンプ] 歌おうね"),
            //ありがとう（ありがとうございました）
            Pair.of("stamp0397", "[通常スタンプ] ありがとう（ありがとうございました）"),
            //す、すごい！
            Pair.of("stamp0396", "[通常スタンプ] す、すごい！"),
            //うぅ...
            Pair.of("stamp0395", "[通常スタンプ] うぅ..."),
            //やったね
            Pair.of("stamp0394", "[通常スタンプ] やったね"),
            //ひゃっ！
            Pair.of("stamp0393", "[通常スタンプ] ひゃっ！"),
            //がんばって！
            Pair.of("stamp0392", "[通常スタンプ] がんばって！"),
            //こ、こんにちは
            Pair.of("stamp0125", "[通常スタンプ] こ、こんにちは")
    );

    public KohaneStampCommand() {
        super(UnitType.VIVID_BAD_SQUAD,
                ColorUtils.KOHANE,
                "stampkohane",
                "こはねちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"kohane", "khn", "こはね", "こはねちゃん", "小豆沢こはね", "小豆沢こはねちゃん", "最高の相棒"},
                KOHANE_STAMPS);
    }
}
