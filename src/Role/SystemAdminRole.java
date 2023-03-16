/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import ProfessorAsService.Business;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author sruthisivasankar
 */
public class SystemAdminRole extends Role {
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
       return new SystemAdminJFrame(business, useraccount);
    }
    
}
