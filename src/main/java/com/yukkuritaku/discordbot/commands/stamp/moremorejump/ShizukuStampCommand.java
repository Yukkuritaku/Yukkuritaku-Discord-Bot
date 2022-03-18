package com.yukkuritaku.discordbot.commands.stamp.moremorejump;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class ShizukuStampCommand extends StampCommand {

    private static final List<Pair<String, String>> SHIZUKU_STAMPS = List.of(
            //[キャラランクスタンプ]
            //応援するわ
            Pair.of("stamp0508", "[キャラランクスタンプ] 応援するわ"),
            //リラックスよ
            Pair.of("stamp0019", "[キャラランクスタンプ] リラックスよ"),

            //[イベントスタンプ]
            //魔法みたいだわ！
            Pair.of("stamp0536", "[イベントスタンプ] 魔法みたいだわ！"),

            //期待に応えるわ
            Pair.of("stamp0428", "[イベントスタンプ] 期待に応えるわ"),

            //[通常スタンプ]
            //あなたのおかげよ
            Pair.of("stamp0391", "[通常スタンプ] あなたのおかげよ"),
            //うまく歌えたかしら(うまく歌えたでしょうか？)
            Pair.of("stamp0390", "[通常スタンプ] うまく歌えたかしら(うまく歌えたでしょうか？)"),
            //それじゃ、また
            Pair.of("stamp0124", "[通常スタンプ] それじゃ、また"),
            //ごめんなさい...
            Pair.of("stamp0123", "[通常スタンプ] ごめんなさい..."),
            //助かりました
            Pair.of("stamp0122", "[通常スタンプ] 助かりました"),
            //よかったわ
            Pair.of("stamp0121", "[通常スタンプ] よかったわ"),
            //そんな...
            Pair.of("stamp0120", "[通常スタンプ] そんな..."),
            //ふふっ
            Pair.of("stamp0119", "[通常スタンプ] ふふっ"),
            //あら...
            Pair.of("stamp0118", "[通常スタンプ] あら..."),
            //がんばりましょう
            Pair.of("stamp0117", "[通常スタンプ] がんばりましょう"),
            //よろしくね(よろしくお願いします)
            Pair.of("stamp0116", "[通常スタンプ] よろしくね(よろしくお願いします)")
    );

    public ShizukuStampCommand() {
        super(UnitType.MORE_MORE_JUMP,
                ColorUtils.SHIZUKU,
                "stampshizuku",
                "雫ちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"shizuku", "雫", "雫ちゃん", "しずく", "しずくちゃん", "日野森雫", "日野森雫ちゃん"},
                SHIZUKU_STAMPS);
    }
}
