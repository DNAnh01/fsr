package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static utils.ThreadUtils.*;

/**
 * Thread Pool
 * + pool size: number of threads
 * + blocking queue: number of tasks
 */
public class Ex01Execute {
    private static Random random = new Random();
    private static long start = 0;
    private static int capacity = 20;

    public static void main(String[] args) {

        start = System.currentTimeMillis();
        // blocking queue
        List<Task> list = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++) {
            long time = 2 + random.nextInt(6);
            list.add(new Task(time, TimeUnit.SECONDS));
        }

        // thread pool - idea processors
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("processors: " + processors);
        ExecutorService executorService = Executors.newFixedThreadPool(processors);

        for (Task task : list) {
            executorService.execute(task);
        }
        System.out.println("thread end");

    }

    private static class Task implements Runnable {
        private long time;
        private TimeUnit timeUnit;

        private Task(long time, TimeUnit timeUnit) {
            this.time = time;
            this.timeUnit = timeUnit;
        }

        @Override
        public void run() {
            startThread(time);
            doTask(time, timeUnit);
            endThread(start);
        }
    }
}
