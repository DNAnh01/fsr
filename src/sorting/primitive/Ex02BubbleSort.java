package sorting.primitive;

import utils.ArrayUtils;

public class Ex02BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 1, 5, 11, 9, 4, 6 };

        bubbleSort(numbers);

        ArrayUtils.printf(numbers);
    }

    private static void bubbleSort(int[] elements) {
        for (int round = 0; round < elements.length; round++) {
            for (int j = 0; j < elements.length - round - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    int tmp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = tmp;
                }
            }
        }
    }
}