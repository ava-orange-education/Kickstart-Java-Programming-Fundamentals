public class ThreadInterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new InterruptExample());
        thread.start();
        try {
            Thread.sleep(5000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}