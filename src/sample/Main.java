package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage primaryStage;
    private Scene sceneAlpha, sceneBeta;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootMain = FXMLLoader.load(getClass().getResource("Screen_Main.fxml"));
        Scene sceneMain = new Scene(rootMain,400,400);


        //Scene Alpha
        Label label1= new Label("This is the first scene");
        Button button1= new Button("Go to Beta");
        button1.setOnAction(e -> primaryStage.setScene(sceneBeta));
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        sceneAlpha = new Scene(layout1, 500, 350);

        //Scene Beta
        Label label2= new Label("This is the second scene");
        Button button2= new Button("Go to scene Main");
        button2.setOnAction(e -> primaryStage.setScene(sceneMain));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        sceneBeta = new Scene(layout2,300,250);

        primaryStage.setScene(sceneAlpha);

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    static Stage getPrimaryStage(){
        return primaryStage;
    }
