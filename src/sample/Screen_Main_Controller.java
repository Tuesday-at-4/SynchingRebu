package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Screen_Main_Controller {
  @FXML
  private HBox mainHBox;

  @FXML
  Button btnScreenOne;

  public void initialize() {
    System.out.println("Loading Main Screen!");
  }

  @FXML
  private void handleTestButton() throws Exception{
    System.out.println("Screen One Button was pressed");
  }
}