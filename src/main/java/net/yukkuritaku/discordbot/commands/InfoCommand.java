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
                "このBotは自分が「ランダムにプロセカのスタンプが選ばれる機能が欲しいなー」って思いながら作りました"
                        + str +
                        "色々頑張ってます！ バグや間違いあったら報告お願いします"
                        + str +
                        "開発環境: Java: Jdk-15.0.2, JDA: 4.2.0_168, jda-utilities: 3.0.5"
        );
        embedBuilder.addField("Version", "1.7.5", false);
        embedBuilder.addField("ChangeLog",
                "1.7.4: 4コマの35話追加"
                + str + "1.7.5: 咲希ちゃんのスタンプ追加"
                ,

                false);
        event.reply(embedBuilder.build());
    }
}
