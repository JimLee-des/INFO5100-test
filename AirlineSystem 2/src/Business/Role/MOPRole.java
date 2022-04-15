/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MOPRole.MOPWorkAreaJPanel;

/**
 *
 * @author 刘欣卓
 */
public class MOPRole extends Role{
    
    public MOPRole(){
        this.type = RoleType.MOP;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.MOP;
        return new MOPWorkAreaJPanel(mainScreen, userAccount, system);
    }
    
}
