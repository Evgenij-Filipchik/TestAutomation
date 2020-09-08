package com.EPAM.TestAtomation.JavaFundamentals.MainTask;

import java.util.ArrayList;

public class Task4 {
    // 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму
    // (произведение) и вывести результат на консоль.
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < args.length; i++) {
            numbers.add(Integer.parseInt(args[i]));
        }

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            mul *= numbers.get(i);
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + mul);
    }
}