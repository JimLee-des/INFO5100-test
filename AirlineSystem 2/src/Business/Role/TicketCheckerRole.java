/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PassengerRole.PassengerAreaJPanel;
import userinterface.TicketCheckerRole.TicketCheckerWorkAreaJPanel;

/**
 *
 * @author 刘欣卓
 */
public class TicketCheckerRole extends Role{
    
    public TicketCheckerRole(){
        this.type = RoleType.TicketChecker;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.TicketChecker;
        return new TicketCheckerWorkAreaJPanel(mainScreen, userAccount, system);
    }
    
}
