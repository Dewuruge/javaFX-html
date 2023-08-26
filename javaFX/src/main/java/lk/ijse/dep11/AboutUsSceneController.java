package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AboutUsSceneController {
    public AnchorPane root;
    public Button btnClose;

    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage aboutUs = (Stage) root.getScene().getWindow();
        aboutUs.close();
    }

    public void rootOnDragEntered(DragEvent dragEvent) {
//        root.setLayoutX(root.getLayoutX());
//        root.setLayoutY(root.getLayoutY());
    }

}
