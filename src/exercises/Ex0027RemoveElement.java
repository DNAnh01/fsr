package exercises;

import java.util.Arrays;

// xoá phần tử trong mảng

// b1: duyệt mảng
public class Ex0027RemoveElement {

    public static int removeElement(int[] a, int val) {
        int n = a.length;
        for (int i = 0; i < n;) {
            if (a[i] == val) {
                for (int j = i; j < (n - 1); j++) {
                    a[j] = a[j + 1];
                }
                // điều này có nghĩa là sau khi xóa xong thì chỉ giảm đi n và i
                // không
                // được tăng
                n--;
            } else {
                // nếu như ta xóa phần tử đó và phần tử sau dồn lên thì ta lại
                // xét
                // phần tử tại index đó

                // nếu như phần tử đó ko được xóa thì ta tăng i lên như bth
                // còn nếu như được xóa rồi thì ta ko tăng i để chạy lại

                i++;
            }
        }
        return n;
    }

    // SỬ DỤNG KỸ THUẬT HAI CON TRỎ
    public static int removeElement2(int[] a, int val) {
        int n = a.length;
        int k = 0;
        for (int i = 0; i < n;) {
            if (a[i] != val) {
                a[k] = a[i];
                i++;
                k++;
            } else {
                i++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] n = { 3, 2, 2, 3 };
        System.out.println(removeElement(n, 2));
        System.out.println(Arrays.toString(n));
    }
}
