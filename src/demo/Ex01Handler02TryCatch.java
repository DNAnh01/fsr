package demo;

import java.util.Scanner;

/**
 * Bài toán: Nhập vào số nguyên --> chuỗi
 * ==> Sử dụng try catch
 */
public class Ex01Handler02TryCatch {

    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int number = 0;
        do {
            try {
                number = Integer.parseInt(ip.nextLine());
                System.out.println("After entering ...");
                break;
            } catch (NumberFormatException numberFormatException) {
                // 1. In ra thông tin lỗi, dòng lỗi
                // 2. Xử lý lỗi
                // System.out.println("Hello - Something wrong with your code ...");
                // System.out.println("Log error --> " + nfe.getMessage());
                numberFormatException.printStackTrace();
                System.out.print("Invalid number, enter again: ");
            }
        } while (true);

        // Đặt đoạn code có khả năng xảy ra ngoại lệ trong khối try, và khi nếu xảy ra
        // ngoại lệ thì
        // chương trình sẽ nhảy vào khối catch sau đó tiếp tục thực thi

        // nếu đoạn code trong khối try không xảy ra ngoại lệ thì chương trình không
        // nhảy vào khối catch mà
        // thực hiện như bình thường

        System.out.println("===============");

        System.out.println("Value: " + number);
        System.out.println("Double Value: " + Math.pow(number, 2));
    }
}