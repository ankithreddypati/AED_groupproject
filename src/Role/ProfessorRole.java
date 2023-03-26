/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UserAccount.UserAccount;
import javax.swing.JFrame;
import UI.ProfessorPanel.ProfessorJFrame;

/**
 *
 * @author sruthisivasankar
 */
public class ProfessorRole extends Role{
     @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
       return new ProfessorJFrame(business, useraccount);
    }
    
}
