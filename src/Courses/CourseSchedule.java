/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;

import java.util.ArrayList;

/**
 *
 * @author ankithreddy
 */
public class CourseSchedule {
    
    String semester;
    ArrayList<Course> courseList;

    public CourseSchedule(String sem) {
        this.semester=sem;
        this.courseList = new ArrayList();
    }
      

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    
    
    
    
    
    
    
}
