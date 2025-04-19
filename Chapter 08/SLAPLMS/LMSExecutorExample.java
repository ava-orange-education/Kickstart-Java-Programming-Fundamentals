package SLAPLMS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LMSExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Executing task " + taskId + " by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}

