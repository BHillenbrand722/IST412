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
public class PersonalInformation {
    
    private String firstName;
    private String middleName;
    private String lastName;
    private String sex;
    private String birthdate;
    
    private String phoneNumber;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    
    public PersonalInformation(){
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.birthdate = "";
        this.sex = "";
        this.phoneNumber = "";
        this.streetAddress = "";      
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }
    
    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setMiddleName(String name){
        this.middleName = name;
    }
    public void setLastName(String name){
        this.lastName = name;
    }
    
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setPhoneNumber(String number){
        this.phoneNumber = number;
    }
    
    public void setStreetAddress(String address){
        this.streetAddress = address;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public void setZipCode(String zip){
        this.zipCode = zip;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getBirthdate(){
        return this.birthdate;
    }
    public String getSex(){
        return this.sex;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public String getStreetAddress(){
        return this.streetAddress;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){
        return this.state;
    }
    public String getZipCode(){
        return this.zipCode;
    }
       
}
