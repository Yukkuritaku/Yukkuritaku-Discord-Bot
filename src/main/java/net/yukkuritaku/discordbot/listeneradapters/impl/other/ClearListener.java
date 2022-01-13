package net.yukkuritaku.discordbot.listeneradapters.impl.other;

import com.jagrosh.jdautilities.doc.standard.CommandInfo;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.yukkuritaku.discordbot.Start;
import org.jetbrains.annotations.NotNull;

import java.util.List;

//Ty Television For Tutorials...
@CommandInfo(name = "Clear", usage = "Usage: .clear [1 - 100 of messages]", description = "Clear the Chat.")
public final class ClearListener extends ListenerAdapter {

    public ClearListener(){
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if(args[0].equalsIgnoreCase(Start.PREFIX + "clear")){
            if(args.length < 2){
                EmbedBuilder usage = new EmbedBuilder();
                usage.setColor(0xff3923);
                usage.setTitle("Specify amount to delete");
                usage.setDescription("Usage: " + Start.PREFIX + "clear [1 - 100 of messages]");
                event.getChannel().sendMessageEmbeds(usage.build()).queue();
            }
            else{
                try{
                    List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
                    //event.getChannel().deleteMessageById(messages).queue();
                    EmbedBuilder success = new EmbedBuilder();
                    success.setColor(0x22ff2a);
                    success.setTitle("[Success] Successfully Deleted " + args[1] + ".");
                    event.getChannel().sendMessageEmbeds(success.build()).queue();
                }
                catch (IllegalArgumentException e){
                    if(e.toString().startsWith("java.lang.IllegalArgumentException: ")){
                        EmbedBuilder error = new EmbedBuilder();
                        error.setColor(0xff3923);
                        error.setTitle("[Exception] Too many Messages Selected!");
                        error.setDescription("Between 1-100 messages can be deleted at one time.");
                        event.getChannel().sendMessageEmbeds(error.build()).queue();
                    }
                    else{
                        EmbedBuilder error = new EmbedBuilder();
                        error.setColor(0xff3923);
                        error.setTitle("[Exception] Selected messages are Older than 2 weeks");
                        error.setDescription("Messages older than 2 weeks cannot be deleted.");
                        event.getChannel().sendMessageEmbeds(error.build()).queue();
                    }
                }
            }
        }
    }
}
