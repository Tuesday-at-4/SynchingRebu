package sample;

import java.awt.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.Action;

public class Account_Summary_Controller extends Account {

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

  @FXML
  public void createAccount(Event event){
    Main.createNewScene(event, "Register.fxml");
  }

  @FXML
  public void setLblName(Label lblName) {
    String name = getFirstName() + getLastName();
    this.lblName = lblName;
    lblName.setText(name);
  }

}

