package ex02;

import java.util.Arrays;

public class LargestNumbers {
    public static void main(String[] args) {
        String s1 = "01a2b3456cde478";
        String s2 = "aa6b546c6e22h";
        String s3 = "aa6b326c6e22h";
        System.out.println(Arrays.toString(getLargestNumbers(s1, s2, s3)));
    }

    private static int[] getLargestNumbers(String... ss) {
        int[] rs = new int[ss.length];
        int count = 0;

        for (int i = 0; i < ss.length; i++) {
            int[] numbers = stringToInt(ss[i]);
            int max = getMax(numbers);
            rs[count++] = max;
        }
        Arrays.sort(rs);
        return Arrays.copyOfRange(rs, 0, count);
    }

    private static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    private static int[] stringToInt(String string) {
        String[] cuts = string.split("[a-z]+");
        System.out.println("cuts: " + cuts);
        int[] numbers = new int[cuts.length];
        for (int j = 0; j < numbers.length; j++) {
            if (cuts[j].equals("")) {
                continue;
            }
            numbers[j] = Integer.parseInt(cuts[j]);
        }
        return Arrays.copyOfRange(numbers, 0, numbers.length);
    }

}
