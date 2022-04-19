/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import Business.Customer.Customer;
import Business.Order.Order;
import java.util.ArrayList;
import java.util.UUID;


public class Airline {
    private ArrayList<Airplane> airplaneList;
    private ArrayList<Flight> flightList;
    private ArrayList<Order> orderList;
    private ArrayList<AircraftCrew> aircraftcrewList;
    private String name;

    public ArrayList<AircraftCrew> getAircraftcrewList() {
        return aircraftcrewList;
    }

    public void setAircraftcrewList(ArrayList<AircraftCrew> aircraftcrewList) {
        this.aircraftcrewList = aircraftcrewList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public void addFlight(String id, String originalplaceName, String destinationplaceName,String departureTime, String arrivingTime, String cost, String airline) {
        Flight flight = new Flight();
        flight.setFlight_id(id);
        flight.setOriginalplace(originalplaceName);
        flight.setDestinationplace(destinationplaceName);
        flight.setDepartureTime(departureTime);
        flight.setArrivingTime(arrivingTime);
        flight.setCost(cost);
        flight.setStatus(false);
        flight.setReadyStatus(false);
        flight.setCustomerStatus(false);
        flight.setAirline(airline);
        flight.setCustomerList(new ArrayList<Customer>());
        flight.setTimeStatus(false);
        flightList.add(flight);
    }
    
    public void addAircraftCrew(String name){
        AircraftCrew ac = new AircraftCrew(name);
        aircraftcrewList.add(ac);
    }
    
    public ArrayList<Airplane> getAirplaneList() {
        return airplaneList;
    }
    
    public void addAirplane(Airplane airplane){
        airplaneList.add(airplane);
    }
    
    public void removeAirplane(Airplane airplane){
        airplaneList.remove(airplane);
    }
    
    public Airline(String Name) {
        this.name = Name;
        airplaneList=new ArrayList<Airplane>();
        flightList=new ArrayList<Flight>();
        orderList = new ArrayList<Order>();
        aircraftcrewList = new ArrayList<AircraftCrew>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Order addOrder(String customerName, String flight_id, String originalplace, String destinationplace, String departureTime, String arrivingTime, String airplane_id, String cost, String airline, boolean insurance){
        Order order = new Order(customerName, flight_id, originalplace, destinationplace, departureTime, arrivingTime, airplane_id, cost, airline, insurance);
//        order.setFlight_id(flight_id);
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
        for(int i = 0; i< airplaneList.size(); i++){
            if(airplaneList.get(i).getId().equals(airplane_id)){
                airplaneList.remove(i);
            }
        }
    }
    
    public void deleteFlight(String flight_id){
        for(int i = 0; i< flightList.size(); i++){
            if(flightList.get(i).getFlight_id().equals(flight_id)){
                flightList.remove(i);
            }
        }
    }
    
    public void deleteAircraftCrew(String acname){
        for(int i = 0; i< aircraftcrewList.size(); i++){
            if(aircraftcrewList.get(i).getName().equals(acname)){
                aircraftcrewList.remove(i);
            }
        }
    }
    
    public boolean checkIfAircraftCrewIsUnique(String name){
        for(AircraftCrew ac : aircraftcrewList){
            if(ac.getName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkIfFlightIsUnique(String flight_id){
        for(Flight fl : flightList){
            if(fl.getFlight_id().equals(flight_id)){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkIfAirplaneIsUnique(String airplane_id){
        for (Airplane ap : airplaneList){
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
