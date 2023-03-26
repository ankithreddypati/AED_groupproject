/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
     public Boolean accountExists(String username, String password, String role){
        for(UserAccount u: this.useraccountlist){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                   return true;
               }
        }
        return false;
    }
     
      public UserAccount findById(String id){
        for(UserAccount user: this.useraccountlist){
            if(user.getAccountId().equals(id)){
                return user;
            }
        }
        return null;
    }
    
      
       public UserAccount findByUserName(String name){
        for(UserAccount user: this.useraccountlist){
            if(user.getUsername().equals(name)){
                return user;
            }
        }
        return null;
    }
       
       public UserAccount deleteByUsername(String name){
        for(UserAccount user: this.useraccountlist){
            if(user.getUsername().equals(name)){
                useraccountlist.remove(user);
            }
        }
        return null;
    }
       
}
