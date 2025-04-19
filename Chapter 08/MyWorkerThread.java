class MyWorkerThread implements Runnable {
    private String message;

    public MyWorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (End) " + message);
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}