/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class Car extends Vehicle{
    private int seatCap;
    public Car(String reg, String own, int seat){
        super(reg, own);
        this.seatCap=seat;
    }
    
    public void setSeatCap(int seat){
        this.seatCap=seat;
    }
    public int getSeatCap(){
        return this.seatCap;
    }
    
    public String toString(){
        return "Car "+super.getRegNo()+" owned by "+super.getOwner()+" with seat capacity "+this.seatCap;
    }
}
