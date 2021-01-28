package net.yukkuritaku.commands.stamp.impl.virtualsingers;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class RinStampCommand extends Command {

    public RinStampCommand(){
        this.name = "stamprin";
        this.help = "リンちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"rin", "りん", "りんちゃん", "リン", "リンちゃん", "鏡音リン", "鏡音リンちゃん", "りんちゃんなう！", "リンちゃんなう！", "りんちゃんなう", "リンちゃんなう"};
    }


    @Override
    protected void execute(CommandEvent event) {
        try{
            final List<RandomRinStamps> Values = List.of(RandomRinStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomRinStamps rinStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + rinStamps + "_rip/" + rinStamps + "/" + rinStamps + ".webp");
            embedBuilder.setColor(0xFFCC11);
            ReplyUtils.logInfo(event, "Sending...");
            event.reply(embedBuilder.build());
            ReplyUtils.logSuccess(event, "Successful!");
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            e.printStackTrace();
        }
    }

    public enum RandomRinStamps{
        //がんばろー！
        stamp0002,

        //よろしく！
        stamp0417,

        //いいね！（レンと同じポーズ）
        stamp0252,

        //えへへ
        stamp0251,

        //元気にいこー！
        stamp0250,

        //またねー！
        stamp0249,

        //ごめんなさ～い！
        stamp0248,

        //ありがとう！
        stamp0247,

        //よかったね！
        stamp0246,

        //しくしく...
        stamp0245,

        //イェーイ！
        stamp0244,

        //ええっ！？
        stamp0243,

        //早く歌いたーい！
        stamp0038,
    }
}
