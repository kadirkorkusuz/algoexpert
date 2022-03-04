package com.korkusuz.arrays;

import java.util.Arrays;

public class Arrays05NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);

        int createdCoin = 0;
        for (int coin : coins)
        {
            if (coin > createdCoin + 1)
            {
                return createdCoin + 1;
            }
            createdCoin += coin;
        }

        return createdCoin + 1;
    }
}
