
package Application;

import Database.Accounts.PersonalInformation;

/**
 *
 * @author sound
 */
public class PersonalInformationController {
    
    public static void insertInfoToDatabase(PersonalInformation pi) {
        System.out.println("Sucessfully inserted data");
    }
    
    public static PersonalInformation selectInfoFromDatabase()
    {
        System.out.println("Selecting personal Info...");
        PersonalInformation pi = new PersonalInformation("", "", "", "", "", "","", "", "",""); 
        System.out.println("Sending Info to view...");
        return pi;
    }
    
}
