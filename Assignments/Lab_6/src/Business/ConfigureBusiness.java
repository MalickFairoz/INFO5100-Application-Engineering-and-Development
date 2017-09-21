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
public class ConfigureBusiness {
    
    public static Businesse initializeBusiness()
    {
        Businesse businesse = Businesse.getInsance();
        
        //crete admin as employee
        Employee e = businesse.getEmployeeDirectory().addEmployee();
        e.setFirstName("Admin");
        e.setLastName("");
        e.setOrganization("NEU");
        
        // cretae user account for admin
        
        UserAccount ua = businesse.getUserAccountDirectory().addUserAccount();
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setPerson(e);
        ua.setRole(UserAccount.ADMIN_ROLE);
        ua.setIsActive(true);
        
        
        return businesse;
        
    }
    
}
