package com.korkusuz.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays06ThreeNumberSum {

    private static List<Integer[]> result;

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        ArrayList<Integer> temp = new ArrayList<>();
        result = new ArrayList<>();

        for (int j : array) {
            temp.add(j);
        }
        Collections.sort(temp);

        for (int i = 0; i < temp.size(); i++)
        {
            twoNumberSum(i, targetSum - temp.get(i), temp);
        }
        return result;
    }

    public static void twoNumberSum(int index, int targetSum, ArrayList<Integer> array)
    {
        for (int i = index + 1; i < array.size(); i++)
        {
            for (int j = i + 1; j < array.size(); j++)
            {
                if (array.get(i) + array.get(j) == targetSum)
                {
                    Integer[] tempResult = new Integer[] {array.get(index), array.get(i), array.get(j)};
                    if (!result.contains(tempResult))
                        result.add(tempResult);
                }
            }
        }
    }
}
