package org.example;

public class CaeserCipher {

    public String cipher(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(rotateChar(s.charAt(i)));
        }
        return sb.toString();
    }


    private char rotateChar(char c) {
        // If the character isn't a letter, return it
        if (!Character.isLetter(c)) return c;
        // Calculate an adjuster that is based on whether the character is upper or lower case
        // This will convert ascii value down to 0 to 25
        int adjuster = Character.isUpperCase(c) ? 65 : 97;
        // Adjust character to 0-25 range then step up by 13.
        //This can alternatively have a key passed in as argument
        int total = c - adjuster + 13;
        // Take total % 26 to find the letter of the alphabet then add adjuster to get back up to ascii code
        return (char)(total % 26 + adjuster);
    }

}
