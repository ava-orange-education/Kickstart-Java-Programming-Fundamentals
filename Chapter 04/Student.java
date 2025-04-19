public class Student {
    private String firstName;
    private String lastName;
    private int id;

    // Method with multiple parameters
    public void create(String fname, String lname, int studentID) {
        this.firstName = fname;
        this.lastName = lname;
        this.id = studentID;
    }

    public void showID() {
        System.out.println("Student: " + firstName + " " + lastName + ", ID: " + id);
    }

    public static void main(String[] args) {
        Student student = new Student();
        // Calling the create method and passing multiple arguments
        student.create("Neo", "Anderson", 00001);
        // Calling showID to display the student's information
        student.showID();
    }
}

