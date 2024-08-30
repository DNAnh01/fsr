### Thread

[![thread life cycle in java](https://ytcards.demolab.com/?id=UTUyJFvXeK4&title=thread+life+cycle+in+java&lang=en&timestamp=1598847600&background_color=%230d1117&title_color=%23ffffff&stats_color=%23dedede&max_title_lines=1&width=400&border_radius=5&duration=498 "thread life cycle in java")](https://youtu.be/UTUyJFvXeK4?si=RcJIC-lU6LitQajQ)



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

##### 3.1 excute

```java
    int processors = Runtime.getRuntime().availableProcessors();
    ExecutorService executorService = Executors.newFixedThreadPool(processors);
    for (Task task : list) {
        executorService.execute(task);
    }
```

##### 3.1 submit

```java
   ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    for (Task task : list) {
        Future<Integer> future = executorService.submit(task);
        // the same Optional<T>
        try {
            System.out.println("current return value: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
    // shutdown thread pools
    executorService.shutdown();
```

##### 3.2 FutureTask

#### 4. Synchronized

##### 4.1 Synchronized method

##### 4.2 Synchronized data

##### Deadlock

![deadlock](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjvXFDsElBWlJoj3lE3zuf618t6yCQGQgFSCNL_69LbBJ7j6DWGzeiiWHqoM-lw4eIyYx8UCOuCeuJDRqoLZp2F8QY4KMzJsWvL4igWZFg1GVHw49r_yzMG03InC25mWdcF-_RQovvnmkg-/s1600/TDeadlock.jpg)

- tại một thời điểm chỉ có một thread truy cập vào nó
