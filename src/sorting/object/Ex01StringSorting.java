package sorting.object;

import static utils.ArrayUtils.*;

public class Ex01StringSorting {
    public static void main(String[] args) {
        String[] sequences = { "1", "0", null, "x", "a", "b", null, "10", "2" };

        sortNullFirst(sequences);
        printf(sequences);
        sortNullLast(sequences);
        printf(sequences);
    }

    // null-first
    private static void sortNullFirst(String[] elements) {
        int len = elements.length;
        for (int right = len - 1; right > 0; right--) {
            for (int left = 0; left < right; left++) {
                if (elements[right] == null && elements[left] != null) {
                    String tmp = elements[left];
                    elements[left] = elements[right];
                    elements[right] = tmp;
                    continue;
                }
                if (elements[left] == null) {
                    continue;
                }
                if (elements[left].compareTo(elements[right]) < 0) {
                    String tmp = elements[left];
                    elements[left] = elements[right];
                    elements[right] = tmp;
                }
            }
        }
    }

    // null-last
    private static void sortNullLast(String[] elements) {
        int len = elements.length;

        for (int right = len - 1; right > 0; right--) {

            for (int left = 0; left < right; left++) {

                if (elements[left] == null && elements[right] != null) {
                    String temp = elements[left];
                    elements[left] = elements[right];
                    elements[right] = temp;
                    continue;
                }
                if (elements[right] == null) {
                    continue;
                }
                if (elements[left].compareTo(elements[right]) > 0) {
                    String temp = elements[left];
                    elements[left] = elements[right];
                    elements[right] = temp;
                    continue;
                }
            }
        }
    }
}
