package manipulation;

import static utils.ArrayUtils.printf;

import java.util.Arrays;

import functional.Predicate;

public class Ex01StrategyStep2 {
    public static void main(String[] args) {
        int[] digits = { 2, 5, 6, 11, 8, 10, 17, 19 };

        printf(digits);

        System.out.println("==================\n");

        Predicate oddStrategy = new Predicate() {
            @Override
            public boolean isValid(int input) {
                return input % 2 != 0;
            }
        };

        Predicate evenStrategy = new Predicate() {
            @Override
            public boolean isValid(int input) {
                return input % 2 == 0;
            }
        };

        Predicate primeStrategy = new Predicate() {

            private boolean isPrime(int num) {
                if (num == 0 || num == 1) {
                    return false;
                }
                for (int i = 2; i < Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public boolean isValid(int input) {
                return isPrime(input);
            }
        };

        printf(getNums(digits, oddStrategy));
        printf(getNums(digits, evenStrategy));
        printf(getNums(digits, primeStrategy));

    }

    // condition -> input: int -> output: boolean
    // Strategy strategy = oddStrategy;
    private static int[] getNums(int[] input, Predicate predicate) {
        int[] rs = new int[input.length];
        int count = 0;
        for (int i : input) {
            if (predicate.isValid(i)) {
                rs[count++] = i;
            }
        }
        return Arrays.copyOfRange(rs, 0, count);
    }
}
