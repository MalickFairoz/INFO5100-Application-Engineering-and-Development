/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

/**
 *
 * @author PeaceFull
 */
public class Course {
    
    private String courseName;
    private String courseId;
    private String credit;
    private String costCredit;
    private String totalCost;
    private ClassroomDirectory classroomDirectory;
    private CourseScheduleDirectory courseScheduleDirectory;

    public CourseScheduleDirectory getCourseScheduleDirectory() {
        return courseScheduleDirectory;
    }

    public void setCourseScheduleDirectory(CourseScheduleDirectory courseScheduleDirectory) {
        this.courseScheduleDirectory = courseScheduleDirectory;
    }

    public Course() {
        this.classroomDirectory = new ClassroomDirectory();
        this.courseScheduleDirectory= new CourseScheduleDirectory();
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCostCredit() {
        return costCredit;
    }

    public void setCostCredit(String costCredit) {
        this.costCredit = costCredit;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public ClassroomDirectory getClassroomDirectory() {
        return classroomDirectory;
    }

    public void setClassroomDirectory(ClassroomDirectory classroomDirectory) {
        this.classroomDirectory = classroomDirectory;
    }
    
}
