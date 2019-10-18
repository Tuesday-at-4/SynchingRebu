package sample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Dashboard_Controller {

    public void handlePassengerButton(ActionEvent event){
        createNewScene(event,"PAssenger.FXML");
    }

    @FXML
    private void handleAccountButton(ActionEvent event){
        createNewScene(event,"AccountSummary.FXML");
    }

    @FXML
    private void handleDriverButton(ActionEvent event){
        createNewScene(event,"Driver.FXML");
    }

    private void createNewScene(ActionEvent event, String newFileFXML){
        Parent newRoot = null;
        try {
            newRoot = FXMLLoader.load(getClass().getResource(newFileFXML));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene newScene = new Scene(newRoot, 500, 500);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

}
