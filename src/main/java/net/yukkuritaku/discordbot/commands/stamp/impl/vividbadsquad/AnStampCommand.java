package net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class AnStampCommand extends Command {

    public AnStampCommand(){
        this.name = "stampan";
        this.help = "杏ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"an", "あん", "あんちゃん", "杏", "杏ちゃん", "白石杏", "白石杏ちゃん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try {
            final List<RandomAnStamp> values = Arrays.asList(RandomAnStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomAnStamp anStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + anStamp + "_rip/" + anStamp + "/" + anStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + anStamp + "_rip/" + anStamp + "/" + anStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.AN.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, exception.toString());
            exception.printStackTrace();
        }
    }

    public enum RandomAnStamp{
        //最高のイベントを作ろう
        stamp0510,

        //やるしかない！
        stamp0490,

        //最高の相棒だよ！
        stamp0021,

        //信じるよ！
        stamp0425,

        //へー（じっと目）
        stamp0411,

        //たよっていいからね
        stamp0410,

        //じゃあね！
        stamp0409,

        //ごめん！
        stamp0408,

        //ありがとう！
        stamp0407,

        //いいね！
        stamp0406,

        //そんな...！
        stamp0405,

        //いいじゃん！
        stamp0404,

        //わっ！？
        stamp0403,

        //いっしょにがんばろうね！
        stamp0402,

        //やっほー！
        stamp0126,
    }
}
