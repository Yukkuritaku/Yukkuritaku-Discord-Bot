package com.yukkuritaku.discordbot.commands.fourframe;

import com.yukkuritaku.discordbot.commands.BaseCommand;
import com.yukkuritaku.discordbot.utils.ColorUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.internal.utils.tuple.Pair;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.List;

public final class FourFrameCommand extends BaseCommand {

    private static final List<Pair<String, String>> FOUR_FRAMES = List.of(
            //リリース前
            //旧第1話「ようこそセカイへ！」
            Pair.of("EW-x1S7UcAENJy2", "旧第1話「ようこそセカイへ！」"),
            //旧第2話「レオニの温度」
            Pair.of("EXi0tOVVcAEQPGc", "旧第2話「レオニの温度」"),
            //旧第3話「先生たち」
            Pair.of("EYG30UlUwAEakNh", "旧第3話「先生たち」"),
            //旧第4話「常連感」
            Pair.of("EMW_3uGU0AEwLKc", "旧第4話「常連感」"),
            //旧第5話「人気者の条件」
            Pair.of("EZO8rAGUEAA9v8n", "旧第5話「人気者の条件」"),
            //旧第6話「怒髪天の歌」
            Pair.of("EZzA3TvU8AAu5pO", "旧第6話「怒髪天の歌」"),

            //リリース後

            //第1話「お姉ちゃん誕生？」
            Pair.of("EjJc3JPU4AAo111", "第1話「お姉ちゃん誕生？」"),
            //第2話「アイドルレッスン トーク編」
            Pair.of("EjNl06bUcAIbi8w", "第2話「アイドルレッスン トーク編」"),
            //第3話「私/俺にできること」
            Pair.of("EjSz2wpVcAAQ5ti", "第3話「私/俺にできること」"),
            //第4話「無法地帯」
            Pair.of("EjX58kXVoAEZPh1", "第4話「無法地帯」"),
            //第5話「孤独を感じて」
            Pair.of("Ejc_rW_UwAAkFqo", "第5話「孤独を感じて」"),

            //公式だと5話って書いてあったけど多分ミス
            //第6話「抱えきれないありがとう」
            Pair.of("EjiJjaxUwAE3auT", "第6話「抱えきれないありがとう」"),

            //第7話「流行をたどって」
            Pair.of("Ejsc9hCUYAEDPLw", "第7話「流行をたどって」"),
            //第8話「お兄さん像」
            Pair.of("EkQfYq0VkAESPlx", "第8話「お兄さん像」"),
            //第9話「明日になれば…」
            Pair.of("Ek0pY8pVcAAYQhj", "第9話「明日になれば…」"),
            //第10話「アップルパイマイスター」
            Pair.of("ElTXEiMVgAEIgfI", "第10話「アップルパイマイスター」"),
            //第11話「仲裁パフォーマー」
            Pair.of("El8wRCoVgAEktUl", "第11話「仲裁パフォーマー」"),
            //第12話「力の源」
            Pair.of("EmBxP5mU8AAU581", "第12話「力の源」"),
            //第13話「学級委員の参考に」
            Pair.of("Emgr_1zU4AAiCkY", "第13話「学級委員の参考に」"),
            //第14話「激励とパンケーキ」
            Pair.of("Eml1VFGUcAESRkx", "第14話「激励とパンケーキ」"),
            //第15話「センスを磨け！」
            Pair.of("EnE2m0gVkAAq6nl", "第15話「センスを磨け！」"),
            //第16話「ありそうで怖い」
            Pair.of("Enoy2WFVEAE1O0P", "第16話「ありそうで怖い」"),
            //第17話「ビビバス会議」
            Pair.of("EoM11ltUcAAkXoE", "第17話「ビビバス会議」"),
            //第18話「隠しきれないカリスマ」
            Pair.of("Eohb7MhVgAAaRwq", "第18話「隠しきれないカリスマ」"),
            //第19話「押しに弱くて」
            Pair.of("EpU8AebUwAAgsnJ", "第19話「押しに弱くて」"),
            //第20話「輝きは君のもの」
            Pair.of("Ep4_66LVQAA7zKm", "第20話「輝きは君のもの」"),
            //第21話「遠慮のない関係」
            Pair.of("EqH_B7WVEAAzSEI", "第21話「遠慮のない関係」"),
            //第22話「度胸」
            Pair.of("EqdCZ7IUUAEqDSh", "第22話「度胸」"),
            //第23話「セカイの狭間に響く歌」
            Pair.of("ErGC5qsVEAM46Wn", "第23話「セカイの狭間に響く歌」"),
            //第24話「また穏やかな日々
            Pair.of("ErLYqQJU0AAZfxz", "第24話「また穏やかな日々"),
            //第25話「ドラマーの体作り」
            Pair.of("ErlI9UMUUAYgYAj", "第25話「ドラマーの体作り」"),
            //第26話「機械オンチ？」
            Pair.of("EsTQggPU4AEINYW", "第26話「機械オンチ？」"),
            //第27話「生まれてきてくれて」
            Pair.of("EstcBKuVcAQUWOL", "第27話「生まれてきてくれて」"),
            //第28話「無敵の微笑み」
            Pair.of("Es8uX1tUUAQtbUg", "第28話「無敵の微笑み」"),
            //第29話「父親たち」
            Pair.of("EtRSAQoVEAEqReK", "第29話「父親たち」"),

            //奏ちゃんお誕生日おめでとう！！
            //第30話「いつでも全力」
            Pair.of("Et1Rw-sU0AQgE7s", "第30話「いつでも全力」"),

            //第31話「想いのこもった手紙」
            Pair.of("EuUAy1GUUAMRB3E", "第31話「想いのこもった手紙」"),
            //第32話「頼れるお兄さん」
            Pair.of("EuZFminVgAIdpDm", "第32話「頼れるお兄さん」"),
            //第33話「進捗はいかが？」
            Pair.of("EvCmiovVoAUrcmO", "第33話「進捗はいかが？」"),
            //第34話「こはねのフィールド」
            Pair.of("EvcZea2U4AYo3SR", "第34話「こはねのフィールド」"),
            //第35話「伝わる人物像」
            Pair.of("EvryyVOVkAAWRYK", "第35話「伝わる人物像」"),
            //第36話「役者の技」
            Pair.of("EwfRq1cVIAIL6gv", "第36話「役者の技」"),
            //第37話「しっかり者へサプライズ」
            Pair.of("Ewz4bmvU8AUa-8S", "第37話「しっかり者へサプライズ」"),
            //第38話「手と手つないで」
            Pair.of("ExSxn9MXMAAN59h", "第38話「手と手つないで」"),
            //第39話「呼び方」
            Pair.of("EyVvmxRVIAMHNHY", "第39話「呼び方」"),

            //てぇてぇ
            //第40話「スランプ対策」
            Pair.of("EyvcR8DUcAEhhvE", "第40話「スランプ対策」"),
            //第41話「ジャスト・フォー・ユー」
            Pair.of("Ey5xncMVkAEs1iJ", "第41話「ジャスト・フォー・ユー」"),
            //第42話「阿鼻叫喚」
            Pair.of("EzoHf_0VoAYrZJ4", "第42話「阿鼻叫喚」"),
            //第43話「#誕生日 #友達と」
            Pair.of("E0MIpVaVIAIkjZb", "第43話「#誕生日 #友達と」"),
            //第44話「急上昇」
            Pair.of("E0NP2Y4VkAMgp4p", "第44話「急上昇」"),
            //第45話「言葉あつめて」
            Pair.of("E0xuTkoUcAI_OMb", "第45話「言葉あつめて」"),
            //第46話「つかみはOK」
            Pair.of("E1J-bpwVEAM_YwP", "第46話「つかみはOK」"),
            //第47話「涙のショータイム」
            Pair.of("E1jtxjvVUAIHjkZ", "第47話「涙のショータイム」"),
            //第48話「最高の相棒」
            Pair.of("E2M6OWlVgAIdzgr", "第48話「最高の相棒」"),
            //第49話「彼女の愛称」
            Pair.of("E2cQLtrVIAAAN3s", "第49話「彼女の愛称」"),
            //第50話「天まで届け」
            Pair.of("E3AhaOlUYAAgCjw", "第50話「天まで届け」"),
            //第51話「挙動不審院」
            Pair.of("E4DQGlHXIAI7x2S", "第51話「挙動不審院」"),
            //第52話「まふゆ考察勢」
            Pair.of("E4iRO_8VUAAlDln", "第52話「まふゆ考察勢」"),
            //第53話「何よりの信頼」
            Pair.of("E4nZRwaVEAA7Kd_", "第53話「何よりの信頼」"),
            //第54話「プロになるには…？」
            Pair.of("E5qWkGCUYAEMD35", "第54話「プロになるには…？」"),

            //ポカリコラボ特別編「タイミング？」
            Pair.of("E6EIyiEUcAUwOZU", "ポカリコラボ特別編「タイミング？」"),

            //第55話「参観日」
            Pair.of("E6YrP5UVoAI-Nt1", "第55話「参観日」"),
            //第56話「賑やかな招待状」
            Pair.of("E6tTaJeVcAQPb8H", "第56話「賑やかな招待状」"),
            //第57話「私の特別な」
            Pair.of("E7MMvngUYAIpfHc", "第57話「私の特別な」"),
            //第58話「楽しみいっぱい夏祭り」
            Pair.of("E7WheP_VEAc5Ekb", "第58話「楽しみいっぱい夏祭り」"),
            //第59話「目指せえむ語マスター！」
            Pair.of("E8E80HGVoAQZ4AK", "第59話「目指せえむ語マスター！」"),
            //第60話「一歌の花」
            Pair.of("E8emnVEUcAcUSAS", "第60話「一歌の花」"),
            //第61話「アイドル常在戦場」
            Pair.of("E89f5aSVUAIWCFd", "第61話「アイドル常在戦場」"),
            //第62話「司令官ポジション」
            Pair.of("E9msVw4UYAAMYSA", "第62話「司令官ポジション」"),
            //第63話「重ねる時間」
            Pair.of("E9w_-M6UcAAVQtZ", "第63話「重ねる時間」"),
            //第64話「みんなの歌」
            Pair.of("E-FmYnNVEAMa-GD", "第64話「みんなの歌」"),
            //第65話「本人は否定するけど」
            Pair.of("E-pozxfUYAMtKle", "第65話「本人は否定するけど」"),
            //第66話「夕暮れのフェニランに」
            Pair.of("E-z_Q9pVEAgrV7q", "第66話「夕暮れのフェニランに」"),
            //第67話「音で語ろう！」
            Pair.of("E_UtSlpVkAANh-5", "第67話「音で語ろう！」"),
            //第68話「病人がもう一人」
            Pair.of("FAa8xaoUcAAW5XQ", "第68話「病人がもう一人」"),
            //第69話「幼馴染みから仲間へ」
            Pair.of("FA5n04EUUAUhpyD", "第69話「幼馴染みから仲間へ」"),
            //第70話「それぞれのミク」
            Pair.of("FBKa1RlVUAIb94j", "第70話「それぞれのミク」"),
            //第71話「新世代百面相」
            Pair.of("FBtXHTPVQAMLR1f", "第71話「新世代百面相」"),
            //第72話「実践に備えて」
            Pair.of("FCmAdY5VEAIdFBI", "第72話「実践に備えて」"),
            //第73話「アップルパイ星の王子様」
            Pair.of("FCq7MwKUUAs8DHP", "第73話「アップルパイ星の王子様」"),
            //第74話「バースデーDJトリオ」
            Pair.of("FDZfR_6aMAAW0bz", "第74話「バースデーDJトリオ」"),
            //第75話「本人×身内×学校態度」
            Pair.of("FDzPUM6acAMhnkQ", "第75話「本人×身内×学校態度」"),
            //第76話「気が利く姉弟」
            Pair.of("FD9iZ4xacAEOceC", "第76話「気が利く姉弟」"),
            //第77話「賑やかな教室」
            Pair.of("FEXTChGaQAALqQT", "第77話「賑やかな教室」"),
            //第78話「いつも通りの二人」
            Pair.of("FFFo3VOacAE7yRO", "第78話「いつも通りの二人」"),
            //第79話「髪の綺麗なあの人」
            Pair.of("FFpr3DsaAAUCzZV", "第79話「髪の綺麗なあの人」"),
            //第80話「穏やかな居場所」
            Pair.of("FF5IgUPaQAIcAYs", "第80話「穏やかな居場所」"),
            //第81話「聖夜に希望を」
            Pair.of("FGnfbAQVUAEAy2A", "第81話「聖夜に希望を」"),
            //第82話「森に行こう！」
            Pair.of("FHQsV-IagAQHGRq", "第82話「森に行こう！」"),
            //第83話「気持ちを込めた花を」
            Pair.of("FHlR6WFacAIsV6f", "第83話「気持ちを込めた花を」"),

            //実はここで好きだったももじゃんが更に好きになってメーターがふっきれました　全員可愛いんだよお！
            //第84話「ターゲットの油断」
            Pair.of("FITo8pYaUAE-E5o", "第84話「ターゲットの油断」"),

            //第85話「眠りに添えて」
            Pair.of("FIgFbMhakAMIxAg", "第85話「眠りに添えて」"),

            //第86話「ワンダショ in America」
            Pair.of("FJcDSNDaMAE9_kc", "第86話「ワンダショ in America」"),

            //第87話「once upon a time」
            Pair.of("FJ_xxRaaUAQRUm5", "第87話「once upon a time」"),

            //第88話「笑顔を届けに…！」
            Pair.of("FKE6n_PagAAl5bT", "第88話「笑顔を届けに…！」"),

            //第89話「頼れる先輩に」
            Pair.of("FKUMrlFVQAAttcB", "第89話「頼れる先輩に」"),

            //カップヌードルタイアップ特別編「超集中モード」
            Pair.of("FKpESE4agAIYP4G", "カップヌードルタイアップ特別編「超集中モード」"),

            //第90話「よいこのみんな」
            //なんて尊い...!
            Pair.of("FK9k0t7aMAIJ8oA", "第90話「よいこのみんな」"),

            //第91話「わたしの好物」
            //奏ちゃん誕生日おめでとう！
            Pair.of("FLNA0PMVcAAKsFb", "第91話「わたしの好物」"),

            //第92話「言葉は無力…！」
            Pair.of("FLr7f1paIAEKAmB", "第92話「言葉は無力…！」"),

            //第93話「KAITOと3人の座長」
            Pair.of("FLw-AHhaIAAYQ1P", "第93話「KAITOと3人の座長」"),

            //第94話「似たもの同士？」
            Pair.of("FMaQ9_jaMAAXqPD", "第94話「似たもの同士？」"),

            //第95話「フェニランで特別なひとときを」
            Pair.of("FMz7mlLaUAE2gJ_", "第95話「フェニランで特別なひとときを」"),

            //第96話「夢は夢のままで」
            Pair.of("FNSkiP4aIAIlOXW", "第96話「夢は夢のままで」"),

            //第97話「大先生にお願い」
            Pair.of("FN8JZbhVsAIVu8p", "第97話「大先生にお願い」"),

            //第98話「今も昔も」
            Pair.of("FOHOU23aIAERtcB", "第98話「今も昔も」"),

            //第99話「焦りと成長」
            Pair.of("FOgKO5jaAAMPK2L", "第99話「焦りと成長」"),

            //100話おめでとう！
            //第100話「誰もいないセカイ、だけど…」
            Pair.of("FPoRKwuacAYZHHz", "第100話「誰もいないセカイ、だけど…」"),

            //みのりちゃんお誕生日おめでとう！
            //第101話「いつもあなたは」
            Pair.of("FQRUKw4aQAQWF6-", "第101話「いつもあなたは」"),

            //第102話「ピアノ弾きの逆トルペ」
            Pair.of("FQloQ9eUYAIKN90", "第102話「ピアノ弾きの逆トルペ」"),

            //第103話「ファンのためにできること」
            Pair.of("FRUPQ_haQAYyhwA", "第103話「ファンのためにできること」"),

            //第104話「ふわふわの約束」
            Pair.of("FRb4wKHUUAAkD6j", "第104話「ふわふわの約束」"),

            //第105話「緊張のお宅訪問」
            Pair.of("FRt1E8aaMAA2tvz", "第105話「緊張のお宅訪問」"),

            //第106話「旋律にのせて」
            Pair.of("FSSC2YOaIAEttfx", "第106話「旋律にのせて」"),

            //第107話「似合いの役職」
            Pair.of("FS14Gs4UUAA6-jz", "第107話「似合いの役職」"),

            //第108話「昔からの大切な」
            Pair.of("FS7VK34akAEsYbS", "第108話「昔からの大切な」"),

            //第109話「旅人と仲間たち」
            Pair.of("FTkXPHDagAIIuFL", "第109話「旅人と仲間たち」"),

            //第110話「主催イベントに向けて」
            Pair.of("FTpyDqHUAAA1CpW", "第110話「主催イベントに向けて」"),

            //第111話「保護者の権限」
            Pair.of("FUndyDPaMAAN2pt", "第111話「保護者の権限」"),

            //第112話「そばにいたい」
            Pair.of("FVV5SXCaMAAtDw4", "第112話「そばにいたい」"),

            //第113話「パーティーは綺麗な部屋で」
            Pair.of("FV_FBHMakAATGuE", "第113話「パーティーは綺麗な部屋で」"),

            //第114話「メカニカル・ロマン」
            Pair.of("FWOW2StagAAqCzX", "第114話「メカニカル・ロマン」"),

            //第115話「弱点属性」
            Pair.of("FW852YiacAAuvwE", "第115話「弱点属性」"),

            //第116話「駆け引きとは」
            Pair.of("FYACmxSaMAApFuY", "第116話「駆け引きとは」"),

            //第117話「わたし達のペース」
            Pair.of("FYEvfdDaQAABzYY", "第117話「わたし達のペース」"),

            //第118話「一番のプレゼント」
            Pair.of("FYjfcGsaMAABTqg", "第118話「一番のプレゼント」"),

            //第119話「新しい曲！」
            Pair.of("FYzRSZkaQAAz7Wt", "第119話「新しい曲！」"),

            //第120話「白熱！ワクワクゲーム大会」
            Pair.of("FZm0ZVBaUAAV8k6", "第120話「白熱！ワクワクゲーム大会」"),

            //第121話「クラスメイトと一緒に」
            Pair.of("FZzCF8OaIAEj1Ux", "第121話「クラスメイトと一緒に」"),

            //第122話「大成功をもう一度」
            Pair.of("FaaXKphacAE5ghk", "第122話「大成功をもう一度」"),

            //第123話「腐れ縁な絆」
            Pair.of("FbFhAYpagAEoo5G", "第123話「腐れ縁な絆」"),

            //第124話「きょうだいの近さ」
            Pair.of("FbS_ZCIaUAAXzzu", "第124話「きょうだいの近さ」"),

            //第125話「灯火に照らされて」
            //ミクちゃん誕生日おめでとう！
            Pair.of("FbdSWzGaIAAwA1H", "第125話「灯火に照らされて」"),

            //第126話「個別練習」
            Pair.of("FcBUL3NaMAAht5y", "第126話「個別練習」"),

            //第127話「特別な日は夜までも」
            Pair.of("FcLg-8kaAAAxtcg", "第127話「特別な日は夜までも」")


    );

    public FourFrameCommand() {
        super(new Color(ColorUtils.rainbow(System.currentTimeMillis(), 3, 0, 1)),
                "fourframe",
                "プロセカの4コマからどれかが選ばれるか選択するよ",
                new String[]{"4frame", "4coma", "coma", "4コマ漫画", "4コマ", "プロセカ4コマ"},
                FOUR_FRAMES);
    }

    private void add(SlashCommandInteractionEvent event, OptionMapping mapping) {
        String id = mapping.getAsString();
        String url = String.format(getUrl(), id);

        checkUrl(event, url);

        EmbedBuilder builder = new EmbedBuilder();
        builder.setImage(url);
        builder.setColor(this.getColor());
        event.replyEmbeds(builder.build()).queue();
    }

    @Override
    protected void onMessageCommandReceived(@NotNull MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        List<Pair<String, String>> returnUrl = getReturnPrefix();

        int randomUrl = RANDOM.nextInt(returnUrl.size());
        String id = returnUrl.get(randomUrl).getLeft();
        String url = String.format(getUrl(), id);

        EmbedBuilder builder = new EmbedBuilder();
        builder.setImage(url);
        builder.setColor(this.getColor());
        channel.sendMessageEmbeds(builder.build()).queue();
    }

    @Override
    protected void onSlashCommandReceived(@NotNull SlashCommandInteractionEvent event) {
    }

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if (!event.getName().contains(this.getCommandName())) {
            return;
        }
        var oldOption = event.getOption("old");
        var newOption1 = event.getOption("current1-25");
        var newOption2 = event.getOption("current26-50");
        var newOption3 = event.getOption("current51-74");
        var newOption4 = event.getOption("current75-100");
        var newOption5 = event.getOption("current99-124");
        var newOption6 = event.getOption("current125-150");
        if (oldOption != null) {
            add(event, oldOption);
        } else if (newOption1 != null) {
            add(event, newOption1);
        } else if (newOption2 != null) {
            add(event, newOption2);
        } else if (newOption3 != null) {
            add(event, newOption3);
        } else if (newOption4 != null) {
            add(event, newOption4);
        } else if (newOption5 != null) {
            add(event, newOption5);
        }else if (newOption6 != null) {
            add(event, newOption6);
        } else {
            List<Pair<String, String>> returnPrefix = getReturnPrefix();
            int randomPrefix = RANDOM.nextInt(returnPrefix.size());

            String id = returnPrefix.get(randomPrefix).getLeft();
            String url = String.format(getUrl(), id);

            EmbedBuilder builder = new EmbedBuilder();
            builder.setImage(url);
            builder.setColor(this.getColor());
            event.replyEmbeds(builder.build()).queue();
        }
    }

    @Override
    public String getUrl() {
        String format = "%s";
        return "https://pbs.twimg.com/media/" + format + "?format=jpg&name=orig";
    }
}
