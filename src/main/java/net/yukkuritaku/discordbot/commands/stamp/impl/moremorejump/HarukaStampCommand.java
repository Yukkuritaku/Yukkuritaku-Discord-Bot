package net.yukkuritaku.discordbot.commands.stamp.impl.moremorejump;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class HarukaStampCommand extends Command {

    public HarukaStampCommand(){
        this.name = "stampharuka";
        this.help = "遥ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"haruka", "hrk", "はるか", "はるかちゃん", "遥ちゃん", "遥", "桐谷遥", "桐谷遥ちゃん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomHarukaStamp> values = Arrays.asList(RandomHarukaStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomHarukaStamp harukaStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + harukaStamp + "_rip/" + harukaStamp + "/" + harukaStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + harukaStamp + "_rip/" + harukaStamp + "/" + harukaStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.HARUKA.getColor());
            event.reply(embedBuilder.build());
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomHarukaStamp{
        //全力でやろう！
        stamp0498,

        //みんなで乗り越えよう！
        stamp0506,

        //いただきます
        stamp0448,

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
