package algorithms;

/**
 * 1. sử dụng đệ quy làm hao tốn về mặt thời gian và không gian bộ
 * nhớ
 * 
 * -> 1. tối ưu đệ quy bằng phương pháp đệ quy có nhớ
 * -> 2. khử đệ quy
 * 
 * 2. Phân loại:
 * 2.1 Not returns result:
 * + cần phải lưu kết quả đang tính tại một chỗ nào đó
 * + sử dụng hầu hết cho các bài toán (nếu có sử dụng đệ quy)
 * + những bài toán hay lưu kết quả (DP, ad-hoc,...)
 * 
 * 
 * 2.2 returns result
 * + áp dụng cho những CTDL có tính đệ quy (linked list, tree)
 * + ngắn gọn, sạch sẽ, dễ hiểu
 */
public class Recursion {
    private static int factorial(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int t = number * factorial(number - 1);
        // System.out.println(t);
        return t;
    }

    private static int fibonacci(int n) {
        System.out.println("can tinh f[" + n + "]");
        if (n <= 2) {
            return 1;
        }
        int fn = fibonacci(n - 1) + fibonacci(n - 2);
        return fn;
    }

    // đệ quy có nhớ
    static int[] f = new int[1000];

    private static int fibonacci2(int n) {
        if (f[n] != 0) {
            return f[n];
        }
        System.out.println("can tinh f[" + n + "]");
        if (n <= 2) {
            f[1] = 1;
            f[2] = 1;

            return 1;
        }
        f[n] = fibonacci2(n - 1) + fibonacci2(n - 2);
        return f[n];
    }

    // bài toán tìm max trong một mảng
    private static int currentMax = Integer.MIN_VALUE;

    // không trả về kết quả
    public static void findMaxNumberNotReturnsResult(int[] arr, int i) {
        if (i < arr.length) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
            findMaxNumberNotReturnsResult(arr, i + 1);
        }
    }

    // có trả về kết quả (trả về giá trị lớn nhất hiện tại tại thời
    // điểm mà nó đang xét)
    public static int findMaxNumberReturnsResult(int[] arr, int i, int previousMax) {
        if (i < arr.length) {
            currentMax = Math.max(previousMax, arr[i]);
            return findMaxNumberReturnsResult(arr, i + 1, currentMax);
        }
        return previousMax;
    }

    public static void main(String[] args) {
        // System.out.println(4 + "! = " + factorial(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci2(5));

        // khử đệ quy
        // F[10]

        int[] Fibo = new int[11];
        // bài toán cơ sở
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int i = 3; i <= 10; i++) {
            // công thức quy nạp
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        System.out.println("F[10]: " + Fibo[10]);

        System.out.println("bài toán tìm max trong một mảng");
        int[] arr = { 1, 2, 3, 54, 21, 4, 1, 4, 1, 6 };
        System.out.println(findMaxNumberReturnsResult(arr, 0, -1));
    }
}
