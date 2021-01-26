package task.four;

import lib.io.Input;

public class Numbers {
    public static void isEnoughEven(int rank, int... numbers) {
        validateRank(rank, numbers);
        int actualRank = 0;
        for (int number : numbers) {
            actualRank += isEven(number);
        }
        System.out.println(actualRank >= rank ? "true" : "false");
    }

    private static int isEven(int number) {
        return number % 2 == 0 ? 1 : 0;
    }

    private static void validateRank(int rank, int... numbers) {
        if (rank < 0 || rank > numbers.length) {
            System.out.println("Rank should be positive value and not a bigger number than the array length. Please insure your data.");
            System.exit(0);
        }
    }

    public static void main(String... args) {
        int A = Input.enterNumber();
        int B = Input.enterNumber();
        int C = Input.enterNumber();
        int D = Input.enterNumber();
        int rank = Input.enterNumber();
        int[] numbers = { A, B, C, D };
        Numbers.isEnoughEven(rank, numbers);
    }
}
