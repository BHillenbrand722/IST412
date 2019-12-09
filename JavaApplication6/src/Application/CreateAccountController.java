
package Application;

import java.awt.Polygon;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class CreateAccountController {
    
    @FXML Button backBtn;
    @FXML Button createAccountBtn;
    @FXML TextField newUsernameField;
    @FXML PasswordField newPasswordField;
    @FXML MenuButton typeAccount;
    @FXML MenuItem patient;
    @FXML MenuItem hospitalemployee;
    @FXML MenuItem medicalprofessional;
    @FXML MenuItem hospitaladministrator;
    @FXML Text createerrortext;
    String currentType;
    MainController theParentCont;
    public CreateAccountController(MainController incoming){
        theParentCont = incoming;
    }
    
    @FXML public void backToLogin(ActionEvent event){
      try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Application/loginView.fxml"));
        
        loader.setController(theParentCont);
        Parent root = loader.load();
        createAccountBtn.getScene().setRoot(root);
        
      }
      catch(IOException e){
          System.out.println("IOException: loginView.fxml not accessible.");
      }
    }
    
    @FXML public void typeAccountSelector(ActionEvent event){
        if(event.getSource().equals(patient)){
            typeAccount.setText("Patient");
            currentType = "Patient";
        }
        if(event.getSource().equals(hospitalemployee)){
            typeAccount.setText("Hospital Employee");
            currentType = "Hospital Employee";
        }
        if(event.getSource().equals(medicalprofessional)){
            typeAccount.setText("Medical Professional");
            currentType = "Medical Professional";
        }
        if(event.getSource().equals(hospitaladministrator)){
            typeAccount.setText("Hospital Administrator");
            currentType = "Hospital Administrator";
        }
    }
    
    
    @FXML public void createNewAccount(ActionEvent event){
        String newUsername = newUsernameField.getText();
        String newPassword = newPasswordField.getText();
        String newAccountType = currentType;
        //
        theParentCont.getMainModel().addNewPatient(newUsername, newPassword, newAccountType);
        createerrortext.setText("Account created successfully. Go Back to login.");
        createerrortext.setVisible(true);
    }
}
