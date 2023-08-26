package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainSceneController {

    //    AppInitializer appInitializer = new AppInitializer();
    public AnchorPane root;
    public Stage stage;
    public MenuItem mnNew;
    public MenuItem mnExit;
    public MenuItem mnUserGuide;
    public MenuItem mnAboutUs;
  

    public void initialize ()throws Exception{

    }


    public void mnNewOnAction(ActionEvent actionEvent) throws IOException{

        AnchorPane mainFormRoot = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
        Scene mainForm = new Scene(mainFormRoot);

        stage = new Stage();
        stage.setScene(mainForm);
        stage.setTitle("EDITOR");
        stage.show();
        Stage previousNewScene = (Stage) root.getScene().getWindow();
        previousNewScene.close();
    }

    public void mnExitOnAction(ActionEvent actionEvent) {
        Stage previousNewScene = (Stage) root.getScene().getWindow();
        previousNewScene.close();
    }

    public void mnUserGuideOnAction(ActionEvent actionEvent) throws  IOException{
        AnchorPane aboutUsRoot = FXMLLoader.load(getClass().getResource("/view/AboutUsScene.fxml"));
        Scene aboutUsScene = new Scene(aboutUsRoot);


    }




    public void mnAboutAsOnAction(ActionEvent actionEvent) throws  IOException{
        AnchorPane aboutUsRoot = FXMLLoader.load(getClass().getResource("/view/AboutUsScene.fxml"));
        Scene aboutUsScene = new Scene(aboutUsRoot);

        stage = new Stage();
        stage.setScene(aboutUsScene);
        stage.setTitle("This is a new stage");

        stage.initStyle(StageStyle.TRANSPARENT);
        aboutUsRoot.setBackground(Background.fill(Color.TRANSPARENT));
        aboutUsScene.setFill(Color.TRANSPARENT);
        stage.show();
    }
}
