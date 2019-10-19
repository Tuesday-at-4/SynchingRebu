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
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootMain = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene sceneMain = new Scene(rootMain,400,400);
        primaryStage.setScene(sceneMain);
        primaryStage.show();
    }
    static void createNewScene(Event event, String newFileFXML){
        Parent newRoot = null;
        try {
            newRoot = FXMLLoader.load(Main.class.getResource(newFileFXML));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene newScene = new Scene(newRoot, 500, 500);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }
}