/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Database.MainModel;
import View.MainDashboardViewController;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author bmh5582
 */
public class MainController {

  public MainModel model;
  
  Stage currentStage;
  
 //Login FX Ids 
  @FXML TextField usernameField;
  @FXML PasswordField passwordField;
  @FXML public Button  loginBtn;
  @FXML Button  createBtn;
  @FXML Text loginerrortext;

  public MainController(){
    model = new MainModel();
  }

  //Returns the main model object.
  public MainModel getMainModel(){
    return model;
  }


  
  
  @FXML public void switchToCreate(ActionEvent event) throws IOException{
      
     
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Application/createAccountView.fxml"));
        CreateAccountController controller = new CreateAccountController(this);
        loader.setController(controller);
        Parent root = loader.load();
        createBtn.getScene().setRoot(root);
        
  }
  
  @FXML public void moveOnToDashboard() throws IOException{
        Stage mainStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/mainDashboardView.fxml"));
        View.MainDashboardViewController controller = new View.MainDashboardViewController(this);
        loader.setController(controller);
        
        Parent root = loader.load();
        mainStage.setScene(new Scene(root, 1200, 900));
        mainStage.show();
      
        
  }
  
  
  public void autheticateCredentials(){
      String authUsername = usernameField.getText();
      String authPassword = passwordField.getText();
      System.out.println(model.authenticatePatient(authUsername, authPassword));
      if(model.authenticatePatient(authUsername, authPassword).equals("Login Successful")){
          try{
            model.setCurrentUserPatient();
            this.moveOnToDashboard();
            loginerrortext.setText("Login Successful!");
            loginerrortext.setVisible(true);
          }
          catch(IOException e){
              
          }
      }
      else{
          loginerrortext.setText("Invalid Login");
          loginerrortext.setVisible(true);
      }
  }

}
