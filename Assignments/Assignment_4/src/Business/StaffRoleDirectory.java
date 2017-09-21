/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malick
 */
public class StaffRoleDirectory {
    List <StaffRole> staffRoleDirectory;
    
      public StaffRoleDirectory() {
        staffRoleDirectory = new ArrayList<>();
    }
    

    public List<StaffRole> getStaffRoleDirectory() {
        return staffRoleDirectory;
    }

    public void setStaffRoleDirectory(List<StaffRole> staffRoleDirectory) {
        this.staffRoleDirectory = staffRoleDirectory;
    }
    
    public StaffRole addStaffRole() {
        StaffRole staffRole = new StaffRole();
        staffRoleDirectory.add(staffRole);
        return staffRole;
    }
  
}
