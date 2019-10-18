package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Dashboard_Controller {
    public void handlePassengerButton(ActionEvent event){
        Main.createNewScene(event,"Passenger.FXML");
    }

    @FXML
    private void handleAccountButton(ActionEvent event){
        Main.createNewScene(event,"AccountSummary.FXML");
    }

    @FXML
    private void handleDriverButton(ActionEvent event){
        Main.createNewScene(event,"Driver.FXML");
    }



}
