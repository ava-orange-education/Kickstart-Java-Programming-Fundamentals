import java.util.concurrent.Phaser;

public class MyWorkerRunnable implements Runnable {
    private Phaser phaser;

    MyWorkerRunnable(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " working in phase 1");
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " moving to next phase");
    }
}
