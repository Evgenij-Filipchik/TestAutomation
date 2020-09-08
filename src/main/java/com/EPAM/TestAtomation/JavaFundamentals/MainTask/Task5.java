package com.EPAM.TestAtomation.JavaFundamentals.MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class Task5 {
    // 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
    // Осуществить проверку корректности ввода чисел.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num > 0 && num < 13) {
            System.out.println(Month.of(num));
        } else System.out.println("Неверное число");
        reader.close();
    }
}
