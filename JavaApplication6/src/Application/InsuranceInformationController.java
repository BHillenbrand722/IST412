
package Application;

import Database.Records.InsuranceInformation;

/**
 *
 * @author sound
 */
public class InsuranceInformationController {
  
    public static void insertRecordToDatabase(InsuranceInformation insurance) {
        System.out.println("Sucessfully inserted data");
    }
    
    public static InsuranceInformation selectRecordFromDatabase()
    {
        System.out.println("Selecting insurance...");
        InsuranceInformation insurance = new InsuranceInformation("Provider", "id", "groupNumber", "primaryHolderFirstName", "primaryHolderLastName", "primaryHolderBirthdate"); 
        System.out.println("Passing insurance info to view...");
        return insurance;
    }
}
