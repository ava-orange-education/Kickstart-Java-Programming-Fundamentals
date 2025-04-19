package SLAPLMS;

public class EnrollmentTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Processing enrollments...");
        try {
            Thread.sleep(2000); // Simulate a time-consuming operation
            System.out.println("Enrollments completed!");
        } catch (InterruptedException e) {
            System.out.println("Enrollment task interrupted.");
        }
 
    }
}