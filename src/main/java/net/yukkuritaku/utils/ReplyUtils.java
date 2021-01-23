package net.yukkuritaku.utils;

import com.jagrosh.jdautilities.command.CommandEvent;

public class ReplyUtils {

    public static void logInfo(CommandEvent event, String msg){
        event.reply("[Debug/Info] " + msg);
    }

    public static void logError(CommandEvent event, String msg){
        event.replyError("[Debug/Error] " + msg);
    }

    public static void logSuccess(CommandEvent event, String msg){
        event.replySuccess("[Debug/Success] " + msg);
    }
}
