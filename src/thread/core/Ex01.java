package thread.core;

import java.util.concurrent.TimeUnit;

import utils.ThreadUtils;

public class Ex01 {
    // Thread main (Đây là thread chính của chương trình)
    public static void main(String[] args) {

        // Thread t1 = new Thread(runnable);
        // t1.start() >>> t1.run()[native method] >> t1.run() {runnable.run()}

        System.out.println("main start"); // In thông báo bắt đầu thread main

        // Tạo thread mới t1 sử dụng Runnable và đặt tên là "thread1"
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() { // Phương thức run() được thực thi khi thread t1 bắt đầu

                // Giả lập chuẩn bị dữ liệu mất 2 giây (simulate a task taking 2 seconds)
                ThreadUtils.doTask(2, TimeUnit.SECONDS);

                ThreadUtils.printCurrThreadName(); // In tên thread hiện tại
                System.out.println("running a task...."); // In thông báo thread đang thực hiện tác vụ
            }
        }, "thread1");

        t1.start(); // Khởi động thread t1 (Gọi phương thức run() của thread t1) // automatically
                    // call t1.run >> runnable

        // Sử dụng t1.run() không cung cấp khả năng kiểm soát luồng thực thi, giới hạn
        // việc thực thi trong thread main.

        // In thông tin thread hiện tại (vẫn là thread main)
        ThreadUtils.printCurrThreadName();
        System.out.println("main end"); // In thông báo kết thúc thread main
    }
}
