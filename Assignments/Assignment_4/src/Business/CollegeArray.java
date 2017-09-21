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
public class CollegeArray {
    
    private ArrayList<College> collegeArray;
 
    public ArrayList<College> getCollegeArray() {
        return collegeArray;
    }

    public void setCollegeArray(ArrayList<College> collegeArray) {
        this.collegeArray = collegeArray;
    }
    
    
       public CollegeArray() {
        collegeArray = new ArrayList<College>();
    }
       
     
    public College addCollege() {
        College cl = new College();
        collegeArray.add(cl);
        return cl;
    }

    public void deleteCollege(College c) {
        collegeArray.remove(c);

    }

    
//    public int calculateCollegeFacultyStaffRatio(){
//        int result =0;
//        FacultyDirectory f = Initialization.initializefaculty();
//        for(College c: collegeArray){
//            for(Department d: departmentArray.getDepartmentArray()){
//                departmentArray.calculateFacultyStaffRatio();
//            }
//    }
//     return result;    
//    } 
    
//    public int calculateCollegeStudentFacultyRatio(){
//        int result =0;
//        FacultyDirectory f = Initialization.initializefaculty();
//        for(College c: collegeArray){
//            for(Department d: departmentArray.getDepartmentArray()){
//                departmentArray.calculateStudFacultyRatio();
//            }
//}return result;
//    
//    }
//    
//    public int calculateCollegePhdPercentage(){
//        int result =0;
//        FacultyDirectory f = Initialization.initializefaculty();
//        for(College c: collegeArray){
//            for(Department d: departmentArray.getDepartmentArray()){
//                departmentArray.calculatePhdPercentage();
//            }
//}return result;
//    }
//    
//    public int studentsRegistered()
//    {
//        int a=0;
//        int b=0;
//        int c=0;
//       StudentDeptArray s1 = Initialization.initializeStudent();
//        for (Student student: s1.getStudentDeptDirectory())
//        {
//            
//            if (student.getGraduationStatus() == "InProgress" && student.getDept().equalsIgnoreCase("Dept1")){
//                a++;
//               
//            }
//            if (student.getGraduationStatus() == "InProgress" && student.getDept().equalsIgnoreCase("Dept2")){
//                b++;
//               
//            }
//            if (student.getGraduationStatus() == "InProgress" && student.getDept().equalsIgnoreCase("Dept3")){
//                c++;
//               
//            }
//            
//        }
//         System.out.println("Number Student Registered with Dept 1:"+a);
//         System.out.println("Number Student Registered with Dept 2:"+b);
//         System.out.println("Number Student Registered with Dept 3:"+c);
//     return a;           
//    }
}
