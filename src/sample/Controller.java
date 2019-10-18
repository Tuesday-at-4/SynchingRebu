package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

public class Controller<Avatar> {

  @FXML
  private Avatar MyAvatar;

  @FXML
  private Label Rating;

  @FXML
  private Label label_Name;

  @FXML
  private Label label_Age;

  @FXML
  private TextField Text_Name;

  @FXML
  private TextField Text_Age;

  @FXML
  private TableView<?> TableView;

  @FXML
  private TextField getManufacturer;

  @FXML
  private TextField getModel;

  @FXML
  private TextField getYear;

  @FXML
  private Button New_Button;

  @FXML
  private Button Edit_Button;

  @FXML
  private Button Delete_Button;

  @FXML
  private TableView<?> Active_Rides;

  @FXML
  void CreateNew(MouseEvent event) {

  }

  @FXML
  void Delete_Item(MouseEvent event) {

  }

  @FXML
  void DisplayVehicles(ActionEvent event) {

  }

  @FXML
  void Edit_Item(MouseEvent event) {

  }

  @FXML
  void add_ActiveRides(ActionEvent event) {

  }

  @FXML
  void add_Manu(InputMethodEvent event) {

  }

  @FXML
  void add_Model(InputMethodEvent event) {

  }

  @FXML
  void add_Year(InputMethodEvent event) {

  }

}
