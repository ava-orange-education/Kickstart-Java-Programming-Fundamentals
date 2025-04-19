package SLAPLMS;

import java.util.HashMap;

public class CourseLookup {
    private HashMap<Integer, String> courseMap = new HashMap<>();

    public void addCourse(int courseID, String courseName) {
        courseMap.put(courseID, courseName);
        System.out.println("Course added: " + courseName + " (ID: " + courseID + ")");
    }

    public String getCourseName(int courseID) {
        return courseMap.getOrDefault(courseID, "Course not found");
    }
}
