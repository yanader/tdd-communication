package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseRaceTest {

    CheeseRace cr;

    @BeforeEach
    void setup() {
        cr = new CheeseRace();
    }

    @Test
    void speedArgumentsAreValid() {
        String input = "---K-----M---C--";

        assertThrows(IllegalArgumentException.class, () -> {
            cr.race(input, -1, 1);
            cr.race(input, 1, -1);
        });
    }

    @Test
    void stringArgumentIsValid() {
        assertThrows(IllegalArgumentException.class, () ->{
           cr.race("------", 1, 1);
           cr.race("-C-M-K---", 1, 1);
           cr.race("-M C K-----", 1, 1);
           cr.race("--MM-CK---", 1, 1);
           cr.race("-KCM-----", 1, 1);
        });
    }

    @Test
    void raceCompletesCorrectly() {
        String input = "---K---M---C--";
        int catSpeed = 2;
        int mouseSpeed = 1;
        String expectedOutput = "Cheese party!";

        String actualOutput = cr.race(input, catSpeed, mouseSpeed);

        assertEquals(expectedOutput, actualOutput);
    }
}