package task.one;

import lib.io.Input;

public class LastDigit {
    public static void lastSqrtDigit(int number) {
        int lastDigit = lastDigit(number);
        // we can use switch instead, but ll have 10 cases. Now 6 ifs
        if (lastDigit == 1 || lastDigit == 9) {
            System.out.println("Last digit of square is 1");
        } else if (lastDigit == 2 || lastDigit == 8) {
            System.out.println("Last digit of square is 4");
        } else if (lastDigit == 3 || lastDigit == 7) {
            System.out.println("Last digit of square is 9");
        } else if (lastDigit == 4 || lastDigit == 6) {
            System.out.println("Last digit of square is 6");
        } else if (lastDigit == 5) {
            System.out.println("Last digit of square is 5");
        } else if (lastDigit == 0) {
            System.out.println("Last digit of square is 0");
        } else {
            System.out.println("Unexpected error in method lastSqrtDigit(int number)");
        }
    }

    private static int lastDigit(int number) {
        return number % 10;
    }

    public static void main(String... args) {
        System.out.println("Enter yours number and we will find last digit of its square");
        int number = Input.enterNumber();
        LastDigit.lastSqrtDigit(number);
    }
}
