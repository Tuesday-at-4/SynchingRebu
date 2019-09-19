package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;


public class Screen_Main_Controller {
  @FXML
  HBox mainHBox;

  @FXML
  Button testButton;

  public void initialize() {
    System.out.println("Loading Main Screen!");
  }

  @FXML
  private void handleTestButton() {
    System.out.println("Heading to Screen One!");
    //initialize();
  }
}