package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
    private ThreadUtils() {
    }

    public static void printCurrThreadName() {
        System.out.println("current thread: " + Thread.currentThread().getName());
    }

    public static String getThreadName() {
        return Thread.currentThread().getName();
    }

    public static void startThread() {
        System.out.println("thread " + Thread.currentThread().getName() + " is running ...");
    }

    public static void startThread(long time) {
        System.out.println("thread " + Thread.currentThread().getName() + " is running ... " + time);
    }

    public static void endThread(long start) {
        System.out.println(
                "thread " + Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start) + " ms");
    }

    // virtual task with a certain time
    public static void doTask(long time, TimeUnit timeUnit) {
        // time: thực hiện task trong bao lâu
        // timeUnit: đơn vị tthoi gian
        try {
            timeUnit.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void join(Thread thread) {
        /**
         * Waits for this thread to die.
         */
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
