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
import userinterface.SellerRole.SellerWorkAreaJPanel;

/**
 *
 * @author 刘欣卓
 */
public class SellerRole extends Role{
    
    public SellerRole(){
        this.type = RoleType.Seller;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.Seller;
        return new SellerWorkAreaJPanel(mainScreen, userAccount, system);
    }
    
}
