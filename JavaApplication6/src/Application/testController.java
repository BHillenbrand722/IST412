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

  }

  //example test for mainController
  public void testMainController(){
    try{
      MainController mainController = new MainController();
    }
    catch(Exception e){
      System.out.print("TEST FAILED: Main Controller not instantiated correctly.")
    }
  }

  //example test for patient object, note that I add values to make it fail, that's the point of this whole thing lmao
  public void testPatient(){
    try{
      Database.Accounts.Account testAccount = new Database.Accounts.Account("TestUsername", "TestPassword", "TestType");
      //This should expect a account object and int, but I'm purposefully throwing it a string to try and make it fail.
      //Ideally it should have a counter to this, hense the test being succesful, which it is not going to be yet.
      Database.Accounts.Patient testPatient = new Database.Accounts.Patient(testAccount, "This should be an int but it ain't." );
    }
    catch(Exception e){
      System.out.print("TEST FAILED: Patient object could not be instantiated.")
    }
  }
}
