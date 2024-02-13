package thread.pool;

import static utils.ThreadUtils.doTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import utils.ThreadUtils;

// 010314
public class Ex02Submit {
    private static Random random = new Random();
    private static int capacity = 20;

    public static void main(String[] args) {

        // blocking queue
        List<Task> list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            list.add(new Task());
        }
        // thread pool - idea processor
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (Task task : list) {
            Future<Integer> future = executorService.submit(task);
            // same Optional<T>
            try {
                System.out.println("current return value: " + future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        // shutdown thread pools
        executorService.shutdown();
        System.out.println("thread end");
    }

    private static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            ThreadUtils.startThread();
            // task random number from 10 to 20
            doTask(1, TimeUnit.SECONDS);
            return 10 + random.nextInt(11);
        }
    }
}
