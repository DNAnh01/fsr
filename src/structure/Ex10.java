package structure;

public class Ex10 {
    /**
     * Kiểu dữ liệu mảng (Array) trong Java:
     * + Lưu trữ tập hợp các phần tử có cùng kiểu dữ liệu.
     * . Mảng có số lượng phần tử cố định.
     * . Mỗi phần tử trong mảng có thể được truy cập thông qua chỉ số (index).
     * . Được sử dụng để quản lý và thao tác trên các tập hợp dữ liệu có cấu trúc
     * đồng nhất.
     * 
     * Ví dụ:
     * + int[] numbers = new int[5]; // Khởi tạo mảng số nguyên với 5 phần tử
     * + String[] names = {"Alice", "Bob", "Charlie"}; // Khởi tạo mảng chuỗi với
     * giá trị khởi đầu
     * 
     * Thao tác với mảng:
     * + Gán giá trị cho phần tử trong mảng:
     * . numbers[0] = 10;
     * . names[2] = "David";
     * 
     * + Truy cập giá trị của phần tử trong mảng:
     * . int value = numbers[1];
     * . String name = names[0];
     * 
     * + Độ dài của mảng:
     * . int length = numbers.length; // Trả về số lượng phần tử trong mảng numbers
     * . int namesLength = names.length; // Trả về số lượng phần tử trong mảng names
     * 
     * Lưu ý: Index của mảng bắt đầu từ 0 và kết thúc tại (độ dài mảng - 1).
     */
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng số nguyên có 6 phần tử
        // Giá trị mặc định sẽ phụ thuộc và KDL của mảng
        int[] a = new int[6];
        a[2] = 8;
        System.out.println("Giá trị tại phần tử a[2]: " + a[2]);

        // Khai báo và khởi tạo giá trị cho mảng
        // Length của mảng = số lượng phần tử mình khởi tạo
        // Length = 5
        int[] b = { 5, 7, 9, 12, 4 };
        System.out.println("length: " + b.length);

        // Cho danh sách, mảng các phần tử số nguyên
        // Tìm những số là bội của 3 và in ra

        // Duyệt: forIndex(duyệt theo chỉ số), forEach(duyệt theo giá trị)

        // forEach
        for (int element : b) {
            if (element % 3 == 0) {
                System.out.print(element + "  ");
            }
        }

        System.out.println("\n================");
        // forIndex
        for (int i = 0; i < b.length; i++) {
            int element = b[i];
            if (element % 4 == 0) {
                System.out.print(element + "  ");
            }
        }
    }
}
