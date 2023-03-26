/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;
import Professor.Professor;

/**
 *
 * @author sruthisivasankar
 */

    public class Course {

    int id;
    String name;
    int credits;
    String description;
    int costPerCredit;
    int totalCoursePrice; //per credit hour
    Professor professor;
    String language;
    double platformCharges;
    CourseSchedule courseSchedule;
    //student can give this for a course 
    static int reputationIndex =5;
//    int numRatings;
//    int totalReputationIndex;

    public Course(String name, int id, int credits,String description, int costPerCredit, String language ) {
        this.description= description;
        this.name = name;
        this.id = id;
        this.costPerCredit= costPerCredit;
        this.credits = credits;
        this.totalCoursePrice= this.costPerCredit* credits;
        this.language = language;
        this.platformCharges = (totalCoursePrice* 0.2);

    }

    public CourseSchedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(CourseSchedule courseSchdule) {
        this.courseSchedule = courseSchdule;
    }
    

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReputationIndex() {
        return reputationIndex;
    }

//    public void setReputationIndex(int reputationIndex) {
//        this.reputationIndex = reputationIndex;
//    }

    public double getPlatformCharges() {
        return platformCharges;
    }
    

    public int getCostPerCredit() {
        return costPerCredit;
    }

    public void setCostPerCredit(int costPerCredit) {
        this.costPerCredit = costPerCredit;
    }

    public int getTotalCoursePrice() {
        return totalCoursePrice;
    }

    public void setTotalCoursePrice(int totalCoursePrice) {
        this.totalCoursePrice = totalCoursePrice;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setPlatformCharges(double platformCharges) {
        this.platformCharges = platformCharges;
    }

    public void setReputationIndex(int reputationIndex) {
        Course.reputationIndex = reputationIndex;
    }

    

    public int getCredits() {
        return credits;
    }
    
    @Override 
    public String toString (){
        return this.name;
    }
    
}
    
    
    

