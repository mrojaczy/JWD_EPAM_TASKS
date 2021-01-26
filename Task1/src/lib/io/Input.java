package lib.io;

import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);

    public static int enterNumber() {
        int value = 0;
        System.out.print("Enter a number: ");
        try {
            value = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You've entered wrong value! Please, try again..");
            System.exit(0);
        }
        return value;
    }

    public static double enterDoubleNumber() {
        double value = 0.0;
        System.out.print("Enter a double number: ");
        try {
            value = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("You've entered wrong value! Please, try again..");
            System.exit(0);
        }
        return value;
    }


}
