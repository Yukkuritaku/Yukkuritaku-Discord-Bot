package net.yukkuritaku.discordbot.commands.comic.impl;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public final class RandomComicCommand extends Command {

    public RandomComicCommand() {
        this.name = "randomcomics";
        this.help = "プロセカのコミックからどれか1つが選ばれるよ";
        this.aliases = new String[]{"rc", "randomc", "comic", "プロセカロード画面", "コミック"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try {
            final List<RandomComics> values = Arrays.asList(RandomComics.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomComics randomComics = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = randomComics.getSrcUrl();
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/" + randomComics.name() + ".webp";
            embedBuilder.setDescription(randomComics.toString());
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.createRainbow(360));
            event.reply(embedBuilder.build());
        } catch (Exception e) {
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomComics {
        //取り柄
        comic1("取り柄", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0001.png", 1),

        //クール系とギャル系？
        comic2("クール系とギャル系？", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0002.png", 2),

        //病院のおばあちゃんから教わった
        comic3("病院のおばあちゃんから教わった", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0003.png", 3),

        //同い年なのに...
        comic4("同い年なのに...", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0004.png", 4),

        //一緒に食べよ！
        comic5("一緒に食べよ！", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0005.png", 5),

        //教室のセカイ
        comic6("教室のセカイ", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0006.png", 6),

        //練習熱心
        comic7("練習熱心", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0007.png", 7),

        //みんなでカラオケ
        comic8("みんなでカラオケ", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0008.png", 8),

        //夢は完全南極
        comic9("夢は完全南極", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0009.png", 9),

        //猫好き
        comic10("猫好き", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0010.png", 10),

        //美しく
        comic11("美しく", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0011.png", 11),

        //ステージのセカイ
        comic12("ステージのセカイ", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0012.png", 12),

        //最高のコンビ！
        comic13("最高のコンビ！", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0013.png", 13),

        //獣のオーラ
        comic14("獣のオーラ", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0014.png", 14),

        //風紀委員はガラじゃない
        comic15("風紀委員はガラじゃない", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0015.png", 15),

        //優男モード
        comic16("優男モード", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0016.png", 16),

        //口下手なふたり
        comic17("口下手なふたり", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0017.png", 17),

        //ストリートのセカイ
        comic18("ストリートのセカイ", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0018.png", 18),

        //不死鳥戦隊ワンダレンジャー！
        comic19("不死鳥戦隊ワンダレンジャー！", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0019.png", 19),

        //百のポーズを持つ男
        comic20("百のポーズを持つ男", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0020.png", 20),

        //一緒に遊んでたら
        comic21("一緒に遊んでたら", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0021.png", 21),

        //ゲームが得意
        comic22("ゲームが得意", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0022.png", 22),

        //稀代の天才
        comic23("稀代の天才", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0023.png", 23),

        //ワンダーランドのセカイ
        comic24("ワンダーランドのセカイ", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0024.png", 24),

        //ニーゴのナイトコード
        comic25("ニーゴのナイトコード", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0025.png", 25),

        //最強装備
        comic26("最強装備", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0026.png", 26),

        //魚のいない水槽
        comic27("魚のいない水槽", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0027.png", 27),

        //最大のライバル？(奏ちゃんのツッコミかわいい)
        comic28("最大のライバル？", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0028.png", 28),

        //かわいいは正義！
        comic29("かわいいは正義！", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0029.png", 29),

        //誰もいないセカイ
        comic30("誰もいないセカイ", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0030.png", 30),

        //バーチャル・シンガーとは
        comic31("バーチャル・シンガーとは", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0031.png", 31),

        //猫かわいがりの姉
        comic32("猫かわいがりの姉", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0032.png", 32),

        //病床の中学校時代
        comic33("病床の中学校時代", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0033.png", 33),

        //姉と弟
        comic34("姉と弟", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0034.png", 34),

        //友達のお兄さん
        comic35("友達のお兄さん", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0035.png", 35),

        //親友でライバル
        comic36("親友でライバル", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0036.png", 36),

        //中学校からの友達(ゲーム内の奴は間違いらしいけど現在は修正済みらしい、自分で確認してきた)ソース: https://twitter.com/pj_sekai/status/1352111841099411459?s=19
        comic37("中学校からの友達", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0037.png", 37),

        //調理実習
        comic38("調理実習", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0038.png", 38),

        //PWLキャストは大忙し
        comic39("PWLキャストは大忙し", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0039.png", 39),

        //機械オンチ
        comic40("機械オンチ", "https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/comic_0040.png", 40),
        ;

        private static final RandomComics[] BY_INDEX = Arrays.stream(values()).sorted(Comparator.comparingInt(RandomComics::getIndex)).toArray(RandomComics[]::new);
        private final String name;
        private final String srcUrl;
        private final int index;

        RandomComics(String name, String srcUrl, int index) {
            this.name = name;
            this.srcUrl = srcUrl;
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public String getSrcUrl() {
            return srcUrl;
        }

        public static RandomComics searchIndex(int indexIn) {
            if (indexIn < 0 || indexIn > BY_INDEX.length) {
                indexIn = 0;
            }
            return BY_INDEX[indexIn];
        }

        @Override
        public String toString() {
            return name;
        }
    }

    //TODO 作り直し
    /*public enum RandomComics{
        //取り柄
        comic_0001("取り柄"),

        //クール系とギャル系？
        comic_0002("クール系とギャル系？"),

        //病院のおばあちゃんから教わった
        comic_0003("病院のおばあちゃんから教わった"),

        //同い年なのに...
        comic_0004("同い年なのに..."),

        //一緒に食べよ！
        comic_0005("一緒に食べよ！"),

        //教室のセカイ
        comic_0006("教室のセカイ"),

        //練習熱心
        comic_0007("練習熱心"),

        //みんなでカラオケ
        comic_0008("みんなでカラオケ"),

        //夢は完全南極
        comic_0009("夢は完全南極"),

        //猫好き
        comic_0010("猫好き"),

        //美しく
        comic_0011("美しく"),

        //ステージのセカイ
        comic_0012("ステージのセカイ"),

        //最高のコンビ！
        comic_0013("最高のコンビ！"),

        //獣のオーラ
        comic_0014("獣のオーラ"),

        //風紀委員はガラじゃない
        comic_0015("風紀委員はガラじゃない"),

        //優男モード
        comic_0016("優男モード"),

        //口下手なふたり
        comic_0017("口下手なふたり"),

        //ストリートのセカイ
        comic_0018("ストリートのセカイ"),

        //不死鳥戦隊ワンダレンジャー！
        comic_0019("不死鳥戦隊ワンダレンジャー！"),

        //百のポーズを持つ男
        comic_0020("百のポーズを持つ男"),

        //一緒に遊んでたら
        comic_0021("一緒に遊んでたら"),

        //ゲームが得意
        comic_0022("ゲームが得意"),

        //稀代の天才
        comic_0023("稀代の天才"),

        //ワンダーランドのセカイ
        comic_0024("ワンダーランドのセカイ"),

        //ニーゴのナイトコード
        comic_0025("ニーゴのナイトコード"),

        //最強装備
        comic_0026("最強装備"),

        //魚のいない水槽
        comic_0027("魚のいない水槽"),

        //最大のライバル？(奏ちゃんのツッコミかわいい)
        comic_0028("最大のライバル？"),

        //かわいいは正義！
        comic_0029("かわいいは正義！"),

        //誰もいないセカイ
        comic_0030("誰もいないセカイ"),

        //バーチャル・シンガーとは
        comic_0031("バーチャル・シンガーとは"),

        //猫かわいがりの姉
        comic_0032("猫かわいがりの姉"),

        //病床の中学校時代
        comic_0033("病床の中学校時代"),

        //姉と弟
        comic_0034("姉と弟"),

        //友達のお兄さん
        comic_0035("友達のお兄さん"),

        //親友でライバル
        comic_0036("親友でライバル"),

        //中学校からの友達(ゲーム内の奴は間違いらしいけど現在は修正済みらしい、自分で確認してきた)ソース: https://twitter.com/pj_sekai/status/1352111841099411459?s=19
        comic_0037("中学校からの友達"),

        //調理実習
        comic_0038("調理実習"),

        //PWLキャストは大忙し
        comic_0039("PWLキャストは大忙し"),

        //機械オンチ
        comic_0040("機械オンチ"),;

        private final String name;

        RandomComics(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
            return this.name;
        }
    }*/
}
