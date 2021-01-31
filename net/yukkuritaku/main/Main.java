package net.yukkuritaku.main;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.examples.command.PingCommand;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.yukkuritaku.commands.*;
import net.yukkuritaku.commands.comic.impl.RandomComicCommand;
import net.yukkuritaku.commands.stamp.impl.RandomStampCommand;
import net.yukkuritaku.commands.stamp.impl.leoneed.HonamiStampCommand;
import net.yukkuritaku.commands.stamp.impl.leoneed.ItikaStampCommand;
import net.yukkuritaku.commands.stamp.impl.leoneed.SakiStampCommand;
import net.yukkuritaku.commands.stamp.impl.leoneed.ShihoStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.AiriStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.HarukaStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.MinoriStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.ShizukuStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.EnaStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.KanadeStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.MafuyuStampCommand;
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
import javax.security.auth.login.LoginException;

public final class Main {

    public static final String Token = "Insert Token Here";
    public static final String Prefixcmd = ".";

    /**
     * Starting Main Method.
     */
    public static void main(String[] args) throws LoginException, InterruptedException {
        final CommandClient commandClient = new CommandClientBuilder()
                .setPrefix(Prefixcmd)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.watching(".helpで見れるよ"))
                .setOwnerId("owner id")
                .setServerInvite("discord invite")
                //Adding Cmd
                //JDA Example
                .addCommand(new PingCommand())

                //おざー(その他
                .addCommand(new HelloCommand())
                .addCommand(new RandomStampCommand())
                .addCommand(new InfoCommand())
                .addCommand(new OldAliasesCommand())
                //こみっく
                .addCommand(new RandomComicCommand())
                //ばちゃしん
                .addCommand(new MikuStampCommand())
                .addCommand(new RinStampCommand())
                .addCommand(new RenStampCommand())
                .addCommand(new RukaStampCommand())
                .addCommand(new MeikoStampCommand())
                .addCommand(new KaitoStampCommand())
                //れおに
                .addCommand(new SakiStampCommand())
                .addCommand(new ItikaStampCommand())
                .addCommand(new HonamiStampCommand())
                .addCommand(new ShihoStampCommand())
                //ももじゃん
                .addCommand(new ShizukuStampCommand())
                .addCommand(new HarukaStampCommand())
                .addCommand(new MinoriStampCommand())
                .addCommand(new AiriStampCommand())
                //びびばす
                .addCommand(new AkitoStampCommand())
                .addCommand(new TouyaStampCommand())
                .addCommand(new AnStampCommand())
                .addCommand(new KohaneStampCommand())
                //わんだしょ
                .addCommand(new NeneStampCommand())
                .addCommand(new TsukasaStampCommand())
                .addCommand(new RuiStampCommand())
                .addCommand(new EmuStampCommand())
                //にーご
                .addCommand(new EnaStampCommand())
                .addCommand(new KanadeStampCommand())
                .addCommand(new MafuyuStampCommand())
                .addCommand(new MizukiStampCommand())
                .build();
        final JDA jda = JDABuilder.createDefault(Token)
                .addEventListeners(commandClient)

                .build();

        //TODO Ready Build!
        jda.awaitReady();
    }
}
