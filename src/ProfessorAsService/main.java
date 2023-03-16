/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProfessorAsService;

import Courses.Course;
import Professor.Professor;

/**
 *
 * @author ankithreddy
 */
public class main {
    
    public static void main(String[] args) {
        Professor p = new Professor("kal");
        Course c = new Course("AED", "mon", "spring", 200);
        p.setCourse(c);
        
        
    }
}
