/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.PassengerDirectory;
import Business.Airline.RailLineDirectory;
import Business.InsuranceCom.InsuranceComDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Airport.RailStationDirectory;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RailLineDirectory railLineDirectory;
    private RailStationDirectory railStationDirectory;
    private InsuranceComDirectory insuranceComDirectory;
    private PassengerDirectory customerDirectory;

    public EcoSystem(RailLineDirectory railLineDirectory, RailStationDirectory railStationDirectory, InsuranceComDirectory insuranceComDirectory, PassengerDirectory customerDirectory) {

        this.railLineDirectory = railLineDirectory;
        this.railStationDirectory = railStationDirectory;
        this.insuranceComDirectory = insuranceComDirectory;
        this.customerDirectory = customerDirectory;
     
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

    public PassengerDirectory getCustomerDirectory() {
        if(customerDirectory == null){
            customerDirectory = new PassengerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(PassengerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public RailLineDirectory getRailLineDirectory() {
        if(railLineDirectory == null){
            railLineDirectory = new RailLineDirectory();
        }
        return railLineDirectory;
    }

    public void setRailLineDirectory(RailLineDirectory railLineDirectory) {
        this.railLineDirectory = railLineDirectory;
    }

    public RailStationDirectory getRailStationDirectory() {
        if(railStationDirectory == null){
            railStationDirectory = new RailStationDirectory();
        }
        return railStationDirectory;
    }

    public void setRailStationDirectory(RailStationDirectory railStationDirectory) {
        this.railStationDirectory = railStationDirectory;
    }

    public InsuranceComDirectory getInsuranceComDirectory() {
        if(insuranceComDirectory == null){
            insuranceComDirectory = new InsuranceComDirectory();
        }
        return insuranceComDirectory;
    }

    public void setInsuranceComDirectory(InsuranceComDirectory insuranceComDirectory) {
        this.insuranceComDirectory = insuranceComDirectory;
    }

}
