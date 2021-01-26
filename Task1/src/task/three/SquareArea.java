package task.three;

import lib.io.Input;

public class SquareArea {
    public static void inscribedSquareArea(double area) {
        validateArea(area);
        double side = Math.sqrt(area);
        double radius = side / 2;
        double inscribedArea = 2 * Math.pow(radius, 2.0);
        double times = area / inscribedArea;
        System.out.println("Area of the inscribed square is " + Math.round(inscribedArea));
        System.out.println("Area of the circumscribed square bigger than area of the inscribed square " + Math.round(times) + " indeed.");
    }

    private static void validateArea(double area) {
        if (area < 0.0) {
            System.out.println("Area cannot be negative value. Please enter valid values..");
            System.exit(0);
        }
    }

    public static void main(String... args) {
        double area = Input.enterDoubleNumber();
        SquareArea.inscribedSquareArea(area);
    }
}
