package net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class TsukasaStampCommand extends Command {

    public TsukasaStampCommand(){
        this.name = "stamptsukasa";
        this.help = "司くんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"tsukasa", "tks", "つかさ", "つかさくん", "司", "司くん", "天馬司", "天馬司くん", "未来のスター"};
    }


    @Override
    protected final void execute(final CommandEvent event) {
        try{
            final List<RandomTsukasaStamps> Values = List.of(RandomTsukasaStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomTsukasaStamps tsukasaStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + tsukasaStamps + "_rip/" + tsukasaStamps + "/" + tsukasaStamps + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + tsukasaStamps + "_rip/" + tsukasaStamps + "/" + tsukasaStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.TSUKASA.color);
            event.reply(embedBuilder.build());
        }catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomTsukasaStamps{
        //素晴らしいな！
        stamp0450,

        //もちろんフルコンだな！
        stamp0003,

        //オイィィ！
        stamp0413,

        //ショウの時間だ！（キリッ）
        stamp0412,

        //さらば！
        stamp0157,

        //すまん...
        stamp0156,

        //感謝する！
        stamp0155,

        //いい調子じゃないか！
        stamp0154,

        //く...
        stamp0153,

        //ハッハッハッ！
        stamp0152,

        //なぬっ！？
        stamp0151,

        //もっとできるだろ！
        stamp0150,

        //オレだ！
        stamp0149,

        //あいつらがいたからだ
        stamp0024,
    }
}
