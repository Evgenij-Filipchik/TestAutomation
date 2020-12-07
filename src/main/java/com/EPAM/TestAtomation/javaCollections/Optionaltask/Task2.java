package com.EPAM.TestAtomation.javaCollections.Optionaltask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Task2 {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (Character c : chars) {
            if(Character.isDigit(c)){
                String s1 = c.toString();
                int i = Integer.parseInt(s1);
                stack.push(i);
            } else {
                System.out.println(c + " не цифра");
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());
        }


    }
}
