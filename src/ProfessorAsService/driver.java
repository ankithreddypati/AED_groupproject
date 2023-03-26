/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProfessorAsService;

import Courses.Course;
import Professor.Professor;
import Students.Student;

/**
 *
 * @author ankithreddy
 */
public class driver {
    
    public static void main(String[] args) {
        //signup 
     Professor p = new Professor("kal", "pak", "jnad@bjb");
     
//     CourseSchedule cs = new CourseSchedule
     
     //pro after login 
     Course c = new Course("AED", 23, 4,"thos os java");
     p.setCourse(c);
     
     //student rates prof
     p.setProfessorRating(3);
     
     //student rates course reputation index
     c.setReputationIndex(4);
     
     
     //student signup 
     Student s = new Student("ankith", "india", "asbia");
     
     
     
     
     
        
    }
}
