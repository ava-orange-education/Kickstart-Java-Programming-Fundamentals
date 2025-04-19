import java.awt.*;
import java.awt.event.*;

public class SLAPLMS {
    public static void main(String[] args) {
        Frame frame = new Frame("SLAP LMS");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        Label welcomeLabel = new Label("Welcome to SLAP LMS");
        Button viewCoursesButton = new Button("View Courses");
        Button enrollStudentButton = new Button("Enroll Student");
        Button exitButton = new Button("Exit");

        // Add components to the frame
        frame.add(welcomeLabel);
        frame.add(viewCoursesButton);
        frame.add(enrollStudentButton);
        frame.add(exitButton);

        // Event handling for buttons
        exitButton.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}

