/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

import java.util.ArrayList;

/**
 *
 * @author Aswat
 */
public class CourseOfferingDirectory {
    
     private ArrayList<CourseOffering> courseOfferingList;

    public CourseOfferingDirectory() {
        this.courseOfferingList = new ArrayList<CourseOffering>();
    }

    public ArrayList<CourseOffering> getCourseOfferingList() {
        return courseOfferingList;
    }

    public void setCourseOfferingList(ArrayList<CourseOffering> courseOfferingList) {
        this.courseOfferingList = courseOfferingList;
    }

     public CourseOffering addCourseOffering(Course course, Semester semester) {
        CourseOffering courseOffering = new CourseOffering();
        courseOffering.setCourse(course);
        courseOffering.setSemester(semester);
        courseOfferingList.add(courseOffering);
        return courseOffering;
    
}
}
