package net.yukkuritaku.commands.stamp.impl.niigo;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public class KanadeStampCommand extends Command {

    public KanadeStampCommand(){
        this.name = "stampkanade";
        this.help = "奏ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"kanade", "knd", "かなで", "奏ちゃん", "奏"};
    }

    @Override
    protected void execute(CommandEvent event) {
        try{
            final List<RandomKanadeStamp> Values = List.of(RandomKanadeStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomKanadeStamp kanadeStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + kanadeStamp + "_rip/" + kanadeStamp + "/" + kanadeStamp + ".webp");
            embedBuilder.setColor(0xBB6688);
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

    public enum RandomKanadeStamp{

        //もう少し...
        stamp0200,

        //...(カップ麺)
        stamp0199,

        //曲、作らないと...
        stamp0198,

        //...ごめん
        stamp0197,

        //ありがとう
        stamp0196,

        //いい音だったよ
        stamp0195,

        //...そう
        stamp0194,

        //...いいね
        stamp0193,

        //...え
        stamp0192,

        //がんばって
        stamp0191,

        //...よろしく
        stamp0190,

        //[キャラランクスタンプ]
        //わたしが作らなくちゃ...
        stamp0028,

        //[初期スタンプ]
        //じゃ..
        stamp0010,
    }
}
