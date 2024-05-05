package org.example;

public class AsciiValueCalculator {

    public int asciiAdder(String s){
        if (s == null) {
            return -1;
        }
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                total += c;
            }
        }
        return total;
    }
}
