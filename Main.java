package sample;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    private TextArea ta = new TextArea();
    private Button btShowJobs = new Button("Show Records");
    private ComboBox<String> cboTableName = new ComboBox<>();
    private Statement stmt;


    @Override
    public void start(Stage primaryStage) {

        initializeDB();
        btShowJobs.setOnAction(e -> showData());
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Table Name"), cboTableName, btShowJobs);
        hBox.setAlignment(Pos.CENTER);

        BorderPane bpane = new BorderPane();
        bpane.setCenter(new ScrollPane(ta));
        bpane.setTop(hBox);

        Scene scene = new Scene(bpane, 420, 180);
        primaryStage.setTitle("Display JOB Information");
        primaryStage.setScene(scene);
        primaryStage.show();
    }//end method start

    private void initializeDB() {

//Add code that does the following
//Create a connection to your Oracle database using the orcluser account
            final String JDBC_DRIVER = "org.h2.Driver";
            final String DB_URL = "jdbc:h2:./res/HR";

            //  Database credentials
            final String USER = "";
            final String PASS = "";
            Connection conn = null;

try{

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//Use the connection to create a statement
             stmt = conn.createStatement();
//Use the Database MetaData to generate a resultSet based on tables that
            //contain the word job
    DatabaseMetaData dbmd = conn.getMetaData();
    ResultSet rsTables = dbmd.getTables(null, null, "JOB%", new String[] {"TABLE"});
    while(rsTables.next()){
            cboTableName.getItems().add(rsTables.getString("TABLE_NAME"));
}
            //Add the returned table names to the comboBox, selecting the first item
        }catch (Exception ex) {
            ex.printStackTrace();
        }//end try catch
    }

        //end method initializeDB
    private void showData() {
        ta.clear();
        String tableName = cboTableName.getValue();
        try {
String sql = "SELECT * FROM " + tableName;
ResultSet rs = stmt.executeQuery(sql);
ResultSetMetaData rsmd = rs.getMetaData();
int numberOfColumns = rsmd.getColumnCount();
//Use the MetaData from the ResultSet to append the column names to the text
            //area

            for (int i  = 1; i <= numberOfColumns; i++){
                ta.appendText(rsmd.getColumnName(i) + "\t");
            }
//Use a while loop to display the values of the returned data to the text
            //area
      ta.appendText("\n");
            while(rs.next()){
                for(int i = 1; i <= numberOfColumns; i++){
                    ta.appendText((rs.getString(i) + "\t"));
                }
                ta.appendText("\n");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }//end try catch
    }//end method showData

    public static void main(String[] args) {
        launch(args);
    }//end method main
}//end class DisplayJobs