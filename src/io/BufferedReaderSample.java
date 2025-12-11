package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter an integer >> ");
        String intInput = bufferedReader.readLine();
        int intNumber = Integer.parseInt(intInput);

        System.out.print("Please enter a real number >> ");
        String doubleInput = bufferedReader.readLine();
        double doubleNumber = Double.parseDouble(doubleInput);

        System.out.print("Please enter a word >> ");
        String word = bufferedReader.readLine();

        System.out.println("intNumber = " + intNumber);
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("word = " + word);
    }
}