package net.yukkuritaku.utils.old;

import java.awt.*;

/**
 * カラーゆーてぃる、基本的にはEmbedBuilderのランダムカラーセットに使う
 */
public final class OldColorUtils {

    /**
     * マインクラフトのチートツールのAstolfo ClientのArrayListのカラーを真似した。
     * @param index うぇーぶ式にするやつ、基本的に意味ないんで1でok
     * @param speed カラーが変わるスピード、お好みで。
     * @param saturation 彩度、再現したいなら0.5fで
     * @param brightness 輝度、再現したいなら1.0fで
     * @param opacity アルファ値、基本的には1で大丈夫だと思う
     * @return Color
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
     * @return Color
     */
    public static int createRainbow(final int colorrotate) {
        final float hue = (float)((System.currentTimeMillis() % colorrotate));
        return Color.getHSBColor(hue / colorrotate, 0.6f, 1.0f).getRGB();
    }
}
