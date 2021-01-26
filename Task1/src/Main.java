import lib.io.Input;
import task.eight.FuncSolver;
import task.five.PerfectNumber;
import task.four.Numbers;
import task.nine.CircleIssues;
import task.one.LastDigit;
import task.seven.GraphDistance;
import task.six.TimeIssues;
import task.ten.FuncStep;
import task.three.SquareArea;
import task.two.CalendarIssues;


public class Main {

    public static void main(String[] args) {
        int choice = Input.enterNumber();

        switch (choice) {
            case 0 -> System.exit(0);
            case 1 -> LastDigit.main();
            case 2 -> CalendarIssues.main();
            case 3 -> SquareArea.main();
            case 4 -> Numbers.main();
            case 5 -> PerfectNumber.main();
            case 6 -> TimeIssues.main();
            case 7 -> GraphDistance.main();
            case 8 -> FuncSolver.main();
            case 9 -> CircleIssues.main();
            case 10 -> FuncStep.main();
        }
    }
}
