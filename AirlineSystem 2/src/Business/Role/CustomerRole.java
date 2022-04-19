/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Airline.Airline;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;


public class CustomerRole extends Role{

    public CustomerRole(){
        this.type = RoleType.Customer;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.Customer;
        return new CustomerAreaJPanel(mainScreen, userAccount, system);
    }

    
    
}
