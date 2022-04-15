/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AirlineAdminRole.AirlineAdminWorkAreaJPanel;

/**
 *
 * @author 刘欣卓
 */
public class AirlineAdminRole extends Role{
    
    public AirlineAdminRole(){
        this.type = Role.RoleType.AirlineAdmin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = Role.RoleType.AirlineAdmin;
        return new AirlineAdminWorkAreaJPanel(mainScreen, userAccount, system);
    }
}
