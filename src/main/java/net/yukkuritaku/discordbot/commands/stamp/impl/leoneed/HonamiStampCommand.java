package net.yukkuritaku.discordbot.commands.stamp.impl.leoneed;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class HonamiStampCommand extends Command {

    public HonamiStampCommand(){
        this.name = "stamphonami";
        this.help = "穂波ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"honami", "ほなみ", "ほなみちゃん", "ほなちゃん", "穂波", "穂波ちゃん", "望月穂波", "望月穂波ちゃん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomHonamiStamp> values = Arrays.asList(RandomHonamiStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomHonamiStamp honamiStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + honamiStamp + "_rip/" + honamiStamp + "/" + honamiStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + honamiStamp + "_rip/" + honamiStamp + "/" + honamiStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.HONAMI.getColor());
            event.reply(embedBuilder.build());
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomHonamiStamp{
        //あらためてよろしくね
        stamp0503,

        //一緒にやらせて！
        stamp0493,

        //もう一回やってみよう！
        stamp0455,

        //ごめん...行くね
        stamp0014,

        //全力を尽くします！
        stamp0427,

        //準備できた？
        stamp0075,

        //おつかれさま
        stamp0074,

        //またね
        stamp0073,

        //ごめんなさい！
        stamp0072,

        //ありがとう！
        stamp0071,

        //えらいえらい
        stamp0070,

        //あ...
        stamp0069,

        //ふふ
        stamp0068,

        //うわぁ！
        stamp0067,

        //がんばれ♪
        stamp0066,

        //よろしくね
        stamp0065,
    }
}
