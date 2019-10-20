package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Account_Summary_Controller {

  @FXML
  private Label lblName;

  @FXML
  private Label lblPhoneNum;

  @FXML
  private Label lblDOB;

  @FXML
  private Label lblEmail;

  @FXML
  private void returnToDashboard(Event event){
    Main.createNewScene(event, "Dashboard.fxml");
  }

  @FXML
  private void deleteAccount(Event event){
    Account.currentUser = null;
    Main.createNewScene(event, "Login.fxml");
  }

  /**
   * Initialize method to replace labels with corresponding values. Temporary for the sake of
   * prototype.
   */
  @FXML
  public void initialize() {
    lblName.setText(Account.currentUser.getName());
    lblEmail.setText(Account.currentUser.getEmail());
    lblPhoneNum.setText(Account.currentUser.getPhone());
    lblDOB.setText(Account.currentUser.getDateOfBirth());
  }

}

