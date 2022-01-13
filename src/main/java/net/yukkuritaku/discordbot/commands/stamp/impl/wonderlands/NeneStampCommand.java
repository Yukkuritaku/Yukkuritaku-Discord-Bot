package net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

//寧々ちゃんも好き
//というか　いち寧々の絡みもっとください
//えむねねもお願いします
public final class NeneStampCommand extends Command {


    public NeneStampCommand() {
        this.name = "stampnene";
        this.help = "寧々ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[]{"nene", "nenechan", "ねね", "ねねちゃん", "寧々", "寧々ちゃん", "草薙寧々", "草薙寧々ちゃん"};
    }


    @Override
    protected void execute(final CommandEvent event) {
        try {
            final List<RandomNeneStamps> values = Arrays.asList(RandomNeneStamps.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomNeneStamps neneStamps = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + neneStamps + "_rip/" + neneStamps + "/" + neneStamps + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + neneStamps + "_rip/" + neneStamps + "/" + neneStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.NENE.getColor());
            event.reply(embedBuilder.build());
        } catch (Exception exception) {
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, exception.toString());
            exception.printStackTrace();
        }
    }

    public enum RandomNeneStamps {
        //ビームの的にするから
        stamp0515,

        //死ぬかと思った...
        stamp0457,

        //なんか文句あんの？
        stamp0026,

        //わたしが一番楽しもう！
        stamp0426,

        //(寧々だヨーの圧がある顔のみ)
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
