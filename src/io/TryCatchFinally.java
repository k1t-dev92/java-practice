package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinally {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 

        try {
            System.out.print("Input an integer >> ");
            String inputText = bufferedReader.readLine();
            int inputNumber = Integer.parseInt(inputText);

            System.out.println("inputNumber = " + inputNumber);
        } catch (NumberFormatException e) {
            System.out.println("The input must be an integer.");
        } finally {
            bufferedReader.close();
        }
    }
}