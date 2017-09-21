/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author himab
 */
public class CourseCatalog {
    
    
    private ArrayList<Course> courseList;

    public CourseCatalog() {
        this.courseList=new ArrayList<Course>();
    }
    

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    public Course addCourse(){
        Course course=new Course();
        courseList.add(course);
        return course;
    }
    
    public void deleteCourse(Course course){
        courseList.remove(course);
    }
    
    
}
