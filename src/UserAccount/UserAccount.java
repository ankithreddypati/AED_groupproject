/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Professor.Professor;
import Role.Role;
import Students.Student;

/**
 *
 * @author sruthisivasankar
 */
public class UserAccount {
    private String accountId;
    private String username;
    private String password;
    private Role role;  
    private Professor professor;
    private Student student;
    
    private static int counter = 0;

    public UserAccount(String username, String password, Role role) {
        this.accountId = "User"+this.counter++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

   
    @Override
    public String toString(){
        return this.accountId;
        
    }    
    
}
