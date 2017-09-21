/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

import java.util.ArrayList;

/**
 *
 * @author PeaceFull
 */
public class CourseOffering {
   Course course;
   Semester semester;
   //CourseOffering courseoffering;
   public CourseOffering(){
       
   }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        
        this.course = course;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
   
   
   
   
    
}