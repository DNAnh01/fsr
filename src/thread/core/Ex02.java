package thread.core;

import utils.ThreadUtils;

public class Ex02 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task(), "task 1");
        ThreadUtils.printCurrThreadName();
        thread.start();
    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            ThreadUtils.printCurrThreadName();
            System.out.println("running a task ...");
        }
    }
}
