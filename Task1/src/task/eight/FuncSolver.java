package task.eight;

import lib.io.Input;

public class FuncSolver {
    public static void solve(double x) {
        if (x >= 3) {
            solveGraterThree(x);
        }
        if (x < 3) {
            solveLessThree(x);
        }
    }

    private static void solveGraterThree(double x) {
        double result = -1*Math.pow(x, 2.0) + 3*x + 9;
        System.out.println("result = " + result);
    }

    private static void solveLessThree(double x) {
        if (Math.pow(x, 3) == 6) {
            System.out.println("This value cause division by zero!");
            System.exit(0);
        }
        double result = 1 / (Math.pow(x, 3) - 6);
        System.out.println("result = " + result);
    }

    public static void main(String... args) {
        double x = Input.enterDoubleNumber();
        FuncSolver.solve(x);
    }
}
