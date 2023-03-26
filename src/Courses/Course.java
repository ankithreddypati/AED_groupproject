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
    int price = 1500; //per credit hour
    
    //student can give this for a course 
    int reputationIndex ;
    int numRatings;
    int totalReputationIndex;

    public Course(String name, int id, int credits,String description ) {
        this.description= description;
        this.name = name;
        this.id = id;
        this.credits = credits;
        reputationIndex = 0;
        numRatings = 0;
        totalReputationIndex = 0;

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

    public void setReputationIndex(int reputationIndex) {
        totalReputationIndex += reputationIndex;
        numRatings++;
        this.reputationIndex = totalReputationIndex / numRatings;
    }

   
    
    public int getCoursePrice() {
        return price * credits;

    }

    public int getCredits() {
        return credits;
    
}
    
}
    
    
    

