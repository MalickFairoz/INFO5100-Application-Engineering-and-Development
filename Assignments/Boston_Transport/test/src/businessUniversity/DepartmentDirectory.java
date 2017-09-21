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
public class DepartmentDirectory {
    
    
    private ArrayList<Department> departmentList;

    public DepartmentDirectory() {
       
        this.departmentList = new ArrayList<Department> ();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }

    
   
     public  Department addDepartment(String departmentName){
    
      Department department = new Department();
      department.setName(departmentName);
      departmentList.add(department);
      return department;
    
}
}