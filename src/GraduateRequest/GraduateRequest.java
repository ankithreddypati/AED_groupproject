/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraduateRequest;

import Students.Student;

/**
 *
 * @author ankithreddy
 */
public class GraduateRequest {
        Student student;
    Boolean requestedStatus=false;
   
    
    
    public GraduateRequest(){
        this.requestedStatus=false;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public Boolean getrequestedStatus() {
        return requestedStatus;
    }

    public void setrequestedStatus(Boolean graduateStatus) {
        this.requestedStatus = graduateStatus;
    }
       
    
    @Override
    public String toString() {
        return this.student.getName();
    }
}
