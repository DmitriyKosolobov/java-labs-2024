package org.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random gen = new Random();

        ArrayList<Integer> arr = new ArrayList<Integer>(49);
        for (int i = 0; i < 49; i++) {
            arr.add(i,i+1);
        }

        int[] comb = new int[6];
        for (int i = 0; i < 6; i++) {
            int j = gen.nextInt(arr.size()-1);
            comb[i] = arr.get(j);
            arr.remove(j);
        }
        Arrays.sort(comb);
        System.out.println(Arrays.toString(comb));
    }
}