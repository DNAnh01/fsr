##**OOP - Object Oriented Programming**

###Trong lập trình hướng đối tượng (OOP) của Java, có bốn tính chất chính:

###1. Kế thừa (Inheritance):

-   Mô tả: Kế thừa cho phép một lớp con sử dụng tất cả hoặc một phần thuộc tính và phương thức của một lớp cha. Lớp con có thể mở rộng (thêm mới) hoặc ghi đè (thay đổi) các phương thức của lớp cha.

-   Lợi ích: Tăng khả năng tái sử dụng mã nguồn, giảm sự lặp lại, và giúp tạo ra các mô hình phân cấp trong các ứng dụng phức tạp.

-   Ví dụ:

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
```

###2. Đóng gói (Encapsulation):

-   Mô tả: Đóng gói là quá trình ẩn giấu thông tin nội tại của một đối tượng và chỉ cho phép truy cập thông qua các phương thức công cộng. Các biến instance thường được đặt là private và truy cập thông qua getter và setter.

-   Lợi ích: Bảo mật dữ liệu, giảm sự phụ thuộc vào chi tiết triển khai nội tại, và dễ dàng bảo trì.

-   Ví dụ:

```java
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
```

###3. Đa hình (Polymorphism):

-   Mô tả: Đa hình cho phép một đối tượng có thể thể hiện nhiều hình dạng thông qua một tên gọi chung. Có đa hình compile-time (overloading) và đa hình runtime (overriding).

-   Lợi ích: Tăng khả năng mở rộng, linh hoạt trong thiết kế, và tạo ra giao diện chung.

-   Ví dụ:

```java
interface Shape {
    void draw();
}

class Circle implements Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}
```

###4. Tính trừu tượng (Abstraction):

-   Mô tả: Tính trừu tượng là quá trình tạo ra một lớp trừu tượng (abstract class) hoặc giao diện (interface) để giảm bớt chi tiết không quan trọng và tập trung vào những đặc điểm quan trọng của đối tượng.

-   Lợi ích: Giảm độ phức tạp, tạo ra một mô hình tốt hơn cho thế giới thực, và tăng sự tái sử dụng.

-   Ví dụ:

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}
```
