package ex03;

/**
 * - Bài 3 (20đ): Cho mảng A gồm n phần tử (2 < n < 20). Ak = [1, 10]
 * Tìm bội chung nhỏ nhất của các phần tử trong mảng
 * - VD1: Ak = [2, 3] >> BCNN = 6
 * - VD2: Ak = [2, 3, 4] >> BCNN = 12
 * - Method signature: int getLeastCommonMultiple(....)
 */
public class GetLeastCommonMultiple {
    public static void main(String[] args) {
        //
        // 2
        // 2 3
        // 2 3 4 5
        System.out.println("lcm: " + leastCommonMultiple(new int[] { 3, 6, 7 }));
    }

    // 4 6
    // 4 = 2^2
    // 6 = 2 * 3
    // = 2^2 * 3 = 12

    // 12 15

    // 12 = 2^2 * 3
    // 15 = 3 * 5
    // = 2^2 * 3 * 5 ==> 60

    // UCLN: 2
    // (4*6)/2 = 12
    private static int leastCommonMultiple(int[] numbers) {
        int length = numbers.length;
        if (length == 0) {
            return Integer.MIN_VALUE;
        }
        if (length == 1) {
            return numbers[0];
        }
        int lcm = leastCommonMultiple(numbers[0], numbers[1]);
        for (int i = 2; i < length; i++) {
            lcm = leastCommonMultiple(lcm, numbers[i]);
        }
        return lcm;
    }

    private static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonMultiple(a, b);
    }

    private static int greatestCommonMultiple(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

}
