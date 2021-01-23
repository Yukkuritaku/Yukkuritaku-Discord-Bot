package net.yukkuritaku.main;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.yukkuritaku.commands.*;
import net.yukkuritaku.commands.stamp.impl.RandomStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.AiriStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.HarukaStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.MinoriStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.ShizukuStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.EnananStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.KanadeStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.MahuyuStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.MizukiStampCommand;

import javax.security.auth.login.LoginException;

public class Main {
    public static final String Token = "Insert Bot Token Here";
    public static final String Prefixcmd = ".";

    public static void main(String[] args) throws LoginException, InterruptedException {
        CommandClient commandClient = new CommandClientBuilder()
                .setPrefix(Prefixcmd)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing(".helpで見れるよ"))
                .setOwnerId("Owner Id")
                //Adding Cmd
                //おざー(その他
                .addCommand(new HelloCommand())
                .addCommand(new RandomStampCommand())
                .addCommand(new AliasesCommand())
                //れおに

                //にーご
                .addCommand(new EnananStampCommand())
                .addCommand(new KanadeStampCommand())
                .addCommand(new MahuyuStampCommand())
                .addCommand(new MizukiStampCommand())

                //ももじゃん
                .addCommand(new ShizukuStampCommand())
                .addCommand(new HarukaStampCommand())
                .addCommand(new MinoriStampCommand())
                .addCommand(new AiriStampCommand())

                //びびばす

                //わんだしょ

                //ばちゃしん



                .build();
        JDA jda = JDABuilder.createDefault(Token)
                .addEventListeners(commandClient)
                .build();

        //Ready Build!
        jda.awaitReady();
    }

    //TODO Some method
    public void stop(){
    }
}
