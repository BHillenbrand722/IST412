/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Accounts;

import java.util.ArrayList;

public class Patient {
    
    private Account account;
    private PersonalInformation personalInformation;
    private InsuranceInformation insuranceInformation;
    private ArrayList<MedicalRecord> medicalRecords;
    
    public Patient(Account account){
        this.account = account;
        this.personalInformation = null;
        this.insuranceInformation = null;
        this.medicalRecords = new ArrayList<MedicalRecord>();
    }
    
    public void setAccount(Account account){
        this.account = account;
    }
    public void setPersonalInformation(PersonalInformation personalInformation){
        this.personalInformation = personalInformation;
    }
    public void setInsuranceInformation(InsuranceInformation insuranceInformation){
        this.insuranceInformation = insuranceInformation;
    }
    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords){
        this.medicalRecords = medicalRecords;
    }
    
    public Account getAccount(){
        return this.account;
    }
    public PersonalInformation getPersonalInformation(){
        return this.personalInformation;
    }
    public InsuranceInformation getInsuranceInformation(){
        return this.insuranceInformation;
    }
    public ArrayList<MedicalRecord> getMedicalRecords(){
        return this.medicalRecords;
    }
    
    public void addMedicalRecord(MedicalRecord record){
        this.medicalRecords.add(record);
    }
    public void removeMedicalRecord(MedicalRecord record){
        this.medicalRecords.remove(record);
    }
    
}
