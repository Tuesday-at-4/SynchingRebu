package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

  String username;
  String password;

  @FXML
  private TextField txtField_username;

  @FXML
  private Button btn_login;

  @FXML
  private PasswordField password_textField;

  @FXML
  void login(MouseEvent event) {
    username = txtField_username.getText();
    password = password_textField.getText();
    System.out.println("Logging " + username + " in.");
  }
}
