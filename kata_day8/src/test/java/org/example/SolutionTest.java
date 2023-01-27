package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sumDigProd() {
        
        assertEquals(0, Solution.sumDigProd(0));
        assertEquals(9, Solution.sumDigProd(9));
        assertEquals(7, Solution.sumDigProd(9, 8));
        assertEquals(6, Solution.sumDigProd(16, 28));
        assertEquals(1, Solution.sumDigProd(111111111));
        assertEquals(2, Solution.sumDigProd(1, 2, 3, 4, 5, 6));
        assertEquals(6, Solution.sumDigProd(8, 16, 89, 3));
        assertEquals(6, Solution.sumDigProd(26, 497, 62, 841));
        assertEquals(6, Solution.sumDigProd(17737, 98723, 2));
        assertEquals(8, Solution.sumDigProd(123, -99));
        assertEquals(8, Solution.sumDigProd(167, 167, 167, 167, 167, 3));
        assertEquals(2, Solution.sumDigProd(98526, 54, 863, 156489, 45, 6156));
    }
}