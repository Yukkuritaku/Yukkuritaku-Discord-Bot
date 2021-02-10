package net.yukkuritaku.commands.stamp.impl.vividbadsquad;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ColorUtils;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class AnStampCommand extends Command {

    public AnStampCommand(){
        this.name = "stampan";
        this.help = "杏ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"an", "あん", "あんちゃん", "杏", "杏ちゃん", "白石杏", "白石杏ちゃん"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try {
            final List<RandomAnStamp> Values = List.of(RandomAnStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomAnStamp anStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + anStamp + "_rip/" + anStamp + "/" + anStamp + ".webp");
            embedBuilder.setColor(ColorUtils.an.color);
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
