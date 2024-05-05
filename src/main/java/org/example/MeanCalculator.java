package org.example;

public class MeanCalculator {

    public double mean(int[] arr) {
        if (arr.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
