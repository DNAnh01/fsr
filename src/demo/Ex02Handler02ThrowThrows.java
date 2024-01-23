package demo;

import java.util.Scanner;

/**
 * Bài toán: Phép toán chia số nguyên cho 0
 * ==> Xử lý với throw, throws và try catch
 */
public class Ex02Handler02ThrowThrows {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a: ");
        int a = Integer.parseInt(ip.nextLine());

        System.out.print("Enter b: ");
        int b = Integer.parseInt(ip.nextLine());

        System.out.println("=========");

        // Place 01 --> Yêu cầu nhập vào a và b bất kỳ
        // divide(a, b) --> phải bắt lỗi

        // Place 02 --> Yêu cầu nhập vào a và b là các số nguyên dương
        // divide(a, b)

        int result = 0;
        try {
            result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Log error: " + e.getMessage());
        }

        // best practice --> try catch
        divide(a, b);
    }

    // Hàm --> có thể được gọi từ nhiều nơi
    // Mỗi nơi sẽ truyền giá trị của tham số khác nhau
    // throws RuntimeException là thừa --> Vì có throw hay không cũng ko bắt buộc
    // try catch bên ngoài
    private static int divide(int a, int b) /* no need */ {
        // Thường mình sẽ sử dụng throw, throws với hàm có khả năng bị ngoại lệ
        // Vì hàm có khả năng = chưa chắc đã xảy ra ngoại lệ cho nên mình sẽ không xử
        // lý(try/catch) ngoại lệ trực tiếp trong hàm này
        // Mà sẽ ném đi chỗ khác (chỗ nào mà đang gọi nó)
        if (b == 0) {
            throw new ArithmeticException("\u001B[31m" + "Hello - It's me who throws the error" + "\u001B[0m");
            // không thực thi code còn lại trong hàm
            // nếu như tại chỗ gọi hàm này có bắt lỗi thì sẽ lấy thông tin của lỗi này và in
            // ra
            // nếu không bắt lỗi thì chương trình sẽ dừng lại
        }
        return a / b;
    }
}
