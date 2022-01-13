package net.yukkuritaku.discordbot.commands.stamp.impl.virtualsinger;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class RenStampCommand extends Command {

    public RenStampCommand(){
        this.name = "stampren";
        this.help = "レンくんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"ren", "れん", "れんくん", "レン", "レンくん", "鏡音レン"};
    }


    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomRenStamps> values = Arrays.asList(RandomRenStamps.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomRenStamps renStamps = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + renStamps + "_rip/" + renStamps + "/" + renStamps + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + renStamps + "_rip/" + renStamps + "/" + renStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.REN.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomRenStamps{
        //ノリノリじゃん！
        stamp0523,

        //えっ！？
        stamp0006,

        //いいね！（リンと同じポーズ）
        stamp0263,

        //へへっ（どや顔）
        stamp0262,

        //まかせろー！
        stamp0261,

        //バイバーイ！
        stamp0260,

        //ごめん！
        stamp0259,

        //サンキュー！
        stamp0258,

        //えぇ...
        stamp0257,

        //イェーイ！(イエーイ！)
        stamp0256,

        //うわっ！
        stamp0255,

        //がんばろうな！
        stamp0254,

        //よろしく！
        stamp0253,

        //はやく歌いたいな
        stamp0040,
    }
}
