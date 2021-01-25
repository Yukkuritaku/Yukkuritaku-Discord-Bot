package net.yukkuritaku.commands.stamp.impl.niigo;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public class MahuyuStampCommand extends Command {

    public MahuyuStampCommand(){
        this.name = "stampmahuyu";
        this.help = "まふゆちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"mahuyu", "mhy", "まふゆちゃん", "まふゆ", "よくわからない", "yokuwakaranai", "朝比奈まふゆ", "朝比奈まふゆちゃん"};
    }

    @Override
    protected void execute(CommandEvent event) {
        try{
            final List<RandomMahuyuStamps> Values = List.of(RandomMahuyuStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomMahuyuStamps mahuyuStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mahuyuStamps + "_rip/" + mahuyuStamps + "/" + mahuyuStamps + ".webp");
            embedBuilder.setColor(0x8888CC);
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

    public enum RandomMahuyuStamps{

        //よくわからない
        stamp0422,

        //ひとりになりたい...(裏の表情、虚無の顔)
        stamp0416,

        //...(裏の表情、虚無の顔)
        stamp0415,

        //またね！
        stamp0209,

        //ごめんなさい
        stamp0208,

        //ありがとう
        stamp0207,

        //よかったね！
        stamp0206,

        //あ...
        stamp0205,

        //うれしいな
        stamp0204,

        //きゃっ！
        stamp0203,

        //いっしょにがんばろうね！
        stamp0202,

        //よろしくね
        stamp0201,

        //いい子、ね...
        stamp0029,
    }
}
