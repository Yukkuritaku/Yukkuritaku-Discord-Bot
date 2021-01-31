package net.yukkuritaku.commands.comic.impl;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ColorUtils;
import net.yukkuritaku.utils.ReplyUtils;

import java.util.List;
import java.util.Random;

public final class RandomComicCommand extends Command {

    public RandomComicCommand(){
        this.name = "randomcomics";
        this.help = "プロセカのコミックからどれか1つが選ばれるよ";
        this.aliases = new String[] {"rc", "randomc", "プロセカロード画面", "コミック"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try{
            event.getChannel().sendTyping().queue();
            final List<RandomComics> Values = List.of(RandomComics.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomComics randomComics = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setDescription(randomComics.toString());
            embedBuilder.setImage("https://sekai-res.dnaroma.eu/file/sekai-assets/comic/one_frame_rip/" + randomComics.name() + ".webp");
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

    public enum RandomComics{
        //TODO Leo/need
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

        //TODO More More Jump!
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

        //TODO Vivid Bad Squad
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

        //TODO ワンダーランズショウタイム
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

        //TODO 25時、ナイトコードで。
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

        //TODO その他（兄妹とかそこらへん）
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

        //中学校からの友達(ゲーム内の奴は間違いらしい(現在は修正済みらしい、自分で確認してきた) ソース: https://twitter.com/pj_sekai/status/1352111841099411459?s=19)
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

        //実装成功した
        @Override
        public String toString(){
            return this.name;
        }
    }
}
