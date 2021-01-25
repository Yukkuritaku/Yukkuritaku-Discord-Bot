package net.yukkuritaku.commands.stamp.impl.virtualsingers;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public class MeikoStampCommand extends Command {

    public MeikoStampCommand(){
        this.name = "stampmeiko";
        this.help = "Meikoさんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"meiko", "meikosan", "めいこ", "めいこさん", "メイコ", "メイコさん"};
    }

    @Override
    protected void execute(CommandEvent event) {
        try{
            final List<RandomMeikoStamp> Values = List.of(RandomMeikoStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomMeikoStamp meikoStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + meikoStamp + "_rip/" + meikoStamp + "/" + meikoStamp + ".webp");
            embedBuilder.setColor(0xDD4444);
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

    public enum RandomMeikoStamp{
        //すごいね (この顔かわいいよね)
        stamp0007,

        //始めましょ（さあ、始めましょ！）
        stamp0296,

        //一息つきましょ？
        stamp0295,

        //楽しい時間だったわね
        stamp0294,

        //じゃあね
        stamp0293,

        //ごめんね
        stamp0292,

        //ありがとう！
        stamp0291,

        //はぁ...
        stamp0290,

        //ふふ
        stamp0289,

        //えっ！？
        stamp0288,

        //ファイト！
        stamp0287,

        //よろしくね♪
        stamp0286,

        //応援ありがとう♪
        stamp0046,
    }
}
