package net.yukkuritaku.utils;

import java.awt.*;

/**
 * カラーゆーてぃる、基本的にはEmbedBuilderのカラーセットに使う
 */
public enum ColorUtils {

    //TODO ばちゃしん

    /**
     *初音ミクのイメージカラー
     */
    miku(0x33CCBB),

    /**
     * 鏡音リンのイメージカラー
     */
    rin(0xFFCC11),

    /**
     * 鏡音レンのイメージカラー
     */
    ren(0xFFEE11),

    /**
     * 巡音ルカのイメージカラー
     */
    ruka(0xFFBBCC),

    /**
     * Meikoのイメージカラー
     */
    meiko(0xDD4444),

    /**
     * Kaitoのイメージカラー
     */
    kaito(0x3366CC),

    //TODO れおに

    /**
     * 星乃一歌のイメージカラー
     */
    itika(0x33AAEE),

    /**
     * 望月穂波のイメージカラー
     */
    honami(0xEE6666),

    /**
     * 天馬咲希のイメージカラー
     */
    saki(0xFFDD44),

    /**
     * 日野森志歩のイメージカラー
     */
    shiho(0xBBDD22),

    //TODO ももじゃん

    /**
     * 花里みのりのイメージカラー
     */
    minori(0xFFCCAA),

    /**
     * 桐谷遥のイメージカラー
     */
    haruka(0x99CCFF),

    /**
     * 桃井愛莉のイメージカラー
     */
    airi(0xFFAACC),

    /**
     * 日野森雫のイメージカラー
     */
    shizuku(0x99EEDD),

    //TODO びびばす

    /**
     * 白石杏のイメージカラー
     */
    an(0x00BBDD),

    /**
     * 小豆沢こはねのイメージカラー
     */
    kohane(0xFF6699),

    /**
     * 東雲彰人のイメージカラー
     */
    akito(0xFF7722),

    /**
     * 青柳冬弥のイメージカラー
     */
    touya(0x0077DD),

    //TODO わんだしょ

    /**
     * 天馬司のイメージカラー
     */
    tsukasa(0xFFBB00),

    /**
     * 鳳えむのイメージカラー
     */
    emu(0xFF66BB),

    /**
     * 草薙寧々のイメージカラー
     */
    nene(0x33DD99),

    /**
     * 神代類のイメージカラー
     */
    rui(0xBB88EE),

    //TODO にーご

    /**
     * 東雲絵名のイメージカラー
     */
    ena(0xCCAA88),

    //奏ちゃんんんんｎ
    /**
     * 宵崎奏のイメージカラー
     */
    kanade(0xBB6688),

    //まふゆちゃんんんんんｎ
    /**
     * 朝比奈まふゆのイメージカラー
     */
    mafuyu(0x8888CC),

    /**
     * 暁山瑞希のイメージカラー
     */
    mizuki(0xDDAACC),


    //TODO ユニットカラー
    /**
     * Virtual Singerのイメージカラー
     * でもまだ使ってるところがない TODO
     */
    VirtualSinger(0xffffff),

    /**
     * Leo/needのイメージカラー
     * でもまだ使ってるところがない TODO
     */
    Leoneed(0x4455dd),

    /**
     * More More Jump!のイメージカラー
     * でもまだ使ってるところがない TODO
     */
    MoreMoreJump(0x88dd44),

    /**
     * Vivid Bad Squadのイメージカラー
     * でもまだ使ってるところがない TODO
     */
    VividBadSquad(0xee1166),

    /**
     * ワンダーランズ×ショウタイムのイメージカラー
     * でもまだ使ってるところがない TODO
     */
    WonderLandsShowtime(0xff9900),

    /**
     * 25時、ナイトコードで。のイメージカラー
     * 英語版省略わからんのでNiigoになった
     * でもまだ使ってるところがない TODO
     */
    Niigo(0x884499),;


    public int color;

    /**
     * 各キャラクターのイメージカラーをenumでまとめたもの
     * @param color 各キャラクターのイメージカラー
     */
    ColorUtils(int color){
        this.color = color;
    }


    //TODO ここからStatic Method

    /**
     * マインクラフトのHack ClientのAstolfo ClientのArrayListのカラーを真似した。
     * @param index うぇーぶ式にするやつ、基本的に意味ないんで1でok
     * @param speed カラーが変わるスピード、お好みで。
     * @param saturation 彩度、再現したいなら0.5fで
     * @param brightness 輝度、再現したいなら1.0fで
     * @param opacity アルファ値、基本的には1で大丈夫だと思う
     * @return java.awt.Color
     */
    public static Color astolfo(final int index, final int speed, final float saturation, final float brightness, final float opacity) {
        int angle = (int) ((System.currentTimeMillis() / speed + index) % 360);
        angle = (angle > 180 ? 360 - angle : angle) + 180;
        final float hue = angle / 360f;

        final int color = Color.HSBtoRGB(hue, saturation, brightness);
        final Color obj = new Color(color);
        return new Color(obj.getRed(), obj.getGreen(), obj.getBlue(), Math.max(0, Math.min(255, (int) (opacity * 255))));
    }

    /**
     * レインボーカラーの作成メソッド
     * @param colorrotate どれくらいカラーが変わるか、基本的には360で大丈夫だと思う
     * @return java.awt.Color
     */
    public static int createRainbow(final int colorrotate) {
        final float hue = (float)((System.currentTimeMillis() % colorrotate));
        return Color.getHSBColor(hue / colorrotate, 0.6f, 1.0f).getRGB();
    }
}
