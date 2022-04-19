/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Railline;

import Business.Customer.Passenger;
import Business.Order.Order;
import java.util.ArrayList;
import java.util.UUID;


public class RailLine {
    private ArrayList<Rail> railList;
    private ArrayList<Train> trainList;
    private ArrayList<Order> orderList;
    private ArrayList<RailCrew> railCrewList;
    private String name;

    public ArrayList<RailCrew> getrailCrewList() {
        return railCrewList;
    }

    public void setAircraftcrewList(ArrayList<RailCrew> aircraftcrewList) {
        this.railCrewList = railCrewList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Train> getFlightList() {
        return trainList;
    }

    public void setTrainList(ArrayList<Train> trainList) {
        this.trainList = trainList;
    }
    
    public void addTrain(String id, String originalplaceName, String destinationplaceName,String departureTime, String arrivingTime, String cost, String airline) {
        Train train = new Train();
        train.setFlight_id(id);
        train.setOriginalplace(originalplaceName);
        train.setDestinationplace(destinationplaceName);
        train.setDepartureTime(departureTime);
        train.setArrivingTime(arrivingTime);
        train.setCost(cost);
        train.setStatus(false);
        train.setReadyStatus(false);
        train.setCustomerStatus(false);
        train.setAirline(airline);
        train.setCustomerList(new ArrayList<Passenger>());
        train.setTimeStatus(false);
        trainList.add(train);
    }
    
    public void addAircraftCrew(String name){
        RailCrew ac = new RailCrew(name);
        railCrewList.add(ac);
    }
    
    public ArrayList<Rail> getRailList() {
        return railList;
    }
    
    public void addAirplane(Rail airplane){
        railList.add(airplane);
    }
    
    public void removeAirplane(Rail airplane){
        railList.remove(airplane);
    }
    
    public RailLine(String Name) {
        this.name = Name;
        railList=new ArrayList<Rail>();
        trainList=new ArrayList<Train>();
        orderList = new ArrayList<Order>();
        railCrewList = new ArrayList<RailCrew>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Order addOrder(String customerName, String train_id, String originalplace, String destinationplace, String departureTime, String arrivingTime, String airplane_id, String cost, String airline, boolean insurance){
        Order order = new Order(customerName, train_id, originalplace, destinationplace, departureTime, arrivingTime, airplane_id, cost, airline, insurance);
//        order.setFlight_id(train_id);
//        order.setOriginalplace(originalplace);
//        order.setDestinationplace(destinationplace);
//        order.setAirplane_id(airplane_id);
//        order.setDepartureTime(departureTime);
//        order.setArrivingTime(arrivingTime);
//        order.setCost(cost);
//        order.setAirline(airline);
//        order.setInsurance(insurance);
//        order.setCustomerName(customerName);
//        order.setOrder_id(getUUID());
        orderList.add(order);
        return order;
    }
    
    public String getUUID(){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString(); 
        String uuidStr=str.replace("-", "");
        return uuidStr;
      }
    
    public void deleteOrder(String order_id){
        for(int i=0; i<orderList.size(); i++){
            if(orderList.get(i).getOrder_id().equals(order_id)){
                orderList.remove(i);
            }
        }
    }
    
    public void deleteAirplane(String airplane_id){
        for(int i = 0; i< railList.size(); i++){
            if(railList.get(i).getId().equals(airplane_id)){
                railList.remove(i);
            }
        }
    }
    
    public void deleteFlight(String train_id){
        for(int i = 0; i< trainList.size(); i++){
            if(trainList.get(i).getrailNum_id().equals(train_id)){
                trainList.remove(i);
            }
        }
    }
    
    public void deleteAircraftCrew(String acname){
        for(int i = 0; i< railCrewList.size(); i++){
            if(railCrewList.get(i).getName().equals(acname)){
                railCrewList.remove(i);
            }
        }
    }
    
    public boolean checkIfAircraftCrewIsUnique(String name){
        for(RailCrew ac : railCrewList){
            if(ac.getName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkIfFlightIsUnique(String train_id){
        for(Train fl : trainList){
            if(fl.getrailNum_id().equals(train_id)){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkIfAirplaneIsUnique(String airplane_id){
        for (Rail ap : railList){
            if (ap.getId().equals(airplane_id)){
                return false;
            }      
        }
        return true;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
