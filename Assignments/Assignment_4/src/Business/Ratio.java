/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Collections;

/**
 *
 * @author Malick
 */
public class Ratio {
    public  int calculateFacultyRatio(){
        FacultyDirectory f2 = new FacultyDirectory();
        int a= Collections.frequency(f2.getFacultyDirectory(), "Full Time");
        System.out.println("full time count"+a);
        int b= Collections.frequency(f2.getFacultyDirectory(), "Part Time");
        System.out.println("part time count"+b);
        System.out.println("The Full Time to Part Time Faculty ratio is"+ a+":"+b);
        return a/b;
    }
}
