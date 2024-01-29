package manipulation;

import static utils.ArrayUtils.*;

import java.util.Arrays;

/**
 * Viết chương trình tìm những ... trong mảng
 * + Phần tử lẻ
 * + Phần tử chẵn
 * + Phần tử là số nguyên tố
 * .........................
 * + Phần tử là bội của 5
 */
public class Ex01StrategyStep1 {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3, 4, 51, 7, 8, 9 };
        printf(digits);

        int[] oddNumbers = getOddNumbers(digits);
        printf(oddNumbers);

        int[] evenNumbers = getEvenNumbers(digits);
        printf(evenNumbers);

        int[] primeNumbers = getPrimeNumbers(digits);
        printf(primeNumbers);
    }

    private static int[] getPrimeNumbers(int[] digits) {
        int[] rs = new int[digits.length];
        int count = 0;
        for (int num : digits) {
            if (isPrime(num)) {
                rs[count++] = num;
            }
        }
        return Arrays.copyOfRange(rs, 0, count);

    }

    private static int[] getEvenNumbers(int[] digits) {
        int[] rs = new int[digits.length];
        int count = 0;

        for (int num : digits) {
            if (num % 2 == 0) {
                rs[count++] = num;
            }
        }
        return Arrays.copyOfRange(rs, 0, count);
    }

    private static int[] getOddNumbers(int[] digits) {
        int[] rs = new int[digits.length];
        int count = 0;

        for (int num : digits) {
            if (num % 2 != 0) {
                rs[count++] = num;
            }
        }
        return Arrays.copyOfRange(rs, 0, count);
    }

}
