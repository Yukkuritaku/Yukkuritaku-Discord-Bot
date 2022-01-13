package com.yukkuritaku.discordbot.commands.comic;

import com.yukkuritaku.discordbot.DiscordBot;
import com.yukkuritaku.discordbot.commands.BaseCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.internal.utils.tuple.Pair;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public final class ComicCommand extends BaseCommand {

    private static final List<Pair<String, String>> COMICS = List.of(
            Pair.of("comic_0001", "[Leo/need] 取り柄"),
            //クール系とギャル系？
            Pair.of("comic_0002", "[Leo/need] クール系とギャル系？"),
            //病院のおばあちゃんから教わった
            Pair.of("comic_0003", "[Leo/need] 病院のおばあちゃんから教わった"),
            //同い年なのに...
            Pair.of("comic_0004", "[Leo/need] 同い年なのに..."),
            //一緒に食べよ！
            Pair.of("comic_0005", "[Leo/need] 一緒に食べよ！"),
            //教室のセカイ
            Pair.of("comic_0006", "[Virtual Singer(Leo/need)] 教室のセカイ"),
            //練習熱心
            Pair.of("comic_0007", "[MORE MORE JUMP!] 練習熱心"),
            //みんなでカラオケ
            Pair.of("comic_0008", "[MORE MORE JUMP!] みんなでカラオケ"),
            //夢は完全南極
            Pair.of("comic_0009", "[MORE MORE JUMP!] 夢は完全南極"),
            //猫好き
            Pair.of("comic_0010", "[MORE MORE JUMP!] 猫好き"),
            //美しく
            Pair.of("comic_0011", "[MORE MORE JUMP!] 美しく"),
            //ステージのセカイ
            Pair.of("comic_0012", "[Virtual Singer(MORE MORE JUMP!)] ステージのセカイ"),
            //最高のコンビ！
            Pair.of("comic_0013", "[Vivid Bad SQUAD] 最高のコンビ！"),
            //獣のオーラ
            Pair.of("comic_0014", "[Vivid Bad SQUAD] 獣のオーラ"),
            //風紀委員はガラじゃない
            Pair.of("comic_0015", "[Vivid Bad SQUAD] 風紀委員はガラじゃない"),
            //優男モード
            Pair.of("comic_0016", "[Vivid Bad SQUAD] 優男モード"),
            //口下手なふたり
            Pair.of("comic_0017", "[Vivid Bad SQUAD] 口下手なふたり"),
            //ストリートのセカイ
            Pair.of("comic_0018", "[Virtual Singer(Vivid Bad SQUAD)] ストリートのセカイ"),
            //不死鳥戦隊ワンダレンジャー！
            Pair.of("comic_0019", "[ワンダーランズ×ショウタイム] 不死鳥戦隊ワンダレンジャー！"),
            //百のポーズを持つ男
            Pair.of("comic_0020", "[ワンダーランズ×ショウタイム] 百のポーズを持つ男"),
            //一緒に遊んでたら
            Pair.of("comic_0021", "[ワンダーランズ×ショウタイム] 一緒に遊んでたら"),
            //ゲームが得意
            Pair.of("comic_0022", "[ワンダーランズ×ショウタイム] ゲームが得意"),
            //稀代の天才
            Pair.of("comic_0023", "[ワンダーランズ×ショウタイム] 稀代の天才"),
            //ワンダーランドのセカイ
            Pair.of("comic_0024", "[Virtual Singer(ワンダーランズ×ショウタイム)] ワンダーランドのセカイ"),
            //ニーゴのナイトコード
            Pair.of("comic_0025", "[25時、ナイトコードで。] ニーゴのナイトコード"),
            //最強装備
            Pair.of("comic_0026", "[25時、ナイトコードで。] 最強装備"),
            //魚のいない水槽
            Pair.of("comic_0027", "[25時、ナイトコードで。] 魚のいない水槽"),
            //最大のライバル？
            Pair.of("comic_0028", "[25時、ナイトコードで。] 最大のライバル？"),
            //かわいいは正義！
            Pair.of("comic_0029", "[25時、ナイトコードで。] かわいいは正義！"),
            //誰もいないセカイ
            Pair.of("comic_0030", "[Virtual Singer(25時、ナイトコードで。)] 誰もいないセカイ"),
            //バーチャル・シンガーとは
            Pair.of("comic_0031", "[その他] バーチャル・シンガーとは"),
            //猫かわいがりの姉
            Pair.of("comic_0032", "[日野森姉妹] 猫かわいがりの姉"),
            //病床の中学校時代
            Pair.of("comic_0033", "[天馬兄妹] 病床の中学校時代"),
            //姉と弟
            Pair.of("comic_0034", "[東雲姉弟] 姉と弟"),
            //友達のお兄さん
            Pair.of("comic_0035", "[その他] 友達のお兄さん"),
            //親友でライバル
            Pair.of("comic_0036", "[その他] 親友でライバル"),

            //中学校からの友達(ゲーム内の奴は間違いらしいけど現在は修正済みらしい、自分で確認してきた)ソース: https://twitter.com/pj_sekai/status/1352111841099411459?s=19
            Pair.of("comic_0037", "[その他] 中学校からの友達"),

            //調理実習
            Pair.of("comic_0038", "[その他] 調理実習"),
            //PWLキャストは大忙し
            Pair.of("comic_0039", "[ワンダーランズ×ショウタイム] PWLキャストは大忙し"),
            //機械オンチ
            Pair.of("comic_0040", "[その他] 機械オンチ")
    );

    public ComicCommand() {
        super(new Color(ColorUtils.rainbow(System.currentTimeMillis(), 3, 0, 1)),
                "comic",
                "プロセカのコミックからどれかが選ばれるか選択するよ",
                new String[]{"rc", "randomc", "comic", "プロセカロード画面", "コミック"},
                COMICS);
    }

    private void putBuilder(EmbedBuilder builder, String id){
        COMICS.stream()
                .filter(pair -> pair.getLeft().equals(id))
                .forEach(pair -> builder.setTitle(
                        pair.getRight()
                                //地獄☆
                                .replace("[Leo/need] ", "")
                                .replace("[Virtual Singer(Leo/need)] ", "")
                                .replace("[MORE MORE JUMP!] ", "")
                                .replace("[Virtual Singer(MORE MORE JUMP!)] ", "")
                                .replace("[Vivid Bad SQUAD] ", "")
                                .replace("[Virtual Singer(Vivid Bad SQUAD)] ", "")
                                .replace("[ワンダーランズ×ショウタイム] ", "")
                                .replace("[Virtual Singer(ワンダーランズ×ショウタイム)] ", "")
                                .replace("[25時、ナイトコードで。] ", "")
                                .replace("[Virtual Singer(25時、ナイトコードで。)] ", "")
                                .replace("[その他] ", "")
                                .replace("[日野森姉妹] ", "")
                                .replace("[天馬兄妹] ", "")
                                .replace("[東雲姉弟] ", "")
                ));
    }

    private void add(SlashCommandEvent event, OptionMapping mapping) {
        String id = mapping.getAsString();
        String url = String.format(getUrl(), id);
        checkUrl(event, url);
        EmbedBuilder builder = new EmbedBuilder();
        COMICS.stream()
                .filter(pair -> pair.getLeft().equals(id))
                .forEach(pair -> putBuilder(builder, id));
        builder.setImage(url);
        builder.setColor(this.getColor());
        event.replyEmbeds(builder.build()).queue();
    }

    @Override
    protected void onMessageCommandReceived(@NotNull MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        List<Pair<String, String>> stampType = getReturnPrefix();
        int randomStamp = RANDOM.nextInt(stampType.size());
        String id = stampType.get(randomStamp).getLeft();
        String url = String.format(getUrl(), id);
        EmbedBuilder builder = new EmbedBuilder();
        putBuilder(builder, id);
        builder.setImage(url);
        builder.setColor(this.getColor());
        channel.sendMessageEmbeds(builder.build()).queue();
    }

    @Override
    protected void onSlashCommandReceived(@NotNull SlashCommandEvent event) {
        var prefix1 = event.getOption("prefix1");
        var prefix2 = event.getOption("prefix2");
        if (prefix1 != null && prefix2 != null){
            event.reply("[Error] このプレフィックスは2個指定できません。どちらか一つに指定してください。").queue();
            return;
        }
        if (prefix1 != null) {
            add(event, prefix1);
        } else if (prefix2 != null) {
            add(event, prefix2);
        } else {
            List<Pair<String, String>> returnPrefix = getReturnPrefix();
            int randomPrefix = RANDOM.nextInt(returnPrefix.size());
            String id = returnPrefix.get(randomPrefix).getLeft();
            String url = String.format(getUrl(), id);
            EmbedBuilder builder = new EmbedBuilder();
            putBuilder(builder, id);
            builder.setImage(url);
            builder.setColor(this.getColor());
            event.replyEmbeds(builder.build()).queue();
        }
    }

    @NotNull
    @Override
    public String getUrl() {
        String prefix = "%s";
        return "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/" + prefix + ".png";
    }
}
