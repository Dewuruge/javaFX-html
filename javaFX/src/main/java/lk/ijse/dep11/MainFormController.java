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

public class MainFormController {

//    AppInitializer appInitializer = new AppInitializer();
    public AnchorPane root;
    public Stage stage;
    public MenuItem btnNew;
    public MenuItem btnExit;
    public MenuItem btnUserGuide;
    public MenuItem btnAboutUs;
    public MenuItem mnSelect;

    public void initialize ()throws Exception{

           }


    public void btnNewOnAction(ActionEvent actionEvent) throws IOException{

        AnchorPane mainFormRoot = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainForm = new Scene(mainFormRoot);

        stage = new Stage();
        stage.setScene(mainForm);
        stage.setTitle("EDITOR");
        stage.show();
        Stage previousNewScene = (Stage) root.getScene().getWindow();
        previousNewScene.close();
    }

    public void btnExitOnAction(ActionEvent actionEvent) {
        Stage previousNewScene = (Stage) root.getScene().getWindow();
        previousNewScene.close();
    }

    public void btnUserGuideOnAction(ActionEvent actionEvent) throws  IOException{

    }

    public void btnAboutUsOnAction(ActionEvent actionEvent)throws IOException {
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

    public void mnSelectOnAction(ActionEvent actionEvent) {

    }
}
