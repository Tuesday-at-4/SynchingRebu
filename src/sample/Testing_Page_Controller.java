package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.HBox;


public class Testing_Page_Controller {

  @FXML
  private Menu menuFile;

  @FXML
  private Button testButton;

  @FXML
  private HBox mainHBox;


  public void initialize() {
    System.out.println("Initializing Scene!");
    //testButton.setVisible(false);
    //mainHBox.getChildren().add(testButton);
  }

  @FXML
  private void testButton() {
    System.out.println("a BUTTON WAS PRESSED!");
    initialize();
  }
}