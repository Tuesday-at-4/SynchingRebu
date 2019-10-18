package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootMain = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene sceneMain = new Scene(rootMain,400,400);
        primaryStage.setScene(sceneMain);
        primaryStage.show();
    }
}