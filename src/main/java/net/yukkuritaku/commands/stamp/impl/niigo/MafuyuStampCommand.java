package net.yukkuritaku.commands.stamp.impl.niigo;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

//1月27日 まふゆちゃん誕生日おめでとう！
//もしかしたらMahuyuじゃなくてMafuyuの方が正しい？

//実はまふゆちゃんも推してる
public final class MafuyuStampCommand extends Command {

    public MafuyuStampCommand(){
        this.name = "stampmahuyu";
        this.help = "まふゆちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"mahuyu", "mhy", "mafuyu", "mfy", "まふゆちゃん", "まふゆ", "よくわからない", "yokuwakaranai", "朝比奈まふゆ", "朝比奈まふゆちゃん", "雪"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try{
            final List<RandomMafuyuStamps> Values = List.of(RandomMafuyuStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomMafuyuStamps mafuyuStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mafuyuStamps + "_rip/" + mafuyuStamps + "/" + mafuyuStamps + ".webp");
            embedBuilder.setColor(0x8888CC);
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomMafuyuStamps{
        //よくわからない
        stamp0422,

        //ひとりになりたい...(裏の表情、虚無の顔)
        stamp0416,

        //...(裏の表情、虚無の顔)
        stamp0415,

        //またね！
        stamp0209,

        //ごめんなさい
        stamp0208,

        //ありがとう
        stamp0207,

        //よかったね！
        stamp0206,

        //あ...
        stamp0205,

        //うれしいな
        stamp0204,

        //きゃっ！
        stamp0203,

        //いっしょにがんばろうね！
        stamp0202,

        //よろしくね
        stamp0201,

        //いい子、ね...
        stamp0029,
    }
}
