package lk.ijse.dep11;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane splashRoot = FXMLLoader.load(getClass().getResource("/view/SplashScene.fxml"));
        Scene splashScene = new Scene(splashRoot);
        primaryStage.setScene(splashScene);

        // Create an undecorated stage for splash scree
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        splashRoot.setBackground(Background.fill(Color.TRANSPARENT));
        splashScene.setFill(Color.TRANSPARENT);
        primaryStage.show();

        // Set up a pause transition for splash screen duration
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> {
            try {
                // Close the splash screen stage
                primaryStage.close();

                // Load main window
                AnchorPane mainRoot = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
                Scene mainScene = new Scene(mainRoot);

                // Create a decorated stage for the main window
                Stage mainStage = new Stage();
                mainStage.setScene(mainScene);
                mainStage.setTitle("EDITOR");
                mainStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        pause.play();


//        Thread.sleep(2500);

    }
}