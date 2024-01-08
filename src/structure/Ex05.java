package structure;

// Operator '=' >> 100% used at STACK
// int: always have value: default 0
// Integer: has value or not(NULL)
public class Ex05 {
    public static void main(String[] args) {
        // JAVA: Integer, Long, Double, Float, String ...

        // testing primitive & object
        // Immutable class: Unable to update value IN HEAP
        // Integer salary = new Integer(9)

        Integer offer = 15;

        // lấy địa chỉ của đối tượng trong bộ nhớ
        System.out.println("hash offer: " + System.identityHashCode(offer));

        // HEAP: NORMAL MEMORY || CONSTANT POOL(IMMUATABLE VALUES)
        // HEAP: NORMAL MEMORY: Bộ nhớ Heap được sử dụng để lưu trữ đối tượng và dữ liệu
        // cấp phát động.
        // CONSTANT POOL(IMMUTABLE VALUES): Một phần của bộ nhớ Heap sử dụng để lưu trữ
        // giá trị không thay đổi (immutable values).

        Integer salary = 9;
        System.out.println("hash salary 01: " + System.identityHashCode(salary)); // hash salary 01: 1500056228

        salary = 13;
        System.out.println("hash salary 02: " + System.identityHashCode(salary)); // hash salary 02: 1749186397
        System.out.println("salary 2021: " + salary); // salary 2021: 13

        anualReview(salary);
        System.out.println("salary 2022: " + salary); // salary 2022: 13
    }

    // Integer currentSalary = salary;
    private static void anualReview(Integer currentSalary) {
        currentSalary = 18;
        System.out.println("current salary: " + currentSalary); // current salary: 18
    }
}
/**
 * Ghi Chú và Câu Hỏi Phỏng Vấn:
 * 
 * 1. Toán Tử Gán (`=`) và Bộ Nhớ STACK: Toán tử '=' được sử dụng tại STACK để
 * cập nhật giá trị biến.
 * 
 * 2. Kiểu Dữ Liệu `Integer` và Immutable Class: Integer là một kiểu dữ liệu đối
 * tượng không thể cập nhật giá trị trong HEAP.
 * 
 * -> Trong Java, các immutable class là những lớp không cho phép thay đổi giá
 * trị của các đối tượng sau khi chúng được khởi tạo. Một khi một đối tượng
 * immutable được tạo ra, giá trị của nó không thể thay đổi. Dưới đây là một số
 * immutable class phổ biến trong Java:
 * 
 * String:Đối tượng String trong Java là immutable. Khi bạn thay đổi giá trị của
 * một chuỗi, một đối tượng chuỗi mới sẽ được tạo ra.
 * 
 * Integer, Long, Short, Byte, Double, Float: Các lớp dữ liệu số nguyên và số
 * thực như Integer, Long, Double, v.v., đều là immutable. Khi bạn thay đổi giá
 * trị của một số, một đối tượng mới sẽ được tạo.
 * 
 * 
 * 3. Địa Chỉ của Đối Tượng Trong Bộ Nhớ: System.identityHashCode() được sử dụng
 * để lấy địa chỉ của đối tượng.
 * 
 * 4. Bộ Nhớ HEAP: NORMAL MEMORY || CONSTANT POOL(IMMUTABLE VALUES): HEAP lưu
 * trữ đối tượng, Constant Pool lưu trữ giá trị không thay đổi.
 * 
 * 5. Thay Đổi Giá Trị và Bộ Nhớ Heap: Thay đổi giá trị của salary trong phương
 * thức anualReview() không ảnh hưởng đến giá trị của salary trong main().
 */
