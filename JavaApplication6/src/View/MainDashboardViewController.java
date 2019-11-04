
package View;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class MainDashboardViewController {

    //THIS ENTIRE CLASS AND ASSOCIATED FXML FILE ARE A DASHBOARD DESIGN PATTER, STILL WIP
    
    AdministatorView administatorView;
    MedicalRecordView medicalRecordView;
    PersonalPortalView personalPortalView;
    MainMenuView mainMenuView;
    Application.MainController theParentCont;
    
    @FXML Button logoutBtn;
    

    public MainDashboardViewController(Application.MainController incoming){
      theParentCont = incoming;
      administatorView = new AdministatorView();
      medicalRecordView = new MedicalRecordView();
      personalPortalView = new PersonalPortalView();
      mainMenuView = new MainMenuView();
      
    }
    
    @FXML public void logoutToLogin() throws IOException{
        
    }
    public AdministatorView getAdministatorView(){
      return administatorView;
    }

    public MedicalRecordView getMedicalRecordView(){
      return medicalRecordView;
    }

    public PersonalPortalView getPersonalPortalView(){
      return personalPortalView;
    }

    public MainMenuView getMainMenuView(){
      return mainMenuView;
    }
}
