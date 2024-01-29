package sorting.primitive;

import utils.ArrayUtils;

public class Ex03InsertionSort {
    public static void main(String[] args) {
        int[] numbers = { 4, 3, 2, 10, 12, 1, 5, 6 };
        insertionSort(numbers);
        ArrayUtils.printf(numbers);
    }

    private static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            for (int j = 0; j < i; j++) {
                if (elements[j] > elements[i]) {
                    int tmp = elements[j];
                    elements[j] = elements[i];
                    elements[i] = tmp;
                }
            }
        }
    }
}