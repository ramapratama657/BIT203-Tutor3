/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
import java.util.Scanner;
public class Menu_Vehicle {
    public static void main(String[] args){
        Vehicle bus = new Bus("DK 1227 MD","Rama", 8,8);
        Vehicle car = new Car("DK 626 MD", "Rama",5);
        System.out.println(bus);
        System.out.println(car);
       
    }
}
