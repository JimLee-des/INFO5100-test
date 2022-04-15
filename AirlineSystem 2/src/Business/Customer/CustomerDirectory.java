/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    public ArrayList<Customer> getCustList() {
        return customerList;
    }
    
    public void setCustList(ArrayList<Customer> custList) {
        this.customerList = custList;
    }
    
    public CustomerDirectory(){
        this.customerList = new ArrayList<Customer>();
    }
    
    public Customer createCustomer(String name, String ppn, String tn){
        Customer customer= new Customer(name, ppn, tn);
        customerList.add(customer);
        return customer;
    }
    
    public void updateCustomer(String name, String cname, String ppn, String tn){
        for(int i = 0;i < customerList.size(); i++){
            if(customerList.get(i).getName().equals(name)){
                customerList.get(i).setName(cname);
                customerList.get(i).setPassportNum(ppn);
                customerList.get(i).setTelNum(tn);
            }
        }
    }
    
    public void deleteCustomer(String name){
        for(int i = 0;i < customerList.size(); i++){
            if(customerList.get(i).getName().equals(name)){
                customerList.remove(i);
            }
        }
    }
}
