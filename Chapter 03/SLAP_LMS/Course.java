package SLAP_LMS;

public class Course {
    private String courseName;
    private int courseID;
    private int maxStudents;

    // Constructor
    public Course(String courseName, int courseID, int maxStudents) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.maxStudents = maxStudents;
    }

    // Method to display course details
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", ID: " + courseID + ", Max Students: " + maxStudents);
    }

    // Getter and Setter methods
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

