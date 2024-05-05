package org.example;

public class ArrayProcessor {

    public int sumExcludingSmallestAndLargestElements(int[] arr) {
        if (arr.length < 3) return 0;
        int smallestElement = valueOfSmallestElement(arr);
        int largestElement = valueOfLargestElement(arr);
        int totalSumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != smallestElement && arr[i] != largestElement) {
                totalSumOfArray += arr[i];
            }
        }
        return totalSumOfArray;
    }

    private int valueOfSmallestElement(int[] arr) {
        int smallestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestElement) {
                smallestElement = arr[i];
            }
        }
        return smallestElement;
    }

    private int valueOfLargestElement(int[] arr) {
        int largestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                ;largestElement = arr[i];
            }
        }
        return largestElement;
    }
}
