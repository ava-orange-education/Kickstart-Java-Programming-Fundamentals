package SLAPLMS;

public class Course {
    private int availableSeats = 10;

    public synchronized void enrollStudent(String studentName) {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println(studentName + " enrolled. Seats left: " + availableSeats);
        } else {
            System.out.println("No seats available for " + studentName);
        }
    }
}

