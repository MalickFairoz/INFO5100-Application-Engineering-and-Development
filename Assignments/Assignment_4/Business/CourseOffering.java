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
public class CourseOffering {
    
    
    private ClassRoom classRoom;
    private Teacher teacher;
    
    
    public CourseOffering(){
        classRoom = new ClassRoom();
        teacher=new Teacher();
        
        
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
