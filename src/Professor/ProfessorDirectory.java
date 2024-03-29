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
    
    
    public Professor createProfessor (String professorName, String country, String email){
        Professor p = new Professor(professorName, country, email);
        professorlist.add(p);
        return p;
    }
    
    public Professor searchProfessor(String s){
        for (Professor p:professorlist){
            if(p.getProfessorName().equals(s)){
                return p;
            }
        }
        return null;
    }
}
