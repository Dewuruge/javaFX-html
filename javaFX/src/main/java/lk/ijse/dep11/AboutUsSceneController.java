package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AboutUsSceneController {
    public AnchorPane root;
    public Button btnClose;


    private double xPos = 0;
    private double yPos = 0;
    private double initialXPos;
    private double initialYPos;

    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage aboutUs = (Stage) root.getScene().getWindow();
        aboutUs.close();
    }


    public void rootOnMouseDragged(MouseEvent e) {
        Stage aboutUs = (Stage) root.getScene().getWindow();

        root.getScene().getWindow().setX(e.getScreenX()-xPos);
        root.getScene().getWindow().setY(e.getScreenY()-yPos);
        System.out.println("gfdewq");
    }

    public void rootOnMousePressed(MouseEvent e) {

        xPos = e.getX();
        yPos = e.getY();
        initialXPos = root.getLayoutX();
        initialYPos = root.getLayoutY();
    }
}
