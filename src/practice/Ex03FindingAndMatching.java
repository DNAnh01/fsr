package practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex03FindingAndMatching {
    public static void main(String[] args) {
        // Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
        int[] numbers = { 1, 2, 18, 4, 5, 8, 10, 4, 12 };

        // có phần tử nào chia hết cho 10 không ?
        boolean isDivBy10 = Arrays.stream(numbers)
                .anyMatch(num -> num % 10 == 0);
        System.out
                .println("\u001B[35m" + "1st: is there element that is divisible by 10: " + isDivBy10 + "\u001B[0m");

        // tìm phần tử đầu tiên chia hết cho 4

        OptionalInt optionalInt = Arrays.stream(numbers)
                .filter(num -> num % 4 == 0)
                .findFirst();
        if (optionalInt.isPresent()) {
            int rs = optionalInt.getAsInt();
            System.out.println(rs);
        }
    }
}
