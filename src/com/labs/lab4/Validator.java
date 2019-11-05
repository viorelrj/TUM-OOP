package com.labs.lab4;

public class Validator {
    public static Boolean HasValidParentheses (String expression) {
        int counter = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                counter++;
            } else if (expression.charAt(i) == ')') {
                counter--;
            }

            if (counter < 0) return false;
        }

        return counter == 0;
    }
}
