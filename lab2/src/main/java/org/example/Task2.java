package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // Модифицирующий (вызов метода useTypeCache, изменяющего состояние)

        Random random = new Random();
        int b = random.nextInt(); // Метод доступа
    }
}
