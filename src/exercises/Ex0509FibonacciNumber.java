package exercises;

public class Ex0509FibonacciNumber {

    // recursion
    public static int fib(int n) {
        // System.out.println("fib[" + n + "]");
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    // recursion with memoization

    public static int fib2(int n) {
        int[] f = new int[31];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(fib2(5));
    }
}
