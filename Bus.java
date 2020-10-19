/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class Bus extends Vehicle {
    private int stanCap, sitCap;
    public Bus(String reg, String own, int stand, int sit){
        super(reg,own);
        this.sitCap=sit;
        this.stanCap=stand;
    }
    public void setSitCap(int sit){
        this.sitCap=sit;
    }
    public int getSitCap(){
        return this.sitCap;
    }
    
    public void setStanCap(int stand){
        this.stanCap=stand;
    }
    public int getStandCap(){
        return this.stanCap;
    }
    
    public String toString(){
        return "Bus "+super.getRegNo()+" owned by "+super.getOwner()+" with sitting capacity: "+this.sitCap+" and standing capacity: "+this.stanCap;
    }
}
