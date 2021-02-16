package com.asphe.task.eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncSolverTest {

    @Test
    void solve() {
        assertEquals(9.0, FuncSolver.getSolution(3.0));
        assertEquals(-9.0, FuncSolver.getSolution(6.0));
        assertEquals(-0.2, FuncSolver.getSolution(1.0));

    }
}