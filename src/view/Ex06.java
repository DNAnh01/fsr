package view;

import java.util.Arrays;

/**
 * 1. Find odd, prime numbers from input number list
 */
public class Ex06 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        int[] oddNumbers = findOddNumbers(numbers);
        System.out.println("odd numbers: " + Arrays.toString(oddNumbers));

        int[] primeNumbers = findPrimeNumbers(numbers);
        System.out.println("prime numbers: " + Arrays.toString(primeNumbers));
    }

    private static int[] findPrimeNumbers(int[] input) {
        int[] result = new int[input.length];
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (isPrimeNumber(input[i])) {
                result[count++] = input[i];
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }

    private static int[] findOddNumbers(int[] input) {
        int[] result = new int[input.length];
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (isOddNumber(input[i])) {
                result[count++] = input[i];
            }
        }

        return Arrays.copyOfRange(result, 0, count);
    }

    private static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    private static boolean isPrimeNumber(int number) {
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}