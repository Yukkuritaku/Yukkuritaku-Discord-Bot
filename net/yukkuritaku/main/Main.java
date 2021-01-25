package net.yukkuritaku.main;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.yukkuritaku.commands.*;
import net.yukkuritaku.commands.stamp.impl.RandomStampCommand;
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

import javax.security.auth.login.LoginException;

public class Main {

    public static final String Token = "Insert Bot Token Here";
    public static final String Prefixcmd = ".";

    public static void main(String[] args) throws LoginException, InterruptedException {
        CommandClient commandClient = new CommandClientBuilder()
                .setPrefix(Prefixcmd)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing(".helpで見れるよ"))
                .setOwnerId("Insert Owner ID Here")
                .setServerInvite("Discord URL")
                //Adding Cmd
                //おざー(その他
                .addCommand(new HelloCommand())
                .addCommand(new RandomStampCommand())
                .addCommand(new AliasesCommand())
                .addCommand(new InfoCommand())
                //こみっく

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
                .addCommand(new EnananStampCommand())
                .addCommand(new KanadeStampCommand())
                .addCommand(new MahuyuStampCommand())
                .addCommand(new MizukiStampCommand())
                .build();
        JDA jda = JDABuilder.createDefault(Token)
                .addEventListeners(commandClient)
                .addEventListeners(new ClearCommand())
                .build();

        //Ready Build!
        jda.awaitReady();
    }
}
