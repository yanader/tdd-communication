package org.example;

public class OpinionCalc {

    // Create the Enum, return the Enum
    public Feedback calculateOpinion(Feedback[] arr) {
        if (arr.length % 2 == 0) {
            return Feedback.NEUTRAL;
        } else {
            return arr[arr.length - 1];
        }

    }
}
