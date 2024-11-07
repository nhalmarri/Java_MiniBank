package Bank;

import java.util.ArrayList;
import java.util.List;

public class BankSingleton {

private static BankSingleton instance;
private List<User> users;

private BankSingleton( ){
this.users = new ArrayList<>();
}

public static BankSingleton getInstance(){
    if(instance == null){
        instance = new BankSingleton();
    }
    return instance;
}


public List<User> getUsers() {
    return users;
}


//Authentication


    public User createUser(String username, String password ){

    for( User user: users){
        if(user.getUsername().equals(username)){
           throw new IllegalArgumentException("Username is Exists");
        }
//        else if((!user.getPassword().equals(password))){
//            throw new IllegalArgumentException("Username is Exists");
//
//        }
    }

    User newUser = new User(username, password);
    users.add(newUser);

    return newUser;


    } //end of method



    public User  authenticate (String username, String password){
    for(User user: users){
        if((user.getUsername().equals(username))&& (user.getPassword().equals(password))){
            //return true;
           return user;
        }
    }
    return null;

} //end of method



















}//end of class
