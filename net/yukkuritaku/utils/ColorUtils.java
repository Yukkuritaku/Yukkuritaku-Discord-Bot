package net.yukkuritaku.utils;

import java.awt.*;

public class ColorUtils {

    public static Color astolfo(int index, int speed, float saturation, float brightness, float opacity) {
        int angle = (int) ((System.currentTimeMillis() / speed + index) % 360);
        angle = (angle > 180 ? 360 - angle : angle) + 180;
        float hue = angle / 360f;

        int color = Color.HSBtoRGB(hue, saturation, brightness);
        Color obj = new Color(color);
        return new Color(obj.getRed(), obj.getGreen(), obj.getBlue(), Math.max(0, Math.min(255, (int) (opacity * 255))));
    }

    public static int createRainbow(final int speed) {
        float hue = (float)((System.currentTimeMillis() % speed));
        return Color.getHSBColor(hue / speed, 0.6f, 1.0f).getRGB();
    }
}
