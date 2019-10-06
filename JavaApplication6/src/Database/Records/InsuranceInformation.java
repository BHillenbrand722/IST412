/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Records;

/**
 *
 * @author bmh5582
 */
public class InsuranceInformation {
    
    private String provider;
    private String idNumber;
    private String groupNumber;
    private String primaryHolderFirstName;
    private String primaryHolderLastName;
    private String primaryHolderBirthate;
    
    public InsuranceInformation(String provider, String idNumber, String groupNumber, String primaryHolderFirstName, String primaryHolderLastName, String primaryHolderBirthdate){
        this.provider = provider;
        this.idNumber = idNumber;
        this.groupNumber = groupNumber;
        this.primaryHolderFirstName = primaryHolderFirstName;
        this.primaryHolderLastName = primaryHolderLastName;
        this.primaryHolderBirthdate = primaryHolderBirthdate;
    }
    
    public void setProvider(String provider){
        this.provider = provider;
    }
    public void setIDNumber(String idNumber){
        this.idNumber = idNumber;
    }
   public void setGroupNumber(String groupNumber){
        this.groupNumber = groupNumber;
    }
   public void setPrimaryHolderFirstName(String primaryHolderFirstName){
        this.primaryHolderFirstName = primaryHolderFirstName;
    }
   public void setPrimaryHolderLastName(String primaryHolderLastName){
        this.primaryHolderLastName = primaryHolderLastName;
    }
   public void setPrimaryHolderBirthdate(String primaryHolderBirthdate){
        this.primaryHolderBirthdate = primaryHolderBirthdate;
    }
    
    public String getProvider(){
        return this.provider;
    }
    public String getIDNumber(){
        return this.idNumber;
    }
   public String getGroupNumber(){
        return this.groupNumber;
    }
   public String getPrimaryHolderFirstName(){
        return this.primaryHolderFirstName;
    }
   public String getPrimaryHolderLastName(){
        return this.primaryHolderLastName;
    }
   public String getPrimaryHolderBirthdate(){
        return this.primaryHolderBirthdate;
    }
    
    
}
