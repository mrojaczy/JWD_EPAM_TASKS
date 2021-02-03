package task.ten;

import lib.io.Input;
import java.text.MessageFormat;
import java.util.ArrayList;

public class FuncStep {
    public static void showSteps(double a, double b, double h) {
        validateDistance(a, b);
        double distance = getDistance(a, b);
        validateStep(distance, h);
        int steps = countSteps(distance, h);
        double x, y;
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y = new ArrayList<>();
        for (int i = 0; i < steps; i++) {
            x = a + i*h;
            y = getY(x);
            X.add(x);
            Y.add(y);
        }
        printSteps(steps, X, Y);
    }

    // splitting logic and printing
    private static void printSteps(int steps, ArrayList<Double> X, ArrayList<Double> Y) {
        for (int i = 0; i < steps; i++) {
            System.out.println(MessageFormat.format("x[{0}] – {1} and y[{2}] = {3}.", i, X.get(i), i, Y.get(i)));
        }
    }

    private static double getY(double x){
        return Math.tan(x);
    }

    private static double getDistance(double a, double b) {
        return Math.abs(b - a);
    }

    private static int countSteps(double distance, double h) {
        return (int)(distance / h);
    }

    private static void validateDistance(double a, double b) {
        if (a > b) {
            System.out.println("Check how you entered interval. [a,b] – a should be always less than b..");
            System.exit(0);
        }
    }

    private static void validateStep(double distance, double h) {
        if (distance < h) {
            System.out.println("Enormous step you have entered! Please, be patient and be kind to out graph..");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        double a = Input.enterDoubleNumber();
        double b = Input.enterDoubleNumber();
        double h = Input.enterDoubleNumber();
        FuncStep.showSteps(a,b,h);
    }
}
