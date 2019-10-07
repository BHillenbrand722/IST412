
package View;


public class MainView {

    //Currently, the view side of this project is just a framework. Will add more later on.
    
    AdministatorView administatorView;
    MedicalRecordView medicalRecordView;
    PersonalPortalView personalPortalView;
    MainMenuView mainMenuView;

    public MainView(){
      administatorView = new AdministatorView();
      medicalRecordView = new medicalRecordView();
      personalPortalView = new personalPortalView();
      mainMenuView = new mainMenuView();
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
