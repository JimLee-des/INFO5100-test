/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class AirlineDirectory {
    private ArrayList<Airline> airlineList;

    public AirlineDirectory(){
        this.airlineList=new ArrayList<Airline>();
    }

    public ArrayList<Airline> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(ArrayList<Airline> airlineList) {
        this.airlineList = airlineList;
    }
    
    public Airline createAirlineInfo(String Name){
        Airline airline= new Airline(Name);
        airlineList.add(airline);
        return airline;
    }
    
    public void deleteAirline(String name){
        for(int i=0;i<airlineList.size();i++){
            if(airlineList.get(i).getName().equals(name)){
                airlineList.remove(i);
            }
        }
    }
    
    public void updateAirlineInfo(Airline airline,String name){
        for(int i=0;i<airlineList.size();i++){
            if(airlineList.get(i).getName().equals(name)){
                airlineList.get(i).setName(name);
            }
        }
    }
    
    public Airplane AddAirplane(Airline airline,String id,String capacity, boolean repairStatus){
        Airplane airplane=new Airplane(id, capacity, false);
        airline.addAirplane(airplane);
        return airplane;
    }
    
    public void DeleteAirplane(Airline restro,Airplane airplane){
        for(int i=0; i<restro.getAirplaneList().size();i++){
            if(restro.getAirplaneList().get(i).getId().equals(airplane.getId())){
                restro.getAirplaneList().remove(i);
            }
        }
    }
}
