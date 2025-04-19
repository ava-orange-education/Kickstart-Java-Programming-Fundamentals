public class RunnableExample1 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start(); // Starts the thread and calls the run() method
    }
}