package exercises;

import java.util.Arrays;

public class Ex0344ReverseString {

    public static void swap(char[] arr, int i, int j) {
        if (i < j) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            swap(arr, i + 1, j - 1);

        }
    }

    public static void reverseString(char[] s) {
        swap(s, 0, s.length - 1);
    }

    public static void reverseString2(char[] s) {
        int a = 0;
        int b = s.length - 1;
        while (a < b) {
            char temp = s[b];
            s[b] = s[a];
            s[a] = temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        char[] s = { '1', '2', '3', '4', '5' };
        reverseString2(s);
        System.out.println(Arrays.toString(s));
    }
}
