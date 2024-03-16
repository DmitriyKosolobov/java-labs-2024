package org.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void printTriangle(ArrayList<ArrayList<Integer>> triangle){
        ArrayList<String> res = new ArrayList<>(triangle.size());
        for (int i = triangle.size()-1; i >= 0; i--) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < triangle.size()-1 - i; j++) {
                str.append("  ");
            }
            str.append(triangle.get(i).toString());
            res.addFirst(str.toString());
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.printf("%-10s %s\n",i+":",res.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("(a+b)^n");
        System.out.print("Введите степень n : ");
        int n = in.nextInt();
        n++;

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            triangle.add(i,new ArrayList<>());
            triangle.get(i).addFirst(1);
            for(int j = 1; j < i; j++){
                triangle.get(i).add(j,triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }

            if(i != 0)
                triangle.get(i).add(i,1);
        }

        for (ArrayList<Integer> row : triangle){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();
        printTriangle(triangle);
    }


}

