package net.yukkuritaku.discordbot.listeneradapters.impl.other;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.yukkuritaku.discordbot.Start;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public final class EventTrackerListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] arguments = event.getMessage().getContentRaw().split("\\s+");
        if(arguments[0].equalsIgnoreCase(Start.PREFIX + "test")){
            getRankingTrackers(event);
        }
    }

    /**
     * 現在使い方を模索中...絶対使えるようにしたい！
     * でも今は無理そう(´・ω・｀)
     */
    public void getRankingTrackers(MessageReceivedEvent event){
        try {
            URL url = new URL("https://sekai.best/eventtracker/");
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            event.getChannel().sendMessage(urlConnection.getContent().toString()).queue();
            final BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            System.out.println(reader.readLine());
            System.out.println(urlConnection.getContent());

            
            reader.close();


        }catch (Exception e){
            System.out.println("Failed");
            event.getChannel().sendMessage("Failed").queue();
            e.printStackTrace();
        }
    }
}
