package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AccountSummaryController extends Account {

  String name = getFirstName() + getLastName();

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


  public void setLblName(Label lblName) {
    String name = getFirstName() + getLastName();
    this.lblName = lblName;
    lblName.setText(name);
  }

}

