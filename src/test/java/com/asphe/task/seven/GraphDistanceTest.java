package com.asphe.task.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphDistanceTest {

    @Test
    void isCloser() {
        // check if the first point closer to center
        assertEquals("A(x1,y1) is closer to the origin of the coordinates", GraphDistance.isCloser(new double[]{4, 4}, new double[]{8,8}));

        // check if the second point closer to center
        assertEquals("B(x2,y2) is closer to the origin of the coordinates", GraphDistance.isCloser(new double[]{8, 8}, new double[]{4,4}));

        // check if the second point closer to center
        assertEquals("Both are equidistant to the origin of the coordinates", GraphDistance.isCloser(new double[]{8, 8}, new double[]{8,8}));
    }
}