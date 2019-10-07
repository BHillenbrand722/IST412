
import Application.InsuranceInformationController;
import Application.MainController;
import Application.MedicalRecordController;
import Application.PersonalInformationController;
import Database.Accounts.Account;
import Database.Accounts.Patient;
import Database.Accounts.PersonalInformation;
import Database.Records.InsuranceInformation;
import Database.Records.MedicalRecord;

/**
This class automates testing and will run the application's various parts with test cases.
The various testing methods will return a status code.
This whole thing almost seudo runs the application, but with testing.
*/
public class testController{

  public testController(){

    //List of all tests. Will run when testController is instantiated when testHarness is ran.
    testMainController();
    testPatient();
    testInsurance();
    testMedicalRecord();
    testPersonalInfo();
  }

  //example test for mainController
  public void testMainController(){
    try{
      MainController mainController = new MainController();
        System.out.println("TEST PASSED: Main Controller instantiated.");
    }
    catch(Exception e){
      System.out.print("TEST FAILED: Main Controller not instantiated correctly.");
    }
  }

  //example test for patient object, note that I add values to make it fail, that's the point of this whole thing lmao
  public void testPatient(){
    try{
      Database.Accounts.Account testAccount = new Database.Accounts.Account("TestUsername", "TestPassword", "TestType");
      Database.Accounts.Patient testPatient = new Database.Accounts.Patient(testAccount, 22 );
    }
    catch(Exception e){
      System.out.print("TEST FAILED: Account not instantiated correctly.");

    }
  }
    public void testInsurance() {
    try {
       InsuranceInformationController insurTest = new InsuranceInformationController();
       InsuranceInformation insurance = new InsuranceInformation("Provider", "id", "groupNumber", "primaryHolderFirstName", "primaryHolderLastName", "primaryHolderBirthdate");
       insurTest.insertRecordToDatabase(insurance);
        System.out.println(insurTest.selectRecordFromDatabase());

    }
    catch(Exception e){
      System.out.print("TEST FAILED: Insurance Controller not instantiated correctly.");
    }
}

    public void testMedicalRecord() {
    try {
       MedicalRecordController medTest = new MedicalRecordController();
        Account account = new Account("", "", "");
        Patient patient = new Patient(account, 22);
        MedicalRecord mr = new MedicalRecord(patient, "", 100.0, 200.0);

        medTest.insertRecordToDatabase(mr);
        System.out.println(medTest.selectRecordFromDatabase());

    }
    catch(Exception e){
      System.out.print("TEST FAILED: MedicalRecord object could not be instantiated.");
    }
  }

    public void testPersonalInfo() {
    try {
       PersonalInformationController piTest = new PersonalInformationController();
         PersonalInformation pi = new PersonalInformation("", "", "", "", "", "","", "", "","");

        piTest.insertInfoToDatabase(pi);
        System.out.println(piTest.selectInfoFromDatabase());

    }
    catch(Exception e){
      System.out.print("TEST FAILED: PersonalInfo object could not be instantiated.");
    }
  }
}
