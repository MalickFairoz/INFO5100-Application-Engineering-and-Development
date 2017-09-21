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
public class StudentAccount {
    
   public static Student financialStatus(Student student, StudentDirectory studentDeptDirectory) {

       if (student.getFeesStatus().equals("Paid"))
       {
           System.out.println("No Due is pending");
       }
       else
       {
           System.out.println("The Payment is pending");       
       }
  return null;
}       
    
}
