package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Screen_Main_Controller {
  @FXML
  HBox mainHBox;

  @FXML
  Button testButton;

  public void initialize() {
    System.out.println("Loading Main Screen!");
  }

  @FXML
  private void handleTestButton() throws Exception{
    System.out.println("Do Something!");
    Stage temp = Main.getPrimaryStage();
    Parent rootOne = FXMLLoader.load(getClass().getResource("Screen_One_Controller.fxml"));
    //Scene secondScene = new Scene(rootOne,400,400);
    //initialize();
    //Main.start(temp, rootOne);
    //temp.setScene(secondScene);


    //Main.getPrimaryStage().setScene(secondScene);
    //initialize();
  }
}