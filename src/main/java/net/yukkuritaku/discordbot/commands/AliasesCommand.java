package net.yukkuritaku.discordbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.doc.standard.CommandInfo;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.commands.comic.impl.RandomComicCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.RandomStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.leoneed.HonamiStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.leoneed.IchikaStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.leoneed.SakiStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.leoneed.ShihoStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.moremorejump.AiriStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.moremorejump.HarukaStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.moremorejump.MinoriStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.moremorejump.ShizukuStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.niigo.EnaStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.niigo.KanadeStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.niigo.MafuyuStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.niigo.MizukiStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.virtualsinger.*;
import net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad.AkitoStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad.AnStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad.KohaneStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad.ToyaStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands.EmuStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands.NeneStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands.RuiStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands.TsukasaStampCommand;
import net.yukkuritaku.discordbot.listeneradapters.impl.aliases.AliasesListener;

import java.util.Arrays;

public final class AliasesCommand extends Command {

    public AliasesCommand(){
        this.name = "aliases";
        this.help = "全てのコマンドのエイリアス(省略コマンド)をDmに送ります。";
    }

    @Override
    protected void execute(final CommandEvent event) {
        //Others
        final InfoCommand infoCommand = new InfoCommand();
        final HelloCommand helloCommand = new HelloCommand();
        final RandomStampCommand randomStampCommand = new RandomStampCommand();
        //コミック
        final RandomComicCommand randomComicCommand = new RandomComicCommand();
        //ばちゃしん
        final MikuStampCommand mikuStampCommand = new MikuStampCommand();
        final RinStampCommand rinStampCommand = new RinStampCommand();
        final RenStampCommand renStampCommand = new RenStampCommand();
        final LukaStampCommand lukaStampCommand = new LukaStampCommand();
        final MeikoStampCommand meikoStampCommand = new MeikoStampCommand();
        final KaitoStampCommand kaitoStampCommand = new KaitoStampCommand();
        //れおに
        final HonamiStampCommand honamiStampCommand = new HonamiStampCommand();
        final IchikaStampCommand ichikaStampCommand = new IchikaStampCommand();
        final SakiStampCommand sakiStampCommand = new SakiStampCommand();
        final ShihoStampCommand shihoStampCommand = new ShihoStampCommand();
        //ももじゃん
        final HarukaStampCommand harukaStampCommand = new HarukaStampCommand();
        final AiriStampCommand airiStampCommand = new AiriStampCommand();
        final MinoriStampCommand minoriStampCommand = new MinoriStampCommand();
        final ShizukuStampCommand shizukuStampCommand = new ShizukuStampCommand();
        //びびばす
        final AkitoStampCommand akitoStampCommand = new AkitoStampCommand();
        final ToyaStampCommand toyaStampCommand = new ToyaStampCommand();
        final AnStampCommand anStampCommand = new AnStampCommand();
        final KohaneStampCommand kohaneStampCommand = new KohaneStampCommand();
        //わんだしょ
        final NeneStampCommand neneStampCommand = new NeneStampCommand();
        final TsukasaStampCommand tsukasaStampCommand = new TsukasaStampCommand();
        final RuiStampCommand ruiStampCommand = new RuiStampCommand();
        final EmuStampCommand emuStampCommand = new EmuStampCommand();
        //にーご
        final EnaStampCommand enaStampCommand = new EnaStampCommand();
        final KanadeStampCommand kanadeStampCommand = new KanadeStampCommand();
        final MafuyuStampCommand mafuyuStampCommand = new MafuyuStampCommand();
        final MizukiStampCommand mizukiStampCommand = new MizukiStampCommand();


        final AliasesListener aliasesListener = new AliasesListener();

        final String str = "\n";

        //Others
        final EmbedBuilder others = new EmbedBuilder();
        others.setTitle("Others");
        others.addField("InfoCommand", infoCommand.getName() + str + Arrays.toString(infoCommand.getAliases()), false);
        others.addField("HelloCommand", helloCommand.getName() + str + Arrays.toString(helloCommand.getAliases()), false);
        others.addField("testaliases", Arrays.toString(aliasesListener.getClass().getAnnotation(CommandInfo.class).name())
                + str +
                aliasesListener.getClass().getAnnotation(CommandInfo.class).usage(), false
        );

        //コミック
        final EmbedBuilder comics = new EmbedBuilder();
        comics.setTitle("コミック");
        comics.addField("RandomComicCommand", randomComicCommand.getName() + str + Arrays.toString(randomComicCommand.getAliases()), false);

        //TODO ここからスタンプ
        //Other Stamp
        final EmbedBuilder otherstamp = new EmbedBuilder();
        otherstamp.setTitle("Other Stamps");
        otherstamp.addField("Random", randomStampCommand.getName() + str + Arrays.toString(randomStampCommand.getAliases()), false);

        //ばちゃしん
        final EmbedBuilder virtualsinger = new EmbedBuilder();
        virtualsinger.setTitle("Virtual Singer");
        virtualsinger.addField("初音ミク", mikuStampCommand.getName() + str + Arrays.toString(mikuStampCommand.getAliases()), false);
        virtualsinger.addField("鏡音リン", rinStampCommand.getName() + str + Arrays.toString(rinStampCommand.getAliases()), false);
        virtualsinger.addField("鏡音レン", renStampCommand.getName() + str + Arrays.toString(renStampCommand.getAliases()), false);
        virtualsinger.addField("巡音ルカ", lukaStampCommand.getName() + str + Arrays.toString(lukaStampCommand.getAliases()), false);
        virtualsinger.addField("Meiko", meikoStampCommand.getName() + str + Arrays.toString(meikoStampCommand.getAliases()), false);
        virtualsinger.addField("Kaito", kaitoStampCommand.getName() + str + Arrays.toString(kaitoStampCommand.getAliases()), false);

        //れおに
        final EmbedBuilder leoneed = new EmbedBuilder();
        leoneed.setTitle("Leo/need");
        leoneed.addField("星乃一歌", ichikaStampCommand.getName() + str + Arrays.toString(ichikaStampCommand.getAliases()), false);
        leoneed.addField("天馬咲希", sakiStampCommand.getName() + str + Arrays.toString(sakiStampCommand.getAliases()), false);
        leoneed.addField("日野森志歩", shihoStampCommand.getName() + str + Arrays.toString(shihoStampCommand.getAliases()), false);
        leoneed.addField("望月穂波", honamiStampCommand.getName() + str + Arrays.toString(honamiStampCommand.getAliases()), false);

        //ももじゃん
        final EmbedBuilder moremorejump = new EmbedBuilder();
        moremorejump.setTitle("MORE MORE JUMP!");
        moremorejump.addField("花里みのり", minoriStampCommand.getName() + str + Arrays.toString(minoriStampCommand.getAliases()), false);
        moremorejump.addField("桐谷遥", harukaStampCommand.getName() + str + Arrays.toString(harukaStampCommand.getAliases()), false);
        moremorejump.addField("桃井愛莉", airiStampCommand.getName() + str + Arrays.toString(airiStampCommand.getAliases()), false);
        moremorejump.addField("日野森雫", shizukuStampCommand.getName() + str + Arrays.toString(shizukuStampCommand.getAliases()), false);

        //びびばす
        final EmbedBuilder vividbadsquad = new EmbedBuilder();
        vividbadsquad.setTitle("Vivid Bad SQUAD");
        vividbadsquad.addField("小豆沢こはね", kohaneStampCommand.getName() + str + Arrays.toString(kohaneStampCommand.getAliases()), false);
        vividbadsquad.addField("白石杏", anStampCommand.getName() + str + Arrays.toString(anStampCommand.getAliases()), false);
        vividbadsquad.addField("東雲彰人", akitoStampCommand.getName() + str + Arrays.toString(akitoStampCommand.getAliases()), false);
        vividbadsquad.addField("青柳冬弥", toyaStampCommand.getName() + str + Arrays.toString(toyaStampCommand.getAliases()), false);

        //わんだしょ
        final EmbedBuilder wonderlands = new EmbedBuilder();
        wonderlands.setTitle("ワンダーランズ×ショウタイム");
        wonderlands.addField("天馬司", tsukasaStampCommand.getName() + str + Arrays.toString(tsukasaStampCommand.getAliases()), false);
        wonderlands.addField("鳳えむ", emuStampCommand.getName() + str + Arrays.toString(emuStampCommand.getAliases()), false);
        wonderlands.addField("草薙寧々", neneStampCommand.getName() + str + Arrays.toString(neneStampCommand.getAliases()), false);
        wonderlands.addField("神代類", ruiStampCommand.getName() + str + Arrays.toString(ruiStampCommand.getAliases()), false);

        //にーご
        final EmbedBuilder niigo = new EmbedBuilder();
        niigo.setTitle("25時、ナイトコードで。");
        niigo.addField("宵崎奏", kanadeStampCommand.getName() + str + Arrays.toString(kanadeStampCommand.getAliases()), false);
        niigo.addField("朝比奈まふゆ", mafuyuStampCommand.getName() + str + Arrays.toString(mafuyuStampCommand.getAliases()), false);
        niigo.addField("東雲絵名", enaStampCommand.getName() + str + Arrays.toString(enaStampCommand.getAliases()), false);
        niigo.addField("暁山瑞希", mizukiStampCommand.getName() + str + Arrays.toString(mizukiStampCommand.getAliases()), false);





        event.replyInDm("##Start");
        event.replyInDm(others.build());

        event.replyInDm(comics.build());

        event.replyInDm(otherstamp.build());

        event.replyInDm(virtualsinger.build());

        event.replyInDm(leoneed.build());

        event.replyInDm(moremorejump.build());

        event.replyInDm(vividbadsquad.build());

        event.replyInDm(wonderlands.build());

        event.replyInDm(niigo.build());
        event.replyInDm("##End");

    }
}
