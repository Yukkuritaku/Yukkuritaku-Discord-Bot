package net.yukkuritaku.discordbot.commands.stamp.impl.niigo;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

//1月27日 まふゆちゃん誕生日おめでとう！
//もしかしたらMahuyuじゃなくてMafuyuの方が正しい？

//実はまふゆちゃんも推してる
public final class MafuyuStampCommand extends Command {

    public MafuyuStampCommand(){
        this.name = "stampmahuyu";
        this.help = "まふゆちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"mahuyu", "mhy", "mafuyu", "mfy", "まふゆちゃん", "まふゆ", "よくわからない", "yokuwakaranai", "朝比奈まふゆ", "朝比奈まふゆちゃん", "雪"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomMafuyuStamps> values = Arrays.asList(RandomMafuyuStamps.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomMafuyuStamps mafuyuStamps = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mafuyuStamps + "_rip/" + mafuyuStamps + "/" + mafuyuStamps + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mafuyuStamps + "_rip/" + mafuyuStamps + "/" + mafuyuStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.MAFUYU.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomMafuyuStamps{
        //見つけてくれてありがとう
        stamp0518,

        //う...
        stamp0460,

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
