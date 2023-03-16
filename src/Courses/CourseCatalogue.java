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
    private ArrayList<Course>courselist;
    
    public CourseCatalogue() {
        this.courselist = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourselist() {
        return courselist;
    }

    public void setCourselist(ArrayList<Course> courselist) {
        this.courselist = courselist;
    }
    
    public Course addCourse(){
        Course c = new Course();
        courselist.add(c);
        return c;
    }
}
