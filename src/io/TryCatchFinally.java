package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinally {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

        try {
            System.out.print("Input an integer >> ");
            String str = reader.readLine();
            int num = Integer.parseInt(str);

            System.out.println("num = " + num);
        } catch (NumberFormatException e) {
            System.out.println("The input must be an integer.");
        } finally {
            reader.close();
        }
    }
}