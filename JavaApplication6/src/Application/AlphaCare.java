/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;


import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author bmh5582
 */
public class AlphaCare extends Application{

    /**
     * @param args the command line arguments
     */
    @Override
    public void start(Stage primaryStage) {
        try{
              
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/Application/loginView.fxml"));
             MainController controller = new MainController();
             loader.setController(controller);
             Parent root = loader.load();
             primaryStage.setScene(new Scene(root, 600, 400));
             primaryStage.show();
        }
        catch(IOException e){
            System.out.println("Failed to start application: IOException");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        //MainController controller = new MainController();
    }
    
}
