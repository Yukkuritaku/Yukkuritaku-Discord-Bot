package net.yukkuritaku.discordbot.commands.stamp.impl.leoneed;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class SakiStampCommand extends Command {

    public SakiStampCommand(){
        this.name = "stampsaki";
        this.help = "咲希ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"saki", "さき", "さきちゃん", "咲希", "咲希ちゃん", "天馬咲希", "天馬咲希ちゃん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomSakiStamp> values = Arrays.asList(RandomSakiStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomSakiStamp sakiStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + sakiStamp + "_rip/" + sakiStamp + "/" + sakiStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + sakiStamp + "_rip/" + sakiStamp + "/" + sakiStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.SAKI.getColor());
            event.reply(embedBuilder.build());
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomSakiStamp{
        //はりきっていくよ！
        stamp0502,

        //わかっちゃった！
        stamp0452,

        //うぇーん
        stamp0432,

        //たっくさん青春したい！
        stamp0013,

        //おつかれさま！
        stamp0421,

        //いいライブだったね！
        stamp0385,

        //てへっ☆
        stamp0384,

        //またね～
        stamp0383,

        //ごめんね！
        stamp0064,

        //ありがとう♪
        stamp0063,

        //すごーい！
        stamp0062,

        //うーん...
        stamp0061,

        //やった！
        stamp0060,

        //びっくりした！
        stamp0059,

        //いいライブになるよ（きっといいライブになるよ）
        stamp0058,

        //よろしくね～♪
        stamp0057,
    }
}
