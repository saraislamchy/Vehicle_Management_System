/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

/**
 *
 * @author Gcl
 */
public class Truck extends Vehicle  {
    
    private double cargoCapacity;

    public Truck(double cargoCapacity, int vehicleNumber, String ownerName, double currentSpeed) {
        super(vehicleNumber, ownerName, currentSpeed);
        this.cargoCapacity = cargoCapacity;
    }
    
    public void loadCargo(double amount){
        if ( amount > cargoCapacity)
        {
            System.out.println("Cargo capacity exceeded!!");
        }
    }
    
    public void unloadCargo(double amount){
        System.out.println(amount+"Cargo is unloaded ");
    }
    
}
