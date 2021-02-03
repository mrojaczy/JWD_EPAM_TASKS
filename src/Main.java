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
