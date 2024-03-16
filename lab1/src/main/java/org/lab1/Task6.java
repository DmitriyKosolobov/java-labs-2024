package org.lab1;

import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        System.out.print("Введите n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger a = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        System.out.println(a);
    }
}
