package task.four;

import lib.io.Input;
import java.util.ArrayList;

public class Numbers {
    public static void isEnoughEven(int rank, ArrayList<Integer> numbers) {
        System.out.println(isEnough(rank, numbers));
    }

    private static boolean isEnough(int rank, ArrayList<Integer> numbers) {
        validateRank(rank, numbers);
        int actualRank = 0;
        for (int number : numbers) {
            actualRank += isEven(number);
        }
        return actualRank >= rank;
    }

    private static int isEven(int number) {
        return number % 2 == 0 ? 1 : 0;
    }

    private static void validateRank(int rank, ArrayList<Integer> numbers) {
        if (rank > numbers.size()) {
            System.out.println("Rank should not be bigger than the array length. Please insure your data.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        int rank = Input.enterPositiveNumber();
        int amount = Input.enterPositiveNumber();

        ArrayList<Integer> numbers = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            int temp = Input.enterNumber();
            numbers.add(temp);
        }

        Numbers.isEnoughEven(rank, numbers);
    }
}
