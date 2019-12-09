/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Accounts;

/**
 *
 * @author bmh5582
 */
import java.util.ArrayList;

public class MedicalProfessional {
    
    private Account account;
    private PersonalInformation personalInformation;
    private String title;
    private ArrayList<Patient> patients;
    
    public MedicalProfessional(Account account){
        this.account = account;
        this.personalInformation = null;
        this.title = "";
        this.patients = new ArrayList<Patient>();
    }
    
    public void setAccount(Account account){
        this.account = account;
    }
    public void setPersonalInformation(PersonalInformation info){
        this.personalInformation = info;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPatients(ArrayList<Patient> patients){
        this.patients = patients;
    }
    
    public Account getAccount(){
        return this.account;
    }
    public PersonalInformation getPersonalInformation(){
        return this.personalInformation;
    }
    public String getTitle(){
        return this.title;
    }
    
    public ArrayList<Patient> getPatients(){
        return this.patients;
    }
    
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    public void removePatient(Patient patient){
        this.patients.remove(patient);
    }
    
}
