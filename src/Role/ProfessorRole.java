/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import UserAccount.UserAccount;
import javax.swing.JFrame;
import ProfessorAsService.Business;
import UI.CertifierPanel.CertifierJFrame;

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
