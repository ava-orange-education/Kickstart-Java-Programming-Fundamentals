import java.util.concurrent.Phaser;

public class MyPhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // Register the main thread

        for (int i = 0; i < 3; i++) {
            phaser.register();
            new Thread(new MyWorkerRunnable(phaser)).start();
        }

        phaser.arriveAndAwaitAdvance(); // Wait for all worker threads to complete phase 1
        System.out.println("Phase 1 complete");

        phaser.arriveAndDeregister(); // Deregister the main thread
    }
}
