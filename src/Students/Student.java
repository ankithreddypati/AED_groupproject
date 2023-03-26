/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Students;

import GraduateRequest.GraduateRequest;

/**
 *
 * @author sruthisivasankar
 */
public class Student {
    static int count=1;
    String name;
    String country;
    String email;
    int studentId;
    Transcript transcript;
    GraduateRequest graduateRequest;
    

    public Student(String name, String country, String email) {
        this.studentId= this.count;
        this.name = name;
        this.country= country;
        this.email = email;
        count=count+1;
        this.transcript=new Transcript();
        this.graduateRequest=new GraduateRequest();
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public GraduateRequest getGraduateRequest() {
        return graduateRequest;
    }

    public void setGraduateRequest(GraduateRequest graduateRequest) {
        this.graduateRequest = graduateRequest;
    }
    
    
    
     @Override
    public String toString(){
        return this.name;
    }
       
}
