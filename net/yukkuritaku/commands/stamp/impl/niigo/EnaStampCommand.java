package net.yukkuritaku.commands.stamp.impl.niigo;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class EnaStampCommand extends Command {


    public EnaStampCommand(){
        this.name = "stampena";
        this.help = "えななんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"enanan", "ena", "えな", "えなちゃん", "えななん", "東雲絵名", "東雲絵名ちゃん"};
    }

    @Override
    protected final void execute(final CommandEvent event){
        try {
            final List<RandomEnanan> Values = List.of(RandomEnanan.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomEnanan enanan = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + enanan + "_rip/" + enanan + "/" + enanan + ".webp");
            embedBuilder.setColor(0xCCAA88);
            event.reply(embedBuilder.build());
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, exception.toString());
            exception.printStackTrace();
        }
    }

    public enum RandomEnanan{
        //(自撮り)
        stamp0220,

        //ねむい...
        stamp0219,

        //またね～
        stamp0218,

        //...ごめんってば
        stamp0217,

        //ありがとう！
        stamp0216,

        //よかったね♪
        stamp0215,

        //うん...
        stamp0214,

        //えへへ
        stamp0213,

        //きゃっ！
        stamp0212,

        //ほどほどにがんばろ？
        stamp0211,

        //よろしく♪
        stamp0210,

        //いいねついてる♪
        stamp0030,

    }
}
