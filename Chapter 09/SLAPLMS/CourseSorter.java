package SLAPLMS;

import java.util.ArrayList;
import java.util.Collections;

public class CourseSorter {
    public static void sortCourses(ArrayList<String> courses) {
        Collections.sort(courses);
        System.out.println("Sorted Courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}

