package task.eight;

import lib.io.Input;

public class FuncSolver {
    public static void solve(double x) {
        double result = getSolution(x);
        System.out.println("result = " + result);
    }

    private static double getSolution(double x) {
        double result = 0.0;
        if (x >= 3) {
            result = solveGraterThree(x);
        }
        if (x < 3) {
            result = solveLessThree(x);
        }
        return result;
    }

    private static double solveGraterThree(double x) {
        return -1 * Math.pow(x, 2.0) + 3 * x + 9;
    }

    private static double solveLessThree(double x) {
        if (Math.pow(x, 3) == 6) {
            System.out.println("This value cause division by zero!");
            System.exit(0);
        }
        return 1 / (Math.pow(x, 3) - 6);
    }

    public static void main(String[] args) {
        double x = Input.enterDoubleNumber();
        FuncSolver.solve(x);
    }
}
