package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import utils.ThreadUtils;

/**
 * Thread Pool
 * + pool size: number of threads
 * + blocking queue: number of tasks
 */
public class Ex04MultiTask {
    private static Random random = new Random();
    private static int capacity = 20;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<FutureTask<Integer>> futureTasks = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++) {
            futureTasks.add(new FutureTask<>(new Task()));
        }

        // create thread pools
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (FutureTask<Integer> futureTask : futureTasks) {
            service.submit(futureTask);
            System.out.println("futureTask.get(): " + futureTask.get());
        }
        service.shutdown();

    }

    private static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int rand = 5 + random.nextInt(6);
            ThreadUtils.startThread(rand);
            ThreadUtils.doTask(1, TimeUnit.SECONDS);
            return rand;
        }
    }

}
/**
 * giả sử mình có 4 câu truy vấn từ 4 bảng khác nhau, không liên quan
 * chi đến nhau, thì mình có thể dùng multi thread để truy vấn cho nhanh
 */
