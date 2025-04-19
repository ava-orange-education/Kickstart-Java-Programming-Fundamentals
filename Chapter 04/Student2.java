public class Student2 {
    private int id;

    // Method to set the student ID
    public void setID(int newID) {
        newID = 99999; // This change only affects the local copy of newID
    }

    public void showID() {
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        int studentID = 54321;
        Student2 student = new Student2();
        // Attempting to change the ID
        student.setID(studentID);
        System.out.println("Original ID: " + studentID); // Prints 54321
    }
}
