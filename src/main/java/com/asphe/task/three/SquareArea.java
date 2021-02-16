package com.asphe.task.three;

import com.asphe.lib.io.Input;

import org.javatuples.Pair;
import java.text.MessageFormat;

public class SquareArea {
    public static Pair<Double, Double> inscribedSquareArea(double area) {
        validateArea(area);
        double side = Math.sqrt(area);
        double radius = side / 2;
        double inscribedArea = Math.round(2 * Math.pow(radius, 2.0));
        double times = Math.round(area / inscribedArea);
        return Pair.with(inscribedArea, times);
    }

    private static void printInscribedAreaCharacteristics(Pair<Double, Double> characteristics) {
        System.out.println(MessageFormat.format("Area of the inscribed square is {0}", characteristics.getValue0()));
        System.out.println(MessageFormat.format("Area of the circumscribed square bigger than area of the inscribed square {0} indeed.", characteristics.getValue1()));
    }

    // TODO create method for inputting positive double values in my lib
    private static void validateArea(double area) {
        if (area < 0.0) {
            System.out.println("Area cannot be negative value. Please enter valid values..");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        double area = Input.enterDoubleNumber();
        printInscribedAreaCharacteristics(SquareArea.inscribedSquareArea(area));
    }
}
