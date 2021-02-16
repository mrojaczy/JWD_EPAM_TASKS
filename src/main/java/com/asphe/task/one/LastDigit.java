package com.asphe.task.one;

import com.asphe.lib.io.Input;

import java.text.MessageFormat;

public class LastDigit {
    public static int lastSqrtDigit(int number) {
        int lastDigit = lastDigit(number);
        int result;
        switch (lastDigit) {
            case 1,9 -> result = 1;
            case 2,8 -> result = 4;
            case 3,7 -> result = 9;
            case 4,6 -> result = 6;
            case 5 -> result = 5;
            case 0 -> result = 0;
            default -> throw new IllegalStateException("Unexpected value: " + lastDigit);
        }
        return result;
    }

    static int lastDigit(int number) {
        return number % 10;
    }

    public static void main(String[] args) {
        int number = Input.enterNumber();
        int lastSqrtDigit = LastDigit.lastSqrtDigit(number);
        System.out.print(MessageFormat.format("Last digit of square is {0}", lastSqrtDigit));
    }
}
