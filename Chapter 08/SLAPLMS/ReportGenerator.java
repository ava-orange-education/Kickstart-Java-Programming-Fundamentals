package SLAPLMS;

import java.util.concurrent.CountDownLatch;

public class ReportGenerator {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable dataTask = () -> {
            try {
                Thread.sleep(1000); // Simulate data loading
                System.out.println(Thread.currentThread().getName() + " completed data loading.");
                latch.countDown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(dataTask).start();
        new Thread(dataTask).start();
        new Thread(dataTask).start();

        latch.await(); // Wait for all tasks to complete
        System.out.println("All data loaded. Generating report...");
    }
}

