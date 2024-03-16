package org.lab1;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short a = (short) in.nextInt();
        short b = (short) in.nextInt();
        System.out.println(a + " " + b);
        System.out.println("Сумма: " + (short)(a+b));
        System.out.println("Разность: " + (short)(a-b));
        System.out.println("Произведение: " + (short)(a*b));

        if (b == 0)
            System.out.println("Ошибка! Деление на ноль.");
        else{
            System.out.println("Частное: " + (short)(a/b));
            System.out.println("Остаток: " + (short)(a%b));
        }

    }
}
