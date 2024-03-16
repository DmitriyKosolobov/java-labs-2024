package org.lab1;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину строки: ");
        int len = in.nextInt();
        long strLong = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = (char) (gen.nextBoolean() ? (gen.nextInt(10) + 48) : (gen.nextBoolean() ? (gen.nextInt(26) + 65) : (gen.nextInt(26) + 97)) );
            System.out.println(ch);
            strLong += ch;
            str.append(ch);
        }
        System.out.println(str);
        System.out.println(strLong);
        System.out.println(Long.toString(strLong, 36));
    }
}

