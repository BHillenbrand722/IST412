package Database.Accounts;

public class Account {
    
    private String username;
    private String password;
    private String type;
    
    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public Account(String username, String password, String type){
        this.username = username;
        this.password = password;
        this.type = type;
    }
    //setters
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setType(String type){
        this.type = type;
    }
    //getters1
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getType(){
        return this.type;
    }
    //toString
    @Override
    public String toString(){
        return "Username: " + this.username + "\nPassword: [REDACTED]" + "\nType: " + this.type; 
    }
    
    public Account createTestAccount(){
        String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        
        String testUsername;
        String testPassword;
        String testType;
        
        
        //random first name
        StringBuilder sbu = new StringBuilder(10);
        for(int i = 0; i < 10; i++){
            int index = (int)((int)Alpha.length() * Math.random());
            sbu.append(Alpha.charAt(index));
        }
        testUsername = sbu.toString();
        
        //random last name
        StringBuilder sbp = new StringBuilder(10);
        for(int i = 0; i < 10; i++){
            int index = (int)((int)Alpha.length() * Math.random());
            sbp.append(Alpha.charAt(index));
        }
        testPassword = sbp.toString();
        
        String[] typeList = {"Patient", "Hospital Employee", "Medical Professional", "Hospital Administrator"};
        testType = typeList[(int)(Math.random() * 5)];
        
        return new Account(testUsername, testPassword, testType);
    }
    
    public void signIn(String checkUsername, String checkPassword){
        if(this.username.equals(checkUsername) && this.password.equals(checkPassword)){
            System.out.println("Welcome " + this.username + "!");
        }
        else if(this.username.equals(checkUsername) && this.password != checkPassword){
            System.out.println("Password is incorrect, please try again.");
        }
        else if(this.username != checkUsername && (this.password.equals(checkPassword) || this.password != checkPassword)){
            System.out.println("Username does not exist, please try again or create an account");
        }
        else if(this.username == null && this.password == null){
            System.out.println("Please create an account to sign in.");
        }
    }
    
    public void signOut(){
        System.out.println("Goodbye, " + this.username + "!");
    }
}
