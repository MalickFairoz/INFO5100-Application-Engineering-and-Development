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
public class StudentDirectory {

     private ArrayList<Student> studentList;
    
    public StudentDirectory() {
        this.studentList = new ArrayList<Student>();
     
    }

    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
     
     public Student addStudent(String studentName,String studentId,String startYear,String department,String numberPaper,String numberInternship){
         Student student = new Student();
         student.setStudentName(studentName);
         student.setStudentId(studentId);
         student.setStartYear(startYear);
         student.setDepartment(department);
         student.setNumberOfPaperPublished(numberPaper);
         student.setNumberOfInternship(numberInternship);
         
         
         studentList.add(student);
         return student;
     }
     
      public Student addAlumini(String studentName,String studentId,String startYear,String department){
         Student student = new Student();
         student.setStudentName(studentName);
         student.setStudentId(studentId);
         student.setStartYear(startYear);
         student.setDepartment(department);
        
         studentList.add(student);
         return student;
     }
}
