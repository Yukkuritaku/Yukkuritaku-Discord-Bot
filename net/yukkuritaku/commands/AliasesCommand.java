package net.yukkuritaku.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.yukkuritaku.commands.stamp.impl.moremorejump.AiriStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.HarukaStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.MinoriStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.ShizukuStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.EnananStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.KanadeStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.MahuyuStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.MizukiStampCommand;

import java.util.Arrays;

public class AliasesCommand extends Command {

    public AliasesCommand(){
        this.name = "aliases";
        this.help = "コマンドを省略したのを確認できるよ";
    }

    @Override
    protected void execute(CommandEvent event) {
        //ももじゃん
        final HarukaStampCommand harukaStampCommand = new HarukaStampCommand();
        final AiriStampCommand airiStampCommand = new AiriStampCommand();
        final MinoriStampCommand minoriStampCommand = new MinoriStampCommand();
        final ShizukuStampCommand shizukuStampCommand = new ShizukuStampCommand();
        //にーご
        final EnananStampCommand enananStampCommand = new EnananStampCommand();
        final KanadeStampCommand kanadeStampCommand = new KanadeStampCommand();
        final MahuyuStampCommand mahuyuStampCommand = new MahuyuStampCommand();
        final MizukiStampCommand mizukiStampCommand = new MizukiStampCommand();
        //びびばす

        //わんだしょ

        //れおに

        //ばちゃしん


        //でもこうするとスパムみたいになるからどうしたものか...
        event.reply("Aliases");
        event.reply("ももじゃん");
        event.reply("stampharuka -> " + Arrays.toString(harukaStampCommand.getAliases()));
        event.reply("stampairi -> " + Arrays.toString(airiStampCommand.getAliases()));
        event.reply("stampminori -> " + Arrays.toString(minoriStampCommand.getAliases()));
        event.reply("stampshizuku -> " + Arrays.toString(shizukuStampCommand.getAliases()));
        event.reply("にーご");
        event.reply("stampena -> " + Arrays.toString(enananStampCommand.getAliases()));
        event.reply("stampkanade -> " + Arrays.toString(kanadeStampCommand.getAliases()));
        event.reply("stampmahuyu -> " + Arrays.toString(mahuyuStampCommand.getAliases()));
        event.reply("stampmizuki -> " + Arrays.toString(mizukiStampCommand.getAliases()));
    }
}