package net.yukkuritaku.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class AliasesCommand extends Command {

    public AliasesCommand(){
        this.name = "aliases";
        this.help = "コマンドを省略したのを確認できるよ";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("stampena -> " + "enanan, ena, えな, えななん");
        event.reply("stampshizuku -> " + "shizuku, 雫");
        event.reply("randomstamp -> " + "rngst, rs");
    }
}