package net.yukkuritaku.commands.stamp.impl.leoneed;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class HonamiStampCommand extends Command {

    public HonamiStampCommand(){
        this.name = "stamphonami";
        this.help = "穂波ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"honami", "ほなみ", "ほなみちゃん", "ほなちゃん", "穂波", "穂波ちゃん", "望月穂波", "望月穂波ちゃん"};
    }

    @Override
    protected void execute(CommandEvent event) {
        try{
            final List<RandomHonamiStamp> Values = List.of(RandomHonamiStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomHonamiStamp honamiStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + honamiStamp + "_rip/" + honamiStamp + "/" + honamiStamp + ".webp");
            embedBuilder.setColor(0xEE6666);
            ReplyUtils.logInfo(event, "Sending...");
            event.reply(embedBuilder.build());
            ReplyUtils.logSuccess(event, "Successful!");
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomHonamiStamp{
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
