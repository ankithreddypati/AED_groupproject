/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.StudentPanel.StudentJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author sruthisivasankar
 */
public class StudentRole extends Role{
    @Override
    
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        
       return new StudentJFrame(business, useraccount);
    }
    
}
