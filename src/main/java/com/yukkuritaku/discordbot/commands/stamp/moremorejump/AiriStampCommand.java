package com.yukkuritaku.discordbot.commands.stamp.moremorejump;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class AiriStampCommand extends StampCommand {

    private static final List<Pair<String, String>> AIRI_STAMPS = List.of(
            //[キャラランクスタンプ]
            //覚悟しなさい！
            Pair.of("stamp0507", "[キャラランクスタンプ] 覚悟しなさい！"),

            //全力でやらなくちゃ！
            Pair.of("stamp0018", "[キャラランクスタンプ] 全力でやらなくちゃ！"),

            //[イベントスタンプ]
            //余裕よっ！
            Pair.of("stamp0456", "[イベントスタンプ] 余裕よっ！"),
            //信じて待ちましょ！
            Pair.of("stamp0447", "[イベントスタンプ] 信じて待ちましょ！"),
            //ここからスタートよ
            Pair.of("stamp0424", "[イベントスタンプ] ここからスタートよ"),

            //[通常スタンプ]
            //任せなさい！
            Pair.of("stamp0389", "[通常スタンプ] 任せなさい！"),
            //目指せてっぺん！(目指せアイドルのてっぺん！)
            Pair.of("stamp0388", "[通常スタンプ] 目指せてっぺん！(目指せアイドルのてっぺん！)"),
            //また一緒に歌いましょ(また一緒に歌おうね！)
            Pair.of("stamp0115", "[通常スタンプ] また一緒に歌いましょ(また一緒に歌おうね！)"),
            //ごめん！
            Pair.of("stamp0114", "[通常スタンプ] ごめん！"),
            //ありがとうね
            Pair.of("stamp0113", "[通常スタンプ] ありがとうね"),
            //やるじゃない！(やるじゃん！)
            Pair.of("stamp0112", "[通常スタンプ] やるじゃない！(やるじゃん！)"),
            //むむむ...
            Pair.of("stamp0111", "[通常スタンプ] むむむ..."),
            //えへへ
            Pair.of("stamp0110", "[通常スタンプ] えへへ"),
            //うわぁ！
            Pair.of("stamp0109", "[通常スタンプ] うわぁ！"),
            //ファイト！
            Pair.of("stamp0108", "[通常スタンプ] ファイト！"),
            //よろしくね！
            Pair.of("stamp0107", "[通常スタンプ] よろしくね！")
    );

    public AiriStampCommand() {
        super(UnitType.MORE_MORE_JUMP,
                ColorUtils.AIRI,
                "stampairi",
                "愛莉ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"airi", "あいり", "あいりちゃん", "愛莉", "愛莉ちゃん", "桃井愛莉", "桃井愛莉ちゃん"},
                AIRI_STAMPS);
    }
}
