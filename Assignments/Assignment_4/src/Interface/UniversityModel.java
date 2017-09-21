/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Initialization;
import Business.UniversityArray;
import java.util.Scanner;

/**
 *
 * @author Malick
 */
public class UniversityModel {

    private static UniversityArray universityArray;

    public static void main(String[] args) {
 
        //UniversityArray ua = new UniversityArray();

       //da.displayCourseName();

        System.out.println("*********Welcome to the EDUCATION LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice for performance of education");
        System.out.println("1. What is the ratio of full time faculty vs part-time? ");
        System.out.println("2. What is the percentage of faculty with Ph.Ds? ");
        System.out.println("3. What is the faculty/student ratio ? ");
        System.out.println("4. What is the Faculty staff ratio? ");
        System.out.println("5. What are the Number Student Registered with the Department? ");
        System.out.println("Please enter a number");
                Scanner reader1 = new Scanner(System.in);
                universityArray = Initialization.initialize1();
                int choice1 = reader1.nextInt();
                switch (choice1) {
                    case 1:
                        universityArray.calculateUniversityFacultyRatio(universityArray);
                        break;
                    case 2:
                        universityArray.calculateUniversityPhdPercentage(universityArray);
                        break;    
                    case 3:
                        universityArray.calculateUniversityStudentFacultyRatio(universityArray);
                        break;
                    case 4:
                        universityArray.calculateUniversityFacultyStaffRatio(universityArray);
                        break;
                    case 5:
                         universityArray.studentEmploymentRatio(universityArray);
                         break;
                    default:
                        System.out.println("Invalid entry ");
                        
                }  

    }

}
