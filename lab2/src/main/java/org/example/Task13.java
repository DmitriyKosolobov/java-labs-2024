package org.example;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("/Users/dmitriykosolobov/Desktop/codegen/lab2/src/main/resources/example.csv");
             CSVReader csvReader = new CSVReader(reader)) {
            csvReader.readAll().stream().limit(10).map(Arrays::toString).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}