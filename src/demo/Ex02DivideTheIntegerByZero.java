package demo;

import java.util.Scanner;

/**
 * Bài toán: Phép toán chia số nguyên cho 0
 */
public class Ex02DivideTheIntegerByZero {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a: ");
        int a = Integer.parseInt(ip.nextLine());

        System.out.print("Enter b: ");
        int b = Integer.parseInt(ip.nextLine());

        System.out.println("=========");

        int result = divide(a, b);
        System.out.println("Result: " + result);
    }

    private static int divide(int a, int b) {
        /*
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * at demo.Ex02DivideTheIntegerByZero.divide(Ex02DivideTheIntegerByZero.java:30)
         * at demo.Ex02DivideTheIntegerByZero.main(Ex02DivideTheIntegerByZero.java:20)
         */
        return a / b;
    }
}
