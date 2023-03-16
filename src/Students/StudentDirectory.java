/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Students;

import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class StudentDirectory {
    private ArrayList<Student> studentlist;
    
    public StudentDirectory() {
        this.studentlist = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Student> studentlist) {
        this.studentlist = studentlist;
    }
    
    
}
