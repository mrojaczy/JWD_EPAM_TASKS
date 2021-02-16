package com.asphe.task.four;

import com.asphe.lib.io.Input;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Numbers {
    static boolean isEnough(int rank, ArrayList<Integer> numbers) {
        validateRank(rank, numbers);
        int actualRank = 0;
        for (int number : numbers) {
            if (isEven(number)) {
                actualRank += 1;
            }
        }
        return actualRank >= rank;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void validateRank(int rank, ArrayList<Integer> numbers) {
        if (rank > numbers.size()) {
            System.out.println("Rank should not be bigger than the array length. Please insure your data.");
            System.exit(0);
        }
    }

    static ArrayList<Integer> initializeArray(int amount) {
        Random random = new Random();
        return IntStream.range(0, amount).map(i -> random.ints(0, 100).findFirst().getAsInt()).boxed().collect(Collectors.toCollection(() -> new ArrayList<>(amount)));
    }

    public static void main(String[] args) {
        int rank = Input.enterPositiveNumber();
        int amount = Input.enterPositiveNumber();

        ArrayList<Integer> numbers = initializeArray(amount);

        System.out.println(Numbers.isEnough(rank, numbers));
    }
}
