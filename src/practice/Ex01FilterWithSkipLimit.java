package practice;

import java.util.Arrays;

public class Ex01FilterWithSkipLimit {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3, 4, 5, 6, 2, 2, 1, 3, 4, 1 };
        Arrays.stream(digits)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------");
        if (digits.length > 3) {
            Arrays.stream(digits)
                    .distinct()
                    .sorted()
                    .skip(2)
                    .limit(3)
                    .forEach(System.out::println);

        }
    }

}
