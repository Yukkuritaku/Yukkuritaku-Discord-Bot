package net.yukkuritaku.discordbot.commands.stamp.impl.virtualsinger;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class RukaStampCommand extends Command{

    public RukaStampCommand(){
        this.name = "stampruka";
        this.help = "ルカちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"ruka", "るか", "るかちゃん", "ルカ", "ルカちゃん", "巡音ルカ", "巡音ルカちゃん"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try{
            final List<RandomRukaStamp> Values = List.of(RandomRukaStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomRukaStamp rukaStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + rukaStamp + "_rip/" + rukaStamp + "/" + rukaStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + rukaStamp + "_rip/" + rukaStamp + "/" + rukaStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.ruka.color);
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
