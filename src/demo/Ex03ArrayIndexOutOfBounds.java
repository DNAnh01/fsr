package demo;

/**
 * Bài toán: Vượt quá kích thước mảng
 */
public class Ex03ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        String[] elements = { "X123", "k27xi", "Z81jc" };
        printf(elements);
    }

    private static void printf(String[] elements) {
        /*
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
         * out of bounds for length 3
         * at demo.Ex03ArrayIndexOutOfBounds.printf(Ex03ArrayIndexOutOfBounds.java:22)
         * at demo.Ex03ArrayIndexOutOfBounds.main(Ex03ArrayIndexOutOfBounds.java:9)
         */
        for (int i = 0; i <= elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
