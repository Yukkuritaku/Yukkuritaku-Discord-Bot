package net.yukkuritaku.commands.stamp.impl.niigo;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ColorUtils;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class MizukiStampCommand extends Command {

    public MizukiStampCommand(){
        this.name = "stampmizuki";
        this.help = "瑞希のスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"mizuki", "mzk", "みずき", "みずきちゃん", "みずきくん", "瑞希", "瑞希ちゃん", "瑞希くん", "暁山瑞希", "amia"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try{
            final List<RandomMizukiStamps> Values = List.of(RandomMizukiStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomMizukiStamps mizukiStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mizukiStamps + "_rip/" + mizukiStamps + "/" + mizukiStamps + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mizukiStamps + "_rip/" + mizukiStamps + "/" + mizukiStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.mizuki.color);
            event.reply(embedBuilder.build());
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomMizukiStamps{
        //ちょっとー！(ちょっとー！（ぷんぷん）)
        stamp0231,

        //かわいいでしょ？
        stamp0230,

        //じゃあね～♪
        stamp0229,

        //ごめんね！
        stamp0228,

        //楽しかったね
        stamp0227,

        //いいね！
        stamp0226,

        //そんな...
        stamp0225,

        //ふふっ
        stamp0224,

        //へー！
        stamp0223,

        //いけるよね？
        stamp0222,

        //よろしく～
        stamp0221,

        //ボクはずっとボクだよ
        stamp0031,
    }
}
