package manipulation;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import functional.Predicate;
import utils.ArrayUtils;

public class Ex01StrategyStep3 {
    public static void main(String[] args) {
        int[] digits = { 2, 5, 6, 11, 8, 10, 17, 19 };
        printf(digits);

        Predicate oddNums = num -> num % 2 != 0;
        Predicate evenNums = num -> num % 2 == 0;
        Predicate primeNums = num -> ArrayUtils.isPrime(num);

        printf(getNums(digits, num -> num % 2 != 0));
        printf(getNums(digits, evenNums));
        printf(getNums(digits, num -> ArrayUtils.isPrime(num)));

    }

    private static int[] getNums(int[] digits, Predicate predicate) {
        int[] rs = new int[digits.length];
        int count = 0;
        for (int i : digits) {
            if (predicate.isValid(i)) {
                rs[count++] = i;
            }
        }
        return Arrays.copyOfRange(rs, 0, count);
    }
}
