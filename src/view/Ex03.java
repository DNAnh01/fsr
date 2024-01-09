package view;

public class Ex03 {
    private static int val = 1;

    private static void printVal(int val) {
        System.out.println("value: " + val);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Ex03.printVal(val);

        int sum = Ex03.sum(12, 14);
        System.out.println("Sum: " + sum);

        /**
         * 1. Phương thức Non-Static (Instance Method):
         * 
         * + Cần một thể hiện (instance) của lớp để gọi phương thức. Điều này có nghĩa
         * là bạn phải tạo một đối tượng từ lớp đó và sau đó sử dụng đối tượng để gọi
         * phương thức.
         * 
         * + Có thể truy cập các biến thành viên (instance variables) của lớp.
         * 
         * + Thường được sử dụng để thực hiện các hoạt động có liên quan đến trạng thái
         * của đối tượng cụ thể.
         * 
         * 2. Phương thức Static:
         * 
         * + Không yêu cầu tạo một thể hiện của lớp để gọi phương thức. Bạn có thể gọi
         * phương thức trực tiếp thông qua tên lớp.
         * 
         * + Không thể truy cập các biến thành viên không static trực tiếp từ phương
         * thức static vì phương thức static không có thể truy cập vào trạng thái của
         * một thể hiện cụ thể.
         * 
         * + Thường được sử dụng khi phương thức không cần truy cập hoặc thay đổi trạng
         * thái của đối tượng.
         */
    }
}
