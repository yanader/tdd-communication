package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class ArrayProcessorTest {

    ArrayProcessor ap;

    @BeforeEach
    void setup() {
        ap = new ArrayProcessor();

    }

    @Test
    void sumExcludingSmallestAndLargestElementsReturnsZeroWithEmptyArray() {
        int[] emptyArray = {};
        assertEquals(0, ap.sumExcludingSmallestAndLargestElements(emptyArray));
    }

    @Test
    void sumExcludingSmallestAndLargestElementsReturnsZeroWithArraySizeLessThanThree() {
        int[] arrayWithOneElement = {1};
        int[] arrayWithTwoElements = {1, 2};
        assertEquals(0, ap.sumExcludingSmallestAndLargestElements(arrayWithOneElement));
        assertEquals(0, ap.sumExcludingSmallestAndLargestElements(arrayWithTwoElements));;
    }

    @Test
    void methodReturnsCorrectValueFromArrayOfUniqueValues() {
        int[] testArrayOne = {5, 2, 6, 10, 22};
        int[] testArrayTwo = {1, 2, 3, 4, 5};
        int[] testArrayThree = {1};
        int[] testArrayFour = {1, 2};
        int[] testArrayFive = {1, 2, 3};
        assertAll(() -> {
                assertEquals(21, ap.sumExcludingSmallestAndLargestElements(testArrayOne));
                assertEquals(9, ap.sumExcludingSmallestAndLargestElements(testArrayTwo));
                assertEquals(0, ap.sumExcludingSmallestAndLargestElements(testArrayThree));
                assertEquals(0, ap.sumExcludingSmallestAndLargestElements(testArrayFour));
                assertEquals(2, ap.sumExcludingSmallestAndLargestElements(testArrayFive));
        });

    }

    @Test
    void methodHandlesArraysOfNonUniqueValues() {
        int[] testArrayOne = {5, 2, 6, 10, 22, 2, 2};
        int[] testArrayTwo = {1, 2, 3, 4, 5, 5, 5};
        int[] testArrayThree = {1, 1, 1, 1};
        int[] testArrayFour = {1, 1, 2, 2};
        int[] testArrayFive = {1, 1, 2, 3, 3};
        assertAll(() -> {
            assertEquals(21, ap.sumExcludingSmallestAndLargestElements(testArrayOne));
            assertEquals(9, ap.sumExcludingSmallestAndLargestElements(testArrayTwo));
            assertEquals(0, ap.sumExcludingSmallestAndLargestElements(testArrayThree));
            assertEquals(0, ap.sumExcludingSmallestAndLargestElements(testArrayFour));
            assertEquals(2, ap.sumExcludingSmallestAndLargestElements(testArrayFive));
        });
    }


}