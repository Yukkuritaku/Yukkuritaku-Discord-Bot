package net.yukkuritaku.utils;

import java.util.Random;

public final class MathUtils {

    public static double randomInRange(final int max, final int min) {
        return Math.random() * (max - min) + min;
    }

    public static int RandomInteger(final int min, final int max){
        final Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}