package com.korkusuz.arrays;

public class Arrays07SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int smallest = Math.abs(arrayOne[0] - arrayTwo[0]);
        int[] temp = new int[]{arrayOne[0], arrayTwo[0]};

        for (int k : arrayOne) {
            for (int i : arrayTwo) {
                if (Math.abs(k - i) < smallest) {
                    smallest = Math.abs(k - i);
                    temp[0] = k;
                    temp[1] = i;
                }
            }
        }
        return temp;
    }
}
