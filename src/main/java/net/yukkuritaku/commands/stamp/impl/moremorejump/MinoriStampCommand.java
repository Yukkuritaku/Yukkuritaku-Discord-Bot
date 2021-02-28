package net.yukkuritaku.commands.stamp.impl.moremorejump;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ColorUtils;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class MinoriStampCommand extends Command {

    public MinoriStampCommand(){
        this.name = "stampminori";
        this.help = "みのりちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"minori", "mnr", "みのりちゃん", "みのり", "花里みのり", "花里みのりちゃん"};
    }


    @Override
    protected final void execute(final CommandEvent event) {
        try{
            final List<RandomMinoriStamp> Values = List.of(RandomMinoriStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomMinoriStamp minoriStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + minoriStamp + "_rip/" + minoriStamp + "/" + minoriStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + minoriStamp + "_rip/" + minoriStamp + "/" + minoriStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.minori.color);
            event.reply(embedBuilder.build());
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomMinoriStamp{
        //もう1回！
        stamp0011,

        //届けたいな(希望を届けたいな！)
        stamp0097,

        //もっともっとがんばるよ！
        stamp0096,

        //またね！
        stamp0095,

        //ごめんなさい
        stamp0094,

        //ありがとう(ありがとうございます！)
        stamp0093,

        //さすが！
        stamp0092,

        //えーん
        stamp0091,

        //えへへ
        stamp0090,

        //はっ！
        stamp0089,

        //がんばろう！
        stamp0088,

        //よろしくね(よろしくお願いします！)
        stamp0087,

        //もっともっともーっと！
        stamp0016,
    }
}
