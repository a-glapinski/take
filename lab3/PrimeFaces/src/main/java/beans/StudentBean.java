/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import models.Student;

/**
 *
 * @author adrian.glapinski
 */
@Named(value = "studentBean")
@SessionScoped
public class StudentBean implements Serializable {

    /**
     * Creates a new instance of StudentBean
     */
    public StudentBean() {
    }
    
    private String firstName;
    private String lastName;
    private Float averageGrade;
    
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        students.add(new Student(firstName, lastName, averageGrade));
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

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
