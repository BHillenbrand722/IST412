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
public class Account {
    
    private String username;
    private String password;
    private String type;
    
    public Account(String username, String password, String type){
        this.username = username;
        this.password = password;
        this.type = type;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getType(){
        return this.type;
    }
    
}
