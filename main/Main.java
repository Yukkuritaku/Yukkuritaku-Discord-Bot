package net.yukkuritaku.discordbot.main;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.examples.command.PingCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.yukkuritaku.discordbot.commands.AliasesCommand;
import net.yukkuritaku.discordbot.commands.GithubCommand;
import net.yukkuritaku.discordbot.commands.HelloCommand;
import net.yukkuritaku.discordbot.commands.InfoCommand;
import net.yukkuritaku.discordbot.commands.comic.impl.RandomComicCommand;
import net.yukkuritaku.discordbot.commands.fourcoma.impl.Random4ComaCommand;
import net.yukkuritaku.discordbot.commands.old.OldAliasesCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.RandomStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.leoneed.HonamiStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.leoneed.ItikaStampCommand;
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
import net.yukkuritaku.discordbot.commands.stamp.impl.vividbadsquad.TouyaStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands.EmuStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands.NeneStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands.RuiStampCommand;
import net.yukkuritaku.discordbot.commands.stamp.impl.wonderlands.TsukasaStampCommand;
import net.yukkuritaku.discordbot.listeneradapters.impl.aliases.AliasesListener;
import org.intellij.lang.annotations.JdkConstants;

import javax.security.auth.login.LoginException;

public final class Main {

    public static final String TOKEN = "token";
    public static final String PREFIX = ".";
    public static final String OWNER_ID = "ownerid";
    public static final String SERVER_URL = "url";
    public static final String ACTIVITY_MESSAGE = ".helpで見れるよ ただの遊び心のBot";

    /**
     * 開始メソッド
     */
    public static void main(String[] args) throws LoginException, InterruptedException {

        final CommandClient commandClient = new CommandClientBuilder()
                .setPrefix(PREFIX)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing(ACTIVITY_MESSAGE))
                .setOwnerId(OWNER_ID)
                .setServerInvite(SERVER_URL)
                //Adding Cmd
                //JDA Example
                .addCommand(new PingCommand())

                //おざー(その他
                .addCommand(new HelloCommand())
                .addCommand(new InfoCommand())
                .addCommand(new OldAliasesCommand())
                .addCommand(new AliasesCommand())
                .addCommand(new GithubCommand())


                .addCommand(new RandomStampCommand())
                .addCommand(new Random4ComaCommand())
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

        final JDA jda = JDABuilder.createDefault(TOKEN)
                .setStatus(OnlineStatus.ONLINE)
                .addEventListeners(commandClient)
                .addEventListeners(new AliasesListener())
                //Listeners
                .build();
        //TODO Finish Build
        jda.awaitReady();
    }
}
