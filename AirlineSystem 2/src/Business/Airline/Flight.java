/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author 刘欣卓
 */
public class Flight {
    private String flight_id;
    private String originalplace;
    private String destinationplace;
    private boolean status;//是否出发
    private boolean readyStatus;//乘务组是否上飞机
    private boolean customerStatus;//检票员决定顾客是否已经全部上飞机
    private boolean timeStatus;//是否延误
    private String airplane_id;
    private String cost;
    private String departureTime;
    private ArrayList<Customer> customerList;
    private String arrivingTime;
    private String airline;

    public boolean isTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(boolean timeStatus) {
        this.timeStatus = timeStatus;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public String getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(String arrivingtime) {
        this.arrivingTime = arrivingtime;
    }

    
    public String getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public String getOriginalplace() {
        return originalplace;
    }

    public void setOriginalplace(String originalplaceName) {
        this.originalplace = originalplaceName;
    }

    public String getDestinationplace() {
        return destinationplace;
    }

    public void setDestinationplace(String destinationplaceName) {
        this.destinationplace = destinationplaceName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(boolean customerStatus) {
        this.customerStatus = customerStatus;
    }

    public boolean isReadyStatus() {
        return readyStatus;
    }

    public void setReadyStatus(boolean readyStatus) {
        this.readyStatus = readyStatus;
    }
    
    public String getAirplane_id() {
        return airplane_id;
    }

    public void setAirplane_id(String airplane_id) {
        this.airplane_id = airplane_id;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    
    @Override
    public String toString(){
        return flight_id;
    }
}
