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
public class CourseScheduleDirectory {

    private ArrayList<CourseSchedule> courseScheduleList;

    public CourseScheduleDirectory() {
        this.courseScheduleList = new ArrayList<CourseSchedule>();
    }

    public ArrayList<CourseSchedule> getCourseScheduleList() {
        return courseScheduleList;
    }

    public CourseSchedule addCourseSchedule(ClassRoom classRoom, Faculty faculty,CourseOffering offer) {
        CourseSchedule courseSchedule = new CourseSchedule();
        courseSchedule.setClassRoom(classRoom);
        courseSchedule.setPerson(faculty);
        courseScheduleList.add(courseSchedule);
        return courseSchedule;

    }
}
