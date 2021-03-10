package net.yukkuritaku.discordbot.commands.fourcoma.impl;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public class Random4ComaCommand extends Command {

    public Random4ComaCommand(){
        this.name = "4coma";
        this.help = "プロセカの4コマからどれかが選ばれるよ";
        this.aliases = new String[] {"coma", "4コマ漫画", "4コマ", "プロセカ4コマ"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try{
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
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum Random4Coma{

        //第1話「お姉ちゃん誕生？」
        part1("第1話「お姉ちゃん誕生？」", "https://pbs.twimg.com/media/EjJc3JPU4AAo111?format=jpg&name=4096x4096"),

        //第2話「アイドルレッスン トーク編」
        part2("第2話「アイドルレッスン トーク編」", "https://pbs.twimg.com/media/EjNl06bUcAIbi8w?format=jpg&name=4096x4096"),

        //第3話「私/俺にできること」
        part3("第3話「私/俺にできること」", "https://pbs.twimg.com/media/EjSz2wpVcAAQ5ti?format=jpg&name=4096x4096"),

        //第4話「無法地帯」
        part4("第4話「無法地帯」", "https://pbs.twimg.com/media/EjX58kXVoAEZPh1?format=jpg&name=4096x4096"),

        //第5話「孤独を感じて」
        part5("第5話「孤独を感じて」", "https://pbs.twimg.com/media/Ejc_rW_UwAAkFqo?format=jpg&name=4096x4096"),

        //公式だと5話って書いてあったけど多分ミス
        //第6話「抱えきれないありがとう」
        part6("第6話「抱えきれないありがとう」", "https://pbs.twimg.com/media/EjiJjaxUwAE3auT?format=jpg&name=4096x4096"),

        //第7話「流行をたどって」
        part7("第7話「流行をたどって」", "https://pbs.twimg.com/media/Ejsc9hCUYAEDPLw?format=jpg&name=4096x4096"),

        //第8話「お兄さん像」
        part8("第8話「お兄さん像」", "https://pbs.twimg.com/media/EkQfYq0VkAESPlx?format=jpg&name=4096x4096"),

        //第9話「明日になれば…」
        part9("第9話「明日になれば…」", "https://pbs.twimg.com/media/Ek0pY8pVcAAYQhj?format=jpg&name=4096x4096"),

        //第10話「アップルパイマイスター」
        part10("第10話「アップルパイマイスター」", "https://pbs.twimg.com/media/ElTXEiMVgAEIgfI?format=jpg&name=4096x4096"),

        //第11話「仲裁パフォーマー」
        part11("第11話「仲裁パフォーマー」", "https://pbs.twimg.com/media/El8wRCoVgAEktUl?format=jpg&name=4096x4096"),

        //第12話「力の源」
        part12("第12話「力の源」", "https://pbs.twimg.com/media/EmBxP5mU8AAU581?format=jpg&name=4096x4096"),

        //第13話「学級委員の参考に」
        part13("第13話「学級委員の参考に」", "https://pbs.twimg.com/media/Emgr_1zU4AAiCkY?format=jpg&name=4096x4096"),

        //第14話「激励とパンケーキ」
        part14("第14話「激励とパンケーキ」", "https://pbs.twimg.com/media/Eml1VFGUcAESRkx?format=jpg&name=4096x4096"),

        //第15話「センスを磨け！」
        part15("第15話「センスを磨け！」", "https://pbs.twimg.com/media/EnE2m0gVkAAq6nl?format=jpg&name=4096x4096"),

        //第16話「ありそうで怖い」
        part16("第16話「ありそうで怖い」", "https://pbs.twimg.com/media/Enoy2WFVEAE1O0P?format=jpg&name=4096x4096"),

        //第17話「ビビバス会議」
        part17("第17話「ビビバス会議」", "https://pbs.twimg.com/media/EoM11ltUcAAkXoE?format=jpg&name=4096x4096"),

        //第18話「隠しきれないカリスマ」
        part18("第18話「隠しきれないカリスマ」", "https://pbs.twimg.com/media/Eohb7MhVgAAaRwq?format=jpg&name=4096x4096"),

        //第19話「押しに弱くて」
        part19("第19話「押しに弱くて」", "https://pbs.twimg.com/media/EpU8AebUwAAgsnJ?format=jpg&name=4096x4096"),

        //TODO 20話
        //第20話「輝きは君のもの」
        part20("第20話「輝きは君のもの」", "https://pbs.twimg.com/media/Ep4_66LVQAA7zKm?format=jpg&name=4096x4096"),

        //第21話「遠慮のない関係」
        part21("第21話「遠慮のない関係」", "https://pbs.twimg.com/media/EqH_B7WVEAAzSEI?format=jpg&name=4096x4096"),

        //第22話「度胸」
        part22("第22話「度胸」", "https://pbs.twimg.com/media/EqdCZ7IUUAEqDSh?format=jpg&name=4096x4096"),

        //第23話「セカイの狭間に響く歌」
        part23("第23話「セカイの狭間に響く歌」", "https://pbs.twimg.com/media/ErGC5qsVEAM46Wn?format=jpg&name=4096x4096"),

        //第24話「また穏やかな日々」
        part24("第24話「また穏やかな日々", "https://pbs.twimg.com/media/ErLYqQJU0AAZfxz?format=jpg&name=4096x4096"),

        //第25話「ドラマーの体作り」
        part25("第25話「ドラマーの体作り」", "https://pbs.twimg.com/media/ErlI9UMUUAYgYAj?format=jpg&name=4096x4096"),

        //第26話「機械オンチ？」
        part26("第26話「機械オンチ？」", "https://pbs.twimg.com/media/EsTQggPU4AEINYW?format=jpg&name=4096x4096"),

        //第27話「生まれてきてくれて」
        part27("第27話「生まれてきてくれて」", "https://pbs.twimg.com/media/EstcBKuVcAQUWOL?format=jpg&name=4096x4096"),

        //第28話「無敵の微笑み」
        part28("第28話「無敵の微笑み」", "https://pbs.twimg.com/media/Es8uX1tUUAQtbUg?format=jpg&name=4096x4096"),

        //第29話「父親たち」
        part29("第29話「父親たち」", "https://pbs.twimg.com/media/EtRSAQoVEAEqReK?format=jpg&name=4096x4096"),

        //TODO 30話
        //奏ちゃんお誕生日おめでとう！！
        //第30話「いつでも全力」
        part30("第30話「いつでも全力」", "https://pbs.twimg.com/media/Et1Rw-sU0AQgE7s?format=jpg&name=4096x4096"),

        //第31話「想いのこもった手紙」
        part31("第31話「想いのこもった手紙」", "https://pbs.twimg.com/media/EuUAy1GUUAMRB3E?format=jpg&name=4096x4096"),

        //第32話「頼れるお兄さん」
        part32("第32話「頼れるお兄さん」","https://pbs.twimg.com/media/EuZFminVgAIdpDm?format=jpg&name=4096x4096"),

        //第33話「進捗はいかが？」
        part33("第33話「進捗はいかが？」", "https://pbs.twimg.com/media/EvCmiovVoAUrcmO?format=jpg&name=4096x4096"),

        //第34話「こはねのフィールド」
        part34("第34話「こはねのフィールド」", "https://pbs.twimg.com/media/EvcZea2U4AYo3SR?format=jpg&name=4096x4096"),

        //第35話「伝わる人物像」
        part35("第35話「伝わる人物像」","https://pbs.twimg.com/media/EvryyVOVkAAWRYK?format=jpg&name=4096x4096")



        ;


        public final String partname;
        public final String url;

        Random4Coma(String partname, String url) {
            this.partname = partname;
            this.url = url;
        }

        @Override
        public String toString(){
            return this.partname;
        }

        public String getURL(){
            return this.url;
        }
    }
}
