package org.lab1;

public class Task16 {
    public static double average(double first, double... values) {
        double sum = first;
        for (double num : values)
            sum += num;
        return sum/(1+values.length);
    }
    public static void main(String[] args) {
        System.out.println(average(1));
        System.out.println(average(1,4,6,7,9));
        System.out.println(average(1,4));
    }
}
