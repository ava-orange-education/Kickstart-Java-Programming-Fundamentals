package main;

import main.AIAnalyzer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label titleLabel = new Label("Title:");
        TextField titleField = new TextField();

        Label descLabel = new Label("Description:");
        TextArea descArea = new TextArea();

        Button suggestButton = new Button("Run AI Suggestion");
        suggestButton.setOnAction(e -> {
            String suggestion = AIAnalyzer.suggestPriority(descArea.getText());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Suggested Priority: " + suggestion);
            alert.showAndWait();
        });

        VBox form = new VBox(10, titleLabel, titleField, descLabel, descArea, suggestButton);
        form.setPadding(new javafx.geometry.Insets(10));

        Scene scene = new Scene(form, 400, 300);
        primaryStage.setTitle("TaskWise AI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
