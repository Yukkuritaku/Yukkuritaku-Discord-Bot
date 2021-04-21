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
                        "開発環境: Jdk-16(Java), JDA(Java Discord Api): 4.2.0_168, jda-utilities: 3.0.5"
        );
        embedBuilder.addField("Version", "1.8.6", false);
        embedBuilder.addField("ChangeLog",
                "1.7.10: ミニアプデ、エイリアスの色々修正"
                + str + "1.8.0: 一歌ちゃんのスタンプ追加(https://twitter.com/pj_sekai/status/1378951470712713219?s=20)"
                + str + "1.8.1: 4コマの39話追加(https://twitter.com/pj_sekai/status/1379631654931554305?s=20)"
                + str + "1.8.2: 瑞希のスタンプ追加(https://twitter.com/pj_sekai/status/1381155563627683840?s=20)"
                + str + "1.8.3: 4コマの40話追加(https://twitter.com/pj_sekai/status/1381441978882084867?s=20)"
                + str + "1.8.4: 4コマの41話追加(https://twitter.com/pj_sekai/status/1382167483147161602?s=20)"
                + str + "1.8.5-Beta1: リンちゃんのエイリアスが多すぎたのでちょっと少なくしました（（"
                + str + "1.8.6: 志歩ちゃんのスタンプ追加"
                ,

                false);
        event.reply(embedBuilder.build());
    }
}
