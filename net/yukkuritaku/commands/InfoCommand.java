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
    protected final void execute(final CommandEvent event) {
        final String str = "\n";
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Info");
        embedBuilder.setDescription(
                "このBotは自分が「ランダムにスタンプが選ばれる機能が欲しいなー」って思いながら作りました"
                        + str +
                        "色々頑張ってます！ バグや間違いあったら報告お願いします"
                        + str +
                        "開発環境: Java: Jdk-15.0.2, JDA: 4.2.0_168, jda-utilities: 3.0.5"
        );
        embedBuilder.addField("Version", "1.4.8", false);
        embedBuilder.addField("ChangeLog",
                   "1.0.0: 正式リリース(誰もしらんけど)"
                        + str +
                        "1.2.2: (DevLog)全てのJava classをfinalに変更、少しは軽くなったはず"
                        + str +
                        "1.2.5: ランダムコミックコマンドにレインボーカラーを追加(currentTimeMillisメソッド)"
                        + str +
                        "1.3.0:ランダムコミックコマンドにコミックの名前が出るようになりました"
                        + str +
                        "1.4.0: 全てのコマンドからDebug Infoを削除しました。(クールダウン軽減のため)"
                        + str +
                        "1.4.1: (DevLog)メソッドにfinalを追加"
                        + str +
                        "1.4.5: RandomStampCommand修正完了！ & jda-utilitiesを3.0.5に更新"
                        + str +
                        "1.4.6: (DevLog)MathUtils削除しました"
                        + str +
                        "1.4.7: (DevLog)MahuyuをMafuyuに変更しました"
                        + str +
                        "1.4.8: RandomStampCommand色々修正しました"
                ,

                false);
        event.reply(embedBuilder.build());
    }
}
