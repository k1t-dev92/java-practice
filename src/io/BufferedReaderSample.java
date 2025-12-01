package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter an integer >> ");
        String i_str = reader.readLine();
        int i_num = Integer.parseInt(i_str);

        System.out.print("Please enter a real number >> ");
        String d_str = reader.readLine();
        double d_num = Double.parseDouble(d_str);

        System.out.print("Please enter a word >> ");
        String str = reader.readLine();

        System.out.println("i_num = " + i_num);
        System.out.println("d_num = " + d_num);
        System.out.println("str = " + str);
    }
}
