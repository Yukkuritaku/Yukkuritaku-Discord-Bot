package net.yukkuritaku.discordbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;

import java.util.Random;

public final class InfoCommand extends Command {

    public final String[] miniMessage = {"後にまた大型コードの改変をするかも！"};

    public InfoCommand() {
        this.name = "info";
        this.help = "このBotの詳細を確認出来ます";
        this.aliases = new String[]{"i"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        final String str = "\n";
        int randomString = new Random().nextInt(miniMessage.length);
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Info");
        embedBuilder.setFooter(miniMessage[randomString]);
        embedBuilder.setColor(ColorUtils.createRainbow(360));
        embedBuilder.setDescription(
                //"このBotは自分が「ランダムにプロセカのスタンプが選ばれる機能が欲しいなー」って思いながら作りました"
                //+ str +
                "色々頑張ってます！ バグや間違いあったら報告お願いします"
                        + str +
                        "開発環境: Jdk-17.0.1(Java), JDA: 4.4.0_350, jda-chewtils: 1.23.0");
        embedBuilder.addField("Version", "2.2.2-old-final", false);
        // "\n2.0.5: 4コマの ポカリコラボ特別編「タイミング？」 を追加。内部では55話に指定していて数値も55に指定しています。(これは後の4コマの話数によって変わる可能性があるよ)" +
        embedBuilder.addField("ChangeLog", """
                        Random4ComaCommand(4コマコマンド)に選べる機能をを追加。
                        .Random4ComaCommandの名前 index <数字> を入れるとその話数が出てくるよ
                        2.1.7: log4jのリモートコード脆弱性回避のため2.16.0に更新、4コマの81話を追加。
                        2.1.8: jda-utilitiesからjda-chewtilsに更新
                        2.1.9: 各種更新
                        2.2.0: 遥ちゃんのスタンプ「全力でやろう！」を追加。
                        2.2.1: 4コマの83、84、85話を追加。
                        2.2.2-old-final: 全てのコード変更に伴い旧コード最終バージョン えむちゃんのスタンプ「勉強するぞ～！」を追加。 所々間違えていた名前のローマ字ミスを修正。
                        """,

                false);
        event.reply(embedBuilder.build());
    }
}
