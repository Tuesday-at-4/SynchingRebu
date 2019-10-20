package sample;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
    primaryStage.setScene(new Scene(root, 600, 450));
    primaryStage.show();
  }

  /**
   * Globally accessble scene switching method
   *
   * @param event       - passes in any javafx event, typically from event handler in a controller
   * @param newFileFXML - passing in desired .fxml file
   */
  public static void createNewScene(Event event, String newFileFXML) {
    Parent newRoot = null;
    try {
      newRoot = FXMLLoader.load(Main.class.getResource(newFileFXML));
    } catch (IOException e) {
      e.printStackTrace();
    }
    Scene newScene = new Scene(newRoot, 600, 500);
    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
    window.setScene(newScene);
    window.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
