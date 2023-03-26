/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Courses.CourseCatalogue;
import Professor.Professor;
import Professor.ProfessorDirectory;
import Role.CertifierRole;
import Students.StudentDirectory;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author ankithreddy
 */
public class Business {
        CourseCatalogue courseCatalogue;
        UserAccountDirectory userAccountDirectory;
        StudentDirectory studentDirectory;
        ProfessorDirectory professorDirectory;
        
        
        Business (){            
            this.studentDirectory = new StudentDirectory();
            this.professorDirectory=new ProfessorDirectory();
            this.userAccountDirectory = new UserAccountDirectory();
            this.courseCatalogue = new CourseCatalogue();
            
            
            this.userAccountDirectory.createUserAccount("cert", "cert", new CertifierRole());
        }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public CourseCatalogue getCourseCatalogue() {
        return courseCatalogue;
    }

    public void setCourseCatalogue(CourseCatalogue courseCatalogue) {
        this.courseCatalogue = courseCatalogue;
    }
        
        
      public static Business getInstance() {
        return new Business();
        
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public ProfessorDirectory getProfessorDirectory() {
        return professorDirectory;
    }

    public void setProfessorDirectory(ProfessorDirectory professorDirectory) {
        this.professorDirectory = professorDirectory;
    }
        
        
    
}
