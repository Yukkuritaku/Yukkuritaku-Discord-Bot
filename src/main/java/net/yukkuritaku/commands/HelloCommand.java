package net.yukkuritaku.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

/**
 * わんだほーい！
 */
public final class HelloCommand extends Command {

    public HelloCommand(){
        this.name = "hello";
        this.help = "あいさつするやーつ";
        this.aliases = new String[] {"h"};
    }

    @Override
    protected final void execute(final CommandEvent event){
        event.getChannel().sendTyping().queue();
        event.reply("わんだほーい！ " + event.getAuthor().getName() + "さあああああん!");
    }
}
