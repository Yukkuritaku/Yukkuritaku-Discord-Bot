package net.yukkuritaku.utils;

import java.awt.*;

public final class ColorUtils {

    public static Color astolfo(final int index, final int speed, final float saturation, final float brightness, final float opacity) {
        int angle = (int) ((System.currentTimeMillis() / speed + index) % 360);
        angle = (angle > 180 ? 360 - angle : angle) + 180;
        final float hue = angle / 360f;

        final int color = Color.HSBtoRGB(hue, saturation, brightness);
        final Color obj = new Color(color);
        return new Color(obj.getRed(), obj.getGreen(), obj.getBlue(), Math.max(0, Math.min(255, (int) (opacity * 255))));
    }

    public static int createRainbow(final int colorrotate) {
        final float hue = (float)((System.currentTimeMillis() % colorrotate));
        return Color.getHSBColor(hue / colorrotate, 0.6f, 1.0f).getRGB();
    }
}
