package org.example;


public class Task4 {

    //при передаче в метод int, будет изменяться локальная копия
    //Integer - нет, неизменяемый класс
    //IntHolder удалили

    public static void swapInteger(Integer a,Integer b){
        Integer c = a;
        a= b;
        b = c;
    }

//    public static void swapIntHolder(IntHolder a, IntHolder b){
//        int c = a.value;
//        a.value = b.value;
//        b.value = c;
//    }


    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 7;
        swapInteger(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
