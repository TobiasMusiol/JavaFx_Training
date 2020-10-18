package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application implements EventHandler {


    public static void main(String[] args) {
        try{
            launch(args); //Start JavaFX as an application
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception{ //The entire windows is called Stage
        //The thinks inside the windows is called scene
        Parent root = FXMLLoader.load(getClass().getResource("PWgenerator.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Password Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(Event event) {

    }
}
