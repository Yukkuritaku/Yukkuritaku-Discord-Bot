package net.yukkuritaku.commands.stamp.impl.leoneed;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ColorUtils;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class ItikaStampCommand extends Command {

    public ItikaStampCommand(){
        this.name = "stampitika";
        this.help = "一歌ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"itika", "いちか", "いちかちゃん", "一歌", "一歌ちゃん", "星乃一歌", "星乃一歌ちゃん", "いっちゃん"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try {
            final List<RandomItikaStamps> Values = List.of(RandomItikaStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomItikaStamps itikaStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + itikaStamps + "_rip/" + itikaStamps + "/" + itikaStamps + ".webp");
            embedBuilder.setColor(ColorUtils.itika.color);
            event.reply(embedBuilder.build());
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, exception.toString());

            exception.printStackTrace();
        }
    }

    public enum RandomItikaStamps{
        //ありがとう
        stamp0008,

        //じゃあ、いこうか
        stamp0382,

        //一緒にできてよかった
        stamp0381,

        //みんなすごいね
        stamp0056,

        //また今度
        stamp0055,

        //ごめん...
        stamp0054,

        //いい歌だったよ
        stamp0053,

        //はぁ...
        stamp0052,

        //ふふ
        stamp0051,

        //びっくりした...
        stamp0050,

        //一緒にがんばろう
        stamp0049,

        //よろしく
        stamp0048,

        //ずっと一緒にいようね
        stamp0012,
    }
}
