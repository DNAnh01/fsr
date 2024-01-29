package manipulation;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03CrudArray {
    public static void main(String[] args) {
        int[] elements = { 1, 9, 5, 36, 12, 33 };
        try {
            int[] insertedElements = addWithOneLoop(elements, 999, 0);
            ArrayUtils.printf(insertedElements);

            int[] removedElements = remove(insertedElements, 2);
            ArrayUtils.printf(removedElements);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int[] remove(int[] source, int k) {
        if (k < 0 || k >= source.length) {
            throw new IllegalArgumentException("Inserted position must in [" + 0 + ", " + source.length + "]");
        }
        int[] target = new int[source.length - 1];

        // B1: Copy elements from i = 0 to less than k
        for (int i = 0; i < k; i++) {
            target[i] = source[i];
        }

        for (int i = k; i < target.length; i++) {
            target[i] = source[i + 1];
        }

        return target;
    }

    // thêm một phần tử mới vào mảng
    private static int[] add(int[] source, int newVal, int index) {

        if (index < 0 || index > source.length) {
            throw new IllegalArgumentException("Inserted position must in [" + 0 + ", " + source.length + "]");
        }

        int[] target = new int[source.length + 1];
        // B1: Copy all elements from preArray to newArray
        // 1 9 5 36 12 33 0
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
        System.out.println("B1: " + Arrays.toString(target));

        // B2: shift right one unit from index to source.length -1
        for (int i = target.length - 1; i > index; i--) {
            target[i] = target[i - 1];
        }
        System.out.println("B2: " + Arrays.toString(target));

        target[index] = newVal;
        System.out.println("B3: " + Arrays.toString(target));
        return target;
    }

    // thêm một phần tử mới vào mảng với 1 vòng lặp
    private static int[] addWithOneLoop(int[] source, int newVal, int index) {
        if (index < 0 || index > source.length) {
            throw new IllegalArgumentException("Inserted position must in [" + 0 + ", " + source.length + "]");
        }

        int[] target = new int[source.length + 1];
        for (int i = 0; i < target.length; i++) {
            if (i < index) {
                target[i] = source[i];
            } else if (i > index) {
                target[i] = source[i - 1];
            }
            target[index] = newVal;
        }
        System.out.println("addWithOneLoop: " + Arrays.toString(target));
        return target;
    }
}
