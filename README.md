#### 1. Encapsulation - Tính chất đóng gói

> Tính chất đóng gói được thể hiện qua access modifier. Nếu thuộc tính, phương thức là:

- private: đóng gói trong phạm vi class.
- public: đóng gói trong phạm vi project, gọi ở đâu cũng được.
- protected: đóng gói trong phạm vi của package, lớp con bên ngoài package có thể thừa kế được.
- default (không có access modifier): đóng gói trong phạm vi của package, lớp con bên ngoài package không thể thừa kế.

#### 2. Polymorphism - Tính chất đa hình

> Đa hình trong phương thức: có nghĩa là một phương thức(1 tên) nhưng có thể xử lý nhiều chức năng, nhiều thể hiện

##### 2.1. Overloading (Nạp chồng phương thức):

###### 2.1.1. Định nghĩa:

- Overloading là việc định nghĩa nhiều phương thức có cùng tên trong một lớp nhưng khác về số lượng tham số, kiểu dữ liệu của tham số hoặc cả hai.

###### 2.1.2. Điều kiện:

- Tên phương thức giống nhau.
- Dấu hiệu phương thức phải khác nhau (số lượng tham số, kiểu dữ liệu tham số).

###### 2.1.3. Ví dụ:

```java
public class Calculator {
    // Overloaded methods with different parameter types
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with different number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

##### 2.2. Overriding (Ghi đè phương thức):

###### 2.2.1. Định nghĩa:

- Overriding là việc cung cấp một triển khai mới cho một phương thức đã được định nghĩa trong lớp cha.

###### 2.2.2. Điều kiện:

- Phương thức con phải có cùng tên, cùng kiểu trả về và cùng danh sách tham số với phương thức cha.

- Phương thức cha và phương thức con phải có cùng quyền truy cập (public, protected hoặc default).

###### 2.2.3. Ví dụ:

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
```

#### 3. Inheritance - Tính chất thừa kế

###### 3.1. Lớp (Class):

- Khai báo và Thân phương thức (Phương thức thông thường):

```java
public class MyClass {
    void sum() {
        // Thực hiện
    }
}
```

###### 3.2. Interface:

- Khai báo (Phương thức trừu tượng):

```java
public interface MyInterface {
    void sum(); // public abstract
}
```

###### 3.3. Lớp trừu tượng (Abstract Class):

- Phương thức thông thường và Phương thức trừu tượng:

```java
public abstract class MyAbstractClass {
    void sum() {
        // Thực hiện
    }

    abstract void abstractSum(); // Phương thức trừu tượng
}
```

###### 3.4. Lớp kế thừa từ Lớp (Class extends Class):

- Phương thức chỉ đơn giản từ khai báo và thân:

```java
public class ChildClass extends ParentClass {
    // Override không bắt buộc
}
```

###### 3.5. Lớp kế thừa từ Lớp trừu tượng (Class extends AbstractClass):

- Override bắt buộc cho các phương thức trừu tượng:

```java
public class ChildClass extends AbstractParentClass {
    @Override
    void abstractSum() {
        // Thực hiện cho abstractSum
    }

    // Override không bắt buộc cho các phương thức thông thường
}
```

###### 3.6. Lớp trừu tượng implements Interface (Abstract Class implements Interface):

- Override tùy chọn cho phương thức của Interface:

```java
public abstract class MyAbstractClass implements MyInterface {
    @Override
    void sum() {
        // Thực hiện cho sum
    }

    // Override tùy chọn cho các phương thức của Interface
}
```

###### 3.7. Multiple Inheritance: NO -> cannot extends more than ONE class

###### 3.8. Lớp vừa kế thừa từ Lớp vừa implement từ Interface (Multiple Inheritance):

- Trong đoạn mã này:
  - Son triển khai (implements) cả Father và Mother.
  - Phương thức coding() được lấy từ Father, và các phương thức html() và css() được triển khai từ Mother.
  - Trong phương thức main(), tạo một đối tượng Son và sử dụng các phương thức của nó. Phương thức coding() sử dụng coding từ Father, và html(), css() sử dụng từ Mother.

```java
// Father interface
interface Father {
    void coding();
}

// Mother interface
interface Mother {
    void coding();
    void html();
    void css();
}

// Son class kế thừa từ Father và triển khai từ Mother
public class Son implements Father, Mother {
    @Override
    public void coding() {
        System.out.println("Son is coding...");
    }

    @Override
    public void html() {
        System.out.println("Son knows HTML.");
    }

    @Override
    public void css() {
        System.out.println("Son knows CSS.");
    }

    public static void main(String[] args) {
        // Tạo đối tượng Son và sử dụng các phương thức
        Son son = new Son();
        son.coding(); // Sử dụng coding từ Father
        son.html();
        son.css();
    }
}
```

##### 4. Tính chất của Interface và Abstract Class trước và sau JDK 1.8:

###### 4.1. Trước JDK 1.8 (<= JDK 1.7):

###### 4.1.1. Interface:

- Chỉ chứa hàm trừu tượng (abstract method).

- Một class có thể implement từ nhiều interface.

###### 4.1.2. Abstract Class:

- Chứa cả hàm trừu tượng và hàm có thân.

- Một class chỉ có thể extends từ một class.

###### 4.2. Sau JDK 1.8 (>= JDK 1.8):

###### 4.2.1. Interface:

- Có thể chứa hàm trừu tượng và hàm có thân với từ khóa default, static, và private (từ Java 9).

- Một class có thể implements từ nhiều interface.

###### 4.2.2. Abstract Class:

- Vẫn giữ tính chất như trước, có thể chứa cả hàm trừu tượng và hàm có thân.

- Một class chỉ có thể extends từ một class.

###### 4.3. Mục đích của cải tiến từ JDK 1.8:

- Trước JDK 1.8, Interface chỉ có thể chứa hàm trừu tượng, điều này làm cho việc mở rộng các chức năng của các lớp triển khai trở nên phức tạp và đôi khi dẫn đến sự lặp lại code.

###### 4.3.1. Static Method trong Interface (Java 8):

- Cung cấp các phương thức có thể được triệu gọi mà không cần tạo đối tượng của interface.
- Giảm sự phụ thuộc vào các lớp triển khai.

```java
interface MyInterface {
    static void staticMethod() {
        System.out.println("Static Method in Interface");
    }
}
```

###### 4.3.2. Default Method trong Interface (Java 8):

- Cung cấp một triển khai mặc định cho phương thức, có thể được kế thừa và ghi đè bởi các lớp triển khai hoặc sử dụng phương thức mặc định đó.
- Giảm sự lặp lại code khi thêm chức năng mới vào interface.

```java
interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default Method in Interface");
    }
}
```

###### 4.3.3. Mục đích của Default và Static Methods:

- Giảm lượng code lặp khi thêm một phương thức mới vào interface.
- Tăng tính linh hoạt và mở rộng của mã nguồn.
