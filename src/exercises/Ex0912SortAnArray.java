package exercises;

import java.util.Arrays;

public class Ex0912SortAnArray {

    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        // trường hợp cả hai không rỗng
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) { // a1 & a2 != rỗng
                if (a1[i1] < a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else { // a1 rỗng hoặc a2 rỗng
                if (i1 < a1.length) { // a1 oke
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else { // a2 oke
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int[] nums, int left, int right) {

        // bài toán cơ sở: xét các trường hợp đặt biệt và điều kiện dừng
        if (left > right) {
            return new int[0];
        }

        if (left == right) { // chia đến mỗi mảng là 1 phần tử
            int[] singleElement = { nums[left] };
            return singleElement;
        }

        // trường hợp tổng quát

        // chia ra
        System.out.println("chia: " + left + " - " + right);
        int k = (left + right) / 2;
        int[] a1 = mergeSort(nums, left, k);
        int[] a2 = mergeSort(nums, k + 1, right);

        // trộn vào: a1 và a2 là các mảng đã được sắp xếp
        int[] result = merge(a1, a2);
        System.out.println("ket qua merge: " + Arrays.toString(result));
        return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        // 5,2,3,1
        int[] nums = { 5, 2, 3, 1 };
        sortArray(nums);

        // 5,1,1,2,0,0
        int[] nums1 = { 5, 1, 1, 2, 0, 0 };
        sortArray(nums1);

        int[] nums3 = { -2, 3, -5 };
        sortArray(nums3);

    }
}
