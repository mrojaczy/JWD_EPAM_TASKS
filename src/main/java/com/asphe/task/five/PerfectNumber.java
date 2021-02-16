package com.asphe.task.five;

import com.asphe.lib.io.Input;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        int i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(PerfectNumber.isPerfectNumber(Input.enterNumber()));
    }
}
