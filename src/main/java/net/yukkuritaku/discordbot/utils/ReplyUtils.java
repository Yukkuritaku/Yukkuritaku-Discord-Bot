package net.yukkuritaku.discordbot.utils;

import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.util.Arrays;

/**
 * 使い道があるかわからないリプライのゆーてぃる
 */
public final class ReplyUtils {

    /**
     * 最初に[Debug/Info]をつけて返信します。
     * 使い道があるのかはしらん！
     * @param event CommandEvent、基本的には eventって書くだけで大丈夫なはず
     * @param msg お好きなメッセージをどーぞ　書くネタが無かったら推しキャラ名を書くのだ
     */
    public static void logInfo(CommandEvent event, String msg){
        event.reply("[Debug/Info] " + msg);
    }

    /**
     * 最初に[Debug/Error]をつけて返信します。
     * 使い道があるのかはしらん！
     * @param event CommandEvent、基本的には eventって書くだけで大丈夫なはず
     * @param msg お好きなメッセージをどーぞ　書くネタが無かったら推しキャラ名を書くのだ
     */
    public static void logError(CommandEvent event, String msg){
        event.replyError("[Debug/Error] " + msg);
    }

    /**
     * 最初に[Debug/Success]をつけて返信します。
     * 使い道があるのかはしらん！
     * @param event CommandEvent、基本的には eventって書くだけで大丈夫なはず
     * @param msg お好きなメッセージをどーぞ　書くネタが無かったら推しキャラ名を書くのだ
     */
    public static void logSuccess(CommandEvent event, String msg){
        event.replySuccess("[Debug/Success] " + msg);
    }

    /**
     * 最初に[Exception]をつけて返信します。
     * 使い道があるのかはしらん！
     * @param event CommandEvent、基本的には eventって書くだけで大丈夫なはず
     * @param exceptionMessage 基本的にException eにして e.toString();メソッドで行けると思います
     */
    public static void logException(CommandEvent event, String exceptionMessage){
        event.reply("[Exception] " + exceptionMessage);
    }

    public static void logExceptionWithStackTrace(CommandEvent eventIn, String message, Exception exceptionIn){
        eventIn.reply("[Exception] " + message);
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.addField("[StackTrace/スタックトレース]\n(1000文字まで)", Arrays.toString(exceptionIn.getStackTrace()).substring(1, 1000).replace("net.yukkuritaku.net.yukkuritaku.discordbot", "ここかも！->>>net.yukkuritaku.net.yukkuritaku.discordbot"), false);
        //桃井愛莉のうわぁ！スタンプ
        embedBuilder.setThumbnail("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0109_rip/stamp0109/stamp0109.png");
        eventIn.reply(embedBuilder.build());

    }
}
