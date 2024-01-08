package structure;

public class Ex09 {
    /**
     * Biến trong Java: Kiểu dữ liệu nguyên thủy và kiểu dữ liệu đối tượng
     * 
     * Kiểu dữ liệu nguyên thủy:
     * - int, float, char, double: Dùng để lưu trữ giá trị nguyên thủy.
     * Được sử dụng khi chỉ cần lưu trữ một giá trị đơn.
     * 
     * Kiểu dữ liệu đối tượng:
     * - Integer, String, Double, Character: Wrapper class chứa một giá trị nguyên
     * thủy.
     * Sử dụng khi cần thao tác và xử lý đối tượng thay vì giá trị nguyên thủy.
     * - Item, CustomInteger: Wrapper class chứa thông tin của một đối tượng với các
     * thuộc tính bên trong.
     * Thường được tạo ra để đóng gói dữ liệu và logic xử lý liên quan.
     * 
     * Đối với kiểu dữ liệu đối tượng:
     * - Giá trị có thể là NULL hoặc NON-NULL, tùy thuộc vào việc có dữ liệu hoặc
     * không.
     * - Class: Biến (lưu trữ dữ liệu) và hàm (chức năng) có thể thuộc về một lớp cụ
     * thể.
     * 
     * >> Kế thừa (Extends): Collections
     * - Sử dụng để mở rộng tính năng của các collection trong Java, như ArrayList,
     * HashSet, etc.
     * 
     * >> Cơ sở dữ liệu: Lưu trữ dữ liệu (cột - kiểu dữ liệu) có thể tồn tại hoặc
     * không.
     * - Dữ liệu từ cơ sở dữ liệu được đổ vào ứng dụng (thuộc tính) để tạo ra các
     * đối tượng.
     */
    public static void main(String[] args) {
        char tmp = '1';
        System.out.println("is digit: " + Character.isDigit(tmp));
    }
}
