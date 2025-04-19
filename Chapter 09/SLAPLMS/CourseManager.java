package SLAPLMS;

import java.util.ArrayList;

public class CourseManager {
    private ArrayList<String> courses = new ArrayList<>();

    public void addCourse(String courseName) {
        courses.add(courseName);
        System.out.println("Course added: " + courseName);
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}
