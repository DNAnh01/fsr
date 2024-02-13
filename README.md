### Thread

![life cycle thread in java](https://b3019442.smushcdn.com/3019442/wp-content/uploads/2023/08/java-thread-lifecycle-2.jpg?lossy=1&strip=1&webp=1)

Một số điều kiện cơ bản và quan trọng về quản lý luồng trong java 11:

#### 1. Thread và Runnable.

- Trong java, ta có thể quản lý đa luồng bằng cách sử dụng lớp Thread hoặc triển khai giao diện Runnable.

- Thread là một lớp trong java cung cấp các phương thức để tạo và quản lý luồng.

```java
class MyThread extends Thread {
    public void run() {
        // Code chạy trong luồng
    }
}

Thread thread = new MyThread();
thread.start(); // Bắt đầu thực thi luồng
```

- Hoặc sử dụng Runnable.

```java
class MyRunnable implements Runnable {
    public void run() {
        // Code chạy trong luồng
    }
}

Thread thread = new Thread(new MyRunnable());
thread.start();
```

một Thread mà dead rồi thì nó không bao giờ về new trở lại được

một hàm gọi là native khi nó được code và building bên trong JVM, hén không cung cấp code java cho mình.

#### 2.Note

- mỗi thread sẽ thực thi trên từng cpu, nó sẽ coppy biến cần thực thi từ main memory về cpu cache -> dễ xảy ra lỗi -> dùng từ khóa volatile để đọc trực tiếp giá trị của biến đó từ main memory -> hạn chế xảy ra lỗi(vẫn có thể xảy ra)

#### 3. ThreadPool

Dưới đây là một số lợi ích của việc sử dụng ThreadPool:

- Cải thiện hiệu suất: ThreadPool giúp tái sử dụng các luồng đã được tạo, tránh việc tạo mới luồng liên tục, tốn kém tài nguyên hệ thống.

- Đơn giản hóa việc quản lý luồng:

hãy tưởng tượng bạn là senior backend java hãy dạy cho tôi về thread pool trong java hãy giải thích chi tiết và cho code cụ thể , có thể cho thêm code thực thế trong dự án
