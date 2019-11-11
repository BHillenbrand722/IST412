/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author bmh5582
 */
public class PersonalPortalViewController {

    MainDashboardViewController theParentCont;
    public String sexselected;
    @FXML Button saveChangesButton;
    @FXML Button backToDashboardButton;
    @FXML TextField firstname;
    @FXML TextField middlename;
    @FXML TextField lastname;
    @FXML TextField phonenum;
    @FXML TextField birthmonth;
    @FXML TextField birthday;
    @FXML TextField birthyear;
    @FXML TextField street;
    @FXML TextField city;
    @FXML TextField state;
    @FXML TextField zip;
    @FXML MenuButton sexselector;
    @FXML MenuItem maleoption;
    @FXML MenuItem femaleoption;
    @FXML Text statustext;
    @FXML Button fillInfoButton;
    
    public PersonalPortalViewController(MainDashboardViewController incoming){
        theParentCont = incoming;
    }
    
    @FXML public void saveChanges(){
        try{
            String birthdate = birthmonth.getText() + " " + birthday.getText() +" " + birthyear.getText();
            theParentCont.theParentCont.getMainModel().currentUserPatient.setPersonalInformation(
                    new Database.Accounts.PersonalInformation(
                            firstname.getText(), middlename.getText(), lastname.getText(), sexselected, birthdate, phonenum.getText(), street.getText(), city.getText(), state.getText(), zip.getText()
                    )
            );
            statustext.setText("Changes saved successfully!");
            statustext.setVisible(true);
        }
        catch(Exception e){
            statustext.setText("Changes were not saved: ERROR");
            statustext.setVisible(true);
        }
    }
    @FXML public void backToDashboard() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/mainDashboardView.fxml"));
        MainDashboardViewController controller = new MainDashboardViewController(theParentCont.theParentCont);
        loader.setController(controller);
        Parent root = loader.load();
        backToDashboardButton.getScene().setRoot(root);
    }
    @FXML public void sexSelector(ActionEvent event){
        
        if(event.getSource().equals(maleoption)){
            sexselector.setText("Male");
            sexselected = "Male";
            
        }
        if(event.getSource().equals(femaleoption)){
            sexselector.setText("Female");
            sexselected = "Female";
        }
    }
    @FXML public void fillInfo(ActionEvent event){
        
            firstname.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getFirstName());
            middlename.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getMiddleName());
            lastname.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getLastName());
            phonenum.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getPhoneNumber());
            street.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getStreetAddress());
            city.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getCity());
            state.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getState());
            zip.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getZipCode());
            sexselector.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getSex());
            birthmonth.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getBirthdate().split(" ")[0]);
            birthday.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getBirthdate().split(" ")[1]);
            birthyear.setText(theParentCont.theParentCont.getMainModel().getCurrentUserPatient().getPersonalInformation().getBirthdate().split(" ")[2]);
            
        
    }
}
