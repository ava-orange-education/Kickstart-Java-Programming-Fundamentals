import java.util.concurrent.CountDownLatch;

public class MyCountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable worker = () -> {
            System.out.println(Thread.currentThread().getName() + " finished work");
            latch.countDown();
        };

        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();

        try {
            latch.await(); // Wait for all worker threads to finish
            System.out.println("All workers are done");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}