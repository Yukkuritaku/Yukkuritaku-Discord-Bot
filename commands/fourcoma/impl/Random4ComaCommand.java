package net.yukkuritaku.discordbot.commands.fourcoma.impl;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Random4ComaCommand extends Command {


    public Random4ComaCommand() {
        this.name = "4coma";
        this.help = "プロセカの4コマからどれかが選ばれるよ";
        this.aliases = new String[]{"coma", "4コマ漫画", "4コマ", "プロセカ4コマ"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        try {

            if (args.length > 2) {
                if (args[1].equalsIgnoreCase("index")) {
                    try {
                        Random4ComaCommand.Random4Coma random4Coma = Random4ComaCommand.Random4Coma.searchIndex(Integer.parseInt(args[2]) - 1);
                        EmbedBuilder embedBuilder = new EmbedBuilder();
                        embedBuilder.setDescription(random4Coma.toString());
                        embedBuilder.setImage(random4Coma.getURL());
                        embedBuilder.setColor(ColorUtils.createRainbow(360));
                        event.getChannel().sendMessage(embedBuilder.build()).queue();
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        event.getChannel().sendMessage(e + "は数字に変換できません！(全角になっているか、整数型(int)の数値より上回っているか下回っています！)").queue();
                    }
                }
            } else {
                final List<Random4Coma> Values = List.of(Random4Coma.values());
                final int Size = Values.size();
                final Random rng = new Random();
                final Random4Coma random4Coma = Values.get(rng.nextInt(Size));
                EmbedBuilder embedBuilder = new EmbedBuilder();
                embedBuilder.setDescription(random4Coma.toString());
                embedBuilder.setImage(random4Coma.getURL());
                embedBuilder.setColor(ColorUtils.createRainbow(360));
                event.reply(embedBuilder.build());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            ReplyUtils.logException(event, "配列エラー: " + args.length + "は" + "" + args.length + "の数値を超えてるよ");
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

        ;


        private static final Random4Coma[] SORT_INDEX = Arrays.stream(values())
                .sorted(Comparator.comparingInt(Random4Coma::getIndex))
                .toArray(Random4Coma[]::new);
        public final String partname;
        public final String url;
        private final int index;

        Random4Coma(String partname, String url, int index) {
            this.partname = partname;
            this.url = url;
            this.index = index;
        }

        @Override
        public String toString() {
            return this.partname;
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
