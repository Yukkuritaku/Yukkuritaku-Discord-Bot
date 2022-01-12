package com.yukkuritaku.discordbot.commands.fourframe;

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

public final class FourFrameCommand extends BaseCommand {

    private static final List<Pair<String, String>> FOUR_FRAMES = List.of(
            //リリース前
            //旧第1話「ようこそセカイへ！」
            Pair.of("https://pbs.twimg.com/media/EW-x1S7UcAENJy2?format=jpg&name=4096x4096", "旧第1話「ようこそセカイへ！」"),
            //旧第2話「レオニの温度」
            Pair.of("https://pbs.twimg.com/media/EXi0tOVVcAEQPGc?format=jpg&name=4096x4096", "旧第2話「レオニの温度」"),
            //旧第3話「先生たち」
            Pair.of("https://pbs.twimg.com/media/EYG30UlUwAEakNh?format=jpg&name=4096x4096", "旧第3話「先生たち」"),
            //旧第4話「常連感」
            Pair.of("https://pbs.twimg.com/media/EMW_3uGU0AEwLKc?format=jpg&name=large", "旧第4話「常連感」"),
            //旧第5話「人気者の条件」
            Pair.of("https://pbs.twimg.com/media/EZO8rAGUEAA9v8n?format=jpg&name=4096x4096", "旧第5話「人気者の条件」"),
            //旧第6話「怒髪天の歌」
            Pair.of("https://pbs.twimg.com/media/EZzA3TvU8AAu5pO?format=jpg&name=4096x4096", "旧第6話「怒髪天の歌」"),

            //リリース後

            //第1話「お姉ちゃん誕生？」
            Pair.of("https://pbs.twimg.com/media/EjJc3JPU4AAo111?format=jpg&name=4096x4096", "第1話「お姉ちゃん誕生？」"),
            //第2話「アイドルレッスン トーク編」
            Pair.of("https://pbs.twimg.com/media/EjNl06bUcAIbi8w?format=jpg&name=4096x4096", "第2話「アイドルレッスン トーク編」"),
            //第3話「私/俺にできること」
            Pair.of("https://pbs.twimg.com/media/EjSz2wpVcAAQ5ti?format=jpg&name=4096x4096", "第3話「私/俺にできること」"),
            //第4話「無法地帯」
            Pair.of("https://pbs.twimg.com/media/EjX58kXVoAEZPh1?format=jpg&name=4096x4096", "第4話「無法地帯」"),
            //第5話「孤独を感じて」
            Pair.of("https://pbs.twimg.com/media/Ejc_rW_UwAAkFqo?format=jpg&name=4096x4096", "第5話「孤独を感じて」"),

            //公式だと5話って書いてあったけど多分ミス
            //第6話「抱えきれないありがとう」
            Pair.of("https://pbs.twimg.com/media/EjiJjaxUwAE3auT?format=jpg&name=4096x4096", "第6話「抱えきれないありがとう」"),

            //第7話「流行をたどって」
            Pair.of("https://pbs.twimg.com/media/Ejsc9hCUYAEDPLw?format=jpg&name=4096x4096", "第7話「流行をたどって」"),
            //第8話「お兄さん像」
            Pair.of("https://pbs.twimg.com/media/EkQfYq0VkAESPlx?format=jpg&name=4096x4096", "第8話「お兄さん像」"),
            //第9話「明日になれば…」
            Pair.of("https://pbs.twimg.com/media/Ek0pY8pVcAAYQhj?format=jpg&name=4096x4096", "第9話「明日になれば…」"),
            //第10話「アップルパイマイスター」
            Pair.of("https://pbs.twimg.com/media/ElTXEiMVgAEIgfI?format=jpg&name=4096x4096", "第10話「アップルパイマイスター」"),
            //第11話「仲裁パフォーマー」
            Pair.of("https://pbs.twimg.com/media/El8wRCoVgAEktUl?format=jpg&name=4096x4096", "第11話「仲裁パフォーマー」"),
            //第12話「力の源」
            Pair.of("https://pbs.twimg.com/media/EmBxP5mU8AAU581?format=jpg&name=4096x4096", "第12話「力の源」"),
            //第13話「学級委員の参考に」
            Pair.of("https://pbs.twimg.com/media/Emgr_1zU4AAiCkY?format=jpg&name=4096x4096", "第13話「学級委員の参考に」"),
            //第14話「激励とパンケーキ」
            Pair.of("https://pbs.twimg.com/media/Eml1VFGUcAESRkx?format=jpg&name=4096x4096", "第14話「激励とパンケーキ」"),
            //第15話「センスを磨け！」
            Pair.of("https://pbs.twimg.com/media/EnE2m0gVkAAq6nl?format=jpg&name=4096x4096", "第15話「センスを磨け！」"),
            //第16話「ありそうで怖い」
            Pair.of("https://pbs.twimg.com/media/Enoy2WFVEAE1O0P?format=jpg&name=4096x4096", "第16話「ありそうで怖い」"),
            //第17話「ビビバス会議」
            Pair.of("https://pbs.twimg.com/media/EoM11ltUcAAkXoE?format=jpg&name=4096x4096", "第17話「ビビバス会議」"),
            //第18話「隠しきれないカリスマ」
            Pair.of("https://pbs.twimg.com/media/Eohb7MhVgAAaRwq?format=jpg&name=4096x4096", "第18話「隠しきれないカリスマ」"),
            //第19話「押しに弱くて」
            Pair.of("https://pbs.twimg.com/media/EpU8AebUwAAgsnJ?format=jpg&name=4096x4096", "第19話「押しに弱くて」"),
            //第20話「輝きは君のもの」
            Pair.of("https://pbs.twimg.com/media/Ep4_66LVQAA7zKm?format=jpg&name=4096x4096", "第20話「輝きは君のもの」"),
            //第21話「遠慮のない関係」
            Pair.of("https://pbs.twimg.com/media/EqH_B7WVEAAzSEI?format=jpg&name=4096x4096", "第21話「遠慮のない関係」"),
            //第22話「度胸」
            Pair.of("https://pbs.twimg.com/media/EqdCZ7IUUAEqDSh?format=jpg&name=4096x4096", "第22話「度胸」"),
            //第23話「セカイの狭間に響く歌」
            Pair.of("https://pbs.twimg.com/media/ErGC5qsVEAM46Wn?format=jpg&name=4096x4096", "第23話「セカイの狭間に響く歌」"),
            //第24話「また穏やかな日々
            Pair.of("https://pbs.twimg.com/media/ErLYqQJU0AAZfxz?format=jpg&name=4096x4096", "第24話「また穏やかな日々"),
            //第25話「ドラマーの体作り」
            Pair.of("https://pbs.twimg.com/media/ErlI9UMUUAYgYAj?format=jpg&name=4096x4096", "第25話「ドラマーの体作り」"),
            //第26話「機械オンチ？」
            Pair.of("https://pbs.twimg.com/media/EsTQggPU4AEINYW?format=jpg&name=4096x4096", "第26話「機械オンチ？」"),
            //第27話「生まれてきてくれて」
            Pair.of("https://pbs.twimg.com/media/EstcBKuVcAQUWOL?format=jpg&name=4096x4096", "第27話「生まれてきてくれて」"),
            //第28話「無敵の微笑み」
            Pair.of("https://pbs.twimg.com/media/Es8uX1tUUAQtbUg?format=jpg&name=4096x4096", "第28話「無敵の微笑み」"),
            //第29話「父親たち」
            Pair.of("https://pbs.twimg.com/media/EtRSAQoVEAEqReK?format=jpg&name=4096x4096", "第29話「父親たち」"),

            //奏ちゃんお誕生日おめでとう！！
            //第30話「いつでも全力」
            Pair.of("https://pbs.twimg.com/media/Et1Rw-sU0AQgE7s?format=jpg&name=4096x4096", "第30話「いつでも全力」"),

            //第31話「想いのこもった手紙」
            Pair.of("https://pbs.twimg.com/media/EuUAy1GUUAMRB3E?format=jpg&name=4096x4096", "第31話「想いのこもった手紙」"),
            //第32話「頼れるお兄さん」
            Pair.of("https://pbs.twimg.com/media/EuZFminVgAIdpDm?format=jpg&name=4096x4096", "第32話「頼れるお兄さん」"),
            //第33話「進捗はいかが？」
            Pair.of("https://pbs.twimg.com/media/EvCmiovVoAUrcmO?format=jpg&name=4096x4096", "第33話「進捗はいかが？」"),
            //第34話「こはねのフィールド」
            Pair.of("https://pbs.twimg.com/media/EvcZea2U4AYo3SR?format=jpg&name=4096x4096", "第34話「こはねのフィールド」"),
            //第35話「伝わる人物像」
            Pair.of("https://pbs.twimg.com/media/EvryyVOVkAAWRYK?format=jpg&name=4096x4096", "第35話「伝わる人物像」"),
            //第36話「役者の技」
            Pair.of("https://pbs.twimg.com/media/EwfRq1cVIAIL6gv?format=jpg&name=4096x4096", "第36話「役者の技」"),
            //第37話「しっかり者へサプライズ」
            Pair.of("https://pbs.twimg.com/media/Ewz4bmvU8AUa-8S?format=jpg&name=4096x4096", "第37話「しっかり者へサプライズ」"),
            //第38話「手と手つないで」
            Pair.of("https://pbs.twimg.com/media/ExSxn9MXMAAN59h?format=jpg&name=4096x4096", "第38話「手と手つないで」"),
            //第39話「呼び方」
            Pair.of("https://pbs.twimg.com/media/EyVvmxRVIAMHNHY?format=jpg&name=4096x4096", "第39話「呼び方」"),

            //てぇてぇ
            //第40話「スランプ対策」
            Pair.of("https://pbs.twimg.com/media/EyvcR8DUcAEhhvE?format=jpg&name=4096x4096", "第40話「スランプ対策」"),
            //第41話「ジャスト・フォー・ユー」
            Pair.of("https://pbs.twimg.com/media/Ey5xncMVkAEs1iJ?format=jpg&name=4096x4096", "第41話「ジャスト・フォー・ユー」"),
            //第42話「阿鼻叫喚」
            Pair.of("https://pbs.twimg.com/media/EzoHf_0VoAYrZJ4?format=jpg&name=4096x4096", "第42話「阿鼻叫喚」"),
            //第43話「#誕生日 #友達と」
            Pair.of("https://pbs.twimg.com/media/E0MIpVaVIAIkjZb?format=jpg&name=4096x4096", "第43話「#誕生日 #友達と」"),
            //第44話「急上昇」
            Pair.of("https://pbs.twimg.com/media/E0NP2Y4VkAMgp4p?format=jpg&name=4096x4096", "第44話「急上昇」"),
            //第45話「言葉あつめて」
            Pair.of("https://pbs.twimg.com/media/E0xuTkoUcAI_OMb?format=jpg&name=4096x4096", "第45話「言葉あつめて」"),
            //第46話「つかみはOK」
            Pair.of("https://pbs.twimg.com/media/E1J-bpwVEAM_YwP?format=jpg&name=4096x4096", "第46話「つかみはOK」"),
            //第47話「涙のショータイム」
            Pair.of("https://pbs.twimg.com/media/E1jtxjvVUAIHjkZ?format=jpg&name=4096x4096", "第47話「涙のショータイム」"),
            //第48話「最高の相棒」
            Pair.of("https://pbs.twimg.com/media/E2M6OWlVgAIdzgr?format=jpg&name=4096x4096", "第48話「最高の相棒」"),
            //第49話「彼女の愛称」
            Pair.of("https://pbs.twimg.com/media/E2cQLtrVIAAAN3s?format=jpg&name=4096x4096", "第49話「彼女の愛称」"),
            //第50話「天まで届け」
            Pair.of("https://pbs.twimg.com/media/E3AhaOlUYAAgCjw?format=jpg&name=4096x4096", "第50話「天まで届け」"),
            //第51話「挙動不審院」
            Pair.of("https://pbs.twimg.com/media/E4DQGlHXIAI7x2S?format=jpg&name=4096x4096", "第51話「挙動不審院」"),
            //第52話「まふゆ考察勢」
            Pair.of("https://pbs.twimg.com/media/E4iRO_8VUAAlDln?format=jpg&name=4096x4096", "第52話「まふゆ考察勢」"),
            //第53話「何よりの信頼」
            Pair.of("https://pbs.twimg.com/media/E4nZRwaVEAA7Kd_?format=jpg&name=4096x4096", "第53話「何よりの信頼」"),
            //第54話「プロになるには…？」
            Pair.of("https://pbs.twimg.com/media/E5qWkGCUYAEMD35?format=jpg&name=4096x4096", "第54話「プロになるには…？」"),

            //ポカリコラボ特別編「タイミング？」
            Pair.of("https://pbs.twimg.com/media/E6EIyiEUcAUwOZU?format=jpg&name=4096x4096", "ポカリコラボ特別編「タイミング？」"),

            //第55話「参観日」
            Pair.of("https://pbs.twimg.com/media/E6YrP5UVoAI-Nt1?format=jpg&name=4096x4096", "第55話「参観日」"),
            //第56話「賑やかな招待状」
            Pair.of("https://pbs.twimg.com/media/E6tTaJeVcAQPb8H?format=jpg&name=4096x4096", "第56話「賑やかな招待状」"),
            //第57話「私の特別な」
            Pair.of("https://pbs.twimg.com/media/E7MMvngUYAIpfHc?format=jpg&name=4096x4096", "第57話「私の特別な」"),
            //第58話「楽しみいっぱい夏祭り」
            Pair.of("https://pbs.twimg.com/media/E7WheP_VEAc5Ekb?format=jpg&name=4096x4096", "第58話「楽しみいっぱい夏祭り」"),
            //第59話「目指せえむ語マスター！」
            Pair.of("https://pbs.twimg.com/media/E8E80HGVoAQZ4AK?format=jpg&name=4096x4096", "第59話「目指せえむ語マスター！」"),
            //第60話「一歌の花」
            Pair.of("https://pbs.twimg.com/media/E8emnVEUcAcUSAS?format=jpg&name=4096x4096", "第60話「一歌の花」"),
            //第61話「アイドル常在戦場」
            Pair.of("https://pbs.twimg.com/media/E89f5aSVUAIWCFd?format=jpg&name=4096x4096", "第61話「アイドル常在戦場」"),
            //第62話「司令官ポジション」
            Pair.of("https://pbs.twimg.com/media/E9msVw4UYAAMYSA?format=jpg&name=4096x4096", "第62話「司令官ポジション」"),
            //第63話「重ねる時間」
            Pair.of("https://pbs.twimg.com/media/E9w_-M6UcAAVQtZ?format=jpg&name=4096x4096", "第63話「重ねる時間」"),
            //第64話「みんなの歌」
            Pair.of("https://pbs.twimg.com/media/E-FmYnNVEAMa-GD?format=jpg&name=4096x4096", "第64話「みんなの歌」"),
            //第65話「本人は否定するけど」
            Pair.of("https://pbs.twimg.com/media/E-pozxfUYAMtKle?format=jpg&name=4096x4096", "第65話「本人は否定するけど」"),
            //第66話「夕暮れのフェニランに」
            Pair.of("https://pbs.twimg.com/media/E-z_Q9pVEAgrV7q?format=jpg&name=4096x4096", "第66話「夕暮れのフェニランに」"),
            //第67話「音で語ろう！」
            Pair.of("https://pbs.twimg.com/media/E_UtSlpVkAANh-5?format=jpg&name=4096x4096", "第67話「音で語ろう！」"),
            //第68話「病人がもう一人」
            Pair.of("https://pbs.twimg.com/media/FAa8xaoUcAAW5XQ?format=jpg&name=4096x4096", "第68話「病人がもう一人」"),
            //第69話「幼馴染みから仲間へ」
            Pair.of("https://pbs.twimg.com/media/FA5n04EUUAUhpyD?format=jpg&name=4096x4096", "第69話「幼馴染みから仲間へ」"),
            //第70話「それぞれのミク」
            Pair.of("https://pbs.twimg.com/media/FBKa1RlVUAIb94j?format=jpg&name=4096x4096", "第70話「それぞれのミク」"),
            //第71話「新世代百面相」
            Pair.of("https://pbs.twimg.com/media/FBtXHTPVQAMLR1f?format=jpg&name=4096x4096", "第71話「新世代百面相」"),
            //第72話「実践に備えて」
            Pair.of("https://pbs.twimg.com/media/FCmAdY5VEAIdFBI?format=jpg&name=4096x4096", "第72話「実践に備えて」"),
            //第73話「アップルパイ星の王子様」
            Pair.of("https://pbs.twimg.com/media/FCq7MwKUUAs8DHP?format=jpg&name=4096x4096", "第73話「アップルパイ星の王子様」"),
            //第74話「バースデーDJトリオ」
            Pair.of("https://pbs.twimg.com/media/FDZfR_6aMAAW0bz?format=jpg&name=4096x4096", "第74話「バースデーDJトリオ」"),
            //第75話「本人×身内×学校態度」
            Pair.of("https://pbs.twimg.com/media/FDzPUM6acAMhnkQ?format=jpg&name=4096x4096", "第75話「本人×身内×学校態度」"),
            //第76話「気が利く姉弟」
            Pair.of("https://pbs.twimg.com/media/FD9iZ4xacAEOceC?format=jpg&name=4096x4096", "第76話「気が利く姉弟」"),
            //第77話「賑やかな教室」
            Pair.of("https://pbs.twimg.com/media/FEXTChGaQAALqQT?format=jpg&name=4096x4096", "第77話「賑やかな教室」"),
            //第78話「いつも通りの二人」
            Pair.of("https://pbs.twimg.com/media/FFFo3VOacAE7yRO?format=jpg&name=4096x4096", "第78話「いつも通りの二人」"),
            //第79話「髪の綺麗なあの人」
            Pair.of("https://pbs.twimg.com/media/FFpr3DsaAAUCzZV?format=jpg&name=4096x4096", "第79話「髪の綺麗なあの人」"),
            //第80話「穏やかな居場所」
            Pair.of("https://pbs.twimg.com/media/FF5IgUPaQAIcAYs?format=jpg&name=4096x4096", "第80話「穏やかな居場所」"),
            //第81話「聖夜に希望を」
            Pair.of("https://pbs.twimg.com/media/FGnfbAQVUAEAy2A?format=jpg&name=4096x4096", "第81話「聖夜に希望を」"),
            //第82話「森に行こう！」
            Pair.of("https://pbs.twimg.com/media/FHQsV-IagAQHGRq?format=jpg&name=4096x4096", "第82話「森に行こう！」"),
            //第83話「気持ちを込めた花を」
            Pair.of("https://pbs.twimg.com/media/FHlR6WFacAIsV6f?format=jpg&name=4096x4096", "第83話「気持ちを込めた花を」"),

            //実はここで好きだったももじゃんが更に好きになってメーターがふっきれました　全員可愛いんだよお！
            //第84話「ターゲットの油断」
            Pair.of("https://pbs.twimg.com/media/FITo8pYaUAE-E5o?format=jpg&name=4096x4096", "第84話「ターゲットの油断」"),

            //第85話「眠りに添えて」
            Pair.of("https://pbs.twimg.com/media/FIgFbMhakAMIxAg?format=jpg&name=4096x4096", "第85話「眠りに添えて」")
    );

    public FourFrameCommand() {
        super(new Color(ColorUtils.rainbow(System.currentTimeMillis(), 3, 0, 1)),
                "fourframe",
                "プロセカの4コマからどれかが選ばれるか選択するよ",
                new String[]{"4frame", "4coma", "coma", "4コマ漫画", "4コマ", "プロセカ4コマ"},
                FOUR_FRAMES);
    }

    private void add(SlashCommandEvent event, OptionMapping mapping) {
        String id = mapping.getAsString();
        checkUrl(event, id);
        EmbedBuilder builder = new EmbedBuilder();
        builder.setImage(id);
        builder.setColor(this.getColor());
        event.replyEmbeds(builder.build()).queue();
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Message message = event.getMessage();
        MessageChannel channel = event.getChannel();
        String contentRaw = message.getContentRaw();
        //複数の空白行を取得
        String[] splitRaw = contentRaw.split("\\s+");
        List<Pair<String, String>> url = getReturnPrefix();
        if (splitRaw[0].equalsIgnoreCase(DiscordBot.PREFIX + getCommandName()) ||
                Arrays.stream(this.getAliases()).anyMatch(s -> splitRaw[0].equalsIgnoreCase(DiscordBot.PREFIX + s))) {
            if (splitRaw.length == 1) {
                int randomUrl = RANDOM.nextInt(url.size());
                String id = url.get(randomUrl).getLeft();
                EmbedBuilder builder = new EmbedBuilder();
                builder.setImage(id);
                builder.setColor(this.getColor());
                channel.sendMessageEmbeds(builder.build()).queue();
            }
        }
    }

    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {
        if (!event.getName().contains(this.getCommandName())) {
            return;
        }
        var oldOption = event.getOption("old");
        var newOption1 = event.getOption("current1-25");
        var newOption2 = event.getOption("current26-50");
        var newOption3 = event.getOption("current51-74");
        var newOption4 = event.getOption("current75-100");
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
        } else {
            List<Pair<String, String>> returnPrefix = getReturnPrefix();
            int randomPrefix = RANDOM.nextInt(returnPrefix.size());
            String id = returnPrefix.get(randomPrefix).getLeft();
            EmbedBuilder builder = new EmbedBuilder();
            builder.setImage(id);
            builder.setColor(this.getColor());
            event.replyEmbeds(builder.build()).queue();
        }
    }

    @Override
    public String getUrl() {
        return null;
    }
}
