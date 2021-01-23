package net.yukkuritaku.main;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.yukkuritaku.commands.*;
import net.yukkuritaku.commands.stamp.impl.RandomStampCommand;
import net.yukkuritaku.commands.stamp.impl.moremorejump.ShizukuStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.EnananStampCommand;
import net.yukkuritaku.commands.stamp.impl.niigo.KanadeStampCommand;

import javax.security.auth.login.LoginException;

public class Main {
    public static final String Token = "Insert Bot Token Here";
    public static final String Prefixcmd = ".";

    public static void main(String[] args) throws LoginException, InterruptedException {
        CommandClient commandClient = new CommandClientBuilder()
                .setPrefix(Prefixcmd)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing(".helpで見れるよ"))
                .setOwnerId("Owner ID Here")
                //Adding Cmd
                .addCommand(new HelloCommand())
                .addCommand(new EnananStampCommand())
                .addCommand(new RandomStampCommand())
                .addCommand(new AliasesCommand())
                .addCommand(new ShizukuStampCommand())
                .addCommand(new KanadeStampCommand())

                .build();

        JDA jda = JDABuilder.createDefault(Token)
                .addEventListeners(commandClient)
                .build();

        jda.awaitReady();

    }

    public void stop(){

    }
}
