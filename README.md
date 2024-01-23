### Các câu hỏi có thể phỏng vấn

#### 1. Trong Java, có 3 loại exception

- Checked exception (Compile-time exception): Là các exception bắt buộc phải được xử lý tại thời điểm biên dịch. Nếu không được xử lý, chương trình sẽ không thể biên dịch thành công.

- Unchecked exception (Runtime exception): Là các exception không bắt buộc phải được xử lý tại thời điểm biên dịch. Nếu không được xử lý, chương trình sẽ vẫn có thể biên dịch thành công nhưng sẽ gặp lỗi tại thời điểm chạy.

- Error (Fatal error): Là các exception nghiêm trọng xảy ra tại thời điểm chạy mà không thể được xử lý. Ví dụ như lỗi phần cứng, tràn bộ nhớ, lỗi của JVM,...

#### 2. Phân biệt các loại exception

| Loại exception      | Đặc điểm                                               | Ví dụ                                                                          |
| ------------------- | ------------------------------------------------------ | ------------------------------------------------------------------------------ |
| Checked exception   | Bắt buộc phải được xử lý tại thời điểm biên dịch       | IOException, ClassNotFoundException, SQLException, ...                         |
| Unchecked exception | Không bắt buộc phải được xử lý tại thời điểm biên dịch | ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, ... |
| Error               | Không thể được xử lý                                   | OutOfMemoryError, StackOverflowError, ...                                      |

#### 3. Cách xử lý exception, có 3 cách xử lý exception trong Java:

- Try/Catch

- Throw/Throws

- Validation

##### Try/Catch là cách xử lý exception phổ biến nhất trong Java. Cách sử dụng như sau:

```java
try {
  // Code có thể xảy ra ngoại lệ
} catch (Exception e) {
  // Xử lý ngoại lệ
}
```

##### Throw/Throws là cách xử lý exception bằng cách ném ngoại lệ từ phương thức lên phương thức gọi. Cách sử dụng như sau:

```java
public class ThrowThrowsExample {

  public static void main(String[] args) {
    try {
      divide(10, 0);
    } catch (ArithmeticException e) {
      System.out.println("Số bị chia không được bằng 0");
    }
  }

  public static void divide(int x, int y) throws ArithmeticException {
    if (y == 0) {
      throw new ArithmeticException("Số bị chia không được bằng 0");
    }
    System.out.println(x / y);
  }
}
```

##### Validation là cách xử lý exception bằng cách kiểm tra điều kiện trước khi thực hiện code có thể xảy ra ngoại lệ. Cách sử dụng như sau:

```java
public class ValidationExample {

  public static void main(String[] args) {
    int x = Integer.parseInt("10");
    int y = Integer.parseInt("2");

    if (x > 0 && y > 0) {
      divide(x, y);
    } else {
      System.out.println("Số không hợp lệ");
    }
  }

  public static void divide(int x, int y) {
    System.out.println(x / y);
  }
}
```

#### 4. Finally là gì và khi nào sử dụng

- Finally là một khối code được thực thi bất kể ngoại lệ có xảy ra hay không. Khối finally thường được sử dụng để thực hiện các tác vụ dọn dẹp, chẳng hạn như đóng kết nối database, giải phóng tài nguyên,...

#### 5. Phân biệt final và finally

- Final và finally là hai từ khóa quan trọng trong Java nhưng có ý nghĩa hoàn toàn khác nhau.

- Final được sử dụng để chỉ định một biến, phương thức hoặc lớp là không thể thay đổi.

- Finally được sử dụng để chỉ định một khối code được thực thi bất kể ngoại lệ có xảy ra hay không.

```java
// Sử dụng final
final int x = 10;
// Thử thay đổi giá trị của x
x = 20; // Lỗi: Variable x is final and cannot be assigned.

// Sử dụng finally
try {
  // Code có thể xảy ra ngoại lệ
} finally {
  // Các tác vụ dọn dẹp
}
```

#### 6. Phân biệt final và finally

#### 7.Tại sao sử dụng serialVersionUID?

```java
public class ZeroException extends Exception {
    static final long serialVersionUID = -3387516993124229948L;
    public ZeroException(String message) {
        super(message);
    }
}
```

- Khi một đối tượng được tuần tự hóa (ví dụ: lưu vào file, truyền qua mạng), JVM sẽ ghi lại giá trị serialVersionUID của lớp đó vào trong dữ liệu tuần tự hóa.

- Khi đối tượng được khôi phục lại từ dữ liệu tuần tự hóa, JVM sẽ so sánh serialVersionUID của lớp hiện tại với serialVersionUID được ghi trong dữ liệu tuần tự hóa.

- Nếu hai giá trị này khớp nhau, JVM sẽ coi đó là cùng một lớp và có thể khôi phục đối tượng một cách an toàn.

- Nếu hai giá trị này không khớp nhau, JVM sẽ coi đó là các lớp khác nhau và có thể ném ra ngoại lệ InvalidClassException.

### Kết luận

- Phân biệt các loại exception là một kiến thức quan trọng trong Java. Việc phân biệt các loại exception giúp lập trình viên có thể xử lý ngoại lệ một cách hiệu quả.
