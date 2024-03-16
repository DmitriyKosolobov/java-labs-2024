package org.lab1;

import java.util.Scanner;
import java.lang.Math;

public class Task2 {
    public static void main(String[] args){
        System.out.print("Введите значение угла: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = Math.abs(a) % 360;
        if(a < 0)
            b = 360 - b;
        System.out.println(b);
        System.out.println(Math.floorMod(a,360));
    }

}
