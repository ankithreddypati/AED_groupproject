/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Courses.Course;

/**
 *
 * @author sruthisivasankar
 */
public class Professor {
    String professorName;
    String professorRating;
    Course course;

    public Professor(String professorName) {
        this.professorName = professorName;
       // this.professorRating = professorRating;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorRating() {
        return professorRating;
    }

    public void setProfessorRating(String professorRating) {
        this.professorRating = professorRating;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    
}
