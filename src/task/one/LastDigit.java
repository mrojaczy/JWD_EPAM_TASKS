package task.one;

import lib.io.Input;

public class LastDigit {
    public static void lastSqrtDigit(int number) {
        int lastDigit = lastDigit(number);
        System.out.print("Last digit of square is ");
        switch (lastDigit) {
            case 1,9 -> System.out.println("1");
            case 2,8 -> System.out.println("4");
            case 3,7 -> System.out.println("9");
            case 4,6 -> System.out.println("6");
            case 5 -> System.out.println("5");
            case 0 -> System.out.println("0");
        }
    }

    private static int lastDigit(int number) {
        return number % 10;
    }

    public static void main(String[] args) {
        System.out.println("Enter yours number and we will find last digit of its square");
        int number = Input.enterNumber();
        LastDigit.lastSqrtDigit(number);
    }
}
