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
public class Initialization {
    
    public static Course initializeStudent() {

        Course course=new Course();
        course.setCourseName("AED");
        course.setCourseCode("5100");
        course.setCreditHours(Integer.parseInt("4"));
        course.setCreditPrice(Integer.parseInt("1500"));
        course.setPrerequisiteCourse("JAVA");
        course.setFollowupCourse("WEBTOOLS");
        course.setCoreCourses("AED");
        course.setElectiveCourses("DBMS");
        
        
        

        
        
    
    }
}
