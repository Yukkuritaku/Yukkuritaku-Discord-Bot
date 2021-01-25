package net.yukkuritaku.commands.stamp.impl.moremorejump;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public class HarukaStampCommand extends Command {

    public HarukaStampCommand(){
        this.name = "stampharuka";
        this.help = "遥ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"haruka", "hrk", "はるか", "はるかちゃん", "遥ちゃん", "遥", "桐谷遥", "桐谷遥ちゃん"};
    }

    @Override
    protected void execute(CommandEvent event) {
        try{
            final List<RandomHarukaStamp> Values = List.of(RandomHarukaStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomHarukaStamp harukaStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + harukaStamp + "_rip/" + harukaStamp + "/" + harukaStamp + ".webp");
            embedBuilder.setColor(0x99CCFF);
            ReplyUtils.logInfo(event, "Sending...");
            event.reply(embedBuilder.build());
            ReplyUtils.logSuccess(event, "Successful!");
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            e.printStackTrace();
        }
    }

    public enum RandomHarukaStamp{

        //練習しないと
        stamp0387,

        //かわいい...！
        stamp0386,

        //さようなら
        stamp0106,

        //すみません...
        stamp0105,

        //ありがとう
        stamp0104,

        //よくできたね(よくできたわね)
        stamp0103,

        //そう...
        stamp0102,

        //ふふ
        stamp0101,

        //驚いた(驚いたわ)
        stamp0100,

        //頑張りましょう
        stamp0099,

        //よろしく(よろしくお願いします)
        stamp0098,

        //希望をみんなに！！
        stamp0017,
    }
}
