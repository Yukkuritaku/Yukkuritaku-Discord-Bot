package com.yukkuritaku.discordbot.commands.stamp.leoneed;

import com.yukkuritaku.discordbot.commands.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public class SakiStampCommand extends StampCommand {

    private static final List<Pair<String, String>> SAKI_STAMPS = List.of(
            //[キャラランクスタンプ]
            //はりきっていくよ！
            Pair.of("stamp0502", "[キャラランクスタンプ] はりきっていくよ！"),
            //たっくさん青春したい！
            Pair.of("stamp0013", "[キャラランクスタンプ] たっくさん青春したい！"),

            //[イベントスタンプ]
            //わかっちゃった！
            Pair.of("stamp0452", "[イベントスタンプ] わかっちゃった！"),
            //うぇーん
            Pair.of("stamp0432", "[イベントスタンプ] うぇーん"),
            //おつかれさま！
            Pair.of("stamp0421", "[イベントスタンプ] おつかれさま！"),

            //[通常スタンプ]
            //いいライブだったね！
            Pair.of("stamp0385", "[通常スタンプ] いいライブだったね！"),
            //てへっ☆
            Pair.of("stamp0384", "[通常スタンプ] てへっ☆"),
            //またね～
            Pair.of("stamp0383", "[通常スタンプ] またね～"),
            //ごめんね！
            Pair.of("stamp0064", "[通常スタンプ] ごめんね！"),
            //ありがとう♪
            Pair.of("stamp0063", "[通常スタンプ] ありがとう♪"),
            //すごーい！
            Pair.of("stamp0062", "[通常スタンプ] すごーい！"),
            //うーん...
            Pair.of("stamp0061", "[通常スタンプ] うーん..."),
            //やった！
            Pair.of("stamp0060", "[通常スタンプ] やった！"),
            //びっくりした！
            Pair.of("stamp0059", "[通常スタンプ] びっくりした！"),
            //いいライブになるよ（きっといいライブになるよ）
            Pair.of("stamp0058", "[通常スタンプ] いいライブになるよ（きっといいライブになるよ）"),
            //よろしくね～♪
            Pair.of("stamp0057", "[通常スタンプ] よろしくね～♪")

    );

    public SakiStampCommand() {
        super(UnitType.LEO_NEED,
                ColorUtils.SAKI,
                "stampsaki",
                "咲希ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"saki", "さき", "さきちゃん", "咲希", "咲希ちゃん", "天馬咲希", "天馬咲希ちゃん"},
                SAKI_STAMPS);
    }
}
