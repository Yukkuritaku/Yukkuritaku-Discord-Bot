package net.yukkuritaku.commands.stamp.impl.moremorejump;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.util.List;
import java.util.Random;

public class ShizukuStampCommand extends Command {

    public ShizukuStampCommand(){
        this.name = "stampshizuku";
        this.help = "雫ちゃんのスタンプからランダムに選ばれるよ";
        this.aliases = new String[] {"shizuku", "雫"};
    }

    @Override
    protected void execute(CommandEvent event) {
        final List<Randoms> Values = List.of(Randoms.values());
        final int Size = Values.size();
        final Random rng = new Random();

        final Randoms shizuku = Values.get(rng.nextInt(Size));

        try {
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + shizuku + "_rip/" + shizuku + "/" + shizuku + ".webp");
            embedBuilder.setColor(0x99EEDD);

            event.reply("[Debug/Info] Sending!");
            event.reply(embedBuilder.build());
            event.reply("[Debug/Success] Successful!");
        }
        catch (Exception exception){
            event.reply("[Debug/Error] File Send Failed!");
            event.reply("[Debug/Error] Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            exception.printStackTrace();
        }
    }

    enum Randoms{

        //期待に応えるわ (新イベントスタンプ) 1
        stamp0428("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0428_rip/stamp0428/stamp0428.webp", 428),

        //あなたのおかげよ 2
        stamp0391("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0391_rip/stamp0391/stamp0391.webp", 391),

        //うまく歌えたかしら(うまく歌えたでしょうか？) 3
        stamp0390("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0390_rip/stamp0390/stamp0390.webp", 390),

        //それじゃ、また 4
        stamp0124("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0124_rip/stamp0124/stamp0124.webp", 124),

        //ごめんなさい... 5
        stamp0123("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0123_rip/stamp0123/stamp0123.webp", 123),

        //助かりました 6
        stamp0122("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0122_rip/stamp0122/stamp0122.webp", 122),

        //よかったわ 7
        stamp0121("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0121_rip/stamp0121/stamp0121.webp", 121),

        //そんな... 8
        stamp0120("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0120_rip/stamp0120/stamp0120.webp", 120),

        //ふふっ 9
        stamp0119("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0119_rip/stamp0119/stamp0119.webp", 119),

        //あら... 10
        stamp0118("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0118_rip/stamp0118/stamp0118.webp", 118),

        //がんばりましょう 11
        stamp0117("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0117_rip/stamp0117/stamp0117.webp", 117),

        //よろしくね(よろしくお願いします) 12
        stamp0116("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0116_rip/stamp0116/stamp0116.webp", 116),

        //TODO [キャラランクスタンプ]
        //リラックスよ 13
        stamp0019("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp0019_rip/stamp0019/stamp0019.webp", 19);

        public String url;
        public int rng;

        Randoms(String url, int rng) {
            this.url = url;
            this.rng = rng;
        }
    }
}
