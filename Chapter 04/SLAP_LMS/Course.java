public class Course {
    private String courseName;
    private int courseID;
    private int maxStudents;
    
    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseID);
        System.out.println("Max Students: " + maxStudents);
    }

    // Method to enroll a student
    public void enrollStudent(Student student) {
        // Logic for enrolling a student in the course
        System.out.println(student.getStudentName() + " enrolled in " + courseName);
    }
}
