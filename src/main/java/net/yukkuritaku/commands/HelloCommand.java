package net.yukkuritaku.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class HelloCommand extends Command {

    public HelloCommand(){
        this.name = "hello";
        this.help = "あいさつするやーつ";
        this.aliases = new String[] {"h"};
    }

    @Override
    public void execute(CommandEvent event){
        event.reply("うおお " + event.getAuthor().getName() + "さあああああん!");
    }
}
