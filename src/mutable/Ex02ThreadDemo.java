package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Ex02#main - start");
        // create a thread to run parallel with thread main
        Thread thread = new Thread(new Task(), "thread-0");
        thread.start(); // JVM automatically call Runnable#run
        // execute a task took 2 seconds
        doATask(2);
        System.out.println("Ex02#main - end");

        /**
         * Chương trình sẽ in ra các dòng sau, nhưng thứ tự của dòng thứ 3 và dòng thứ 4
         * có thể thay đổi do các luồng chạy song song:
         * 
         * Ex02#main - start
         * Ex02#main - end
         * thread-0 is running ...
         * Task#executing ...
         * 
         * 
         * Giải thích:
         * Chương trình tạo ra hai luồng: luồng chính (main) và luồng "thread-0".
         * Luồng chính thực hiện tác vụ 2 giây, sau đó in ra "Ex02#main - end" và kết
         * thúc.
         * Luồng "thread-0" thực hiện tác vụ 4 giây, sau đó in ra thông báo đang chạy và
         * "Task#executing ...".
         * Do các luồng chạy song song, nên thứ tự in ra của các thông báo từ hai luồng
         * có thể khác nhau.
         */
    }

    // nested class
    private static class Task implements Runnable {
        @Override
        public void run() {
            doATask(4);
            System.out.println(Thread.currentThread().getName() + "is running ... ");
            System.out.println("Task#executing ... ");
        }
    }

    private static void doATask(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
