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
public class Patient {
    
    private Account account;
    private PersonalInformation personalInformation;
    
    public Patient(Account account){
        this.account = account;
        this.personalInformation = null;
    }
    
    public void setAccount(Account account){
        this.account = account;
    }
    public void setPersonalInformation(PersonalInformation personalInformation){
        this.personalInformation = personalInformation;
    }
    public Account getAccount(){
        return this.account;
    }
    public PersonalInformation getPersonalInformation(){
        return this.personalInformation;
    }
    
}
