package net.yukkuritaku.discordbot.utils;

import com.jagrosh.jdautilities.command.CommandEvent;

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
     * @param exceptionmsg 基本的にException eにして e.toString();メソッドで行けると思います
     */
    public static void logException(CommandEvent event, String exceptionmsg){
        event.reply("[Exception] " + exceptionmsg);
    }
}
