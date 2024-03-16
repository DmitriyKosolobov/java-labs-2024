package org.lab1;

public class Task9 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = str1.substring(0,5);
        String str3 = "Hello";
        System.out.println(str2 == str3);
        System.out.println(str3.equals(str2));
        System.out.println();

        String str4 = new String("Hello");
        String str5 = new String("Hello");
        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));
    }
}
