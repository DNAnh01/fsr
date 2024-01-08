package structure;

import java.util.Arrays;

/**
 * Viết phương thức - Tìm kiếm những phần tử lẻ trong mảng
 */
public class Ex11 {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 3, 29, 20 };
        int[] oddNumbers = findOddNumbers(numbers);
        System.out.println(Arrays.toString(oddNumbers));

    }

    private static int[] findOddNumbers(int[] elements) {
        // results = {0, 0, 0, 0, 0};
        int[] results = new int[elements.length];
        int run = 0;

        for (int element : elements) {
            if (element % 2 != 0) {
                System.out.println("run before: " + run);

                results[run++] = element;
                // result[run] = element; run++;
                System.out.println("run after: " + run);
            }
        }
        System.out.println("run: " + run);
        return Arrays.copyOfRange(results, 0, run);
    }
}
