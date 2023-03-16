/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Students;

/**
 *
 * @author sruthisivasankar
 */
public class Student {
    static int count=1;
    String name;
    int studentId;

    public Student(String name) {
        this.studentId= this.count;
        this.name = name;
        count=count+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int customerId) {
        this.studentId = customerId;
    }
    
    
     @Override
    public String toString(){
        return this.name;
    }
       
}
