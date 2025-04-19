package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AudioExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        String audioFile = "file:///path/to/audio.mp3"; // Replace with your file and path
        Media media = new Media(audioFile);
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        mediaPlayer.play(); // Start playing the audio

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Audio Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
