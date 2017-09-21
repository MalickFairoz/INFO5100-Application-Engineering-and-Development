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
public class Employee extends Person{
    
    private static int count=1000;
    private int employeeId;
    private String organization;
    
    public Employee()
    {
        employeeId = count++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    
    @Override
    public String toString()
    {
        return this.getFirstName();
                
    }
    
    
}
