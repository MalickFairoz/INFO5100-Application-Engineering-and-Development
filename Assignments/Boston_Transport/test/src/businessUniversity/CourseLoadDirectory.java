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
public class CourseLoadDirectory {
    private ArrayList<CourseLoad> courseLoadList;

    public CourseLoadDirectory() {
        this.courseLoadList = new ArrayList<CourseLoad>();
    }

    public ArrayList<CourseLoad> getCourseLoadList() {
        return courseLoadList;
    }

    public void setCourseLoadList(ArrayList<CourseLoad> courseLoadList) {
        this.courseLoadList = courseLoadList;
    }
    
    public CourseLoad addCourseLoad(CourseOffering courseOffering, Seat seat){
        CourseLoad courseLoad = new CourseLoad();
        courseLoad.setSeat(seat);
        courseLoad.setCourseOffering(courseOffering);
        courseLoadList.add(courseLoad);
        return courseLoad;
    }
    
}
