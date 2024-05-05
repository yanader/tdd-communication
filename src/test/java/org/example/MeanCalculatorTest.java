package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeanCalculatorTest {

    MeanCalculator meanCalculator;

    @BeforeEach
    void setup() {
        meanCalculator = new MeanCalculator();
    }

    @Test
    void meanHandlesAnEmptyArray() {
        int[] input = {};
        double expectedOutput = 0;

        double actualOutput = meanCalculator.mean(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void meanReturnsCorrectValueFromArrayLengthOne() {
        int[] input = {5};
        double expectedOutput = 5.0;

        double actualOutput = meanCalculator.mean(input);
    }

    @Test
    void meanReturnsCorrectValue() {
        int[] inputOne = {1, 2, 3};
        int[] inputTwo = {40, 16, 5, 8};
        int[] inputThree = {1, 1, 2, 3};
        int[] inputFour = {-2, 70, 70};
        int[] inputFive = {10, 10, 10};

        assertAll(() -> {
            assertEquals(2.0, meanCalculator.mean(inputOne));
            assertEquals(17.25, meanCalculator.mean(inputTwo));
            assertEquals(1.75, meanCalculator.mean(inputThree));
            assertEquals(46.0, meanCalculator.mean(inputFour));
            assertEquals(10.0, meanCalculator.mean(inputFive));
        });
    }
}