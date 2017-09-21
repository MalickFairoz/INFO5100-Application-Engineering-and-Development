/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

import java.util.ArrayList;

/**
 *
 * @author PeaceFull
 */
public class FacultyDirectory {
    
     private ArrayList<Faculty> facultyList;
     
     private ArrayList<Faculty> staffList;
    
   
    public FacultyDirectory() {
        this.facultyList = new ArrayList<Faculty> ();
        this.staffList=new ArrayList<Faculty>();
  
    }

  

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public ArrayList<Faculty> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Faculty> staffList) {
        this.staffList = staffList;
    }

  
    public  Faculty addFaculty(){
        Faculty faculty = new Faculty();
        facultyList.add(faculty);
        return faculty;
    }
  
    
    public  Faculty addFaculty1(String firstName,String lastName,String designation,String availability,String role,String JobRole){
    
      Faculty faculty = new Faculty();
      faculty.setFirstName(firstName);
      faculty.setLastName(lastName);
      faculty.setDesignation(designation);
      faculty.setAvailability(availability);
      faculty.setRole_description(designation);
     faculty.setJobRole(JobRole);
      if(JobRole.equals("Teaching Faculty")){
      facultyList.add(faculty);
      }
      else{
        staffList.add(faculty);
      }
        return faculty;
    }
    
  
                
  

}
