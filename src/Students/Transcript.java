/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Students;

import Courses.Course;
import Courses.CourseCatalogue;

/**
 *
 * @author ankithreddy
 */
public class Transcript {
    
    CourseCatalogue coursecatlogue;
    
    public Transcript(){
        this.coursecatlogue=new CourseCatalogue();
    }

    public CourseCatalogue getCoursecatlogue() {
        return coursecatlogue;
    }

    public void setCoursecatlogue(CourseCatalogue coursecatlogue) {
        this.coursecatlogue = coursecatlogue;
    }
    public Course searchintranscript(String canme){
       for(Course ctemp: this.coursecatlogue.getCourseList()){
           if(ctemp.getName().equals(canme)){
               return ctemp;
           }
       }
       return null;
    }
    
}
