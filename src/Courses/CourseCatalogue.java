/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;

import Professor.Professor;
import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class CourseCatalogue {
    String lastupdated;
    ArrayList<Course> courselist; 
        ArrayList<Course> searchCoursesList;

    public CourseCatalogue(){
        courselist = new ArrayList();
        searchCoursesList = new ArrayList();
    }
    
    public ArrayList<Course> getCourseList(){
        return courselist;
    }
    
    public Course addCourse(String name, int id, int credits,String description, int costPerCredit, String language ){
        Course c = new Course(name,id,credits,description,costPerCredit,language);
        courselist.add(c);
        return c;
    }
    
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
    
    
     public ArrayList<Course> searchCourseByProfName(String profname){
        for(Course c : this.courselist){
            System.out.println("before search");
            if(c.getProfessor().getProfessorName().contains(profname)){
                System.out.println(c.getName()+ "" + c.getProfessor().getProfessorName());
                this.searchCoursesList.add(c);
                
            }
        }
        
        if(!searchCoursesList.isEmpty()) {
            return searchCoursesList;
        } else {
            return null;
        }
        
    }
         
     public void deleteCourse (Course c ){
        this.courselist.remove(c);
        System.out.println("i am in deletecourse and i am deleted");
     }

}
