package manipulation;

import utils.ArrayUtils;

public class Ex04Reverse {
    public static void main(String[] args) {
        int[] elements = { 33, 18, 22, 44, 20 };
        reverse(elements);

        ArrayUtils.printf(elements);
        // 20 44 22 18 33
    }

    private static void reverse(int[] source) {
        int length = source.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = source[i];
            source[i] = source[length - i - 1];
            source[length - i - 1] = temp;
        }
    }
}
