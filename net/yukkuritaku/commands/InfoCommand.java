package net.yukkuritaku.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

public final class InfoCommand extends Command {

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
        embedBuilder.addField("Version", "1.3.0", false);
        embedBuilder.addField("ChangeLog","1.2.2: (DevLog)全てのJava classをfinalに変更、少しは軽くなったはず 1.3.0:ランダムコミックコマンドにコミックの名前が出るようになりました", false);
        event.reply(embedBuilder.build());
    }
}
