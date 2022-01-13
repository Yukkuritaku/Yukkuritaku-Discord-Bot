package com.yukkuritaku.discordbot.commands.stamp.virtualsinger;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class MikuStampCommand extends StampCommand {

    private static final List<Pair<String, String>> MIKU_STAMPS = List.of(
            //[キャラランクスタンプ]
            //みんなと歌えてうれしい♪
            Pair.of("stamp0521", "[キャラランクスタンプ] みんなと歌えてうれしい♪"),
            //ミュージックスタート！
            Pair.of("stamp0032", "[キャラランクスタンプ] ミュージックスタート！"),

            //[通常スタンプ]
            //はやく来て...(にーごみく)
            Pair.of("stamp0489", "[通常スタンプ(25時、ナイトコードで。)] はやく来て..."),
            //セカイにようこそ～(だしょみくさん)
            Pair.of("stamp0488", "[通常スタンプ(ワンダーランズ×ショウタイム)] セカイにようこそ～"),
            //ここで止まっていいの？(びびばすみく)
            Pair.of("stamp0487", "[通常スタンプ(Vivid Bad SQUAD)] ここで止まっていいの？"),
            //かわいくいくよっ(ももじゃんみく)
            Pair.of("stamp0486", "[通常スタンプ(MORE MORE JUMP!)] かわいくいくよっ"),
            //その想い大事にしてね(れおにみく)
            Pair.of("stamp0485", "[通常スタンプ(Leo/need)] その想い大事にしてね"),
            //よろしく
            Pair.of("stamp0001", "[通常スタンプ] よろしく"),
            //いいステージだったね！
            Pair.of("stamp0242", "[通常スタンプ] いいステージだったね！"),
            //39♪
            Pair.of("stamp0241", "[通常スタンプ] 39♪"),
            //いっしょに歌おう！
            Pair.of("stamp0240", "[通常スタンプ] いっしょに歌おう！"),
            //またね～
            Pair.of("stamp0239", "[通常スタンプ] またね～"),
            //ごめんなさい...
            Pair.of("stamp0238", "[通常スタンプ] ごめんなさい..."),
            //ありがとう！
            Pair.of("stamp0237", "[通常スタンプ] ありがとう！"),
            //楽しいライブだったね！
            Pair.of("stamp0236", "[通常スタンプ] 楽しいライブだったね！"),
            //うぅ...
            Pair.of("stamp0235", "[通常スタンプ] うぅ..."),
            //えへへ
            Pair.of("stamp0234", "[通常スタンプ] えへへ"),
            //わっ！
            Pair.of("stamp0233", "[通常スタンプ] わっ！"),
            //がんばろう！
            Pair.of("stamp0232", "[通常スタンプ] がんばろう！")
    );

    public MikuStampCommand() {
        super(UnitType.VIRTUAL_SINGER,
                ColorUtils.MIKU,
                "stampmiku",
                "ミクちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[]{"miku", "39", "みく", "みくちゃん", "ミク", "ミクちゃん", "初音ミク", "初音ミクちゃん"},
                MIKU_STAMPS);
    }
}
