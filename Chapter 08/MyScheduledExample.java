import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Running scheduled task at " + System.currentTimeMillis());
        scheduler.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000); // Let the task run for a while
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
    }
}