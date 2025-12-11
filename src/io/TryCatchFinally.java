package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinally {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 

        try {
            System.out.print("Input an integer >> ");
            String intInput = bufferedReader.readLine();
            int intNumber = Integer.parseInt(intInput);

            System.out.println("intNumber = " + intNumber);
        } catch (NumberFormatException e) {
            System.out.println("The input must be an integer.");
        } finally {
            bufferedReader.close();
        }
    }
}