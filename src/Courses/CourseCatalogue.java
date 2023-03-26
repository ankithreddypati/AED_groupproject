/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;

import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class CourseCatalogue {
    String lastupdated;
    ArrayList<Course> courselist; 
    public CourseCatalogue(){
        courselist = new ArrayList();
    }
    
    public ArrayList<Course> getCourseList(){
        return courselist;
    }
    
//    public Course newCourse(String n, String nm, int cr){
//        Course c = new Course(n, nm, cr);
//        courselist.add(c);
//        return c;
//    }
    
//    public Course getCourseByNumber(String n){
//        
//        for( Course c: courselist){
//            
//            if(c.getCOurseNumber().equals(n)) return c;
//        }
//        return null;
//    }
    
    public Course searchcourse(String s){
        for (Course c:courselist){
            if(c.getName().equals(s)){
                return c;
            }
        }
        return null;
    }

}
