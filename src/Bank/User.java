package Bank;

public class User {

    private String username;
    private String password;
    private BankAccount account;

    public User(String userName, String password) {
        this.username = userName;
        this.password = password;

    }

    //Getters
    public String getUsername() {
        return username;
    }


    public BankAccount getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    //Setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void updateUsername (String newUsername) {
        this.username = newUsername;
    }

    public void updatePassword (String newPassword){
        this.password = newPassword;
    }

    public void displayAccountDetails(){

        System.out.println("Username: " + username);
    }

}//end of class

