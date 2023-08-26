package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

//    AppInitializer appInitializer = new AppInitializer();
    public AnchorPane root;
    public Stage stage;
    public MenuItem btnNew;
    public MenuItem btnExit;
    public MenuItem btnUserGuide;
    public MenuItem btnAboutUs;

    public void initialize ()throws Exception{

           }


    public void btnNewOnAction(ActionEvent actionEvent) throws IOException{

        AnchorPane mainFormRoot = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainForm = new Scene(mainFormRoot);

        stage = new Stage();
        stage.setScene(mainForm);
        stage.setTitle("This is a new stage");
        stage.show();
        Stage previousNewScene = (Stage) root.getScene().getWindow();
        previousNewScene.close();
    }

    public void btnExitOnAction(ActionEvent actionEvent) throws IOException{
        stage.hide();
    }

    public void btnUserGuideOnAction(ActionEvent actionEvent) {
    }

    public void btnAboutUsOnAction(ActionEvent actionEvent) {
    }
}
