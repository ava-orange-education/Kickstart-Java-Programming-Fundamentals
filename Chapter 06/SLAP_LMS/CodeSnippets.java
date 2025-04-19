/***

This file contains code snippets presented in the Chapter 6 "Book Long Project" section.
The code presented are merely code snippets, not executable code.
They are intended as reference and starter code for your own work.

public class CodeSnippets {
    
}

public static void saveCourseDetails(String courseDetails, String fileName) {
    try (FileWriter writer = new FileWriter(fileName)) {
        writer.write(courseDetails);
    } catch (IOException e) {
        System.out.println("Error writing course details: " + e.getMessage());
    }
}

public static void loadCourseDetails(String fileName) {
    try (FileReader reader = new FileReader(fileName)) {
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
    } catch (IOException e) {
        System.out.println("Error reading course details: " + e.getMessage());
    }
}


public static void saveFeedback(String feedback, String fileName) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        writer.write(feedback);
    } catch (IOException e) {
        System.out.println("Error saving feedback: " + e.getMessage());
    }
}

public static void loadFeedback(String fileName) {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("Error reading feedback: " + e.getMessage());
    }
}


public static void saveStudentScores(String fileName, int[] scores) {
    try (DataOutputStream output = new DataOutputStream(new FileOutputStream(fileName))) {
        for (int score : scores) {
            output.writeInt(score);
        }
    } catch (IOException e) {
        System.out.println("Error saving scores: " + e.getMessage());
    }
}

public static void loadStudentScores(String fileName) {
    try (DataInputStream input = new DataInputStream(new FileInputStream(fileName))) {
        while (true) {
            System.out.println("Score: " + input.readInt());
        }
    } catch (IOException e) {
        System.out.println("Error reading scores: " + e.getMessage());
    }
}


public static void saveCourseObject(Course course, String fileName) {
    try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
        output.writeObject(course);
    } catch (IOException e) {
        System.out.println("Error serializing course: " + e.getMessage());
    }
}

public static Course loadCourseObject(String fileName) {
    try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
        return (Course) input.readObject();
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error deserializing course: " + e.getMessage());
        return null;
    }
}

 */