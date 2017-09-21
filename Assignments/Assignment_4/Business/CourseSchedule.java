/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author himab
 */
public class CourseSchedule {
    
    
    private CourseOffering courseOffering;
    
    public CourseSchedule(){
    courseOffering=new CourseOffering();
     }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }
    
}
