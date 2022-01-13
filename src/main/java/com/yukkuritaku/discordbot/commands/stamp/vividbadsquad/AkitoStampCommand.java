package com.yukkuritaku.discordbot.commands.stamp.vividbadsquad;

import com.yukkuritaku.discordbot.commands.stamp.UnitType;
import com.yukkuritaku.discordbot.commands.stamp.StampCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.internal.utils.tuple.Pair;

import java.util.List;

public final class AkitoStampCommand extends StampCommand {

    private static final List<Pair<String, String>> AKITO_STAMPS = List.of(
            //[キャラランクスタンプ]
            //真っ向勝負だ！
            Pair.of("stamp0511", "[キャラランクスタンプ] 真っ向勝負だ！"),
            //必要だって言ってる！
            Pair.of("stamp0022", "[キャラランクスタンプ] 必要だって言ってる！"),

            //[イベントスタンプ]
            //いくぞ、お前ら！
            Pair.of("stamp0446", "[イベントスタンプ] いくぞ、お前ら！"),

            //[通常スタンプ]
            //盛り上がろうぜ！（盛り上がっていこうぜ！）
            Pair.of("stamp0137", "[通常スタンプ] 盛り上がろうぜ！（盛り上がっていこうぜ！）"),
            //面白そうじゃん
            Pair.of("stamp0136", "[通常スタンプ] 面白そうじゃん"),
            //じゃな
            Pair.of("stamp0135", "[通常スタンプ] じゃな"),
            //わるい...
            Pair.of("stamp0134", "[通常スタンプ] わるい..."),
            //サンキュー
            Pair.of("stamp0133", "[通常スタンプ] サンキュー"),
            //ちょっと見直したぜ
            Pair.of("stamp0132", "[通常スタンプ] ちょっと見直したぜ"),
            //くそ...
            Pair.of("stamp0131", "[通常スタンプ] くそ..."),
            //ははは
            Pair.of("stamp0130", "[通常スタンプ] ははは"),
            //は！？
            Pair.of("stamp0129", "[通常スタンプ] は！？"),
            //やるぞ！
            Pair.of("stamp0128", "[通常スタンプ] やるぞ！"),
            //よっ
            Pair.of("stamp0127", "[通常スタンプ] よっ")
    );

    public AkitoStampCommand() {
        super(UnitType.VIVID_BAD_SQUAD,
                ColorUtils.AKITO,
                "stampakito",
                "彰人のスタンプからどれかが選ばれるか選択するよ",
                //                                                                                      ↓だからそれやめろってーの！(この会話草生えた)
                new String[] {"akito", "あきと", "あきとくん", "彰人", "彰人くん", "東雲彰人", "東雲彰人くん", "弟くん"},
                AKITO_STAMPS);
    }
}
