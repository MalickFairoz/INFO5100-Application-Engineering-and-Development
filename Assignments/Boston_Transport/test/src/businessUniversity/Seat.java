/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

/**
 *
 * @author Aswat
 */
public class Seat {
    private int gpa;
   // private CourseLoadDirectory courseLoadDirectory;
    private CourseSchedule courseSchedule;
    
            
    public Seat(){
       // this.courseLoadDirectory =new CourseLoadDirectory();
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public CourseSchedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(CourseSchedule courseSchedule) {
        this.courseSchedule = courseSchedule;
    }
    
    
}
