/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import java.util.ArrayList;


public class RailLineDirectory {
    private ArrayList<RailLine> RailLineList;

    public RailLineDirectory(){
        this.RailLineList=new ArrayList<RailLine>();
    }

    public ArrayList<RailLine> getRailLineList() {
        return RailLineList;
    }

    public void setRailLineList(ArrayList<RailLine> RailLineList) {
        this.RailLineList = RailLineList;
    }
    
    public RailLine createRailLineInfo(String Name){
        RailLine airline= new RailLine(Name);
        RailLineList.add(airline);
        return airline;
    }
    
    public void deleteRailLine(String name){
        for(int i=0;i<RailLineList.size();i++){
            if(RailLineList.get(i).getName().equals(name)){
                RailLineList.remove(i);
            }
        }
    }
    
    public void updateRailLineInfo(RailLine airline,String name){
        for(int i=0;i<RailLineList.size();i++){
            if(RailLineList.get(i).getName().equals(name)){
                RailLineList.get(i).setName(name);
            }
        }
    }
    
    public Rail AddAirplane(RailLine airline,String id,String capacity, boolean repairStatus){
        Rail airplane=new Rail(id, capacity, false);
        airline.addAirplane(airplane);
        return airplane;
    }
    
    public void DeleteAirplane(RailLine restro,Rail airplane){
        for(int i=0; i<restro.getAirplaneList().size();i++){
            if(restro.getAirplaneList().get(i).getId().equals(airplane.getId())){
                restro.getAirplaneList().remove(i);
            }
        }
    }
}
