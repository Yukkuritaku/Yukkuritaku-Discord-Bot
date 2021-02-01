package net.yukkuritaku.commands.stamp.impl.moremorejump;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class AiriStampCommand extends Command {

    public AiriStampCommand(){
        this.name = "stampairi";
        this.help = "愛莉ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"airi", "あいり", "あいりちゃん", "愛莉", "愛莉ちゃん", "桃井愛莉", "桃井愛莉ちゃん"};
    }


    @Override
    protected final void execute(final CommandEvent event) {
        try{
            final List<RandomAiriStamp> Values = List.of(RandomAiriStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomAiriStamp airiStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + airiStamp + "_rip/" + airiStamp + "/" + airiStamp + ".webp");
            embedBuilder.setColor(0xFFAACC);
            event.reply(embedBuilder.build());
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomAiriStamp{
        //全力でやらなくちゃ！
        stamp0018,

        //ここからスタートよ
        stamp0424,

        //任せなさい！
        stamp0389,

        //目指せてっぺん！(目指せアイドルのてっぺん！)
        stamp0388,

        //また一緒に歌いましょ(また一緒に歌おうね！)
        stamp0115,

        //ごめん！
        stamp0114,

        //ありがとうね
        stamp0113,

        //やるじゃない！(やるじゃん！)
        stamp0112,

        //むむむ...
        stamp0111,

        //えへへ
        stamp0110,

        //うわぁ！
        stamp0109,

        //ファイト！
        stamp0108,

        //よろしくね！
        stamp0107,
    }
}
