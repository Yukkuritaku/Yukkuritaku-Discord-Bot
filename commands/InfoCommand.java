package net.yukkuritaku.discordbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;

public final class InfoCommand extends Command {

    public InfoCommand(){
     this.name = "info";
     this.help = "このBotの詳細を確認出来ます";
     this.aliases = new String[] {"i"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        final String str = "\n";
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Info");
        embedBuilder.setColor(ColorUtils.astolfo(1, 3, 0.5f, 1.0f, 1));
        embedBuilder.setDescription(
                //"このBotは自分が「ランダムにプロセカのスタンプが選ばれる機能が欲しいなー」って思いながら作りました"
                        //+ str +
                        "色々頑張ってます！ バグや間違いあったら報告お願いします"
                        + str +
                        "開発環境: Jdk-16(Java), JDA: 4.3.0_277, jda-utilities: 3.0.5"
        );
        embedBuilder.addField("Version", "2.0.0", false);
        embedBuilder.addField("ChangeLog",
                "Random4ComaCommand(4コマコマンド)に選べる機能をを追加。" + str + ".Random4ComaCommandの名前 index <数字> を入れるとその話数が出てくるよ(見つからない場合は1話が出てきます)"
                + str + "2.0.0: JDAを地味にアップデート。"
                ,

                false);
        event.reply(embedBuilder.build());
    }
}
