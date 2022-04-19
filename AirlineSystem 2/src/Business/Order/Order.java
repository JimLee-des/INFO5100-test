/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.UUID;

// 
public class Order {
    private String order_id;
    private String customerName;
    private String railNum_id;;
    private String originalplace;
    private String destinationplace;
    private String departureTime;
    private String arrivingTime;
    private String rail_id;
    private String cost;
    private boolean status;
    private String railLine;
    private boolean insurance; 

    public Order(String customerName, String railNum_id, String originalplace, String destinationplace, String departureTime, String arrivingTime,  String rail_id, String cost, String railLine, boolean insurance) {
        this.customerName = customerName;
        this.railNum_id = railNum_id;
        this.originalplace = originalplace;
        this.destinationplace = destinationplace;
        this.departureTime = departureTime;
        this.arrivingTime = arrivingTime;
        this.rail_id = rail_id;
        this.cost = cost;
        this.railLine = railLine;
        this.insurance = insurance;
        this.order_id = getUUID();
        this.status = false;
    }

    public String getUUID(){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString(); 
        String uuidStr=str.replace("-", "");
        return uuidStr;
      }
    
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(String arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public String getRail_id() {
        return rail_id;
    }

    public void setRail_id(String rail_id) {
        this.rail_id = rail_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRailNum_id() {
        return railNum_id;
    }

    public void setRailNum_id(String railNum_id) {
        this.railNum_id = railNum_id;
    }

    public String getOriginalplace() {
        return originalplace;
    }

    public void setOriginalplace(String originalplace) {
        this.originalplace = originalplace;
    }

    public String getDestinationplace() {
        return destinationplace;
    }

    public void setDestinationplace(String destinationplace) {
        this.destinationplace = destinationplace;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getrailLine() {
        return railLine;
    }

    public void setrailLine(String airline) {
        this.railLine = airline;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    
    @Override
    public String toString() {
        return order_id;
    }
}
