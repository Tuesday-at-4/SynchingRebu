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
        Parent rootMain = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene sceneMain = new Scene(rootMain,400,400);
        Account dummy = new Account();

        //Scene Alpha
        //System.out.println("Going To Scene Alpha");
        //Label label1= new Label("This is Scene Alpha");
        //Button btnBeta= new Button("Go to Beta");
        //btnBeta.setOnAction(e -> primaryStage.setScene(sceneBeta));
        //VBox layout1 = new VBox(20);
        //layout1.getChildren().addAll(label1, btnBeta);
        //sceneAlpha = new Scene(layout1, 500, 350);

        //Scene Beta
        /*System.out.println("Going to Scene Beta");
        Label label2= new Label("This is Scene Beta");
        Button button2= new Button("Go to scene Main");
        button2.setOnAction(e -> primaryStage.setScene(sceneMain));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        sceneBeta = new Scene(layout2,300,250);
        */
        /*Label label2= new Label("This is Scene Main");
        Button button2= new Button("Go to scene Main");
        button2.setOnAction(e -> primaryStage.setScene(sceneMain));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        sceneBeta = new Scene(layout2,300,250);
        */
        primaryStage.setScene(sceneMain);
        primaryStage.show();
    }
}