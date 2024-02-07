package thread.core;

import static utils.ThreadUtils.*;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("main start");
        Thread t1 = new Thread(new Task(), "task 1");
        t1.start();
        join(t1);

        Thread t2 = new Thread(new Task(), "task 2");
        t2.start();
        join(t2);

        printCurrThreadName();
        System.out.println("main end");
    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            printCurrThreadName();
            System.out.println("running a task ...");
        }
    }
}
