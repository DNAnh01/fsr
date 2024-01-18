package exercises;

// duyệt mảng
public class Ex1295FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int numberOfDigits = calculateTheNumberOfDigit(num);
            if (numberOfDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int calculateTheNumberOfDigit(int num) {
        int count = 0;
        int result = num;
        while (result != 0) {
            result = num / 10;
            num = result;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums_case1 = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums_case1));
        int[] nums_case2 = { 555, 901, 482, 1771 };
        System.out.println(findNumbers(nums_case2));

    }
}
