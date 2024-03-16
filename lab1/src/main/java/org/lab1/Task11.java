package org.lab1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch < 32 || ch > 127) {
                System.out.println((int)ch + ": " + ch);
            }
        }
    }
}
