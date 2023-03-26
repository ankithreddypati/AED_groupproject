/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UserAccount.UserAccount;
import javax.swing.JFrame;
import UI.CertifierPanel.CertifierJFrame;

/**
 *
 * @author sruthisivasankar
 */
public class CertifierRole extends Role{
     @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new CertifierJFrame(business, useraccount);
    }
    
}
