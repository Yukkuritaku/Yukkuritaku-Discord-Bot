package net.yukkuritaku.commands.stamp.impl.virtualsingers;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class RenStampCommand extends Command {

    public RenStampCommand(){
        this.name = "stampren";
        this.help = "レンくんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"ren", "れん", "れんくん", "レン", "レンくん", "鏡音レン"};
    }


    @Override
    protected final void execute(final CommandEvent event) {
        try{
            final List<RandomRenStamps> Values = List.of(RandomRenStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomRenStamps renStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + renStamps + "_rip/" + renStamps + "/" + renStamps + ".webp");
            embedBuilder.setColor(0xFFEE11);
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
