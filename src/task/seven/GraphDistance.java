package task.seven;

import lib.io.Input;

public class GraphDistance {
    public static void isCloser(double[] pointOne, double[] pointTwo) {
        double distanceOne = getDistance(pointOne);
        double distanceTwo = getDistance(pointTwo);
        if (distanceOne < distanceTwo) {
            System.out.println("A(x1,y1) is closer to the origin of the coordinates");
        } else if (distanceOne > distanceTwo) {
            System.out.println("B(x2,y2) is closer to the origin of the coordinates");
        } else {
            System.out.println("Both are equidistant to the origin of the coordinates");
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
        GraphDistance.isCloser(pointOne, pointTwo);
    }
}
