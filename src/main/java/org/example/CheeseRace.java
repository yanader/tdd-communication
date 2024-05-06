package org.example;

import java.util.Arrays;

public class CheeseRace {

    public String race(String input, int catSpeed, int mouseSpeed) {
        if (catSpeed < 0 || mouseSpeed < 0) {
            throw new IllegalArgumentException("Speed can't be negative");
        }
        if (!stringInputIsValid(input)) {
            throw new IllegalArgumentException("String is invalid");
        }
        int[] positions = arrayRepresentation(input);
        while (positions[0] < positions[1] && positions[1] < positions[2]) {
            updatePosition(positions, catSpeed, mouseSpeed);
        }
        return assessPosition(positions);
    }

    private String assessPosition(int[] arr) {
        int cat = arr[0];
        int mouse = arr[1];
        int cheese = arr[2];

        if (cat >= cheese && mouse >= cheese) {
            return Result.TIE.toString();
        }
        if (cat >= mouse && mouse < cheese) {
            return Result.CAT_WIN.toString();
        }
        if (cat < mouse && mouse >= cheese) {
            return Result.MOUSE_WIN.toString();
        }
        return null;
    }

    private void updatePosition(int[] arr, int catSpeed, int mouseSpeed){
        arr[0] = Math.min(arr[0] + catSpeed, arr[2]);
        arr[1] = Math.min(arr[1] + mouseSpeed, arr[2]);
    }

    // Returns and int array version of the input string where...
    // arr[0] = Cat position
    // arr[1] = Mouse position
    // arr[2] = Cheese position
    private int[] arrayRepresentation(String s) {
        int k = s.indexOf('K');
        int m = s.indexOf('M');
        int c = s.indexOf('C');
        return new int[]{k, m, c};
    }



    // Checks the validity of the string input.
    // Validity requires
    //      1 instance of each 'K', 'M' & 'C'
    // 'K' before 'M' and 'M' before 'C'
    private boolean stringInputIsValid(String input) {
        if (instancesOfChar(input, 'K') != 1) return false;
        if (instancesOfChar(input, 'M') != 1) return false;
        if (instancesOfChar(input, 'C') != 1) return false;
        if (!(input.indexOf('K') < input.indexOf('M'))) return false;
        if (!(input.indexOf('M') < input.indexOf('C'))) return false;
        return true;
    }



    // Returns the number of instances of character c in String s
    private int instancesOfChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }


}
