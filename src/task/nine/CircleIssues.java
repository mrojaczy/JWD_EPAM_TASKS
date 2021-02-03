package task.nine;

import lib.io.Input;
import java.text.MessageFormat;

public class CircleIssues {
    public static void characteristics(double radius) {
        double C = 2 * Math.PI * radius;
        double S = Math.PI * Math.pow(radius, 2.0);
        System.out.println(MessageFormat.format("Circumference is {0} and Area is {1}", C, S));
    }

    public static void main(String[] args) {
        double radius = Input.enterDoubleNumber();
        CircleIssues.characteristics(radius);
    }
}
