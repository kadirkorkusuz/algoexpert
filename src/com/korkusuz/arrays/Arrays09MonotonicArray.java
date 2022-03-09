package com.korkusuz.arrays;

public class Arrays09MonotonicArray {

    public static boolean isMonotonic(int[] array) {

        var isNonDecreasing = true;
        var isNonIncreasing = true;

        for (int i = 1; i < array.length; i++)
        {
            if(array[i] < array[i - 1])
            {
                isNonDecreasing = false;
            }
            if(array[i] > array[i - 1])
            {
                isNonIncreasing = false;
            }
        }
        return isNonDecreasing || isNonIncreasing;
    }
}
