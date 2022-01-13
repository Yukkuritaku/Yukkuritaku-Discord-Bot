package net.yukkuritaku.discordbot.commands.old;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.yukkuritaku.discordbot.commands.comic.impl.RandomComicCommand;
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

import java.util.Arrays;

public final class OldAliasesCommand extends Command {

    public OldAliasesCommand(){
        this.name = "oldaliases";
        this.help = "コマンドを省略したのを確認できるよ";
        this.hidden = true;
    }

    @Override
    protected void execute(final CommandEvent event) {
        //TODO Input in EmbedBuilders
        //Others
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
        //でもこうするとスパムみたいになるからどうしたものか...
        event.replyInDm("Aliases");
        event.replyInDm("Others");
        event.replyInDm("info -> i");
        event.replyInDm(randomComicCommand.getName() + " -> " + Arrays.toString(randomComicCommand.getAliases()));
        event.replyInDm("バチャシン");
        event.replyInDm(mikuStampCommand.getName() + " -> " + Arrays.toString(mikuStampCommand.getAliases()));
        event.replyInDm(rinStampCommand.getName() + " -> " + Arrays.toString(rinStampCommand.getAliases()));
        event.replyInDm(renStampCommand.getName() + " -> " + Arrays.toString(renStampCommand.getAliases()));
        event.replyInDm(lukaStampCommand.getName() + " -> " + Arrays.toString(lukaStampCommand.getAliases()));
        event.replyInDm(meikoStampCommand.getName() + " -> " + Arrays.toString(meikoStampCommand.getAliases()));
        event.replyInDm(kaitoStampCommand.getName() + " -> " + Arrays.toString(kaitoStampCommand.getAliases()));
        event.replyInDm("レオニード");
        event.replyInDm(honamiStampCommand.getName() + " -> " + Arrays.toString(honamiStampCommand.getAliases()));
        event.replyInDm(ichikaStampCommand.getName() + " -> " + Arrays.toString(ichikaStampCommand.getAliases()));
        event.replyInDm(sakiStampCommand.getName() + " -> " + Arrays.toString(sakiStampCommand.getAliases()));
        event.replyInDm(shihoStampCommand.getName() + " -> " + Arrays.toString(shihoStampCommand.getAliases()));
        event.replyInDm("ももじゃん");
        event.replyInDm(harukaStampCommand.getName() + " -> " + Arrays.toString(harukaStampCommand.getAliases()));
        event.replyInDm(airiStampCommand.getName() + " -> " + Arrays.toString(airiStampCommand.getAliases()));
        event.replyInDm(minoriStampCommand.getName() + " -> " + Arrays.toString(minoriStampCommand.getAliases()));
        event.replyInDm(shizukuStampCommand.getName() + " -> " + Arrays.toString(shizukuStampCommand.getAliases()));
        event.replyInDm("びびばす");
        event.replyInDm(akitoStampCommand.getName() + " -> " + Arrays.toString(akitoStampCommand.getAliases()));
        event.replyInDm(toyaStampCommand.getName() + " -> " + Arrays.toString(toyaStampCommand.getAliases()));
        event.replyInDm(anStampCommand.getName() + " -> " + Arrays.toString(anStampCommand.getAliases()));
        event.replyInDm(kohaneStampCommand.getName() + " -> " + Arrays.toString(kohaneStampCommand.getAliases()));
        event.replyInDm("わんだしょ");
        event.replyInDm(neneStampCommand.getName() + " -> " + Arrays.toString(neneStampCommand.getAliases()));
        event.replyInDm(tsukasaStampCommand.getName() + " -> " + Arrays.toString(tsukasaStampCommand.getAliases()));
        event.replyInDm(ruiStampCommand.getName() + " -> " + Arrays.toString(ruiStampCommand.getAliases()));
        event.replyInDm(emuStampCommand.getName() + " -> " + Arrays.toString(emuStampCommand.getAliases()));
        event.replyInDm("にーご");
        event.replyInDm(enaStampCommand.getName() + " -> " + Arrays.toString(enaStampCommand.getAliases()));
        event.replyInDm(kanadeStampCommand.getName() + " -> " + Arrays.toString(kanadeStampCommand.getAliases()));
        event.replyInDm(mafuyuStampCommand.getName() + " -> " + Arrays.toString(mafuyuStampCommand.getAliases()));
        event.replyInDm(mizukiStampCommand.getName() + " -> " + Arrays.toString(mizukiStampCommand.getAliases()));
        event.replyInDm("##End");
    }
}