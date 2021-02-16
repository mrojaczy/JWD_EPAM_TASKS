package com.asphe.task.ten;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static org.junit.jupiter.api.Assertions.*;

class FuncStepTest {

    @Test
    void showSteps() {
        assertEquals(2.0, FuncStep.getDistance(2.0, 4.0));
        assertEquals(3, FuncStep.countSteps(FuncStep.getDistance(2.0, 5.0), 1.0));
        assertEquals(1.6197751905438615, FuncStep.getY(45));

        assertEquals(3, FuncStep.showSteps(2, 5, 1).getValue0());
        assertEquals(DoubleStream.of(2.0, 3.0, 4.0).boxed().collect(Collectors.toCollection(ArrayList::new)), FuncStep.showSteps(2, 5, 1).getValue1());
        assertEquals(DoubleStream.of(-2.185039863261519, -0.1425465430742778, 1.1578212823495775).boxed().collect(Collectors.toCollection(ArrayList::new)), FuncStep.showSteps(2, 5, 1).getValue2());

    }
}