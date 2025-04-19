package SLAPLMS;

public class LMSConcurrencyDemo {
    public static void main(String[] args) {
        Thread enrollmentThread = new Thread(new EnrollmentTask());
        enrollmentThread.start();
        System.out.println("Main thread continues execution...");
    }
}
