package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numToEng() {
        assertEquals("zero",Solution.numToEng(0));
        assertEquals("eighteen",Solution.numToEng(18));
        assertEquals("one hundred twenty six",Solution.numToEng(126));
        assertEquals("nine hundred nine",Solution.numToEng(909));
    }
}