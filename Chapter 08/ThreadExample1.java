public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Starts the thread and calls the run() method
    }
}