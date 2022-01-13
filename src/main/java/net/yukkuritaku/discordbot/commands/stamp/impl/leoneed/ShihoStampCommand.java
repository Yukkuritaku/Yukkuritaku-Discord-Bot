package net.yukkuritaku.discordbot.commands.stamp.impl.leoneed;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class ShihoStampCommand extends Command {

    public ShihoStampCommand(){
        this.name = "stampshiho";
        this.help = "志歩ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"shiho", "しほ", "しほちゃん", "志歩", "志歩ちゃん", "日野森志歩", "日野森志歩ちゃん", "しぃちゃん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        final List<RandomShihoStamp> values = Arrays.asList(RandomShihoStamp.values());
        final int size = values.size();
        final Random rng = new Random();
        final RandomShihoStamp shihoStamp = values.get(rng.nextInt(size));
        try {
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + shihoStamp + "_rip/" + shihoStamp + "/" + shihoStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + shihoStamp + "_rip/" + shihoStamp + "/" + shihoStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.SHIHO.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomShihoStamp{
        //今回だけだよ
        stamp0504,

        //たくさんもらったよ
        stamp0458,

        //後悔しても知らないよ
        stamp0445,

        //余裕でしょ
        stamp0086,

        //なにがしたいの（ジト目）
        stamp0085,

        //じゃ
        stamp0084,

        //ごめん
        stamp0083,

        //ありがと
        stamp0082,

        //いい音だったよ(奏ちゃんと同じだから奏ちゃんとの絡みも来る！？だとしたら楽しみ過ぎる)
        stamp0081,

        //はぁ...
        stamp0080,

        //いい感じ
        stamp0079,

        //...っ！
        stamp0078,

        //がんばろう
        stamp0077,

        //どうも
        stamp0076,

        //うん、上達してる
        stamp0015,
    }
}
