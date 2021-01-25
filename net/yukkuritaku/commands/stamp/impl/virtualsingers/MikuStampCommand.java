package net.yukkuritaku.commands.stamp.impl.virtualsingers;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public class MikuStampCommand extends Command {

    public MikuStampCommand(){
        this.name = "stampmiku";
        this.help = "ミクちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"miku", "39", "みく", "みくちゃん", "ミク", "ミクちゃん", "初音ミク", "初音ミクちゃん"};
    }

    @Override
    protected void execute(CommandEvent event) {
        try{
            final List<RandomMikuStamps> Values = List.of(RandomMikuStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomMikuStamps mikuStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mikuStamps + "_rip/" + mikuStamps + "/" + mikuStamps + ".webp");
            embedBuilder.setColor(0x33CCBB);
            ReplyUtils.logInfo(event, "Sending...");
            event.reply(embedBuilder.build());
            ReplyUtils.logSuccess(event, "Successful!");
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            e.printStackTrace();
        }
    }

    public enum RandomMikuStamps{
        //よろしく
        stamp0001,

        //いいステージだったね！
        stamp0242,

        //39♪
        stamp0241,

        //いっしょに歌おう！
        stamp0240,

        //またね～
        stamp0239,

        //ごめんなさい...
        stamp0238,

        //ありがとう！
        stamp0237,

        //楽しいライブだったね！
        stamp0236,

        //うぅ...
        stamp0235,

        //えへへ
        stamp0234,

        //わっ！
        stamp0233,

        //がんばろう！
        stamp0232,

        //ミュージックスタート！
        stamp0032,
    }
}
