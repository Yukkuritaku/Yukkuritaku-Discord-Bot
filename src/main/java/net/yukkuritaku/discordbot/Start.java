package net.yukkuritaku.discordbot;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import net.yukkuritaku.discordbot.commands.AliasesCommand;
import net.yukkuritaku.discordbot.commands.GithubCommand;
import net.yukkuritaku.discordbot.commands.HelloCommand;
import net.yukkuritaku.discordbot.commands.InfoCommand;
import net.yukkuritaku.discordbot.commands.comic.impl.RandomComicCommand;
import net.yukkuritaku.discordbot.commands.fourcoma.impl.Random4ComaCommand;
import net.yukkuritaku.discordbot.commands.old.OldAliasesCommand;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class Start implements EventListener {

    public static final Logger LOGGER = LogManager.getLogger("Discord-Bot");

    /**
     * コマンドプレフィックス
     */
    public static final String PREFIX = ".";

    /**
     * Discordのトークン、herokuからアクセスするならgetenvを使う
     */
    private static final String TOKEN = System.getenv("DISCORD_TOKEN");

    /**
     * 主のDiscordのユーザーId、herokuからアクセスするならgetenvを使う
     */
    private static final String OWNER_ID = System.getenv("OWNER_ID");
    /**
     * 主のDiscordのサーバーurl、herokuからアクセスするならgetenvを使う
     */
    private static final String SERVER_URL = System.getenv("SERVER_URL");

    private static final String ACTIVITY_MESSAGE = """
            バージョン: 2.2.2-old-final
            .helpで見れるよ ただの遊び心のBot
            """;

    /**
     * 開始メソッド
     */
    public static void main(String... args) {
        try {
            final CommandClient commandClient = new CommandClientBuilder()
                    .setPrefix(PREFIX)
                    .setStatus(OnlineStatus.ONLINE)
                    .setActivity(Activity.playing(ACTIVITY_MESSAGE))
                    .setOwnerId(OWNER_ID)
                    .setServerInvite(SERVER_URL)
                    //Adding Cmd
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
                    .addCommand(new LukaStampCommand())
                    .addCommand(new MeikoStampCommand())
                    .addCommand(new KaitoStampCommand())
                    //れおに
                    .addCommand(new SakiStampCommand())
                    .addCommand(new IchikaStampCommand())
                    .addCommand(new HonamiStampCommand())
                    .addCommand(new ShihoStampCommand())
                    //ももじゃん
                    .addCommand(new ShizukuStampCommand())
                    .addCommand(new HarukaStampCommand())
                    .addCommand(new MinoriStampCommand())
                    .addCommand(new AiriStampCommand())
                    //びびばす
                    .addCommand(new AkitoStampCommand())
                    .addCommand(new ToyaStampCommand())
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
            var builder = JDABuilder.createDefault(TOKEN)
                    .setStatus(OnlineStatus.ONLINE)
                    .disableCache(CacheFlag.VOICE_STATE)
                    .setActivity(Activity.playing(ACTIVITY_MESSAGE))
                    //リステナーを追加する予定だった だがしかし、ない！！！！！！！
                    .addEventListeners(commandClient)
                    .addEventListeners(new AliasesListener())
                    ;
            var jda = builder.build();
            //ビルド完了
            jda.awaitReady();
        } catch (Exception e){
            System.err.println("An error has been occurred. Exiting.");
            e.printStackTrace();
            System.exit(-1);
        }
    }


    @Override
    public void onEvent(@NotNull GenericEvent event) {
        if (event instanceof ReadyEvent) {
            LOGGER.info("API ready!");
        }
    }
}
