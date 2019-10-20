package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Login_Controller {

  private String username;
  private String password;

  @FXML
  private TextField txtField_username;

  @FXML
  private Button btn_login;

  @FXML
  private Button btn_signUp;

  @FXML
  private PasswordField password_textField;

  @FXML
  void login(MouseEvent event) {
    username = txtField_username.getText();
    password = password_textField.getText();
    System.out.println("Logging " + username + " in.");
  }

  @FXML
  void signUp(ActionEvent event) {
    Main.createNewScene(event, "Register.fxml");
  }
}
