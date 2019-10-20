package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AccountSummaryController {

  @FXML
  private Label lblName;

  @FXML
  private Button btnDelete;

  @FXML
  private Button btnEditAcc;

  @FXML
  private Button btnEditPic;

  @FXML
  private Label lblPhoneNum;

  @FXML
  private Label lblDOB;

  @FXML
  private Label lblEmail;

  /**
   * Initialize method to replace labels with corresponding values. Temporary for the sake of
   * prototype.
   */
  public void initialize() {
    lblName.setText(Account.currentUser.getName());
    lblEmail.setText(Account.currentUser.getEmail());
    lblPhoneNum.setText(Account.currentUser.getPhone());
    lblDOB.setText(Account.currentUser.getDateOfBirth());
  }
}

