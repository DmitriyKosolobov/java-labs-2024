package org.example;

import java.util.ArrayList;

public class Task3 {
    private int a;

    Task3 setA(int a){
        this.a = a;
        return this;
    }

    boolean foo(){
        return a == 5;
    }

    public static void main(String[] args) {
        Task3 el = new Task3();
        System.out.println(el.setA(5).foo());

        ArrayList<String> list = new ArrayList<>();
        boolean c = list.add("str");
        System.out.println(c);
    }
}
