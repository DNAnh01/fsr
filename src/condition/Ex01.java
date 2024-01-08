package condition;

/**
 * Given three integers a, b, c. Write a program to find the largest number,
 * smallest number and remaining number
 */
public class Ex01 {
    public static void main(String[] args) {
        int first = 1;
        int second = 18;
        int third = 5;

        Pair pair = getMinMax(first, second, third);

        System.out.println("\u001B[34m" + "max: " + pair.max + "\u001B[0m");
        System.out.println("\u001B[34m" + "min: " + pair.min + "\u001B[0m");

    }

    private static Pair getMinMax(int first, int second, int third) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (first > second) {
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }
        if (max < third) {
            max = third;
        }
        if (min > third) {
            min = third;
        }

        return new Pair(min, max);

    }
}