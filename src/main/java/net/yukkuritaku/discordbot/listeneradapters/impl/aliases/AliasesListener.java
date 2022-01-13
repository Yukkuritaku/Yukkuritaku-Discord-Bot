package net.yukkuritaku.discordbot.listeneradapters.impl.aliases;

import com.jagrosh.jdautilities.doc.standard.CommandInfo;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.yukkuritaku.discordbot.commands.HelloCommand;
import net.yukkuritaku.discordbot.commands.InfoCommand;
import net.yukkuritaku.discordbot.commands.comic.impl.RandomComicCommand;
import net.yukkuritaku.discordbot.commands.fourcoma.impl.Random4ComaCommand;
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
import net.yukkuritaku.discordbot.Start;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

@CommandInfo(name = "testaliases", usage = "testaliases <integer>", description = "Showing command Aliases.")
public class AliasesListener extends ListenerAdapter {

    public final String[] strings = {"Tips: 実は省略の募集したりしてるんで追加したいの教えて", "Tips: 主はJava超初心者です"};

    public AliasesListener(){

    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String str = "\n";
        //Others
        final InfoCommand infoCommand = new InfoCommand();
        final HelloCommand helloCommand = new HelloCommand();
        final RandomStampCommand randomStampCommand = new RandomStampCommand();
        final Random4ComaCommand random4ComaCommand = new Random4ComaCommand();
        //コミック
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
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Start.PREFIX + "testaliases")){
            if (args.length < 2){
                String escape = "\n";
                EmbedBuilder builderUsage = new EmbedBuilder();

                Random random = new Random();

                int num = random.nextInt(strings.length);

                builderUsage.setTitle("使い方");
                builderUsage.setDescription(Start.PREFIX + "testaliases <数字>"
                        + escape + escape + "1でバーチャルシンガー"
                + escape + "2でLeo/need"
                + escape + "3でMORE MORE JUMP!"
                + escape + "4でVivid Bad SQUAD"
                + escape + "5でワンダーランズ×ショウタイム"
                + escape + "6で25時、ナイトコードで。"
                + escape + "7でその他のコマンドを表示するよ！");

                builderUsage.setFooter(strings[num]);
                event.getChannel().sendMessageEmbeds(builderUsage.build()).queue();
            }else {
                if (args[1].equalsIgnoreCase("1")){
                    //ばちゃしん
                    final EmbedBuilder virtualsinger = new EmbedBuilder();
                    virtualsinger.setTitle("Virtual Singer");
                    virtualsinger.setColor(ColorUtils.VIRTUAL_SINGER.getColor());
                    virtualsinger.addField("初音ミク", mikuStampCommand.getName() + str + Arrays.toString(mikuStampCommand.getAliases()), false);
                    virtualsinger.addField("鏡音リン", rinStampCommand.getName() + str + Arrays.toString(rinStampCommand.getAliases()), false);
                    virtualsinger.addField("鏡音レン", renStampCommand.getName() + str + Arrays.toString(renStampCommand.getAliases()), false);
                    virtualsinger.addField("巡音ルカ", lukaStampCommand.getName() + str + Arrays.toString(lukaStampCommand.getAliases()), false);
                    virtualsinger.addField("Meiko", meikoStampCommand.getName() + str + Arrays.toString(meikoStampCommand.getAliases()), false);
                    virtualsinger.addField("Kaito", kaitoStampCommand.getName() + str + Arrays.toString(kaitoStampCommand.getAliases()), false);
                    event.getChannel().sendMessageEmbeds(virtualsinger.build()).queue();
                }
                else if (args[1].equalsIgnoreCase("2")){
                    //れおに
                    final EmbedBuilder leoneed = new EmbedBuilder();
                    leoneed.setTitle("Leo/need");
                    leoneed.setColor(ColorUtils.LEONEED.getColor());
                    leoneed.addField("星乃一歌", ichikaStampCommand.getName() + str + Arrays.toString(ichikaStampCommand.getAliases()), false);
                    leoneed.addField("天馬咲希", sakiStampCommand.getName() + str + Arrays.toString(sakiStampCommand.getAliases()), false);
                    leoneed.addField("日野森志歩", shihoStampCommand.getName() + str + Arrays.toString(shihoStampCommand.getAliases()), false);
                    leoneed.addField("望月穂波", honamiStampCommand.getName() + str + Arrays.toString(honamiStampCommand.getAliases()), false);
                    event.getChannel().sendMessageEmbeds(leoneed.build()).queue();
                }
                else if (args[1].equalsIgnoreCase("3")){
                    //ももじゃん
                    final EmbedBuilder moremorejump = new EmbedBuilder();
                    moremorejump.setTitle("MORE MORE JUMP!");
                    moremorejump.setColor(ColorUtils.MORE_MORE_JUMP.getColor());
                    moremorejump.addField("花里みのり", minoriStampCommand.getName() + str + Arrays.toString(minoriStampCommand.getAliases()), false);
                    moremorejump.addField("桐谷遥", harukaStampCommand.getName() + str + Arrays.toString(harukaStampCommand.getAliases()), false);
                    moremorejump.addField("桃井愛莉", airiStampCommand.getName() + str + Arrays.toString(airiStampCommand.getAliases()), false);
                    moremorejump.addField("日野森雫", shizukuStampCommand.getName() + str + Arrays.toString(shizukuStampCommand.getAliases()), false);
                    event.getChannel().sendMessageEmbeds(moremorejump.build()).queue();
                }
                else if (args[1].equalsIgnoreCase("4")){
                    //びびばす
                    final EmbedBuilder vividbadsquad = new EmbedBuilder();
                    vividbadsquad.setTitle("Vivid Bad SQUAD");
                    vividbadsquad.setColor(ColorUtils.VIVID_BAD_SQUAD.getColor());
                    vividbadsquad.addField("小豆沢こはね", kohaneStampCommand.getName() + str + Arrays.toString(kohaneStampCommand.getAliases()), false);
                    vividbadsquad.addField("白石杏", anStampCommand.getName() + str + Arrays.toString(anStampCommand.getAliases()), false);
                    vividbadsquad.addField("東雲彰人", akitoStampCommand.getName() + str + Arrays.toString(akitoStampCommand.getAliases()), false);
                    vividbadsquad.addField("青柳冬弥", toyaStampCommand.getName() + str + Arrays.toString(toyaStampCommand.getAliases()), false);
                    event.getChannel().sendMessageEmbeds(vividbadsquad.build()).queue();
                }
                else if (args[1].equalsIgnoreCase("5")){
                    //わんだしょ
                    final EmbedBuilder wonderlands = new EmbedBuilder();
                    wonderlands.setTitle("ワンダーランズ×ショウタイム");
                    wonderlands.setColor(ColorUtils.WONDER_LANDS_SHOWTIME.getColor());
                    wonderlands.addField("天馬司", tsukasaStampCommand.getName() + str + Arrays.toString(tsukasaStampCommand.getAliases()), false);
                    wonderlands.addField("鳳えむ", emuStampCommand.getName() + str + Arrays.toString(emuStampCommand.getAliases()), false);
                    wonderlands.addField("草薙寧々", neneStampCommand.getName() + str + Arrays.toString(neneStampCommand.getAliases()), false);
                    wonderlands.addField("神代類", ruiStampCommand.getName() + str + Arrays.toString(ruiStampCommand.getAliases()), false);
                    event.getChannel().sendMessageEmbeds(wonderlands.build()).queue();
                }
                else if (args[1].equalsIgnoreCase("6")){
                    //にーご
                    final EmbedBuilder niigo = new EmbedBuilder();
                    niigo.setTitle("25時、ナイトコードで。");
                    niigo.setColor(ColorUtils.NIIGO.getColor());
                    niigo.addField("宵崎奏", kanadeStampCommand.getName() + str + Arrays.toString(kanadeStampCommand.getAliases()), false);
                    niigo.addField("朝比奈まふゆ", mafuyuStampCommand.getName() + str + Arrays.toString(mafuyuStampCommand.getAliases()), false);
                    niigo.addField("東雲絵名", enaStampCommand.getName() + str + Arrays.toString(enaStampCommand.getAliases()), false);
                    niigo.addField("暁山瑞希", mizukiStampCommand.getName() + str + Arrays.toString(mizukiStampCommand.getAliases()), false);
                    event.getChannel().sendMessageEmbeds(niigo.build()).queue();
                }
                else if (args[1].equalsIgnoreCase("7")){
                    //Other Stamp
                    final EmbedBuilder others = new EmbedBuilder();
                    others.setTitle("その他");
                    others.addField("Random", randomStampCommand.getName() + str + Arrays.toString(randomStampCommand.getAliases()), false);
                    //コミック
                    others.addField("RandomComicCommand", randomComicCommand.getName() + str + Arrays.toString(randomComicCommand.getAliases()), false);
                    //Others
                    others.addField("InfoCommand", infoCommand.getName() + str + Arrays.toString(infoCommand.getAliases()), false);
                    others.addField("HelloCommand", helloCommand.getName() + str + Arrays.toString(helloCommand.getAliases()), false);
                    others.addField("Random4ComaCommand", random4ComaCommand.getName() + str + Arrays.toString(random4ComaCommand.getAliases()), false);
                    event.getChannel().sendMessageEmbeds(others.build()).queue();
                }else {
                    event.getChannel().sendMessage(new IllegalArgumentException("Invalid Argument!/数値がコマンドの数値より上になっているか、ネガティブな数値になっています！").toString()).queue();
                }
            }
        }
    }
}

