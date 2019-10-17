package sample;


import java.time.LocalDate;
import java.util.Date;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.util.Scanner;



public class Controller {
  String email;
  String firstName;
  String lastName;
  String phone;
  String username;
  String password;
  LocalDate DOB;


  @FXML
  private TextField txtField_firstName;

  @FXML
  private TextField txtField_lastName;

  @FXML
  private TextField txtField_email;

  @FXML
  private TextField txtField_phone;

  @FXML
  private Button btn_createAccount;

  @FXML
  private TextField txtField_createUsername;

  @FXML
  private TextField txtField_createPassword;

  @FXML
  private DatePicker dateB_DOB;


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
    System.out.println("Logging " +username + " in.");
  }


  @FXML
  void create_account(MouseEvent event) {
    DOB = dateB_DOB.getValue();
    firstName = txtField_firstName.getText();
    lastName = txtField_lastName.getText();
    email = txtField_email.getText();
    phone = txtField_phone.getText();
    username = txtField_createUsername.getText();
    password = txtField_createPassword.getText();

    System.out.println("You have created an account! \nConfirm information below is correct.");

    System.out.println(
        "\nFirst name: " + firstName +
        "\nLast name: " + lastName+
        "\nEmail: " + email +
        "\nPhone: "+ phone +
            "\nDate of Birth: "+ DOB+
        "\nUsername: "+ username +
        "\nPassword: " + password);



  }




}
