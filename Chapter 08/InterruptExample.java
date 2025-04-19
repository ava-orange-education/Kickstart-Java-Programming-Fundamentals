class InterruptExample implements Runnable {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("The thread is running");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted");
        }
    }
}