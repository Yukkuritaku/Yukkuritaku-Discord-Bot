package net.yukkuritaku.discordbot.commands.stamp.impl.virtualsinger;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class KaitoStampCommand extends Command {

    public KaitoStampCommand(){
        this.name = "stampkaito";
        this.help = "Kaitoのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"kaito", "かいと", "かいとくん", "カイト", "カイトくん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomKaitoStamp> values = Arrays.asList(RandomKaitoStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomKaitoStamp kaitoStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + kaitoStamp + "_rip/" + kaitoStamp + "/" + kaitoStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + kaitoStamp + "_rip/" + kaitoStamp + "/" + kaitoStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.KAITO.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomKaitoStamp{
        //もっと盛り上がろう！
        stamp0526,

        //うぅ...
        stamp0005,

        //大丈夫だよ（イケメン顔）
        stamp0285,

        //楽しかったよ
        stamp0284,

        //そんな...(あわわ顔)
        stamp0283,

        //またね
        stamp0282,

        //ごめん！
        stamp0281,

        //ありがとう
        stamp0280,

        //いいね！
        stamp0279,

        //ははっ！
        stamp0278,

        //わあっ！
        stamp0277,

        //がんばろう！
        stamp0276,

        //よろしく
        stamp0275,

        //楽しんでくれてる？
        stamp0044,
    }
}
