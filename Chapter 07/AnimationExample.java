package application;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);

        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), circle);
        transition.setByX(200); // Move 200 pixels to the right
        transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.setAutoReverse(true);
        transition.play();

        Scene scene = new Scene(new javafx.scene.Group(circle), 400, 300);
        primaryStage.setTitle("Animation Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
