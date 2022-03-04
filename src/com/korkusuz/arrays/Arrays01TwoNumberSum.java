package com.korkusuz.arrays;

import java.util.*;

public class Arrays01TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] result = {};
        HashSet<Integer> map = new HashSet<>();

        for (int j : array) {
            map.add(j);
        }
        for (int j : array) {
            if (map.contains(targetSum - j) && targetSum - j != j) {
                result = new int[2];
                result[0] = j;
                result[1] = targetSum - j;
                break;
            }
        }
        return result;
    }
}




