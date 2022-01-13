package net.yukkuritaku.discordbot.commands.stamp.impl.virtualsinger;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class LukaStampCommand extends Command{

    public LukaStampCommand(){
        this.name = "stampluka";
        this.help = "ルカちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"luka", "るか", "るかちゃん", "ルカ", "ルカちゃん", "巡音ルカ", "巡音ルカちゃん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomRukaStamp> values = Arrays.asList(RandomRukaStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomRukaStamp rukaStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + rukaStamp + "_rip/" + rukaStamp + "/" + rukaStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + rukaStamp + "_rip/" + rukaStamp + "/" + rukaStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.LUKA.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomRukaStamp{
        //期待していてくださいね
        stamp0524,

        //うれしいわ
        stamp0004,

        //どうだったかしら
        stamp0274,

        //ふふ
        stamp0273,

        //一緒に歌いましょう
        stamp0272,

        //また会えるといいわね
        stamp0271,

        //ごめんなさい
        stamp0270,

        //感謝するわ
        stamp0269,

        //よくできました
        stamp0268,

        //あ...
        stamp0267,

        //あら
        stamp0266,

        //頑張りましょう
        stamp0265,

        //よろしくね（よろしくお願いします）
        stamp0264,

        //準備はいいかしら
        stamp0042,

    }
}
