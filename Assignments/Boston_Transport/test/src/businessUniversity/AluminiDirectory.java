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
public class AluminiDirectory {
    private ArrayList<Alumini> aluminiList;

//private StudentDirectory studentDirectory;
    public AluminiDirectory() {
        this.aluminiList = new ArrayList<Alumini>();
  //      this.studentDirectory=new StudentDirectory();
    }

   /* public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }*/

    
    
    public ArrayList<Alumini> getAluminiList() {
        return aluminiList;
    }

    public void setAluminiList(ArrayList<Alumini> aluminiList) {
        this.aluminiList = aluminiList;
    }
    
    
    public Alumini addAlumini(String studentId,String companyName,String workingStatus,String salary,String passedYear){
        Alumini alumini=new Alumini();
      
        alumini.setStudentId(studentId);
        alumini.setCompanyName(companyName);
        alumini.setWorkingStatus(workingStatus);
        alumini.setSalary(salary);
        alumini.setPassedyYear(passedYear);
        
        aluminiList.add(alumini);
        return alumini;
    }
}
