package com.asphe.task.seven;

import com.asphe.lib.io.Input;


public class GraphDistance {
    public static String isCloser(double[] pointOne, double[] pointTwo) {
        double distanceOne = getDistance(pointOne);
        double distanceTwo = getDistance(pointTwo);
        if (distanceOne < distanceTwo) {
            return "A(x1,y1) is closer to the origin of the coordinates";
        } else if (distanceOne > distanceTwo) {
            return "B(x2,y2) is closer to the origin of the coordinates";
        } else {
            return "Both are equidistant to the origin of the coordinates";
        }
    }

    private static double getDistance(double[] point) {
        return Math.sqrt(Math.pow(point[0], 2.0) + Math.pow(point[1], 2.0));
    }

    public static void main(String[] args) {
        double x1 = Input.enterDoubleNumber();
        double y1 = Input.enterDoubleNumber();
        double x2 = Input.enterDoubleNumber();
        double y2 = Input.enterDoubleNumber();
        double[] pointOne = {x1, y1};
        double[] pointTwo = {x2, y2};
        System.out.println(GraphDistance.isCloser(pointOne, pointTwo));
    }
}
