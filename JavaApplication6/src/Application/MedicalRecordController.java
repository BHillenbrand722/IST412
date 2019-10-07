
package Application;

import Database.Accounts.Account;
import Database.Accounts.Patient;
import Database.Records.MedicalRecord;

/**
 *
 * @author sound
 */
public class MedicalRecordController {
    
        public static void insertRecordToDatabase(MedicalRecord mr) {
        System.out.println("Sucessfully inserted data");
    }
    
    public static MedicalRecord selectRecordFromDatabase()
    {
        System.out.println("Selecting Medical Record...");
        
        Account account = new Account("", "", ""); 
        Patient patient = new Patient(account, 22); 
        
        MedicalRecord mr = new MedicalRecord(patient, "", 100.0, 200.0); 
        System.out.println("Passing record to view...");
        return mr;
    }
    
}
