package task.ten;

import lib.io.Input;

import java.util.ArrayList;

public class FuncStep {
    public static void showSteps(double a, double b, double h) {
        validateDistance(a, b);
        double distance = getDistance(a, b);
        System.out.println("distance = " + distance);
        validateStep(distance, h);
        int steps = countSteps(distance, h);
        System.out.println("steps = " + steps);
        double x, y;
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y = new ArrayList<>();
        for (int i = 0; i < steps; i++) {
            x = a + i*h;
            y = getY(x);
            X.add(x);
            Y.add(y);
        }
        for (int i = 0; i < steps; i++) {
            System.out.println("x[" + i + "] – " + X.get(i) + " and y[" + i + "] = " + Y.get(i) + ".");
        }
    }

    private static double getY(double x){
        return Math.tan(x);
    }

    private static void validateDistance(double a, double b) {
        if (a > b) {
            System.out.println("Check how you entered interval. [a,b] – a should be always less than b..");
            System.exit(0);
        }
    }

    private static double getDistance(double a, double b) {
        return Math.abs(b - a);
    }

    private static void validateStep(double distance, double h) {
        if (distance < h) {
            System.out.println("Enormous step you have entered! Please, be patient and be kind to out graph..");
            System.exit(0);
        }
    }

    private static int countSteps(double distance, double h) {
        return (int)(distance / h);
    }

    public static void main(String... args) {
        double a = Input.enterDoubleNumber();
        double b = Input.enterDoubleNumber();
        double h = Input.enterDoubleNumber();
        FuncStep.showSteps(a,b,h);
    }
}
