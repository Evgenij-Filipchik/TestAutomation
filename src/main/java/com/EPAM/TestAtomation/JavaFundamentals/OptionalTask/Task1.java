package com.EPAM.TestAtomation.JavaFundamentals.OptionalTask;
import java.io.*;
import java.io.IOException;

public class Task1 {
    // 1.  Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String minlength = null;
        String maxlength = null;
        while (true) {
            String s = reader.readLine();
            if (s.equals("")) {
                break;
            }
            if (s.contains("-")) {

                if (min > s.length() - 1) {
                    min = s.length() - 1;
                    minlength = s;
                }
                if (max < s.length() - 1) {
                    max = s.length() - 1;
                    maxlength = s;
                }
            } else {
                if (min > s.length()) {
                    min = s.length();
                    minlength = s;
                }
                if (max < s.length()) {
                    max = s.length();
                    maxlength = s;
                }
            }
        }
        reader.close();
        System.out.println("min " + minlength + ", length " + min);
        System.out.println("max " + maxlength + ", length " + max);
    }
}
