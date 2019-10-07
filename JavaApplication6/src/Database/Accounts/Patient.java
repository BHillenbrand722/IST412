/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Accounts;

import Database.Records.InsuranceInformation;
import Database.Records.MedicalRecord;
import java.util.ArrayList;

public class Patient {
    
    private int patientID;
    private Account account;
    private PersonalInformation personalInformation;
    private InsuranceInformation insuranceInformation;
    private ArrayList<MedicalRecord> medicalRecords;
    
    public Patient(Account account, Integer patientID){
        this.account = account;
        this.patientID = patientID;
        this.personalInformation = null;
        this.insuranceInformation = null;
        this.medicalRecords = new ArrayList<MedicalRecord>();
    }
    
    public void setAccount(Account account){
        this.account = account;
    }
    public void setPatientID(Integer patientID){
        this.patientID = patientID;
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
    public Integer getPatientID(){
        return this.patientID;
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
