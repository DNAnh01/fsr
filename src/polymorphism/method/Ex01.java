package polymorphism.method;

/**
 * Polymorphism with method
 * 
 * --> Overloading
 * --> 2, nhiều hàm được gọi là overloading nếu
 * + Cùng thuộc 1 class
 * + Cùng tên hàm
 * ----------------------------------
 * - Khác số lượng tham số truyền vào
 * - Khác KDL truyền vào của tham số
 */
public class Ex01 {
    public static void main(String[] args) {
        int x = min(1, 1);
        int y = min(1, 2, 3);
        float z = min(1.1f, 2.2f);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    // private static String min(int a, int b) {
    // return "value";
    // }

    private static float min(float a, float b) {
        return a < b ? a : b;
    }

    private static int min(int a, int b, int c) {
        int min = a < b ? a : b;
        return min < c ? min : c;
    }
}