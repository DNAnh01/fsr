package io;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random rd = new Random();
        String[] customers = {"Laika", "Edin", "Batona", "Boke"};

        int luckyIndex = rd.nextInt(customers.length);
        System.out.println("Lucky draw: " + customers[luckyIndex]);
    }
}
