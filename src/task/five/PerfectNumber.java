package task.five;

import lib.io.Input;

public class PerfectNumber {
    public static void isPerfectNumber(int number) {
        int sum = 0;
        int i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum == number ? "true" : "false");
    }

    public static void main(String[] args) {
        int number = Input.enterNumber();
        PerfectNumber.isPerfectNumber(number);
    }
}
