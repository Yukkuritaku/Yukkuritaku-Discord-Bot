package net.yukkuritaku.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.yukkuritaku.main.Main;
import org.jetbrains.annotations.NotNull;

import java.util.List;

//Ty Television For Tutorials...
public class ClearCommand extends ListenerAdapter {

    public ClearCommand(){
    }

    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Main.Prefixcmd + "clear")){
            if(args.length < 2){
                //Err
                EmbedBuilder usage = new EmbedBuilder();
                usage.setColor(0xff3923);
                usage.setTitle("Specify amount to delete");
                usage.setDescription("Usage: " + Main.Prefixcmd + "clear [1 - 100 of messages]");
                event.getChannel().sendMessage(usage.build()).queue();
            }
            else{
                try{
                    List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
                    event.getChannel().deleteMessages(messages).queue();
                    EmbedBuilder success = new EmbedBuilder();
                    success.setColor(0x22ff2a);
                    success.setTitle("[Success] Successfully Deleted " + args[1] + ".");
                    event.getChannel().sendMessage(success.build()).queue();
                }
                catch (IllegalArgumentException e){
                    if(e.toString().startsWith("java.lang.IllegalArgumentException: ")){
                        //Too Many Messages
                        EmbedBuilder error = new EmbedBuilder();
                        error.setColor(0xff3923);
                        error.setTitle("[Exception] Too many Messages Selected!");
                        error.setDescription("Between 1-100 messages can be deleted at one time.");
                        event.getChannel().sendMessage(error.build()).queue();
                    }
                    else{
                        EmbedBuilder error = new EmbedBuilder();
                        error.setColor(0xff3923);
                        error.setTitle("[Exception] Selected messages are Older than 2 weeks");
                        error.setDescription("Messages older than 2 weeks cannot be deleted.");
                        event.getChannel().sendMessage(error.build()).queue();
                    }
                }
            }
        }
    }
}
