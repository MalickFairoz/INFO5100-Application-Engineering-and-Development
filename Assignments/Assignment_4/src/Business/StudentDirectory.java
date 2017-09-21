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
public class StudentDirectory {

    private ArrayList<Student> StudentDeptDirectory;

    public StudentDirectory(){
        StudentDeptDirectory = new ArrayList<>();
    }
    public ArrayList<Student> getStudentDeptDirectory() {
        return StudentDeptDirectory;
    }

    public void setStudentDeptDirectory(ArrayList<Student> StudentDeptDirectory) {
        this.StudentDeptDirectory = StudentDeptDirectory;
    }
    
     public Student addStudent() {
        Student sd = new Student();
        StudentDeptDirectory.add(sd);
        return sd;
    }

    public void deleteProduct(Student s) {
        StudentDeptDirectory.remove(s);

    }
}
