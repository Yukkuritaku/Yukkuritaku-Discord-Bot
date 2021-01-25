package net.yukkuritaku.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.yukkuritaku.commands.stamp.impl.leoneed.HonamiStampCommand;
import net.yukkuritaku.commands.stamp.impl.leoneed.ItikaStampCommand;
import net.yukkuritaku.commands.stamp.impl.leoneed.SakiStampCommand;
import net.yukkuritaku.commands.stamp.impl.leoneed.ShihoStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.AiriStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.HarukaStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.MinoriStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.ShizukuStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.EnananStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.KanadeStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.MahuyuStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.MizukiStampCommand;
import net.yukkuritaku.commands.stamp.impl.virtualsingers.*;
import net.yukkuritaku.commands.stamp.impl.vividbadsquad.AkitoStampCommand;
import net.yukkuritaku.commands.stamp.impl.vividbadsquad.AnStampCommand;
import net.yukkuritaku.commands.stamp.impl.vividbadsquad.KohaneStampCommand;
import net.yukkuritaku.commands.stamp.impl.vividbadsquad.TouyaStampCommand;
import net.yukkuritaku.commands.stamp.impl.wonderlands.EmuStampCommand;
import net.yukkuritaku.commands.stamp.impl.wonderlands.NeneStampCommand;
import net.yukkuritaku.commands.stamp.impl.wonderlands.RuiStampCommand;
import net.yukkuritaku.commands.stamp.impl.wonderlands.TsukasaStampCommand;

import java.util.Arrays;

public class AliasesCommand extends Command {

    public AliasesCommand(){
        this.name = "aliases";
        this.help = "コマンドを省略したのを確認できるよ";
    }

    @Override
    protected void execute(CommandEvent event) {
        //ばちゃしん
        final MikuStampCommand mikuStampCommand = new MikuStampCommand();
        final RinStampCommand rinStampCommand = new RinStampCommand();
        final RenStampCommand renStampCommand = new RenStampCommand();
        final RukaStampCommand rukaStampCommand = new RukaStampCommand();
        final MeikoStampCommand meikoStampCommand = new MeikoStampCommand();
        final KaitoStampCommand kaitoStampCommand = new KaitoStampCommand();
        //れおに
        final HonamiStampCommand honamiStampCommand = new HonamiStampCommand();
        final ItikaStampCommand itikaStampCommand = new ItikaStampCommand();
        final SakiStampCommand sakiStampCommand = new SakiStampCommand();
        final ShihoStampCommand shihoStampCommand = new ShihoStampCommand();
        //ももじゃん
        final HarukaStampCommand harukaStampCommand = new HarukaStampCommand();
        final AiriStampCommand airiStampCommand = new AiriStampCommand();
        final MinoriStampCommand minoriStampCommand = new MinoriStampCommand();
        final ShizukuStampCommand shizukuStampCommand = new ShizukuStampCommand();
        //びびばす
        final AkitoStampCommand akitoStampCommand = new AkitoStampCommand();
        final TouyaStampCommand touyaStampCommand = new TouyaStampCommand();
        final AnStampCommand anStampCommand = new AnStampCommand();
        final KohaneStampCommand kohaneStampCommand = new KohaneStampCommand();
        //わんだしょ
        final NeneStampCommand neneStampCommand = new NeneStampCommand();
        final TsukasaStampCommand tsukasaStampCommand = new TsukasaStampCommand();
        final RuiStampCommand ruiStampCommand = new RuiStampCommand();
        final EmuStampCommand emuStampCommand = new EmuStampCommand();
        //にーご
        final EnananStampCommand enananStampCommand = new EnananStampCommand();
        final KanadeStampCommand kanadeStampCommand = new KanadeStampCommand();
        final MahuyuStampCommand mahuyuStampCommand = new MahuyuStampCommand();
        final MizukiStampCommand mizukiStampCommand = new MizukiStampCommand();
        //でもこうするとスパムみたいになるからどうしたものか...
        event.replyInDm("Aliases");
        event.replyInDm("Others");
        event.replyInDm("info -> i");
        event.replyInDm("バチャシン");
        event.replyInDm(mikuStampCommand.getName() + " -> " + Arrays.toString(mikuStampCommand.getAliases()));
        event.replyInDm(rinStampCommand.getName() + " -> " + Arrays.toString(rinStampCommand.getAliases()));
        event.replyInDm(renStampCommand.getName() + " -> " + Arrays.toString(renStampCommand.getAliases()));
        event.replyInDm(rukaStampCommand.getName() + " -> " + Arrays.toString(rukaStampCommand.getAliases()));
        event.replyInDm(meikoStampCommand.getName() + " -> " + Arrays.toString(meikoStampCommand.getAliases()));
        event.replyInDm(kaitoStampCommand.getName() + " -> " + Arrays.toString(kaitoStampCommand.getAliases()));
        event.replyInDm("レオニード");
        event.replyInDm(honamiStampCommand.getName() + " -> " + Arrays.toString(honamiStampCommand.getAliases()));
        event.replyInDm(itikaStampCommand.getName() + " -> " + Arrays.toString(itikaStampCommand.getAliases()));
        event.replyInDm(sakiStampCommand.getName() + " -> " + Arrays.toString(sakiStampCommand.getAliases()));
        event.replyInDm(shihoStampCommand.getName() + " -> " + Arrays.toString(shihoStampCommand.getAliases()));
        event.replyInDm("ももじゃん");
        event.replyInDm(harukaStampCommand.getName() + " -> " + Arrays.toString(harukaStampCommand.getAliases()));
        event.replyInDm(airiStampCommand.getName() + " -> " + Arrays.toString(airiStampCommand.getAliases()));
        event.replyInDm(minoriStampCommand.getName() + " -> " + Arrays.toString(minoriStampCommand.getAliases()));
        event.replyInDm(shizukuStampCommand.getName() + " -> " + Arrays.toString(shizukuStampCommand.getAliases()));
        event.replyInDm("びびばす");
        event.replyInDm(akitoStampCommand.getName() + " -> " + Arrays.toString(akitoStampCommand.getAliases()));
        event.replyInDm(touyaStampCommand.getName() + " -> " + Arrays.toString(touyaStampCommand.getAliases()));
        event.replyInDm(anStampCommand.getName() + " -> " + Arrays.toString(anStampCommand.getAliases()));
        event.replyInDm(kohaneStampCommand.getName() + " -> " + Arrays.toString(kohaneStampCommand.getAliases()));
        event.replyInDm("わんだしょ");
        event.replyInDm(neneStampCommand.getName() + " -> " + Arrays.toString(neneStampCommand.getAliases()));
        event.replyInDm(tsukasaStampCommand.getName() + " -> " + Arrays.toString(tsukasaStampCommand.getAliases()));
        event.replyInDm(ruiStampCommand.getName() + " -> " + Arrays.toString(ruiStampCommand.getAliases()));
        event.replyInDm(emuStampCommand.getName() + " -> " + Arrays.toString(emuStampCommand.getAliases()));
        event.replyInDm("にーご");
        event.replyInDm(enananStampCommand.getName() + " -> " + Arrays.toString(enananStampCommand.getAliases()));
        event.replyInDm(kanadeStampCommand.getName() + " -> " + Arrays.toString(kanadeStampCommand.getAliases()));
        event.replyInDm(mahuyuStampCommand.getName() + " -> " + Arrays.toString(mahuyuStampCommand.getAliases()));
        event.replyInDm(mizukiStampCommand.getName() + " -> " + Arrays.toString(mizukiStampCommand.getAliases()));
        event.replyInDm("##End");
    }
}