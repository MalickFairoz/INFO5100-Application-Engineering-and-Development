/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;


/**
 *
 * @author Malick
 */
public class CourseOfferingDirectory {
    private ArrayList<CourseOffering> cousreOfferingList;

    public CourseOfferingDirectory() {
        cousreOfferingList = new ArrayList<>();
    }

    public ArrayList<CourseOffering> getCousreOfferingList() {
        return cousreOfferingList;
    }

    public void setCousreOfferingList(ArrayList<CourseOffering> cousreOfferingList) {
        this.cousreOfferingList = cousreOfferingList;
    }
    
    public CourseOffering addCourseOffering(){
      CourseOffering courseOffering = new CourseOffering();
      cousreOfferingList.add(courseOffering);
      return courseOffering;
    
    
}
}
