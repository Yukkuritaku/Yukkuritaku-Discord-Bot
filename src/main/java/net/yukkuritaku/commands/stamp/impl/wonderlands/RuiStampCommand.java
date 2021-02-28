package net.yukkuritaku.commands.stamp.impl.wonderlands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ColorUtils;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class RuiStampCommand extends Command {

    public RuiStampCommand(){
        this.name = "stamprui";
        this.help = "類くんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"rui", "るいくん", "るい", "類", "類くん", "神代類", "神代類くん", "ひとりぼっちの錬金術師"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try{
            final List<RandomRuiStamp> Values = List.of(RandomRuiStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomRuiStamp ruiStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + ruiStamp + "_rip/" + ruiStamp + "/" + ruiStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + ruiStamp + "_rip/" + ruiStamp + "/" + ruiStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.rui.color);
            event.reply(embedBuilder.build());
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomRuiStamp{
        //素晴らしい
        stamp0027,

        //派手にいこう！
        stamp0423,

        //共にいこう！（共にいこうじゃないか！）
        stamp0414,

        //じゃあね！（星3類くんの顔）
        stamp0189,

        //ショウタイムだ（では、ショウタイムだ）
        stamp0188,

        //またお会いしよう！
        stamp0187,

        //悪かったね
        stamp0186,

        //ありがとう
        stamp0185,

        //素晴らしいね！
        stamp0184,

        //ふーん...
        stamp0183,

        //フフフ
        stamp0182,

        //おや？
        stamp0181,

        //よろしく
        stamp0180,
    }
}
