/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author adrian.glapinski
 */
public class Student {
    private String firstName;
    private String lastName;
    private Float averageGrade;
    
    public Student(String firstName, String lastName, Float averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the averageGrade
     */
    public Float getAverageGrade() {
        return averageGrade;
    }

    /**
     * @param averageGrade the averageGrade to set
     */
    public void setAverageGrade(Float averageGrade) {
        this.averageGrade = averageGrade;
    }
}
