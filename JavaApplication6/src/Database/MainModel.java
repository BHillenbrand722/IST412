/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Database.Accounts.Patient;
import java.util.ArrayList;

/**
 *
 * @author bmh5582
 */
public class MainModel {

  //Will create list or sometime of storage of accounts here.
  public ArrayList<Database.Accounts.Patient> patientList;
  
  //Singleton Design Pattern Part 1
  private static ArrayList<Database.Accounts.HospitalAdministrator> hospitalAdministratorList;
  
  public Database.Accounts.Patient currentUserPatient;
  public int throwaway;
  
  public MainModel(){
      
  }
  
  public ArrayList<Database.Accounts.Patient> getPatientList(){
      if (patientList==null) 
            patientList = new ArrayList<Database.Accounts.Patient>(); 
      return patientList; 
  }
  
  public String authenticatePatient(String un, String pw){
      
      for(int i = 0; i< getPatientList().size(); i++){
        if(getPatientList().get(i).getAccount().getUsername().equals(un)){
            if(getPatientList().get(i).getAccount().getPassword().equals(pw)){
                throwaway = i;
                return "Login Successful";
            }
        }
      }
      return "Login Invalid";
  }
  
  public void addNewPatient(String newU, String newP, String type){
      int accountnum = (int) (Math.random() * 100000);
      Database.Accounts.Account newaccount = new Database.Accounts.Account(newU, newP, type);
      Database.Accounts.Patient newpatient = new Database.Accounts.Patient(newaccount, accountnum);
      getPatientList().add(newpatient);
      
  }
  
  public void setCurrentUserPatient(){
      currentUserPatient = getPatientList().get(throwaway);
  }
  
  public Patient getCurrentUserPatient(){
      return currentUserPatient;
  }
  
  //Singleton Design Pattern Part 2
  public static ArrayList<Database.Accounts.HospitalAdministrator> getHospitalAdministratorList(){
      return  hospitalAdministratorList;
  }
          
}
