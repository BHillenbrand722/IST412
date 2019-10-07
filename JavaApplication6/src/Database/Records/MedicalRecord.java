/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Records;

import Database.Accounts.Patient;

/**
 *
 * @author bmh5582
 */
public class MedicalRecord {
    Patient patient; 
    String preExistingConditions; 
    double height;
    double weight; 
    
    public MedicalRecord(Patient patient, String preExistingConditions, double height, double weight)
    {
        this.patient = patient;
        this.preExistingConditions = preExistingConditions;
        this.weight = weight;
        this.height = height; 
    }
}
