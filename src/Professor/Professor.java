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
    String country;
    String email;
    int professorRating;
    Course course;

    public Professor(String professorName, String country, String email) {
        this.professorName = professorName;
        this.country = country;
        this.email = email;    
       // this.professorRating = professorRating;
       
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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
    
    
    
}
