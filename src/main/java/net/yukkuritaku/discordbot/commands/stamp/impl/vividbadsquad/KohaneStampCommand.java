package net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class KohaneStampCommand extends Command {

    public KohaneStampCommand(){
        this.name = "stampkohane";
        this.help = "こはねちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"kohane", "khn", "こはね", "こはねちゃん", "小豆沢こはね", "小豆沢こはねちゃん", "最高の相棒"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try {
            final List<RandomKohaneStamp> Values = List.of(RandomKohaneStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomKohaneStamp kohaneStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + kohaneStamp + "_rip/" + kohaneStamp + "/" + kohaneStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + kohaneStamp + "_rip/" + kohaneStamp + "/" + kohaneStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.kohane.color);
            event.reply(embedBuilder.build());
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, exception.toString());
            exception.printStackTrace();
        }
    }

    public enum RandomKohaneStamp{
        //ガタガタガタ
        stamp0401,

        //ごめんね...！
        stamp0009,

        //ドキドキする...！
        stamp0400,

        //ど、どうしよう...
        stamp0399,

        //歌おうね
        stamp0398,

        //ありがとう（ありがとうございました）
        stamp0397,

        //す、すごい！
        stamp0396,

        //うぅ...
        stamp0395,

        //やったね
        stamp0394,

        //ひゃっ！
        stamp0393,

        //がんばって！
        stamp0392,

        //こ、こんにちは
        stamp0125,

        //歌うよ！
        stamp0020,
    }
}
