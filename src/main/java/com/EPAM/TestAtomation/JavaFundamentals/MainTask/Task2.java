package com.EPAM.TestAtomation.JavaFundamentals.MainTask;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Task2 {
    // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String[] args) {
        List<String> listOfArguments = Arrays.asList(args);
        Collections.reverse(listOfArguments);
        System.out.println(listOfArguments);
    }
    }
