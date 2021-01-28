package net.yukkuritaku.commands.stamp.impl.leoneed;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class ShihoStampCommand extends Command {

    public ShihoStampCommand(){
        this.name = "stampshiho";
        this.help = "志歩ちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"shiho", "しほ", "しほちゃん", "志歩", "志歩ちゃん", "日野森志歩", "日野森志歩ちゃん", "しぃちゃん"};
    }

    @Override
    protected void execute(CommandEvent event) {
        final List<RandomShihoStamp> Values = List.of(RandomShihoStamp.values());
        final int Size = Values.size();
        final Random rng = new Random();
        final RandomShihoStamp shihoStamp = Values.get(rng.nextInt(Size));
        try {
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + shihoStamp + "_rip/" + shihoStamp + "/" + shihoStamp + ".webp");
            embedBuilder.setColor(0xBBDD22);
            event.getChannel().sendTyping().queue();
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

    public enum RandomShihoStamp{
        //余裕でしょ
        stamp0086,

        //なにがしたいの（ジト目）
        stamp0085,

        //じゃ
        stamp0084,

        //ごめん
        stamp0083,

        //ありがと
        stamp0082,

        //いい音だったよ(奏ちゃんと同じだから奏ちゃんとの絡みも来る！？だとしたら楽しみ過ぎる)
        stamp0081,

        //はぁ...
        stamp0080,

        //いい感じ
        stamp0079,

        //...っ！
        stamp0078,

        //がんばろう
        stamp0077,

        //どうも
        stamp0076,

        //うん、上達してる
        stamp0015,
    }
}
