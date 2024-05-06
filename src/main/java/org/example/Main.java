package org.example;

public class Main {
    public static void main(String[] args) {

        CheeseRace cr = new CheeseRace();

        String result = cr.race("---M-----K---C--", 6, 6);
        System.out.println(result);
    }
}