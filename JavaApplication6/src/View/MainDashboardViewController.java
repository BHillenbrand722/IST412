
package View;

import Application.CreateAccountController;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class MainDashboardViewController {

    //THIS ENTIRE CLASS AND ASSOCIATED FXML FILE ARE A DASHBOARD DESIGN PATTER, STILL WIP
    
    AdministatorView administatorView;
    MedicalRecordView medicalRecordView;
    PersonalPortalViewController personalPortalView;
    MainMenuView mainMenuView;
    Application.MainController theParentCont;
    
    @FXML Button logoutBtn;
    @FXML Text usernameText;
    @FXML AnchorPane accountAPane;
    @FXML TitledPane accountPane; 
    @FXML Button editInfoButton;
    @FXML Text accountTypeText;
    public MainDashboardViewController(Application.MainController incoming){
      theParentCont = incoming;

    }
    
    
    @FXML public void logoutToLogin() throws IOException{
        
    }
    
    @FXML public void setUsernameText(){
        usernameText.setText(theParentCont.getMainModel().getCurrentUserPatient().getAccount().getUsername());
        accountTypeText.setText(theParentCont.getMainModel().getCurrentUserPatient().getAccount().getType());
    }
    
    @FXML public void moveToPersonalInfo() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/personalPortalView.fxml"));
        PersonalPortalViewController controller = new PersonalPortalViewController(this);
        loader.setController(controller);
        Parent root = loader.load();
        editInfoButton.getScene().setRoot(root);
    }
    
    public AdministatorView getAdministatorView(){
      return administatorView;
    }

    public MedicalRecordView getMedicalRecordView(){
      return medicalRecordView;
    }

    public PersonalPortalViewController getPersonalPortalView(){
      return personalPortalView;
    }

    public MainMenuView getMainMenuView(){
      return mainMenuView;
    }
}
