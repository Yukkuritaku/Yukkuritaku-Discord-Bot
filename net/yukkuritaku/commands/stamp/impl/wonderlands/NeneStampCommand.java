package net.yukkuritaku.commands.stamp.impl.wonderlands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public class NeneStampCommand extends Command {


    public NeneStampCommand(){
        this.name = "stampnene";
        this.help = "寧々ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"nene", "nenechan", "ねね", "ねねちゃん", "寧々", "寧々ちゃん", "草薙寧々", "草薙寧々ちゃん"};
    }


    @Override
    protected void execute(CommandEvent event) {
        try {
            final List<RandomNeneStamps> Values = List.of(RandomNeneStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomNeneStamps neneStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + neneStamps + "_rip/" + neneStamps + "/" + neneStamps + ".webp");
            embedBuilder.setColor(0x33DD99);
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

    /**
     *
     */
    public enum RandomNeneStamps{

        //なんか文句あんの？
        stamp0026,

        //わたしが一番楽しもう！
        stamp0426,

        //寧々だヨーの圧がある顔のみ
        stamp0179,

        //...ふーん
        stamp0178,

        //じゃあね
        stamp0177,

        //ごめん...
        stamp0176,

        //...ありがと
        stamp0175,

        //いい歌だった
        stamp0174,

        //ん...
        stamp0173,

        //ふふ
        stamp0172,

        //え...
        stamp0171,

        //やれるでしょ
        stamp0170,

        //...なに
        stamp0169,
    }
}
