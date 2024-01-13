package ex01;

/**
 * - Bài 1 (15đ): Viết hàm kiểm tra một số có phải là lũy thừa của một số khác
 * không
 * - VD: (8, 2)(true), (2, 8)(true), (6, 2)(false), (20, 4)(false), (64,
 * 4)(true)
 * - Method signature: boolean isPowerOf(int a, int b)
 */
public class IsPowerOf {
    public static void main(String[] args) {
        System.out.println(isPowerOf(8, 2));
        System.out.println(isPowerOf(2, 8));
        System.out.println(isPowerOf(6, 2));
        System.out.println(isPowerOf(20, 4));
        System.out.println(isPowerOf(64, 4));
    }

    private static boolean isPowerOf(int a, int b) {
        if (a == b) {
            return true;
        }
        int number = Math.max(a, b);
        int base = Math.min(a, b);
        if (base == 0) {
            return false;
        }
        while (base <= number) {
            if (base == number) {
                return true;
            }
            base *= Math.min(a, b);
        }
        return false;
    }
}
