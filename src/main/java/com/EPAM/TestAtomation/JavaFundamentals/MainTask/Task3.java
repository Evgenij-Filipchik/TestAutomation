package com.EPAM.TestAtomation.JavaFundamentals.MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task3 {
    // 3.  Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main(String[] args)  throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[] numbers = new int[a];
        for (int i = 0; i < a; i++) {
            Random num = new Random();
            numbers[i] = num.nextInt();
        }
            for (int i : numbers )
            {System.out.println(i);}
            for (int i : numbers )
            {System.out.print(i);}
        }
    }