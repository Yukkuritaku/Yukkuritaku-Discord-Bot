package net.yukkuritaku.discordbot.listeneradapters.aliases.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.yukkuritaku.discordbot.commands.HelloCommand;
import net.yukkuritaku.discordbot.commands.InfoCommand;
import net.yukkuritaku.discordbot.commands.comic.impl.RandomComicCommand;
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
import net.yukkuritaku.discordbot.main.Main;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class AliasesListener extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String str = "\n";
        //Others
        final InfoCommand infoCommand = new InfoCommand();
        final HelloCommand helloCommand = new HelloCommand();
        final RandomStampCommand randomStampCommand = new RandomStampCommand();
        //コミック
        final RandomComicCommand randomComicCommand = new RandomComicCommand();
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
        final EnaStampCommand enaStampCommand = new EnaStampCommand();
        final KanadeStampCommand kanadeStampCommand = new KanadeStampCommand();
        final MafuyuStampCommand mafuyuStampCommand = new MafuyuStampCommand();
        final MizukiStampCommand mizukiStampCommand = new MizukiStampCommand();
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Main.Prefixcmd + "testaliases")){
            if (args.length < 2){
                String escape = "\n";
                EmbedBuilder builderUsage = new EmbedBuilder();
                builderUsage.setTitle("使い方");
                builderUsage.setDescription(Main.Prefixcmd + "testaliases <数字>"
                        + escape + escape + "1でバーチャルシンガー"
                + escape + "2でLeo/need"
                + escape + "3でMORE MORE JUMP!"
                + escape + "4でVivid Bad SQUAD"
                + escape + "5でワンダーランズ×ショウタイム"
                + escape + "6で25時、ナイトコードで。"
                + escape + "7でその他のコマンドを表示するよ！");
                builderUsage.setFooter("Tips: 実は省略の募集したりしてるんで追加したいの教えて");
                event.getChannel().sendMessage(builderUsage.build()).queue();
            }else {
                if (args[1].equalsIgnoreCase("1")){
                    //ばちゃしん
                    final EmbedBuilder virtualsinger = new EmbedBuilder();
                    virtualsinger.setTitle("Virtual Singer");
                    virtualsinger.setColor(ColorUtils.VirtualSinger.color);
                    virtualsinger.addField("初音ミク", mikuStampCommand.getName() + str + Arrays.toString(mikuStampCommand.getAliases()), false);
                    virtualsinger.addField("鏡音リン", rinStampCommand.getName() + str + Arrays.toString(rinStampCommand.getAliases()), false);
                    virtualsinger.addField("鏡音レン", renStampCommand.getName() + str + Arrays.toString(renStampCommand.getAliases()), false);
                    virtualsinger.addField("巡音ルカ", rukaStampCommand.getName() + str + Arrays.toString(rukaStampCommand.getAliases()), false);
                    virtualsinger.addField("Meiko", meikoStampCommand.getName() + str + Arrays.toString(meikoStampCommand.getAliases()), false);
                    virtualsinger.addField("Kaito", kaitoStampCommand.getName() + str + Arrays.toString(kaitoStampCommand.getAliases()), false);
                    event.getChannel().sendMessage(virtualsinger.build()).queue();
                }
                if (args[1].equalsIgnoreCase("2")){
                    //れおに
                    final EmbedBuilder leoneed = new EmbedBuilder();
                    leoneed.setTitle("Leo/need");
                    leoneed.setColor(ColorUtils.Leoneed.color);
                    leoneed.addField("星乃一歌", itikaStampCommand.getName() + str + Arrays.toString(itikaStampCommand.getAliases()), false);
                    leoneed.addField("天馬咲希", sakiStampCommand.getName() + str + Arrays.toString(sakiStampCommand.getAliases()), false);
                    leoneed.addField("日野森志歩", shihoStampCommand.getName() + str + Arrays.toString(shihoStampCommand.getAliases()), false);
                    leoneed.addField("望月穂波", honamiStampCommand.getName() + str + Arrays.toString(honamiStampCommand.getAliases()), false);
                    event.getChannel().sendMessage(leoneed.build()).queue();
                }
                if (args[1].equalsIgnoreCase("3")){
                    //ももじゃん
                    final EmbedBuilder moremorejump = new EmbedBuilder();
                    moremorejump.setTitle("MORE MORE JUMP!");
                    moremorejump.setColor(ColorUtils.MoreMoreJump.color);
                    moremorejump.addField("花里みのり", minoriStampCommand.getName() + str + Arrays.toString(minoriStampCommand.getAliases()), false);
                    moremorejump.addField("桐谷遥", harukaStampCommand.getName() + str + Arrays.toString(harukaStampCommand.getAliases()), false);
                    moremorejump.addField("桃井愛莉", airiStampCommand.getName() + str + Arrays.toString(airiStampCommand.getAliases()), false);
                    moremorejump.addField("日野森雫", shizukuStampCommand.getName() + str + Arrays.toString(shizukuStampCommand.getAliases()), false);
                    event.getChannel().sendMessage(moremorejump.build()).queue();
                }
                if (args[1].equalsIgnoreCase("4")){
                    //びびばす
                    final EmbedBuilder vividbadsquad = new EmbedBuilder();
                    vividbadsquad.setTitle("Vivid Bad SQUAD");
                    vividbadsquad.setColor(ColorUtils.VividBadSquad.color);
                    vividbadsquad.addField("小豆沢こはね", kohaneStampCommand.getName() + str + Arrays.toString(kohaneStampCommand.getAliases()), false);
                    vividbadsquad.addField("白石杏", anStampCommand.getName() + str + Arrays.toString(anStampCommand.getAliases()), false);
                    vividbadsquad.addField("東雲彰人", akitoStampCommand.getName() + str + Arrays.toString(akitoStampCommand.getAliases()), false);
                    vividbadsquad.addField("青柳冬弥", touyaStampCommand.getName() + str + Arrays.toString(touyaStampCommand.getAliases()), false);
                    event.getChannel().sendMessage(vividbadsquad.build()).queue();
                }
                if (args[1].equalsIgnoreCase("5")){
                    //わんだしょ
                    final EmbedBuilder wonderlands = new EmbedBuilder();
                    wonderlands.setTitle("ワンダーランズ×ショウタイム");
                    wonderlands.setColor(ColorUtils.WonderLandsShowtime.color);
                    wonderlands.addField("天馬司", tsukasaStampCommand.getName() + str + Arrays.toString(tsukasaStampCommand.getAliases()), false);
                    wonderlands.addField("鳳えむ", emuStampCommand.getName() + str + Arrays.toString(emuStampCommand.getAliases()), false);
                    wonderlands.addField("草薙寧々", neneStampCommand.getName() + str + Arrays.toString(neneStampCommand.getAliases()), false);
                    wonderlands.addField("神代類", ruiStampCommand.getName() + str + Arrays.toString(ruiStampCommand.getAliases()), false);
                    event.getChannel().sendMessage(wonderlands.build()).queue();
                }
                if (args[1].equalsIgnoreCase("6")){
                    //にーご
                    final EmbedBuilder niigo = new EmbedBuilder();
                    niigo.setTitle("25時、ナイトコードで。");
                    niigo.setColor(ColorUtils.Niigo.color);
                    niigo.addField("宵崎奏", kanadeStampCommand.getName() + str + Arrays.toString(kanadeStampCommand.getAliases()), false);
                    niigo.addField("朝比奈まふゆ", mafuyuStampCommand.getName() + str + Arrays.toString(mafuyuStampCommand.getAliases()), false);
                    niigo.addField("東雲絵名", enaStampCommand.getName() + str + Arrays.toString(enaStampCommand.getAliases()), false);
                    niigo.addField("暁山瑞希", mizukiStampCommand.getName() + str + Arrays.toString(mizukiStampCommand.getAliases()), false);
                    event.getChannel().sendMessage(niigo.build()).queue();
                }
                if (args[1].equalsIgnoreCase("7")){
                    //Other Stamp
                    final EmbedBuilder others = new EmbedBuilder();
                    others.setTitle("その他");
                    others.addField("Random", randomStampCommand.getName() + str + Arrays.toString(randomStampCommand.getAliases()), false);
                    //コミック
                    others.addField("RandomComicCommand", randomComicCommand.getName() + str + Arrays.toString(randomComicCommand.getAliases()), false);
                    //Others
                    others.addField("InfoCommand", infoCommand.getName() + str + Arrays.toString(infoCommand.getAliases()), false);
                    others.addField("HelloCommand", helloCommand.getName() + str + Arrays.toString(helloCommand.getAliases()), false);
                    event.getChannel().sendMessage(others.build()).queue();
                }
            }
        }
    }
}

