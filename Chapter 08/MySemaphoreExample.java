import java.util.concurrent.Semaphore;

public class MySemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // Allow up to 2 threads to access the resource concurrently

        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " acquired a permit");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " released a permit");
                semaphore.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}
