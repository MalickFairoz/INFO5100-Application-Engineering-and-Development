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
public class CourseDirectory {
    private ArrayList<Course> courseList;

    public CourseDirectory() {
        this.courseList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    public Course addCourse(String courseName,String courseId,String credit,String costCredit){
        Course course=new Course();
        course.setCourseName(courseName);
        course.setCourseId(courseId);
        course.setCredit(credit);
        course.setCostCredit(costCredit);
        int totalCost = Integer.valueOf(credit)*Integer.valueOf(costCredit);
        course.setTotalCost(String.valueOf(totalCost));
        courseList.add(course);
        return course;
    }
    
}
