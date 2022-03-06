package com.korkusuz.arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays08MoveElementToTheEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        for (int i = 0; i < array.size(); i++)
        {
            int current = array.get(i);
            for (int j = i + 1; j < array.size(); j++)
            {
                if (array.get(i) != toMove)
                    break;
                if (array.get(j) != toMove)
                {
                    array.set(i, array.get(j));
                    array.set(j, current);
                }
            }
        }
        return array;
    }
}
