package sample;

import javafx.event.Event;

public class Register_Controller {

  public void create_account(Event event){
    Main.createNewScene(event, "Dashboard.fxml");
  }
}
