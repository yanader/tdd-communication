package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpinionCalcTest {

    OpinionCalc opinionCalc;

    @BeforeEach
    void setup() {
        opinionCalc = new OpinionCalc();
    }


    @Test
    void calculateOpinion() {
        Feedback[] inputOne = {Feedback.LIKE, Feedback.DISLIKE};
        Feedback[] inputTwo = {Feedback.LIKE};
        Feedback[] inputThree = {Feedback.DISLIKE, Feedback.DISLIKE};

        assertAll(() -> {
            assertEquals(Feedback.NEUTRAL, opinionCalc.calculateOpinion(inputOne));
            assertEquals(Feedback.LIKE, opinionCalc.calculateOpinion(inputTwo));
            assertEquals(Feedback.NEUTRAL, opinionCalc.calculateOpinion(inputThree));
        });

    }
}