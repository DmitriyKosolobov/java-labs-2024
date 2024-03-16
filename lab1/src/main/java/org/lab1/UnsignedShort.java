package org.lab1;

import java.util.Scanner;

public class UnsignedShort{

    private final int value;

    public UnsignedShort(int val){
        if(val < 0){
            value = 0;
        }
        else if(val > Character.MAX_VALUE){
            value = Character.MAX_VALUE;
        }
        else {
            value = val;
        }
    }

    public int getValue(){
        return value;
    }

    public UnsignedShort add(UnsignedShort val){
        long res = value + val.value;

        if(res > Character.MAX_VALUE)
            res = Character.MAX_VALUE;
        else if(res < 0)
            res = 0;

        return new UnsignedShort((int)res);
    }

    public UnsignedShort subtract(UnsignedShort val){
        long res = value - val.value;

        if(res > Character.MAX_VALUE)
            res = Character.MAX_VALUE;
        else if(res < 0)
            res = 0;

        return new UnsignedShort((int)res);
    }

    public UnsignedShort multiply(UnsignedShort val){
        long res = (long) value * val.value;

        if(res > Character.MAX_VALUE)
            res = Character.MAX_VALUE;
        else if(res < 0)
            res = 0;

        return new UnsignedShort((int)res);
    }

    public UnsignedShort divide(UnsignedShort val){
        if(val.value == 0)
            throw new ArithmeticException();

        long res = value / val.value;

        if(res > Character.MAX_VALUE)
            res = Character.MAX_VALUE;
        else if(res < 0)
            res = 0;

        return new UnsignedShort((int)res);
    }

    public UnsignedShort mod(UnsignedShort val){
        if(val.value <= 0)
            throw new ArithmeticException();

        int res = value % val.value;

        if(res > Character.MAX_VALUE)
            res = Character.MAX_VALUE;
        else if(res < 0)
            res = 0;

        return new UnsignedShort(res);
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int c = in.nextInt();
//        int d = in.nextInt();
//        System.out.println(c + " " + d);
//
//        UnsignedShort a = new UnsignedShort(c);
//        UnsignedShort b = new UnsignedShort(d);
//        System.out.println(a.getValue() + " " + b.getValue());
//
//        System.out.println("Сумма: " + a.add(b).getValue() );
//        System.out.println("Разность: " + a.subtract(b).getValue() );
//        System.out.println("Произведение: " + a.multiply(b).getValue() );
//
//        System.out.println("Частное: " + a.divide(b).getValue() );
//        System.out.println("Остаток: " + a.mod(b).getValue() );
//        System.out.println((int)Character.MAX_VALUE);

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        short var1 = (short) in.nextInt();

        System.out.print("Введите второе число: ");
        short var2 = (short) in.nextInt();

        System.out.printf("Первое число как short: %d , и как unsigned short: %d\n", var1, (0xFFFF & var1));
        System.out.printf("Второе число как short: %d , и как unsigned short: %d\n", var2, (0xFFFF & var2));

    }
}
