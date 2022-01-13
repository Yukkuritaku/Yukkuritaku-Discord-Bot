package net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class ToyaStampCommand extends Command {

    public ToyaStampCommand(){
        this.name = "stamptoya";
        this.help = "冬弥のスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"toya", "とうや", "とうやくん", "冬弥", "冬弥くん", "青柳冬弥", "青柳冬弥くん"};
    }


    @Override
    protected void execute(final CommandEvent event) {
        try {
            final List<RandomTouyaStamp> values = Arrays.asList(RandomTouyaStamp.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomTouyaStamp touyaStamp = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + touyaStamp + "_rip/" + touyaStamp + "/" + touyaStamp + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + touyaStamp + "_rip/" + touyaStamp + "/" + touyaStamp + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.TOYA.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, exception.toString());
            exception.printStackTrace();
        }
    }

    public enum RandomTouyaStamp{
        //照れるな
        stamp0512,

        //いい経験になった
        stamp0497,

        //俺は俺の道を進む
        stamp0429,

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
