/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class Vehicle {
    private String regNo, owner;
    public Vehicle(String reg, String own){
        this.regNo=reg;
        this.owner=own;
    }
    
    public void setRegNo(String reg){
        this.regNo=reg;
    }
    public String getRegNo(){
        return this.regNo;
    }
    
    public void setOwner(String own){
        this.owner=own;
    }
    public String getOwner(){
        return this.owner;
    }
    
    public String toString(){
        return this.regNo+" owned by "+this.owner;
    }
}
