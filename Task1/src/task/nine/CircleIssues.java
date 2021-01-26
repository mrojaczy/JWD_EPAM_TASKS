package task.nine;

import lib.io.Input;

public class CircleIssues {
    public static void characteristics(double radius) {
        double C = 2 * Math.PI * radius;
        double S = Math.PI * Math.pow(radius, 2.0);
        System.out.println("Circumference is " + C + " and area is " + S);
    }

    public static void main(String... args) {
        double radius = Input.enterDoubleNumber();
        CircleIssues.characteristics(radius);
    }
}
