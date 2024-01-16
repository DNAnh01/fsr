package exercises;

import java.util.Arrays;

// 1538
public class Ex0283MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int currentIndex = 0;
        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {
                nums[currentIndex] = nums[i];
                currentIndex++;
            }

        }
        while (currentIndex < n) {
            nums[currentIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
