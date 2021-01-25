package net.yukkuritaku.commands.stamp.impl;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.MathUtils;
import net.yukkuritaku.utils.ReplyUtils;

public class RandomStampCommand extends Command {

    public RandomStampCommand(){
        this.name = "randomstamp";
        this.help = "プロセカ全てのスタンプから1個選ばれるやつでございまし(上手く動かないので現在修正中)";
        this.aliases = new String[] {"rngst", "rs"};
    }

    @Override
    protected void execute(CommandEvent event) {
        try {
            final int randomint = MathUtils.RandomInteger(1, 428);
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0" + randomint + "_rip/stamp0" + randomint + "/stamp0" + randomint + ".webp");
            embedBuilder.setColor(0xf83249);

            ReplyUtils.logInfo(event, "Sending Random Stamp...");
            event.reply(embedBuilder.build());
            ReplyUtils.logSuccess(event, "Successful!");
        }
        catch (Exception exception){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            exception.printStackTrace();
        }
    }
}