package com.yukkuritaku.discordbot.commands.stamp.virtualsinger;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public class LukaStampCommand extends StampCommand {

    private static final List<Pair<String, String>> LUKA_STAMPS = List.of(
            //[キャラランクスタンプ]
            //期待していてくださいね
            Pair.of("stamp0524", "[キャラランクスタンプ] 期待していてくださいね"),
            //準備はいいかしら
            Pair.of("stamp0042", "[キャラランクスタンプ] 準備はいいかしら"),

            //[通常スタンプ]
            //うれしいわ
            Pair.of("stamp0004", "[通常スタンプ] うれしいわ"),
            //どうだったかしら
            Pair.of("stamp0274", "[通常スタンプ] どうだったかしら"),
            //ふふ
            Pair.of("stamp0273", "[通常スタンプ] ふふ"),
            //一緒に歌いましょう
            Pair.of("stamp0272", "[通常スタンプ] 一緒に歌いましょう"),
            //また会えるといいわね
            Pair.of("stamp0271", "[通常スタンプ] また会えるといいわね"),
            //ごめんなさい
            Pair.of("stamp0270", "[通常スタンプ] ごめんなさい"),
            //感謝するわ
            Pair.of("stamp0269", "[通常スタンプ] 感謝するわ"),
            //よくできました
            Pair.of("stamp0268", "[通常スタンプ] よくできました"),
            //あ...
            Pair.of("stamp0267", "[通常スタンプ] あ..."),
            //あら
            Pair.of("stamp0266", "[通常スタンプ] あら"),
            //頑張りましょう
            Pair.of("stamp0265", "[通常スタンプ] 頑張りましょう"),
            //よろしくね（よろしくお願いします）
            Pair.of("stamp0264", "[通常スタンプ] よろしくね（よろしくお願いします）")
    );

    public LukaStampCommand() {
        super(UnitType.VIRTUAL_SINGER,
                ColorUtils.LUKA,
                "stampluka",
                "ルカちゃんのスタンプからどれかが選ばれるか選択するよ",
                new String[]{"luka", "るか", "るかちゃん", "ルカ", "ルカちゃん", "巡音ルカ", "巡音ルカちゃん"},
                LUKA_STAMPS);
    }
}
