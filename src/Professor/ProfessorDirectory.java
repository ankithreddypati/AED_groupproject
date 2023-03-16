/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Courses.Course;
import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class ProfessorDirectory {
    private ArrayList<Professor>professorlist;
    
    public ProfessorDirectory() {
        this.professorlist = new ArrayList<Professor>();
    }

    public ArrayList<Professor> getProfessorlist() {
        return professorlist;
    }

    public void setProfessorlist(ArrayList<Professor> professorlist) {
        this.professorlist = professorlist;
    }
    
    
}
