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
public class HospitalAdministrator {
    
    private Account account;
    private PersonalInformation personalInformation;
    private String title;
    
    public MedicalProfessional(Account account){
        this.account = account;
        this.personalInformation = null;
        this.title = "";
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
    
    public Account getAccount(){
        return this.account;
    }
    public PersonalInformation getPersonalInformation(){
        return this.personalInformation;
    }
    public String getTitle(){
        return this.title;
    }
    
}
