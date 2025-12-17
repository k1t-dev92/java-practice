package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter an integer >> ");
        String userInput1Text = bufferedReader.readLine();
        int userInput1 = Integer.parseInt(userInput1Text);

        System.out.print("Please enter a real number >> ");
        String userInput2Text = bufferedReader.readLine();
        double userInput2 = Double.parseDouble(userInput2Text);

        System.out.print("Please enter a userInput3 >> ");
        String userInput3 = bufferedReader.readLine();

        System.out.println("userInput1 = " + userInput1);
        System.out.println("userInput2 = " + userInput2);
        System.out.println("userInput3 = " + userInput3);
    }
}