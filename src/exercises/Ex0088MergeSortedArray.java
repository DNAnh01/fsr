package exercises;

import java.util.Arrays;

// insert elements into array
public class Ex0088MergeSortedArray {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int i : n2) {
            insertElementsIntoArray(i, n1, m);
            m++;
        }
    }

    private static void insertElementsIntoArray(int x, int[] a, int m) {
        boolean foundK = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                foundK = true;
                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }
        }
        if (foundK == false) {
            a[m] = x;
        }
    }

    // use the two cursor technique
    public static void merge2(int[] n1, int m, int[] n2, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (k >= 0) {
            if (j < 0) {
                n1[k] = n1[i];
                i--;
            } else if (i < 0) {
                n1[k] = n2[j];
                j--;
            } else if (n1[i] > n2[j]) {
                n1[k] = n1[i];
                i--;
            } else {
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 4, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge2(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
