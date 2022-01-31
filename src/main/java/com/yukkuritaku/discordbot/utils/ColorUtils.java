package com.yukkuritaku.discordbot.utils;

import java.awt.*;

public final class ColorUtils {

    private ColorUtils(){
        throw new AssertionError("Utility class is cannot initializing");
    }
    //ばちゃしん

    /**
     * 初音ミクのイメージカラー
     */
    public static final Color
            MIKU = new Color(0x33CCBB),
    /**
     * 鏡音リンのイメージカラー
     */
    RIN = new Color(0xFFCC11),

    /**
     * 鏡音レンのイメージカラー
     */
    REN = new Color(0xFFEE11),

    /**
     * 巡音ルカのイメージカラー
     */
    LUKA = new Color(0xFFBBCC),

    /**
     * MEIKOのイメージカラー
     */
    MEIKO = new Color(0xDD4444),

    /**
     * KAITOのイメージカラー
     */
    KAITO = new Color(0x3366CC),

    //れおに

    /**
     * 星乃一歌のイメージカラー
     */
    ICHIKA = new Color(0x33AAEE),

    /**
     * 天馬咲希のイメージカラー
     */
    SAKI = new Color(0xFFDD44),

    /**
     * 望月穂波のイメージカラー
     */
    HONAMI = new Color(0xEE6666),

    /**
     * 日野森志歩のイメージカラー
     */
    SHIHO = new Color(0xBBDD22),

    //ももじゃん

    /**
     * 花里みのりのイメージカラー
     */
    MINORI = new Color(0xFFCCAA),

    /**
     * 桐谷遥のイメージカラー
     */
    HARUKA = new Color(0x99CCFF),

    /**
     * 桃井愛莉のイメージカラー
     */
    AIRI = new Color(0xFFAACC),

    /**
     * 日野森雫のイメージカラー
     */
    SHIZUKU = new Color(0x99EEDD),

    //びびばす

    /**
     * 小豆沢こはねのイメージカラー
     */
    KOHANE = new Color(0xFF6699),

    /**
     * 白石杏のイメージカラー
     */
    AN = new Color(0x00BBDD),

    /**
     * 東雲彰人のイメージカラー
     */
    AKITO = new Color(0xFF7722),

    /**
     * 青柳冬弥のイメージカラー
     */
    TOYA = new Color(0x0077DD),

    //わんだしょ

    /**
     * 天馬司のイメージカラー
     */
    TSUKASA = new Color(0xFFBB00),

    /**
     * 鳳えむのイメージカラー
     */
    EMU = new Color(0xFF66BB),

    /**
     * 草薙寧々のイメージカラー
     */
    NENE = new Color(0x33DD99),

    /**
     * 神代類のイメージカラー
     */
    RUI = new Color(0xBB88EE),

    //にーご

    //奏ちゃんんんんｎ
    /**
     * 宵崎奏のイメージカラー
     */
    KANADE = new Color(0xBB6688),

    //まふゆちゃんんんんんｎ
    /**
     * 朝比奈まふゆのイメージカラー
     */
    MAFUYU = new Color(0x8888CC),

    /**
     * 東雲絵名のイメージカラー
     */
    ENA = new Color(0xCCAA88),

    /**
     * 暁山瑞希のイメージカラー
     */
    MIZUKI = new Color(0xDDAACC),

    //ユニットカラー

    /**
     * Virtual Singerのイメージカラー
     */
    VIRTUAL_SINGER = new Color(0xffffff),

    /**
     * Leo/needのイメージカラー
     * Javaの仕様で/は使えなかったぜ☆
     */
    LEO_NEED = new Color(0x4455dd),

    /**
     * MORE MORE JUMP!のイメージカラー
     */
    MORE_MORE_JUMP = new Color(0x88dd44),

    /**
     * Vivid Bad SQUADのイメージカラー
     */
    VIVID_BAD_SQUAD = new Color(0xee1166),

    /**
     * ワンダーランズ×ショウタイムのイメージカラー
     */
    WONDER_LANDS_SHOWTIME = new Color(0xff9900),

    /**
     * 25時、ナイトコードで。のイメージカラー
     */
    NIGHTCODE_AT_25_00 = new Color(0x884499);

    public static int rainbow(final long currentMillis, final int speed, final int offset, final float alpha) {
        final int rainbow = Color.HSBtoRGB(1.0f - (currentMillis + offset * 100) % speed / (float) speed, 0.9f, 0.9f);
        final int r = rainbow >> 16 & 0xFF;
        final int g = rainbow >> 8 & 0xFF;
        final int b = rainbow & 0xFF;
        final int a = (int) (alpha * 255.0f);
        return (a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF);
    }
}
