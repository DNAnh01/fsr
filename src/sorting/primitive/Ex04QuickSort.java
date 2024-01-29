package sorting.primitive;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04QuickSort {
    public static void main(String[] args) {
        int[] numbers = { 4, 3, 2, 10, 12, 1, 5, 6 };

        // Java Quick Sort
        Arrays.sort(numbers);

        ArrayUtils.reverse(numbers);

        ArrayUtils.printf(numbers);
    }
}