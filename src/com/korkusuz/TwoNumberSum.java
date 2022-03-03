package com.korkusuz;

import java.util.*;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] result = {};
        HashSet<Integer> map = new HashSet<Integer>();

        for(int i = 0; i < array.length; i++)
        {
            map.add(array[i]);
        }
        for(int i = 0; i < array.length; i++)
        {
            if(map.contains(targetSum-array[i]) && targetSum-array[i] != array[i])
            {
                result = new int[2];
                result[0] = array[i];
                result[1] = targetSum - array[i];
                break;
            }
        }
        return result;
    }
}




