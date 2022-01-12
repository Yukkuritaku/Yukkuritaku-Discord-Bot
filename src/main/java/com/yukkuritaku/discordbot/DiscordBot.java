package com.yukkuritaku.discordbot;

import com.yukkuritaku.discordbot.commands.BaseCommand;
import com.yukkuritaku.discordbot.commands.comic.ComicCommand;
import com.yukkuritaku.discordbot.commands.fourframe.FourFrameCommand;
import com.yukkuritaku.discordbot.commands.stamp.leoneed.HonamiStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.leoneed.IchikaStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.leoneed.SakiStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.leoneed.ShihoStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.moremorejump.AiriStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.moremorejump.HarukaStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.moremorejump.MinoriStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.moremorejump.ShizukuStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.nightcode.EnaStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.nightcode.KanadeStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.nightcode.MafuyuStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.nightcode.MizukiStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.virtualsinger.*;
import com.yukkuritaku.discordbot.commands.stamp.vividbadsquad.AkitoStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.vividbadsquad.AnStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.vividbadsquad.KohaneStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.vividbadsquad.ToyaStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.wonderlands.EmuStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.wonderlands.NeneStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.wonderlands.RuiStampCommand;
import com.yukkuritaku.discordbot.commands.stamp.wonderlands.TsukasaStampCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import net.dv8tion.jda.internal.utils.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DiscordBot {

    private static JDA JDA;

    private static final String TOKEN = System.getenv("TOKEN");
    private static final List<BaseCommand> BASE_COMMAND_REGISTRY = new ArrayList<>();

    public static final Logger LOGGER = LoggerFactory.getLogger(DiscordBot.class);
    public static final String PREFIX = ".";
    public static final String VERSION = "0.02-remake_unstable_code";
    public static final String JDA_VERSION = "5.0.0-alpha.4";

    public static void main(String[] args) throws LoginException, InterruptedException {

        LOGGER.info("Discord Botを起動します！ Version: {}, JDA Version: {}", VERSION, JDA_VERSION);
        List<CommandData> commandData = new LinkedList<>();
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);
        //バチャシン
        BASE_COMMAND_REGISTRY.add(new MikuStampCommand());
        BASE_COMMAND_REGISTRY.add(new RinStampCommand());
        BASE_COMMAND_REGISTRY.add(new RenStampCommand());
        BASE_COMMAND_REGISTRY.add(new LukaStampCommand());
        BASE_COMMAND_REGISTRY.add(new MEIKOStampCommand());
        BASE_COMMAND_REGISTRY.add(new KAITOStampCommand());
        //れおに
        BASE_COMMAND_REGISTRY.add(new IchikaStampCommand());
        BASE_COMMAND_REGISTRY.add(new SakiStampCommand());
        BASE_COMMAND_REGISTRY.add(new HonamiStampCommand());
        BASE_COMMAND_REGISTRY.add(new ShihoStampCommand());
        //モモジャン
        BASE_COMMAND_REGISTRY.add(new MinoriStampCommand());
        BASE_COMMAND_REGISTRY.add(new HarukaStampCommand());
        BASE_COMMAND_REGISTRY.add(new AiriStampCommand());
        BASE_COMMAND_REGISTRY.add(new ShizukuStampCommand());
        //びびばす
        BASE_COMMAND_REGISTRY.add(new KohaneStampCommand());
        BASE_COMMAND_REGISTRY.add(new AnStampCommand());
        BASE_COMMAND_REGISTRY.add(new AkitoStampCommand());
        BASE_COMMAND_REGISTRY.add(new ToyaStampCommand());
        //わんだしょ
        BASE_COMMAND_REGISTRY.add(new TsukasaStampCommand());
        BASE_COMMAND_REGISTRY.add(new EmuStampCommand());
        BASE_COMMAND_REGISTRY.add(new NeneStampCommand());
        BASE_COMMAND_REGISTRY.add(new RuiStampCommand());
        //ニーゴ
        BASE_COMMAND_REGISTRY.add(new KanadeStampCommand());
        BASE_COMMAND_REGISTRY.add(new MafuyuStampCommand());
        BASE_COMMAND_REGISTRY.add(new EnaStampCommand());
        BASE_COMMAND_REGISTRY.add(new MizukiStampCommand());
        //Register Listeners
        BASE_COMMAND_REGISTRY.forEach(jdaBuilder::addEventListeners);
        //登録されたベースコマンドを全てスラッシュコマンドに登録する。
        BASE_COMMAND_REGISTRY.forEach(baseCommand -> {
                    List<Pair<String, String>> arrayListPrefix = baseCommand.getReturnPrefix();
                    OptionData optionData = new OptionData(OptionType.STRING,
                            "prefix",
                            "プレフィックスです。表示したい物を選択できます。");

                    //選択肢に追加
                    arrayListPrefix.forEach(pair -> optionData.addChoice(pair.getRight(), pair.getLeft()));
                    CommandData data = new CommandData(baseCommand.getCommandName(), baseCommand.getCommandDescription())
                            .addOptions(optionData);
                    commandData.add(data);
                }
        );

        //その他
        //4コマコマンド
        FourFrameCommand fourFrameCommand = new FourFrameCommand();
        jdaBuilder.addEventListeners(fourFrameCommand);
        CommandData fourFrameData = new CommandData(fourFrameCommand.getCommandName(), fourFrameCommand.getCommandDescription());
        CommandData fourFrameData1 = new CommandData(fourFrameCommand.getCommandName() + "_2",
                fourFrameCommand.getCommandDescription() + " 複数に分かれてるのはコマンドオプションが25個以下までしか設定できないから。");
        CommandData fourFrameData2 = new CommandData(fourFrameCommand.getCommandName() + "_3",
                fourFrameCommand.getCommandDescription() + " 複数に分かれてるのはコマンドオプションが25個以下までしか設定できないから。");
        CommandData fourFrameData3 = new CommandData(fourFrameCommand.getCommandName() + "_4",
                fourFrameCommand.getCommandDescription() + " 複数に分かれてるのはコマンドオプションが25個以下までしか設定できないから。");
        List<Pair<String, String>> fourFramePrefix = fourFrameCommand.getReturnPrefix();

        //旧 第1話から第6話まで
        OptionData old = new OptionData(OptionType.STRING, "old",
                "keiさんが描き下ろした4コマ漫画です。1話から6話までを選ぶことが出来ます。");
        OptionData current1 = new OptionData(OptionType.STRING, "current1-25",
                "宇崎うそさんが描き下ろした4コマ漫画です。このプレフィックスは1話から25話までを選ぶことが出来ます。");
        OptionData current2 = new OptionData(OptionType.STRING, "current26-50",
                "宇崎うそさんが描き下ろした4コマ漫画です。このプレフィックスは26話から50話までを選ぶことが出来ます。");
        OptionData current3 = new OptionData(OptionType.STRING, "current51-74",
                "宇崎うそさんが描き下ろした4コマ漫画です。このプレフィックスは(特別編を除き)51話から74話までを選ぶことが出来ます。");
        OptionData current4 = new OptionData(OptionType.STRING, "current75-100",
                //旧漫画とコラボ漫画は省くので7になる
                "宇崎うそさんが描き下ろした4コマ漫画です。このプレフィックスは75話から" + (fourFramePrefix.size() - 7) + "話までを選ぶことが出来ます。");
        for (int i = 0; i < fourFramePrefix.size(); i++) {
            if (i < 6) {
                old.addChoice(fourFramePrefix.get(i).getRight(), fourFramePrefix.get(i).getLeft());
            } else if (i < 6 + 25) {
                current1.addChoice(fourFramePrefix.get(i).getRight(), fourFramePrefix.get(i).getLeft());
            } else if (i < 6 + 50) {
                current2.addChoice(fourFramePrefix.get(i).getRight(), fourFramePrefix.get(i).getLeft());
            } else if (i < 6 + 75) {
                current3.addChoice(fourFramePrefix.get(i).getRight(), fourFramePrefix.get(i).getLeft());
            } else if (i < 6 + 100) {
                current4.addChoice(fourFramePrefix.get(i).getRight(), fourFramePrefix.get(i).getLeft());
            }
        }
        fourFrameData.addOptions(old, current1);
        fourFrameData1.addOptions(current2);
        fourFrameData2.addOptions(current3);
        fourFrameData3.addOptions(current4);

        //コミック
        ComicCommand command = new ComicCommand();
        List<Pair<String, String>> comicPrefix = command.getReturnPrefix();
        jdaBuilder.addEventListeners(command);
        CommandData comicCommand = new CommandData(command.getCommandName(), command.getCommandDescription());
        OptionData comic1 = new OptionData(OptionType.STRING, "prefix1", "このプレフィックスは1から25個まで選ぶことが出来ます。");
        OptionData comic2 = new OptionData(OptionType.STRING, "prefix2", "このプレフィックスは26から40個まで選ぶことが出来ます。");
        for (int i = 0; i < comicPrefix.size(); i++){
            if (i < 25){
                comic1.addChoice(comicPrefix.get(i).getRight(), comicPrefix.get(i).getLeft());
            }else if (i < 50){
                comic2.addChoice(comicPrefix.get(i).getRight(), comicPrefix.get(i).getLeft());
            }
        }
        comicCommand.addOptions(comic1, comic2);

        JDA = jdaBuilder.build();
        CommandListUpdateAction action = JDA.updateCommands();
        action.timeout(10, TimeUnit.SECONDS).addCommands(commandData)
                .addCommands(fourFrameData, fourFrameData1, fourFrameData2, fourFrameData3, comicCommand)
                .queue();
        JDA.awaitReady();
        LOGGER.info("起動完了！登録したListener数: {}", JDA.getRegisteredListeners().size());
    }

    public static JDA getJDA() {
        return JDA;
    }

    public static List<BaseCommand> getRegisteredStampCommands() {
        return Collections.unmodifiableList(BASE_COMMAND_REGISTRY);
    }
}
