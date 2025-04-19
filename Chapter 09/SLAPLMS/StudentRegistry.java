package SLAPLMS;

import java.util.HashSet;

public class StudentRegistry {
    private HashSet<Integer> studentIDs = new HashSet<>();

    public boolean enrollStudent(int studentID) {
        if (studentIDs.add(studentID)) {
            System.out.println("Student enrolled: ID " + studentID);
            return true;
        } else {
            System.out.println("Student already enrolled: ID " + studentID);
            return false;
        }
    }
}

