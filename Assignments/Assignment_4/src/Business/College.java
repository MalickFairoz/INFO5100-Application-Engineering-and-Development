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
public class College {
    
private String collegeName;

private DepartmentArray departmentArray;


 public College(DepartmentArray departmentArray) {
        this.departmentArray = departmentArray;
    }

public College() {
        departmentArray = new DepartmentArray();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    

    public DepartmentArray getDepartmentArray() {
        return departmentArray;
    }

    public void setDepartmentArray(DepartmentArray departmentArray) {
        this.departmentArray = departmentArray;
    }

    




}
