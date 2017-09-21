/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.*;


/**
 *
 * @author Malick
 */

public class FacultyDirectory {
    private ArrayList<Faculty> facultyDirectory;

    public ArrayList<Faculty> getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(ArrayList<Faculty> facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }

   

    public FacultyDirectory(){
        facultyDirectory = new ArrayList<Faculty>();
    }
    public Faculty addFaculty(){
            Faculty f = new Faculty();
            facultyDirectory.add(f);
            return f;
        }
        
    
    
    public void removeFaculty(Faculty f){
        facultyDirectory.remove(f);
    }
    
    public  static double calculatePhdPercentage(){
        FacultyDirectory f1 = Initialization.initializefaculty();
        int a= Collections.frequency(f1.getFacultyDirectory(), "PHD");
        System.out.println("calculatePhdPercentage"+a);
        int itemCount = f1.getFacultyDirectory().size();
        double d= (a/itemCount)*100;
        System.out.println("The percentage of Staffs with PHD is: "+ d);
        return d;
    }
    public static int calculateFacultyRatio(){
        FacultyDirectory f2 = Initialization.initializefaculty();
        int a= Collections.frequency(f2.getFacultyDirectory(), "Full Time");
        System.out.println("full time count"+a);
        int b= Collections.frequency(f2.getFacultyDirectory(), "Part Time");
        System.out.println("part time count"+b);
        System.out.println("The Full Time to Part Time Faculty ratio is"+ a+":"+b);
        return a/b;
    }
    
    
}
