package utils;

import bean.Item;

public class ArrayUtils {
    private ArrayUtils() {

    }

    public static void printf(Item[] items) {
        for (Item item : items) {
            System.out.println("\u001B[34m" + item + "\u001B[0m");
        }
        System.out.println();
    }

    public static void printf(String[] elements) {
        for (String element : elements) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public static void printf(int[] elements) {
        for (int element : elements) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number == 0 || number == 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void reverse(int[] elements) {
        int length = elements.length;
        for (int i = 0; i < length / 2; i++) {
            int tmp = elements[i];
            elements[i] = elements[length - i - 1];
            elements[length - i - 1] = tmp;
        }
    }
}
