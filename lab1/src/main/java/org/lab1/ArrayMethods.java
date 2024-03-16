package org.lab1;

import java.util.Arrays;

public class ArrayMethods {
    static public int[] add(int[] arr,int el){
        if (arr == null)
            throw new RuntimeException("Null argument");

        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[newArr.length-1] = el;
        return newArr;
    }
    static public int[] remove(int[] arr,int element){
        if (arr == null)
            throw new RuntimeException("Null argument");

        int count = 0;
        for (int el : arr) {
            if (el == element) {
                count += 1;
            }
        }

        if(count == 0){
            throw new RuntimeException("Not found element");
        }
        else
        {
            int[] newArr = new int[arr.length-count];
            int j = 0;
            for (int el : arr) {
                if (el != element) {
                    newArr[j] = el;
                    j++;
                }
            }
            return newArr;
        }
    }

    static public int get(int[] arr, int index){
        if (arr == null)
            throw new RuntimeException("Null argument");

        if(index < 0 || index >= arr.length)
            throw new RuntimeException("Index out of range");
        else{
            return arr[index];
        }
    }

    static public int[] set(int[] arr,int index,int el){
        if (arr == null)
            throw new RuntimeException("Null argument");

        if(index < 0 || index >= arr.length)
            throw new RuntimeException("Index out of range");
        else{
            int[] newArr = new int[arr.length];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = el;
            for (int i = index+1; i < newArr.length; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[0];
        System.out.println(Arrays.toString(arr1));

        arr1 = ArrayMethods.add(arr1,1);
        System.out.println(Arrays.toString(arr1));

        arr1 = ArrayMethods.add(arr1,2);
        System.out.println(Arrays.toString(arr1));
        System.out.println();



        try{
            arr1 = ArrayMethods.remove(arr1,3);
        }
        catch (Exception e){
            System.out.println("Ошибка!");
        }

        arr1 = new int[]{1,3,6,2,5,2};
        arr1 = ArrayMethods.remove(arr1,2);
        System.out.println(Arrays.toString(arr1));
        System.out.println();



        int a = ArrayMethods.get(arr1,0);
        System.out.println(a);

        try{
            a = ArrayMethods.get(arr1,4);
        }
        catch (Exception e){
            System.out.println("Ошибка!");
        }
        System.out.println();



        int[] arr2 = {1,45,6,2};
        System.out.println(Arrays.toString(arr2));

        arr2 = ArrayMethods.set(arr2,2,52);
        System.out.println(Arrays.toString(arr2));

        try{
            arr2 = ArrayMethods.set(arr1,-1,89);
        }
        catch (Exception e){
            System.out.println("Ошибка!");
        }
        System.out.println();

    }
}
