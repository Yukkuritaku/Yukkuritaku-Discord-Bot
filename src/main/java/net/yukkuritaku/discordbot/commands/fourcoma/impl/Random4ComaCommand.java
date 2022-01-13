package net.yukkuritaku.discordbot.commands.fourcoma.impl;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public final class Random4ComaCommand extends Command {

    public Random4ComaCommand() {
        this.name = "4coma";
        this.help = "プロセカの4コマからどれかが選ばれるよ";
        this.aliases = new String[]{"coma", "4コマ漫画", "4コマ", "プロセカ4コマ"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        //コマンド時の長さを取得する
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        //ここでtryする(本当はあまりやらない方がいいらしいけど仕方ない)
        try {
            //コマンドの長さが3の場合(.1 2 3 <-この場合)
            if (args.length == 3) {
                //もし.4coma index <- indexがついていた場合
                if (args[1].equalsIgnoreCase("index")) {
                    //そしてここでまたtryする これに関してはもっといい方法があるかも...
                    try {
                        //このクラスの中にあるenumクラスのRandom4ComaをsearchIndexで取得 arg[2]は.4coma index <数字> <-この数字
                        //Integer.parseInt(args[2]) - 1 <- -1を入れないと46と入れても47話が出てきちゃうから対策
                        Random4Coma random4Coma = Random4Coma.searchIndex(Integer.parseInt(args[2]) - 1);
                        //EmbedBuilderを作成する
                        EmbedBuilder embedBuilder = new EmbedBuilder();
                        //概要欄を設定する(4コマのタイトル)
                        embedBuilder.setDescription(random4Coma.toString());
                        //画像を設定する(4コマの画像Url 公式Twitterの画像から)
                        embedBuilder.setImage(random4Coma.getURL());
                        //色を設定する ここならレインボー
                        embedBuilder.setColor(ColorUtils.createRainbow(360));
                        //メッセージを送る
                        event.reply(embedBuilder.build());
                        //もしNumberFormatException <数字> の部分が数字に変換出来ない場合
                    } catch (NumberFormatException e) {
                        //event.reply(e + "は数字に変換できません！(全角になっているか、整数型(int)の数値より上回っているか下回っています！)");
                        final EmbedBuilder usage = new EmbedBuilder();
                        usage.addField("Usage/使い方", ".random4comaコマンドの名前(4coma、comaなど) index <数字>", false);
                        event.reply(usage.build());
                    }
                }else {
                    //Random4Comaの配列をListにする
                    final List<Random4Coma> values = Arrays.asList(Random4Coma.values());
                    //このListのサイズを取得
                    final int size = values.size();
                    //ランダムを作成
                    final Random rng = new Random();
                    //ランダムでRandom4Comaの中のどれかを選ぶ
                    final Random4Coma random4Coma = values.get(rng.nextInt(size));
                    EmbedBuilder embedBuilder = new EmbedBuilder();
                    embedBuilder.setDescription(random4Coma.toString());
                    embedBuilder.setImage(random4Coma.getURL());
                    embedBuilder.setColor(ColorUtils.createRainbow(360));
                    event.reply(embedBuilder.build());
                }
            } else {
                final List<Random4Coma> values = Arrays.asList(Random4Coma.values());
                final int size = values.size();
                final Random rng = new Random();
                final Random4Coma random4Coma = values.get(rng.nextInt(size));
                EmbedBuilder embedBuilder = new EmbedBuilder();
                embedBuilder.setDescription(random4Coma.toString());
                embedBuilder.setImage(random4Coma.getURL());
                embedBuilder.setColor(ColorUtils.createRainbow(360));
                event.reply(embedBuilder.build());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            ReplyUtils.logExceptionWithStackTrace(event, "配列エラー: 意図しない配列エラーです！", e);
            e.printStackTrace();
        }
    }

    public enum Random4Coma {
        //第1話「お姉ちゃん誕生？」
        part1("第1話「お姉ちゃん誕生？」", "https://pbs.twimg.com/media/EjJc3JPU4AAo111?format=jpg&name=4096x4096", 1),

        //第2話「アイドルレッスン トーク編」
        part2("第2話「アイドルレッスン トーク編」", "https://pbs.twimg.com/media/EjNl06bUcAIbi8w?format=jpg&name=4096x4096", 2),

        //第3話「私/俺にできること」
        part3("第3話「私/俺にできること」", "https://pbs.twimg.com/media/EjSz2wpVcAAQ5ti?format=jpg&name=4096x4096", 3),

        //第4話「無法地帯」
        part4("第4話「無法地帯」", "https://pbs.twimg.com/media/EjX58kXVoAEZPh1?format=jpg&name=4096x4096", 4),

        //第5話「孤独を感じて」
        part5("第5話「孤独を感じて」", "https://pbs.twimg.com/media/Ejc_rW_UwAAkFqo?format=jpg&name=4096x4096", 5),

        //公式だと5話って書いてあったけど多分ミス
        //第6話「抱えきれないありがとう」
        part6("第6話「抱えきれないありがとう」", "https://pbs.twimg.com/media/EjiJjaxUwAE3auT?format=jpg&name=4096x4096", 6),

        //第7話「流行をたどって」
        part7("第7話「流行をたどって」", "https://pbs.twimg.com/media/Ejsc9hCUYAEDPLw?format=jpg&name=4096x4096", 7),

        //第8話「お兄さん像」
        part8("第8話「お兄さん像」", "https://pbs.twimg.com/media/EkQfYq0VkAESPlx?format=jpg&name=4096x4096", 8),

        //第9話「明日になれば…」
        part9("第9話「明日になれば…」", "https://pbs.twimg.com/media/Ek0pY8pVcAAYQhj?format=jpg&name=4096x4096", 9),

        //第10話「アップルパイマイスター」
        part10("第10話「アップルパイマイスター」", "https://pbs.twimg.com/media/ElTXEiMVgAEIgfI?format=jpg&name=4096x4096", 10),

        //第11話「仲裁パフォーマー」
        part11("第11話「仲裁パフォーマー」", "https://pbs.twimg.com/media/El8wRCoVgAEktUl?format=jpg&name=4096x4096", 11),

        //第12話「力の源」
        part12("第12話「力の源」", "https://pbs.twimg.com/media/EmBxP5mU8AAU581?format=jpg&name=4096x4096", 12),

        //第13話「学級委員の参考に」
        part13("第13話「学級委員の参考に」", "https://pbs.twimg.com/media/Emgr_1zU4AAiCkY?format=jpg&name=4096x4096", 13),

        //第14話「激励とパンケーキ」
        part14("第14話「激励とパンケーキ」", "https://pbs.twimg.com/media/Eml1VFGUcAESRkx?format=jpg&name=4096x4096", 14),

        //第15話「センスを磨け！」
        part15("第15話「センスを磨け！」", "https://pbs.twimg.com/media/EnE2m0gVkAAq6nl?format=jpg&name=4096x4096", 15),

        //第16話「ありそうで怖い」
        part16("第16話「ありそうで怖い」", "https://pbs.twimg.com/media/Enoy2WFVEAE1O0P?format=jpg&name=4096x4096", 16),

        //第17話「ビビバス会議」
        part17("第17話「ビビバス会議」", "https://pbs.twimg.com/media/EoM11ltUcAAkXoE?format=jpg&name=4096x4096", 17),

        //第18話「隠しきれないカリスマ」
        part18("第18話「隠しきれないカリスマ」", "https://pbs.twimg.com/media/Eohb7MhVgAAaRwq?format=jpg&name=4096x4096", 18),

        //第19話「押しに弱くて」
        part19("第19話「押しに弱くて」", "https://pbs.twimg.com/media/EpU8AebUwAAgsnJ?format=jpg&name=4096x4096", 19),

        //TODO 20話
        //第20話「輝きは君のもの」
        part20("第20話「輝きは君のもの」", "https://pbs.twimg.com/media/Ep4_66LVQAA7zKm?format=jpg&name=4096x4096", 20),

        //第21話「遠慮のない関係」
        part21("第21話「遠慮のない関係」", "https://pbs.twimg.com/media/EqH_B7WVEAAzSEI?format=jpg&name=4096x4096", 21),

        //第22話「度胸」
        part22("第22話「度胸」", "https://pbs.twimg.com/media/EqdCZ7IUUAEqDSh?format=jpg&name=4096x4096", 22),

        //第23話「セカイの狭間に響く歌」
        part23("第23話「セカイの狭間に響く歌」", "https://pbs.twimg.com/media/ErGC5qsVEAM46Wn?format=jpg&name=4096x4096", 23),

        //第24話「また穏やかな日々」
        part24("第24話「また穏やかな日々", "https://pbs.twimg.com/media/ErLYqQJU0AAZfxz?format=jpg&name=4096x4096", 24),

        //第25話「ドラマーの体作り」
        part25("第25話「ドラマーの体作り」", "https://pbs.twimg.com/media/ErlI9UMUUAYgYAj?format=jpg&name=4096x4096", 25),

        //第26話「機械オンチ？」
        part26("第26話「機械オンチ？」", "https://pbs.twimg.com/media/EsTQggPU4AEINYW?format=jpg&name=4096x4096", 26),

        //第27話「生まれてきてくれて」
        part27("第27話「生まれてきてくれて」", "https://pbs.twimg.com/media/EstcBKuVcAQUWOL?format=jpg&name=4096x4096", 27),

        //第28話「無敵の微笑み」
        part28("第28話「無敵の微笑み」", "https://pbs.twimg.com/media/Es8uX1tUUAQtbUg?format=jpg&name=4096x4096", 28),

        //第29話「父親たち」
        part29("第29話「父親たち」", "https://pbs.twimg.com/media/EtRSAQoVEAEqReK?format=jpg&name=4096x4096", 29),

        //TODO 30話
        //奏ちゃんお誕生日おめでとう！！
        //第30話「いつでも全力」
        part30("第30話「いつでも全力」", "https://pbs.twimg.com/media/Et1Rw-sU0AQgE7s?format=jpg&name=4096x4096", 30),

        //第31話「想いのこもった手紙」
        part31("第31話「想いのこもった手紙」", "https://pbs.twimg.com/media/EuUAy1GUUAMRB3E?format=jpg&name=4096x4096", 31),

        //第32話「頼れるお兄さん」
        part32("第32話「頼れるお兄さん」", "https://pbs.twimg.com/media/EuZFminVgAIdpDm?format=jpg&name=4096x4096", 32),

        //第33話「進捗はいかが？」
        part33("第33話「進捗はいかが？」", "https://pbs.twimg.com/media/EvCmiovVoAUrcmO?format=jpg&name=4096x4096", 33),

        //第34話「こはねのフィールド」
        part34("第34話「こはねのフィールド」", "https://pbs.twimg.com/media/EvcZea2U4AYo3SR?format=jpg&name=4096x4096", 34),

        //第35話「伝わる人物像」
        part35("第35話「伝わる人物像」", "https://pbs.twimg.com/media/EvryyVOVkAAWRYK?format=jpg&name=4096x4096", 35),

        //第36話「役者の技」
        part36("第36話「役者の技」", "https://pbs.twimg.com/media/EwfRq1cVIAIL6gv?format=jpg&name=4096x4096", 36),

        //第37話「しっかり者へサプライズ」
        part37("第37話「しっかり者へサプライズ」", "https://pbs.twimg.com/media/Ewz4bmvU8AUa-8S?format=jpg&name=4096x4096", 37),

        //第38話「手と手つないで」
        part38("第38話「手と手つないで」", "https://pbs.twimg.com/media/ExSxn9MXMAAN59h?format=jpg&name=4096x4096", 38),

        //第39話「呼び方」
        part39("第39話「呼び方」", "https://pbs.twimg.com/media/EyVvmxRVIAMHNHY?format=jpg&name=4096x4096", 39),

        //てぇてぇ
        //第40話「スランプ対策」
        part40("第40話「スランプ対策」", "https://pbs.twimg.com/media/EyvcR8DUcAEhhvE?format=jpg&name=4096x4096", 40),

        //第41話「ジャスト・フォー・ユー」
        part41("第41話「ジャスト・フォー・ユー」", "https://pbs.twimg.com/media/Ey5xncMVkAEs1iJ?format=jpg&name=4096x4096", 41),

        //第42話「阿鼻叫喚」
        part42("第42話「阿鼻叫喚」", "https://pbs.twimg.com/media/EzoHf_0VoAYrZJ4?format=jpg&name=4096x4096", 42),

        //第43話「#誕生日 #友達と」
        part43("第43話「#誕生日 #友達と」", "https://pbs.twimg.com/media/E0MIpVaVIAIkjZb?format=jpg&name=4096x4096", 43),

        //第44話「急上昇」
        part44("第44話「急上昇」", "https://pbs.twimg.com/media/E0NP2Y4VkAMgp4p?format=jpg&name=4096x4096", 44),

        //第45話「言葉あつめて」
        part45("第45話「言葉あつめて」", "https://pbs.twimg.com/media/E0xuTkoUcAI_OMb?format=jpg&name=4096x4096", 45),

        //第46話「つかみはOK」
        part46("第46話「つかみはOK」", "https://pbs.twimg.com/media/E1J-bpwVEAM_YwP?format=jpg&name=4096x4096", 46),

        //第47話「涙のショータイム」
        part47("第47話「涙のショータイム」", "https://pbs.twimg.com/media/E1jtxjvVUAIHjkZ?format=jpg&name=4096x4096", 47),

        //第48話「最高の相棒」
        part48("第48話「最高の相棒」", "https://pbs.twimg.com/media/E2M6OWlVgAIdzgr?format=jpg&name=4096x4096", 48),

        //第49話「彼女の愛称」
        part49("第49話「彼女の愛称」", "https://pbs.twimg.com/media/E2cQLtrVIAAAN3s?format=jpg&name=4096x4096", 49),

        //第50話「天まで届け」
        part50("第50話「天まで届け」", "https://pbs.twimg.com/media/E3AhaOlUYAAgCjw?format=jpg&name=4096x4096", 50),

        //第51話「挙動不審院」
        part51("第51話「挙動不審院」", "https://pbs.twimg.com/media/E4DQGlHXIAI7x2S?format=jpg&name=4096x4096", 51),

        //第52話「まふゆ考察勢」
        part52("第52話「まふゆ考察勢」", "https://pbs.twimg.com/media/E4iRO_8VUAAlDln?format=jpg&name=4096x4096", 52),

        //第53話「何よりの信頼」
        part53("第53話「何よりの信頼」", "https://pbs.twimg.com/media/E4nZRwaVEAA7Kd_?format=jpg&name=4096x4096", 53),

        //第54話「プロになるには…？」
        part54("第54話「プロになるには…？」", "https://pbs.twimg.com/media/E5qWkGCUYAEMD35?format=jpg&name=4096x4096", 54),

        //ポカリコラボ特別編「タイミング？」
        partSpecial("ポカリコラボ特別編「タイミング？」", "https://pbs.twimg.com/media/E6EIyiEUcAUwOZU?format=jpg&name=4096x4096", Integer.MAX_VALUE), //TODO 特別編だけどindex判定だとどうすればいいのかわからん

        //第55話「参観日」
        part55("第55話「参観日」", "https://pbs.twimg.com/media/E6YrP5UVoAI-Nt1?format=jpg&name=4096x4096", 55),

        //第56話「賑やかな招待状」 寧々ちゃんの誕生日
        part56("第56話「賑やかな招待状」", "https://pbs.twimg.com/media/E6tTaJeVcAQPb8H?format=jpg&name=4096x4096", 56),

        //第57話「私の特別な」
        part57("第57話「私の特別な」", "https://pbs.twimg.com/media/E7MMvngUYAIpfHc?format=jpg&name=4096x4096", 57),

        //第58話「楽しみいっぱい夏祭り」
        part58("第58話「楽しみいっぱい夏祭り」", "https://pbs.twimg.com/media/E7WheP_VEAc5Ekb?format=jpg&name=4096x4096", 58),

        //第59話「目指せえむ語マスター！」
        part59("第59話「目指せえむ語マスター！」", "https://pbs.twimg.com/media/E8E80HGVoAQZ4AK?format=jpg&name=4096x4096", 59),

        //第60話「一歌の花」
        part60("第60話「一歌の花」", "https://pbs.twimg.com/media/E8emnVEUcAcUSAS?format=jpg&name=4096x4096", 60),

        //第61話「アイドル常在戦場」
        part61("第61話「アイドル常在戦場」", "https://pbs.twimg.com/media/E89f5aSVUAIWCFd?format=jpg&name=4096x4096", 61),

        //第62話「司令官ポジション」
        part62("第62話「司令官ポジション」", "https://pbs.twimg.com/media/E9msVw4UYAAMYSA?format=jpg&name=4096x4096", 62),

        //第63話「重ねる時間」
        part63("第63話「重ねる時間」", "https://pbs.twimg.com/media/E9w_-M6UcAAVQtZ?format=jpg&name=4096x4096", 63),

        //第64話「みんなの歌」
        part64("第64話「みんなの歌」", "https://pbs.twimg.com/media/E-FmYnNVEAMa-GD?format=jpg&name=4096x4096", 64),

        //第65話「本人は否定するけど」
        part65("第65話「本人は否定するけど」", "https://pbs.twimg.com/media/E-pozxfUYAMtKle?format=jpg&name=4096x4096", 65),

        //第66話「夕暮れのフェニランに」
        part66("第66話「夕暮れのフェニランに」", "https://pbs.twimg.com/media/E-z_Q9pVEAgrV7q?format=jpg&name=4096x4096", 66),

        //第67話「音で語ろう！」
        part67("第67話「音で語ろう！」", "https://pbs.twimg.com/media/E_UtSlpVkAANh-5?format=jpg&name=4096x4096", 67),

        //第68話「病人がもう一人」
        part68("第68話「病人がもう一人」", "https://pbs.twimg.com/media/FAa8xaoUcAAW5XQ?format=jpg&name=4096x4096", 68),

        //第69話「幼馴染みから仲間へ」
        part69("第69話「幼馴染みから仲間へ」", "https://pbs.twimg.com/media/FA5n04EUUAUhpyD?format=jpg&name=4096x4096", 69),

        //第70話「それぞれのミク」
        part70("第70話「それぞれのミク」", "https://pbs.twimg.com/media/FBKa1RlVUAIb94j?format=jpg&name=4096x4096", 70),

        //第71話「新世代百面相」
        part71("第71話「新世代百面相」", "https://pbs.twimg.com/media/FBtXHTPVQAMLR1f?format=jpg&name=4096x4096", 71),

        //第72話「実践に備えて」
        part72("第72話「実践に備えて」", "https://pbs.twimg.com/media/FCmAdY5VEAIdFBI?format=jpg&name=4096x4096", 72),

        //第73話「アップルパイ星の王子様」
        part73("第73話「アップルパイ星の王子様」", "https://pbs.twimg.com/media/FCq7MwKUUAs8DHP?format=jpg&name=4096x4096", 73),

        //第74話「バースデーDJトリオ」
        part74("第74話「バースデーDJトリオ」", "https://pbs.twimg.com/media/FDZfR_6aMAAW0bz?format=jpg&name=4096x4096", 74),

        //第75話「本人×身内×学校態度」
        part75("第75話「本人×身内×学校態度」", "https://pbs.twimg.com/media/FDzPUM6acAMhnkQ?format=jpg&name=4096x4096", 75),

        //第76話「気が利く姉弟」
        part76("第76話「気が利く姉弟」", "https://pbs.twimg.com/media/FD9iZ4xacAEOceC?format=jpg&name=4096x4096", 76),

        //第77話「賑やかな教室」
        part77("第77話「賑やかな教室」", "https://pbs.twimg.com/media/FEXTChGaQAALqQT?format=jpg&name=4096x4096", 77),

        //第78話「いつも通りの二人」
        part78("第78話「いつも通りの二人」", "https://pbs.twimg.com/media/FFFo3VOacAE7yRO?format=jpg&name=4096x4096", 78),

        //第79話「髪の綺麗なあの人」
        part79("第79話「髪の綺麗なあの人」", "https://pbs.twimg.com/media/FFpr3DsaAAUCzZV?format=jpg&name=4096x4096", 79),

        //第80話「穏やかな居場所」
        part80("第80話「穏やかな居場所」", "https://pbs.twimg.com/media/FF5IgUPaQAIcAYs?format=jpg&name=4096x4096", 80),

        //第81話「聖夜に希望を」
        part81("第81話「聖夜に希望を」", "https://pbs.twimg.com/media/FGnfbAQVUAEAy2A?format=jpg&name=4096x4096", 81),

        //第82話「森に行こう！」
        part82("第82話「森に行こう！」", "https://pbs.twimg.com/media/FHQsV-IagAQHGRq?format=jpg&name=4096x4096", 82),

        //第83話「気持ちを込めた花を」
        part83("第83話「気持ちを込めた花を」", "https://pbs.twimg.com/media/FHlR6WFacAIsV6f?format=jpg&name=4096x4096", 83),

        //第84話「ターゲットの油断」
        part84("第84話「ターゲットの油断」", "https://pbs.twimg.com/media/FITo8pYaUAE-E5o?format=jpg&name=4096x4096", 84),

        //第85話「眠りに添えて」
        part85("第85話「眠りに添えて」", "https://pbs.twimg.com/media/FIgFbMhakAMIxAg?format=jpg&name=4096x4096", 85)

        ;

        private static final Random4Coma[] SORT_INDEX = Arrays.stream(values())
                .sorted(Comparator.comparingInt(Random4Coma::getIndex))
                .toArray(Random4Coma[]::new);
        public final String partName;
        public final String url;
        private final int index;

        Random4Coma(String partName, String url, int index) {
            this.partName = partName;
            this.url = url;
            this.index = index;
        }

        @Override
        public String toString() {
            return "//" + this.partName + "\n" + "{\"" + this.url + "\", \"" + this.partName + "\"},";
        }

        public String getURL() {
            return this.url;
        }

        public int getIndex() {
            return index;
        }

        public static Random4Coma searchIndex(int index) {
            if (index < 0 || index > SORT_INDEX.length) {
                index = 0;
            }
            return SORT_INDEX[index];
        }
    }
}
