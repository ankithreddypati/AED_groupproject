/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

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
    
    
}
