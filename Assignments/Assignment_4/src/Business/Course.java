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
public class Course {
    
    
    private String courseName;
    private String courseCode;
    private int creditHours;
    private int creditPrice;
    private String prerequisiteCourse;
    private String followupCourse;
    private int count;
    private String coreCourses;
    private String electiveCourses;
    private SeatAssignment seatAssignment;
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public SeatAssignment getSeatAssignment() {
        return seatAssignment;
    }

    public void setSeatAssignment(SeatAssignment seatAssignment) {
        this.seatAssignment = seatAssignment;
    }

    public String getPrerequisiteCourse() {
        return prerequisiteCourse;
    }

    public void setPrerequisiteCourse(String prerequisiteCourse) {
        this.prerequisiteCourse = prerequisiteCourse;
    }

    public String getFollowupCourse() {
        return followupCourse;
    }

    public void setFollowupCourse(String followupCourse) {
        this.followupCourse = followupCourse;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    private CourseOffering courseOffering;
    
    public Course(){
        courseOffering=new CourseOffering();
     }

    

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }
    

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getcreditPrice() {
        return creditPrice;
    }

    public void setCreditPrice(int creditPrice) {
        this.creditPrice = creditPrice;
    }

    public String getCoreCourses() {
        return coreCourses;
    }

    public void setCoreCourses(String coreCourses) {
        this.coreCourses = coreCourses;
    }

    public String getElectiveCourses() {
        return electiveCourses;
    }

    public void setElectiveCourses(String electiveCourses) {
        this.electiveCourses = electiveCourses;
    }

    
    
    
}
