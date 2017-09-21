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
public class Transcript {
    

private CourseLoadArray cl;

   

//This command will fetch the values from courseLoad class 
public Transcript() {
        cl = new CourseLoadArray();
    }

    public CourseLoadArray getCourseLoadArray() {
        return cl;
    }

    public void setCourseLoadArray(CourseLoadArray c) {
        this.cl = c;
    }

    
 
    
}
