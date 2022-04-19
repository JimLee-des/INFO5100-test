/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RailCrewRole.AircraftCrewWorkAreaJPanel;


public class RailCrewRole extends Role {
    
    public RailCrewRole(){
        this.type = RoleType.RailCrew;
    }

    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.RailCrew;
        return new AircraftCrewWorkAreaJPanel(mainScreen,userAccount,system);//To change body of generated methods, choose Tools | Templates.
    }
    
}
