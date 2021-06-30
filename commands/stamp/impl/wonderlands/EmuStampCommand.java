package net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

//ちなみに主はえむちゃんも推してる
public final class EmuStampCommand extends Command {

    public EmuStampCommand(){
        this.name = "stampemu";
        this.help = "えむちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"emu", "えむ", "えむちゃん", "鳳えむ", "鳳えむちゃん", "わんだほーい！", "魔王様のお世話係えむむ", "ぷぎゅ", "wandahoi"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try {
            final List<RandomEmuStamps> Values = List.of(RandomEmuStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomEmuStamps emuStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + emuStamps + "_rip/" + emuStamps + "/" + emuStamps + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + emuStamps + "_rip/" + emuStamps + "/" + emuStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.EMU.color);
            event.reply(embedBuilder.build());
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, exception.toString());
            exception.printStackTrace();
        }
    }

    public enum RandomEmuStamps{
        //ポカポカするよ！
        stamp0431,

        //わんだほーい！
        stamp0168,

        //わーいわーい！
        stamp0167,

        //またねっ☆
        stamp0166,

        //ごめんなさい！
        stamp0165,

        //楽しかったね！
        stamp0164,

        //えらいえらい！
        stamp0163,

        //困ったな～
        stamp0162,

        //わっはっはー！
        stamp0161,

        //ええーっ！？
        stamp0160,

        //えいえいおー！
        stamp0159,

        //よろしくねっ☆
        stamp0158,

        //約束、してくれたよね
        stamp0025,
    }
}
