package SLAP_LMS;
public class Student extends User {
    public Student(String name, int userID) {
        super(name, userID);  // Calling the parent class constructor
    }

    public void enrollInCourse(Course course) {
        System.out.println(name + " has enrolled in " + course.getCourseName());
    }
}