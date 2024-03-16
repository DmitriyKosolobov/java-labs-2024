package org.lab1;

import java.util.Scanner;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Введите целочисленное значение: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println(Double.toHexString(1.0 / a));

        int[] s = {1,5};

        final int[] arr = new int[]{4,5,7,1};
        System.out.println(arr[0]);
        arr[0]=15;
        System.out.println(arr[0]);

    }
}