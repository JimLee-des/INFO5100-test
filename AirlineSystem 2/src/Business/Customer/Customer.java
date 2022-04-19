/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import java.util.ArrayList;


public class Customer {
    private String Name;
    private ArrayList<Order> orderList;
    private String passportNum;
    private String telNum;
    
    public Customer(String name, String ppn, String tn){
        this.Name = name;
        this.passportNum = ppn;
        this.telNum = tn;
        orderList = new ArrayList<Order>();
    }
    
    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }
    
    public void deleteOrder(Order order){
        for(int i=0; i<orderList.size(); i++){
            if(orderList.get(i).getOrder_id().equals(order.getOrder_id())){
                orderList.remove(i);
            }
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String UserName) {
        this.Name = UserName;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> order) {
        this.orderList = order;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public boolean checkIfOrderIsUnique(Order order){
        for(Order od : orderList){
            if(od.getRailNum_id().equals(order.getRailNum_id()) && od.isStatus()==false){
                return true;
            }
        }
        return false;
    }
}
