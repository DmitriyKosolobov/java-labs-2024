package org.lab1;

import java.sql.Struct;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] arr = a.split("\\s+");
        for(String str : arr){
            System.out.println(str);
        }
    }
}
