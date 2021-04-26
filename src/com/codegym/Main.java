package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<String> results = new ArrayList<>();
            readDataFromFile(results);
            showElementInArrays(results);
            results.add("5\tThanh\tHN\t9");
            writeDataToFile(results);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showElementInArrays(List<String> results) {
        for (String element : results) {
            System.out.println(element);
        }
    }

    private static void readDataFromFile(List<String> results) throws IOException {
        FileReader fileReader = new FileReader("output.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            results.add(line);
        }
        bufferedReader.close();
        fileReader.close();
    }

    private static void writeDataToFile(List<String> strings) throws IOException {
        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String element : strings) {
            bufferedWriter.write(element);
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
