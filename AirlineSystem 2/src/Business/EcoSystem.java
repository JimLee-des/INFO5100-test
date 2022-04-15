/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.Airline.AirlineDirectory;
import Business.InsuranceCom.InsuranceComDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Airport.AirportDirectory;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private AirlineDirectory airlineDirectory;
    private AirportDirectory airportDirectory;
    private InsuranceComDirectory insuranceComDirectory;
    private CustomerDirectory customerDirectory;

    public EcoSystem(AirlineDirectory airlineDirectory, AirportDirectory airportDirectory, InsuranceComDirectory insuranceComDirectory, CustomerDirectory customerDirectory) {

        this.airlineDirectory = airlineDirectory;
        this.airportDirectory = airportDirectory;
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

    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null){
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public AirlineDirectory getAirlineDirectory() {
        if(airlineDirectory == null){
            airlineDirectory = new AirlineDirectory();
        }
        return airlineDirectory;
    }

    public void setAirlineDirectory(AirlineDirectory airlineDirectory) {
        this.airlineDirectory = airlineDirectory;
    }

    public AirportDirectory getAirportDirectory() {
        if(airportDirectory == null){
            airportDirectory = new AirportDirectory();
        }
        return airportDirectory;
    }

    public void setAirportDirectory(AirportDirectory airportDirectory) {
        this.airportDirectory = airportDirectory;
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
