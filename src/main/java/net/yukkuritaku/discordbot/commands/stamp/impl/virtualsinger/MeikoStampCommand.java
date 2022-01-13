package net.yukkuritaku.discordbot.commands.stamp.impl.virtualsinger;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class MeikoStampCommand extends Command {

    public MeikoStampCommand(){
        this.name = "stampmeiko";
        this.help = "Meikoさんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"meiko", "meikosan", "めいこ", "めいこさん", "メイコ", "メイコさん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomMeikoStamp> values = Arrays.asList(RandomMeikoStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomMeikoStamp meikoStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + meikoStamp + "_rip/" + meikoStamp + "/" + meikoStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + meikoStamp + "_rip/" + meikoStamp + "/" + meikoStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.MEIKO.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomMeikoStamp{
        //まだまだいくわよ！
        stamp0525,

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
