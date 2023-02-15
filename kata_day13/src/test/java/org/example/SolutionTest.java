package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void validateCard() {

        assertEquals(false, Solution.validateCard(79927398714L));

        System.out.println("Passes Luhn test, but too short.");
        assertEquals(false, Solution.validateCard(79927398713L));

        assertEquals(true, Solution.validateCard(709092739800713L));

        assertEquals(false, Solution.validateCard(1234567890123456L));

        assertEquals(true, Solution.validateCard(12345678901237L));

        assertEquals(true, Solution.validateCard(5496683867445267L));

        assertEquals(false, Solution.validateCard(4508793361140566L));

        assertEquals(true, Solution.validateCard(376785877526048L));

        assertEquals(false, Solution.validateCard(36717601781975L));
    }
}