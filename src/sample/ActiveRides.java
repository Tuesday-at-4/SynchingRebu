package sample;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class ActiveRides {
  @FXML
  private TableView<Rides> scheduled_Rides;
  @FXML
  private TableColumn<Rides, String> Passenger;

  @FXML
  private TableColumn<Rides, LocalTime> Time_OfRide;

  @FXML
  private TableColumn<Rides, LocalDate> Date_OfRide;

  @FXML
  private Button schedule_Button;

  @FXML
  private Button schedule_Delete;

  @FXML
  public void initialize(URL url, ResourceBundle rb) {
    Passenger.setCellValueFactory(new PropertyValueFactory<Rides, String>("passengerName"));
    Date_OfRide.setCellValueFactory(new PropertyValueFactory<Rides, LocalDate>("Date"));
    Time_OfRide.setCellValueFactory(new PropertyValueFactory<Rides, LocalTime>("Time"));

    scheduled_Rides.setItems(getRides());
  }
  public ObservableList<Rides> getRides(){
    ObservableList<Rides> Rides = FXCollections.observableArrayList();
    Rides.add(new Rides("J Cole", LocalTime.of(12,45), LocalDate.of(2019, Month.OCTOBER, 19)));
    Rides.add(new Rides("Kendrick Lamar", LocalTime.of(5,35), LocalDate.of(2019,Month.OCTOBER,24)));
    Rides.add(new Rides("LeBron James", LocalTime.of(6,45),LocalDate.of(2019,Month.OCTOBER,31)));
    return Rides;
  }

}
