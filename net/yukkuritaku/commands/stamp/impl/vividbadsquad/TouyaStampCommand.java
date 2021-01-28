package net.yukkuritaku.commands.stamp.impl.vividbadsquad;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class TouyaStampCommand extends Command {

    public TouyaStampCommand(){
        this.name = "stamptouya";
        this.help = "冬弥のスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"touya", "とうや", "とうやくん", "冬弥", "冬弥くん", "青柳冬弥", "青柳冬弥くん"};
    }


    @Override
    protected void execute(CommandEvent event) {
        try {
            final List<RandomTouyaStamp> Values = List.of(RandomTouyaStamp.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomTouyaStamp touyaStamp = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + touyaStamp + "_rip/" + touyaStamp + "/" + touyaStamp + ".webp");
            embedBuilder.setColor(0x0077DD);
            ReplyUtils.logInfo(event, "Sending...");
            event.reply(embedBuilder.build());
            ReplyUtils.logSuccess(event, "Successful!");
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            exception.printStackTrace();
        }
    }

    public enum RandomTouyaStamp{
        //一緒に歌うか？
        stamp0148,

        //やりすぎだ
        stamp0147,

        //...じゃあ
        stamp0146,

        //悪かった
        stamp0145,

        //ありがとう
        stamp0144,

        //いいと思う
        stamp0143,

        //...
        stamp0142,

        //...よかった
        stamp0141,

        //...っ！
        stamp0140,

        //うまくいくといいな
        stamp0139,

        //どうも
        stamp0138,

        //歌うのが好きだ
        stamp0023,
    }
}
