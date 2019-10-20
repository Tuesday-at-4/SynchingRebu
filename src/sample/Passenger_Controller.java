package sample;

import java.time.LocalDate;
import java.time.LocalTime;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Passenger_Controller {

  @FXML
  TextField textFieldEndLocation;

  @FXML
  TextField textFieldStartLocation;

  @FXML
  TextField textFieldStartTime;

  @FXML
  TextField textFieldEndTime;

  @FXML
  TextArea textAreaPendingRides;

  @FXML
  public void initialize(){
    String dummyStr = "";
    for (Rides x:Main.pendingRides){
      dummyStr += "RideID: " + x.getPassengerName() + "\n";
    }
    textAreaPendingRides.setText(dummyStr);
  }

  @FXML
  private void returnHome(Event event){
    Main.createNewScene(event, "Dashboard.fxml");
  }

  @FXML
  private void createRide(Event event){
    Rides dummy = new Rides(Account.currentUser.getUsername(), LocalTime.of(12,45), LocalDate.of(2120, 4, 15));
    Main.pendingRides.add(dummy);
    initialize();
  }
}
