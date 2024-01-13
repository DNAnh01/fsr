package ex02;

/**
 * - Bài 2 (15đ): Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak =
 * [1, n].
 * Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
 * - VD1: n = 6, Ak = [3, 2, 1, 6, 5]
 * - Phần tử cần tìm có giá trị: 4
 * - VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
 * - Phần tử cần tìm có giá trị: 8
 * - Method signature: int getMissingNumber(...)
 */
public class GetMissingNumber {
    public static void main(String[] args) {
        int[] array1 = { 3, 2, 1, 6, 5 };
        int n1 = 6;
        System.out.println(getMissingNumber(n1, array1));
        int[] array2 = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
        int n2 = 10;
        System.out.println(getMissingNumber(n2, array2));
    }

    private static int getMissingNumber(int n, int[] arr) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}
