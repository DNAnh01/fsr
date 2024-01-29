```java
package functional;

@FunctionalInterface
public interface Predicate {
    boolean isValid(int input);
}
```

##### Interface Predicate:

- @FunctionalInterface: Annotation này đánh dấu đây là một functional interface, nghĩa là chỉ chứa một phương thức abstract.

- Tên: Tên Predicate có thể đặt tùy ý, nó thể hiện vai trò kiểm tra một điều kiện nào đó.

- Phương thức isValid(int input):
  - Đây là phương thức abstract duy nhất của interface.
  - Nhận một tham số input kiểu int và trả về boolean (true nếu hợp lệ, false nếu không).
  - Sẽ được triển khai cụ thể khi đối tượng được tạo.

##### Giải thích về Functional Interface và Lambda Expression:

- Functional Interface:

  - Interface chỉ chứa một phương thức abstract.
  - Có thể sử dụng lambda expression để tạo đối tượng một cách ngắn gọn.

- Lambda Expression:

  - Một cách ngắn gọn để tạo đối tượng của functional interface.

  - Có cú pháp: (parameters) -> { body }.

  - Có thể lược bỏ kiểu dữ liệu tham số và dấu ngoặc nếu chỉ có một tham số.

  - Có thể lược bỏ dấu ngoặc nhọn và từ khóa return nếu body chỉ có một dòng code.

##### Lưu ý:

- Functional interface không thể chứa nhiều hơn một phương thức abstract.

- Có thể chứa default method và static method, nhưng chúng không ảnh hưởng đến việc sử dụng lambda expression.

- Lambda expression cung cấp một cách viết code ngắn gọn và linh hoạt hơn.

##### Ví dụ sử dụng Lambda Expression:

```java
Predicate isEven = (number) -> number % 2 == 0;  // Kiểm tra số chẵn
boolean result = isEven.isValid(4);  // Sử dụng như đối tượng bình thường
```

##### Kết luận:

- Functional interface và lambda expression là những công cụ mạnh mẽ trong lập trình Java, giúp viết code ngắn gọn và linh hoạt hơn.

- Nắm vững những khái niệm này sẽ giúp bạn viết code hiệu quả và dễ đọc hơn.

##### Function Reference

Trong Java, Method Reference là một cách viết gọn gàng để tham chiếu đến một phương thức có sẵn, thay vì sử dụng biểu thức lambda truyền thống. Nó giúp code ngắn gọn và dễ đọc hơn.

###### Cách sử dụng:

- Sử dụng toán tử :: để biến một phương thức thành một biểu thức lambda.

- Cú pháp chung: Classname::methodname

###### Các loại Method Reference:

1. Reference đến một phương thức tĩnh (static):

- Ví dụ: Math::pow (thay thế cho biểu thức lambda (x, y) -> Math.pow(x, y))

2. Reference đến một phương thức của một đối tượng cụ thể:

- Ví dụ: stringInstance::toUpperCase (thay thế cho (str) -> stringInstance.toUpperCase(str))

3. Reference đến một phương thức của một thực thể bất kỳ thuộc một kiểu cụ thể:

- Ví dụ: String::length (thay thế cho (str) -> str.length())

4. Reference đến một phương thức của một lớp xây dựng:

- Ví dụ: ArrayList::new (thay thế cho () -> new ArrayList())

###### Ví dụ cụ thể:

- Sắp xếp một mảng theo chiều dài của chuỗi:

```java
String[] strings = {"hello", "world", "java"};
Arrays.sort(strings, Comparator.comparing(String::length));
```

- In hoa tất cả các chuỗi trong một danh sách:

```java
List<String> words = Arrays.asList("hello", "world");
words.forEach(String::toUpperCase);
```

- Tạo một mảng số nguyên và điền các giá trị ngẫu nhiên:

```java
Random random = new Random();
int[] numbers = IntStream.generate(random::nextInt).limit(10).toArray();
```
