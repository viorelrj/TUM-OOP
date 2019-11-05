package com.labs.lab4;

import java.util.ArrayList;

public class Task {
    public static void main() {
        ArrayList<String> expressions;
        expressions = CustomFileReader.readFile("./assets/lab-4/three_expressions.txt");

        for (String expression: expressions) {
            System.out.print(expression + ": ");
            System.out.println(Validator.HasValidParentheses(expression));
        }
    }
}
