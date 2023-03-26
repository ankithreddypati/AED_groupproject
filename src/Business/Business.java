/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Courses.Course;
import Courses.CourseCatalogue;
import GraduateRequest.GraduateRequestDirectory;
import Professor.Professor;
import Professor.ProfessorDirectory;
import Role.CertifierRole;
import Role.SystemAdminRole;
import Students.StudentDirectory;
import UserAccount.UserAccount;
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
        GraduateRequestDirectory gradutaedirectory;
        
        Business (){  
            this.studentDirectory = new StudentDirectory();
            this.professorDirectory=new ProfessorDirectory();
            this.userAccountDirectory = new UserAccountDirectory();
            this.courseCatalogue = new CourseCatalogue();
            this.gradutaedirectory=new GraduateRequestDirectory();
            this.userAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
            this.userAccountDirectory.createUserAccount("c", "c", new CertifierRole());
        }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public GraduateRequestDirectory getGradutaedirectory() {
        return gradutaedirectory;
    }

    public void setGradutaedirectory(GraduateRequestDirectory gradutaedirectory) {
        this.gradutaedirectory = gradutaedirectory;
    }
    
    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public CourseCatalogue getCourseCatalogue() {
        return courseCatalogue;
    }
    public Course addcourseinbusiness(Course c){
        this.getCourseCatalogue().getCourseList().add(c);
        return c;
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
    public void deleteprofessor(String name){
        Professor ptemp=this.getProfessorDirectory().searchProfessor(name);
      
           this.getProfessorDirectory().getProfessorlist().remove(ptemp);
        
    }
        
        
    
}
