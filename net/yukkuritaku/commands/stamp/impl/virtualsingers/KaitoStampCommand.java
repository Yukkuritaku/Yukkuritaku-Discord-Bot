package net.yukkuritaku.commands.stamp.impl.virtualsingers;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.commands.stamp.impl.niigo.KanadeStampCommand;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public class KaitoStampCommand extends Command {

    public KaitoStampCommand(){
        this.name = "stampkaito";
        this.help = "Kaitoのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"kaito", "かいと", "かいとくん", "カイト", "カイトくん"};
    }

    @Override
    protected void execute(CommandEvent event) {
        try{
            final List<RandomKaitoStamp> Values = List.of(RandomKaitoStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomKaitoStamp kaitoStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + kaitoStamp + "_rip/" + kaitoStamp + "/" + kaitoStamp + ".webp");
            embedBuilder.setColor(0x3366CC);
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

    public enum RandomKaitoStamp{
        //うぅ...
        stamp0005,

        //大丈夫だよ（イケメン顔）
        stamp0285,

        //楽しかったよ
        stamp0284,

        //そんな...(あわわ顔)
        stamp0283,

        //またね
        stamp0282,

        //ごめん！
        stamp0281,

        //ありがとう
        stamp0280,

        //いいね！
        stamp0279,

        //ははっ！
        stamp0278,

        //わあっ！
        stamp0277,

        //がんばろう！
        stamp0276,

        //よろしく
        stamp0275,

        //楽しんでくれてる？
        stamp0044,
    }
}
