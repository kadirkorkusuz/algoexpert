package com.korkusuz.arrays;

import java.util.Arrays;

public class Arrays03SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            result[i] = (int) Math.pow(array[i], 2);
        }
        Arrays.sort(result);
        return result;
    }
}
