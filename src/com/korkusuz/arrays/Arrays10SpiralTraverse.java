package com.korkusuz.arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays10SpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int[] ints : array) {
            for (int anInt : ints) {
                result.add(anInt);
            }
        }
        return result;
    }
}
