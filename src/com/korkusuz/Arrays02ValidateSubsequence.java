package com.korkusuz;

import java.util.List;
import java.util.Objects;

public class Arrays02ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int left = 0;
        int right = 0;

        while(left < array.size() && right < sequence.size())
        {
            if (sequence.size() > array.size())
                return false;
            else if (!Objects.equals(sequence.get(right), array.get(left)))
            {
                left++;
            }
            else
            {
                left++;
                right++;
            }
        }
        return right == sequence.size();
    }
}
