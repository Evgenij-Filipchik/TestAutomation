package com.EPAM.TestAtomation.JavaFundamentals.MainTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {
    // 1.     Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String username = reader.readLine();
        System.out.println("Hello " + username + "!");
    }

}
