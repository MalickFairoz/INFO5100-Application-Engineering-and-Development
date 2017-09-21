/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
//import java.util.*;


/**
 *
 * @author Malick
 */

public class Department {
    private String departmentName;
    private FacultyDirectory facultyDirectory;
    private StudentDirectory studentDirectory;
    private CourseCatalog courseCatalog;
    private StaffRoleDirectory staffRoleDirectory;

    public Department(StaffRoleDirectory staffRoleDirectory) {
        this.staffRoleDirectory = staffRoleDirectory;
    }

    public StaffRoleDirectory getStaffRoleDirectory() {
        return staffRoleDirectory;
    }

    public void setStaffRoleDirectory(StaffRoleDirectory staffRoleDirectory) {
        this.staffRoleDirectory = staffRoleDirectory;
    }
    
    

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }
    
    public Department(){
        facultyDirectory = new FacultyDirectory();
        studentDirectory = new StudentDirectory();
        this.courseCatalog = new CourseCatalog();
    }
      
}
