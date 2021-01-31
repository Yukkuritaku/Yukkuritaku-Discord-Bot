package net.yukkuritaku.commands.stamp.impl.vividbadsquad;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class AkitoStampCommand extends Command {

    public AkitoStampCommand(){
        this.name = "stampakito";
        this.help = "彰人のスタンプからどれかが選ばれるよ";                                                     //↓だからそれやめろってーの！(この会話草生えた)
        this.aliases = new String[] {"akito", "あきと", "あきとくん", "彰人", "彰人くん", "東雲彰人", "東雲彰人", "弟くん"};
    }


    @Override
    protected final void execute(final CommandEvent event) {
        try {
            final List<RandomAkitoStamps> Values = List.of(RandomAkitoStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomAkitoStamps akitoStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + akitoStamps + "_rip/" + akitoStamps + "/" + akitoStamps + ".webp");
            embedBuilder.setColor(0xFF7722);
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
