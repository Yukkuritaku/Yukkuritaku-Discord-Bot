package com.yukkuritaku.discordbot.commands.stamp.virtualsinger;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class RenStampCommand extends StampCommand {

    private static final List<Pair<String, String>> REN_STAMPS = List.of(
            //[キャラランクスタンプ]
            //ノリノリじゃん！
            Pair.of("stamp0523", "[キャラランクスタンプ] ノリノリじゃん！"),
            //はやく歌いたいな
            Pair.of("stamp0040", "[キャラランクスタンプ] はやく歌いたいな"),

            //[通常スタンプ]
            //えっ！？
            Pair.of("stamp0006", "[通常スタンプ] えっ！？"),
            //いいね！（リンと同じポーズ）
            Pair.of("stamp0263", "[通常スタンプ] いいね！（リンと同じポーズ）"),
            //へへっ（どや顔）
            Pair.of("stamp0262", "[通常スタンプ] へへっ（どや顔）"),
            //まかせろー！
            Pair.of("stamp0261", "[通常スタンプ] まかせろー！"),
            //バイバーイ！
            Pair.of("stamp0260", "[通常スタンプ] バイバーイ！"),
            //ごめん！
            Pair.of("stamp0259", "[通常スタンプ] ごめん！"),
            //サンキュー！
            Pair.of("stamp0258", "[通常スタンプ] サンキュー！"),
            //えぇ...
            Pair.of("stamp0257", "[通常スタンプ] えぇ..."),
            //イェーイ！(イエーイ！)
            Pair.of("stamp0256", "[通常スタンプ] イェーイ！(イエーイ！)"),
            //うわっ！
            Pair.of("stamp0255", "[通常スタンプ] うわっ！"),
            //がんばろうな！
            Pair.of("stamp0254", "[通常スタンプ] がんばろうな！"),
            //よろしく！
            Pair.of("stamp0253", "[通常スタンプ] よろしく！")
    );

    public RenStampCommand() {
        super(UnitType.VIRTUAL_SINGER,
                ColorUtils.REN,
                "stampren",
                "レンのスタンプからどれかが選ばれるか選択するよ",
                new String[] {"ren", "れん", "れんくん", "レン", "レンくん", "鏡音レン"},
                REN_STAMPS);
    }
}
