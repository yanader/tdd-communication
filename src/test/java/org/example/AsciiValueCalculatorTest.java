package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsciiValueCalculatorTest {

    AsciiValueCalculator asciiCalc;

    @BeforeEach
    void setup() {
        asciiCalc = new AsciiValueCalculator();
    }

    @Test
    void emptyStringReturnsZero() {
        String input = "";
        int expectedOutput = 0;

        int actualOutput = asciiCalc.asciiAdder(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void asciiAdderHandlesValidStrings() {
        String inputOne = "northcoders";
        String inputTwo = "Northcoders";
        String inputThree = "a";
        String inputFour = "1";
        String inputFive = "123";

        assertAll(() -> {
            assertEquals(1195,asciiCalc.asciiAdder(inputOne));
            assertEquals(1163,asciiCalc.asciiAdder(inputTwo));
            assertEquals(97,asciiCalc.asciiAdder(inputThree));
            assertEquals(49,asciiCalc.asciiAdder(inputFour));
            assertEquals(150,asciiCalc.asciiAdder(inputFive));
        });
    }

    @Test
    void asciiAdderHandlesOtherCharacters() {
        String inputOne = "!£$";
        String inputTwo = "./\\;";
        String inputThree = "./\\;a";

        assertAll(() -> {
            assertEquals(0, asciiCalc.asciiAdder(inputOne));
            assertEquals(0, asciiCalc.asciiAdder(inputTwo));
            assertEquals(97, asciiCalc.asciiAdder(inputThree));
        });
    }

    @Test
    void asciiAdderHandlesNullInput() {
        assertEquals(-1, asciiCalc.asciiAdder(null));
    }
}