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
 
public class CourseSchedule {
    ClassRoom classRoom;
    Faculty faculty;
    CourseOffering courseOffering;

     public CourseSchedule() {
         
    }
    
    
    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }
    

   

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Faculty getPerson() {
        return faculty;
    }

    public void setPerson(Faculty faculty) {
        this.faculty = faculty;
    }

   
    
}

