package org.lab1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task14 {

//    public static boolean isMagic(int[][] square){
//        int sum = 0;
//        int n = square.length;
//        for (int k = 0; k < n; k++) {
//            sum += square[0][k];
//        }
//
//        for(int[] row : square){
//            int rowSum = 0;
//            for(int number : row){
//                rowSum += number;
//            }
//            if(rowSum != sum){
//                return false;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            int columnSum = 0;
//            for (int j = 0; j < n; j++) {
//                columnSum += square[j][i];
//            }
//            if(columnSum != sum){
//                return false;
//            }
//        }
//
//        int diagonalSum = 0;
//        for (int i = 0; i < n; i++){
//            diagonalSum += square[i][i];
//        }
//        if (diagonalSum != sum){
//            return false;
//        }
//
//        diagonalSum = 0;
//        for (int i = 0; i < n; i++){
//            diagonalSum += square[i][n-1-i];
//        }
//        if (diagonalSum != sum){
//            return false;
//        }
//
//        return true;
//    }

    public static void main(String[] args) {

//        System.out.print("Введите размер квадрата: ");
//        int n = in.nextInt();
//        int[][] square = new int[n][n];
//        for (int i = 0; i < square.length; i++) {
//            for (int j = 0; j < square[0].length; j++) {
//                square[i][j] = in.nextInt();
//            }
//        }

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> square = new ArrayList<>();
        int i = 0;
        while (in.hasNextLine()){
            square.add(new ArrayList<>());
            String line = in.nextLine();
            Pattern pattern = Pattern.compile("\\b[0-9]+\\b");
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()) {
                square.get(i).add(Integer.parseInt(line.substring(matcher.start(), matcher.end())));
            }
            i++;
        }
        System.out.println(isMagic(square) ? "Квадрат магический!" : "Квадрат НЕ магический!");
    }

    public static boolean isMagic(ArrayList<ArrayList<Integer>> square){
        int sum = 0;
        int n = square.size();
        for (int k = 0; k < n; k++) {
            sum += square.getFirst().get(k);
        }

        for(ArrayList<Integer> row : square){
            int rowSum = 0;
            for(int number : row){
                rowSum += number;
            }
            if(rowSum != sum){
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            int columnSum = 0;
            for (int j = 0; j < n; j++) {
                columnSum += square.get(j).get(i);
            }
            if(columnSum != sum){
                return false;
            }
        }

        int diagonalSum = 0;
        for (int i = 0; i < n; i++){
            diagonalSum += square.get(i).get(i);
        }
        if (diagonalSum != sum){
            return false;
        }

        diagonalSum = 0;
        for (int i = 0; i < n; i++){
            diagonalSum += square.get(i).get(n-1-i);
        }
        if (diagonalSum != sum){
            return false;
        }

        return true;
    }

}



