package net.yukkuritaku.discordbot.commands.stamp.impl.niigo;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

//2021年2月10日 奏ちゃんお誕生日おめでとう！！！！
//まじでニーゴ全員幸せになって...

//ちなみに僕は奏ちゃん推しです
public final class KanadeStampCommand extends Command {

    public KanadeStampCommand(){
        this.name = "stampkanade";
        this.help = "奏ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"kanade", "knd", "かなで", "かなでちゃん", "奏ちゃん", "奏", "宵崎奏", "宵崎奏ちゃん", "K"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomKanadeStamp> values = Arrays.asList(RandomKanadeStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomKanadeStamp kanadeStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + kanadeStamp + "_rip/" + kanadeStamp + "/" + kanadeStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + kanadeStamp + "_rip/" + kanadeStamp + "/" + kanadeStamp + ".webp"
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.KANADE.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomKanadeStamp{
        //25時、ナイトコードで。
        stamp0517,

        //こういうことなんだね
        stamp0451,

        //もう少し...
        stamp0200,

        //...(カップ麺)
        stamp0199,

        //曲、作らないと...
        stamp0198,

        //...ごめん
        stamp0197,

        //ありがとう
        stamp0196,

        //いい音だったよ
        stamp0195,

        //...そう
        stamp0194,

        //...いいね
        stamp0193,

        //...え
        stamp0192,

        //がんばって
        stamp0191,

        //...よろしく
        stamp0190,

        //[キャラランクスタンプ]
        //わたしが作らなくちゃ...
        stamp0028,

        //[初期スタンプ]
        //じゃ..
        stamp0010,
    }
}
