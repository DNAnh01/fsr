package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Ex04 {
    /**
     * Task: Took 3 seconds
     * Demo performance case with 3 calculation tasks
     * Run single thread : Took 9 seconds
     * Run parallel with 3 threads : Took 3 seconds
     */
    private static long start = 0;

    public static void main(String[] args) {

        // trong truong hop nay 3 task khong phu thuoc lan nhau
        Task task1 = new Task(3, SECONDS);
        Task task2 = new Task(3, SECONDS);
        Task task3 = new Task(4, SECONDS);

        start = System.currentTimeMillis();

        Thread thread1 = new Thread(task1, "Thread 1");
        Thread thread2 = new Thread(task2, "Thread 2");
        Thread thread3 = new Thread(task3, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        long end = System.currentTimeMillis();
        System.out.println("thread main took " + (end - start) + " ms");
    }

    private static class Task implements Runnable {
        private long time;
        private TimeUnit timeUnit;

        public Task(long time, TimeUnit timeUnit) {
            this.time = time;
            this.timeUnit = timeUnit;
        }

        @Override
        public void run() {
            startThread();
            doTask(time, timeUnit);
            System.out.println(getThreadName() + " took " + (System.currentTimeMillis() - start) + " ms");
        }
    }
}
