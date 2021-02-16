package com.asphe.task.nine;

import com.asphe.lib.io.Input;
import java.text.MessageFormat;

public class CircleIssues {
    public static double[] characteristics(double radius) {
        double C = 2 * Math.PI * radius;
        double S = Math.PI * Math.pow(radius, 2.0);
        return new double[]{C, S};
    }

    public static void main(String[] args) {
        double radius = Input.enterDoubleNumber();
        double[] array = CircleIssues.characteristics(radius);
        System.out.println(MessageFormat.format("Circumference is {0} and Area is {1}", array[0], array[1]));
    }
}
