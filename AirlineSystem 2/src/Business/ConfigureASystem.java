package Business;

import Business.Employee.Employee;
import Business.Role.AckemmaRole;
import Business.Role.AircraftCrewRole;
import Business.Role.AnnouncerRole;
import Business.Role.CommanderRole;
import Business.Role.MOPRole;
import Business.Role.SellerRole;
import Business.Role.SystemAdminRole;
import Business.Role.TicketCheckerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee employee1 = system.getEmployeeDirectory().createEmployee("Ackemma");
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("ackemma", "ackemma", employee, new AckemmaRole());
        
        Employee employee2 = system.getEmployeeDirectory().createEmployee("Commander");
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("commander", "commander", employee, new CommanderRole());
        
        Employee employee3 = system.getEmployeeDirectory().createEmployee("Announcer");
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("announcer", "announcer", employee, new AnnouncerRole());
        
        Employee employee4 = system.getEmployeeDirectory().createEmployee("TicketChecker");
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("ticketChecker", "ticketChecker", employee, new TicketCheckerRole());
        
        Employee employee5 = system.getEmployeeDirectory().createEmployee("Seller");
        UserAccount ua5 = system.getUserAccountDirectory().createUserAccount("seller", "seller", employee, new SellerRole());
        
        Employee employee6 = system.getEmployeeDirectory().createEmployee("MOP");
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("mop", "mop", employee, new MOPRole());
        
        return system;
    }
    
}
