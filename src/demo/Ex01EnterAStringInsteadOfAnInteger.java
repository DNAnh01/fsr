package demo;

import java.util.Scanner;

/**
 * Bài toán: Nhập vào số nguyên --> chuỗi
 */
public class Ex01EnterAStringInsteadOfAnInteger {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");

        /*
         * Khi code thực thi bị exception, Java(JVM) nó sẽ quăng/show ra thông tin
         * của exception mình gặp phải và dừng toàn bộ chương trình
         * Expected: Khi bị exception thì sẽ xử lý lỗi, in ra thông tin lỗi cho người
         * dùng và tiếp tục chương trình
         * Exception in thread "main" java.lang.NumberFormatException: For input string:
         * "6a"
         * at java.base/java.lang.NumberFormatException.forInputString(
         * NumberFormatException.java:65)
         * at java.base/java.lang.Integer.parseInt(Integer.java:652)
         * at java.base/java.lang.Integer.parseInt(Integer.java:770)
         * at demo.Ex01.main(Ex01.java:14)
         * 
         * ==> printStackTrace
         */
        int number = Integer.parseInt(ip.nextLine());
        System.out.println("-----------");
        System.out.println("Value: " + number);
        System.out.println("Double Value: " + Math.pow(number, 2));
    }
}
