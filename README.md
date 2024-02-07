### Thread

Một số điều kiện cơ bản và quan trọng về quản lý luồng trong java 11:

1. Thread và Runnable.

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
