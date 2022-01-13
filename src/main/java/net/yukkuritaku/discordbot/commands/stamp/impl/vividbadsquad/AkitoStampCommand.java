package net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class AkitoStampCommand extends Command {

    public AkitoStampCommand(){
        this.name = "stampakito";
        this.help = "彰人のスタンプからどれかが選ばれるよ";                                                         //↓だからそれやめろってーの！(この会話草生えた)
        this.aliases = new String[] {"akito", "あきと", "あきとくん", "彰人", "彰人くん", "東雲彰人", "東雲彰人くん", "弟くん"};
    }


    @Override
    protected void execute(final CommandEvent event) {
        try {
            final List<RandomAkitoStamps> values = Arrays.asList(RandomAkitoStamps.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomAkitoStamps akitoStamps = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + akitoStamps + "_rip/" + akitoStamps + "/" + akitoStamps + ".png";
            //final String url ="https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + akitoStamps + "_rip/" + akitoStamps + "/" + akitoStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.AKITO.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, exception.toString());
            exception.printStackTrace();
        }
    }

    public enum RandomAkitoStamps{
        //真っ向勝負だ！
        stamp0511,

        //いくぞ、お前ら！
        stamp0446,

        //盛り上がろうぜ！（盛り上がっていこうぜ！）
        stamp0137,

        //面白そうじゃん
        stamp0136,

        //じゃな
        stamp0135,

        //わるい...
        stamp0134,

        //サンキュー
        stamp0133,

        //ちょっと見直したぜ
        stamp0132,

        //くそ...
        stamp0131,

        //ははは
        stamp0130,

        //は！？
        stamp0129,

        //やるぞ！
        stamp0128,

        //よっ
        stamp0127,

        //必要だって言ってる！
        stamp0022,
    }
}
