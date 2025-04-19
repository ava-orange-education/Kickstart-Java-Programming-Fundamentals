package SLAPLMS;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LMSSchedulerExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Generating daily report at " + System.currentTimeMillis());
        scheduler.scheduleAtFixedRate(task, 0, 24, TimeUnit.HOURS);
    }
}
