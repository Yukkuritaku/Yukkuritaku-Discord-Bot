package net.yukkuritaku.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

public class InfoCommand extends Command {

    public InfoCommand(){
     this.name = "info";
     this.help = "このBotの詳細を確認出来ます";
     this.aliases = new String[] {"i"};
    }

    @Override
    protected void execute(CommandEvent event) {
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Info");
        embedBuilder.setDescription("このBotは自分が「ランダムにスタンプが選ばれる機能が欲しいなー」って思いながら作りました" +
                "　色々頑張ってます！ バグや間違いあったら報告お願いします");
        embedBuilder.addField("Version", "1.0.0", false);
        embedBuilder.addField("ChangeLog","clearコマンド追加(使用する際は注意！)、バチャシン追加、多分公開する...かも", false);
        event.reply(embedBuilder.build());
    }
}
