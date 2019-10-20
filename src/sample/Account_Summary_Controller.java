package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Account_Summary_Controller {

  @FXML
  private Label lblName;

  @FXML
  private Button btnDelete;

  @FXML
  private Button btnEditAcnt;

  @FXML
  private Button btnEditPic;

  @FXML
  private Label lblPhoneNum;

  @FXML
  private Label lblDOB;

  @FXML
  private Label lblEmail;

  /*@FXML
  void editAcnt(ActionEvent event) {

  }*/

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

