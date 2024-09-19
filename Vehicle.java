/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

/**
 *
 * @author Gcl
 */
public class Vehicle {
    private int vehicleNumber;
    private String ownerName;
    private double currentSpeed;

    public Vehicle(int vehicleNumber, String ownerName, double currentSpeed) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.currentSpeed = currentSpeed;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
    
    public void accelerate(double speedIncrement){
        currentSpeed += speedIncrement;
        System.out.println("Speed accelerted by  " +speedIncrement);
    }
    
    public void brake(double speedDecrement){
        this.currentSpeed -= speedDecrement;
        
        if (this.currentSpeed < 0)
        {
            currentSpeed=0;
        }
        System.out.println("Speed is decreased by " +speedDecrement);
    }
    
    
    
}
