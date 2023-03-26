/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Courses.Course;
import Students.Student;
import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class Professor {
    String professorName;
    String country;
    String email;
    static int professorRating = 3;
    ArrayList<Course> profCourseList;
    ArrayList<Student> profStudentList;
    int revenue;
    int reports;

    public Professor(String professorName, String country, String email) {
        this.professorName = professorName;
        this.country = country;
        this.email = email; 
        this.profCourseList = new ArrayList();
        this.profStudentList = new ArrayList();
        professorRating=3;
       
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getReports() {
        return reports;
    }

    public void setReports(int reports) {
        this.reports = reports;
    }
    

    public ArrayList<Course> getProfCourseList() {
        return profCourseList;
    }

    public void setProfCourseList(ArrayList<Course> profCourseList) {
        this.profCourseList = profCourseList;
    }

    public ArrayList<Student> getProfStudentList() {
        return profStudentList;
    }

    public void setProfStudentList(ArrayList<Student> profStudentList) {
        this.profStudentList = profStudentList;
    }
    
   

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getProfessorRating() {
        return professorRating;
    }

    public void setProfessorRating(int professorRating) {
        this.professorRating = professorRating;
    }

   
public void deleteCourseProf (Course c ){
       this.profCourseList.remove(c);
       System.out.println("i am inside professor courselist and i deleted the course");
     }
    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Course searchCourseinProCList(String c){
        for (Course co:profCourseList){
            if(co.getName().equals(c)){
                return co;
            }
        }
        return null;
    }
    public Boolean searchforenroll(String c){
         for (Course co:profCourseList){
            if(co.getName().equals(c)){
                return true;
            }
        }
        return false;
    }
    
    
    
}
