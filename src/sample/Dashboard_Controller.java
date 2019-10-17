package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class Dashboard_Controller {

    @FXML
    private AnchorPane anchorDashboard;

        @FXML
        private HBox hBoxDashboard;

        @FXML
        private Button btnAccountSum;

        @FXML
        private Button btnDriver;

        @FXML
        private Button btnPassenger;

    //Label introLabel = new Label("Hello");

    public void initialize(){
        Button btnAccountSum = new Button("Account Summary");
        Button btnDriver = new Button("Driver");
        Button btnPassenger = new Button("Passenger");
        HBox hBoxDashboard = new HBox();
        hBoxDashboard.getChildren().addAll(btnAccountSum, btnDriver, btnPassenger);//,btnDriver,btnPassenger);
        anchorDashboard.getChildren().add(hBoxDashboard);
    }
}
