package com.asphe;

import com.asphe.lib.io.Input;
import com.asphe.task.eight.FuncSolver;
import com.asphe.task.five.PerfectNumber;
import com.asphe.task.four.Numbers;
import com.asphe.task.nine.CircleIssues;
import com.asphe.task.one.LastDigit;
import com.asphe.task.seven.GraphDistance;
import com.asphe.task.six.TimeIssues;
import com.asphe.task.ten.FuncStep;
import com.asphe.task.three.SquareArea;
import com.asphe.task.two.CalendarIssues;


public class Main {

    public static void main(String[] args) {
        int choice = Input.enterNumber();

        switch (choice) {
            case 0 -> System.exit(0);
            case 1 -> LastDigit.main(args);
            case 2 -> CalendarIssues.main(args);
            case 3 -> SquareArea.main(args);
            case 4 -> Numbers.main(args);
            case 5 -> PerfectNumber.main(args);
            case 6 -> TimeIssues.main(args);
            case 7 -> GraphDistance.main(args);
            case 8 -> FuncSolver.main(args);
            case 9 -> CircleIssues.main(args);
            case 10 -> FuncStep.main(args);
            default -> System.out.println("Wrong input, try again");
        }
    }
}
