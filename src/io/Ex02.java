package io;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rd = new Random();


        int randWithoutBound = rd.nextInt();
		System.out.println("randWithoutBound: " + randWithoutBound);
		
		int randWithBoundedRange = rd.nextInt(10); // [0 - bound)
		System.out.println("randWithBoundedRange: " + randWithBoundedRange);
		
		// [a - b], 100 - 120
		// a + rd.nextInt(b-a+1)
		int number = 100 + rd.nextInt(21);
		System.out.println("number: " + number);
    }
}
