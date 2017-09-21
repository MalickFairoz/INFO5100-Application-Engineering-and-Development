/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Malick
 */
public class SeatAssignment extends Course{
    
    private String courseGrade;
    private float courseGpa;
    private CourseOfferingDirectory courseOfferingDirectory;

    public CourseOfferingDirectory getCourseOfferingDirectory() {
        return courseOfferingDirectory;
    }

    public void setCourseOfferingDirectory(CourseOfferingDirectory courseOfferingDirectory) {
        this.courseOfferingDirectory = courseOfferingDirectory;
    }

    public float getCourseGpa() {
        return courseGpa;
    }

    public void setCourseGpa(float courseGpa) {
        this.courseGpa = courseGpa;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }
    
}
