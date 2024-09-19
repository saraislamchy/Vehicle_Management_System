/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

/**
 *
 * @author Gcl
 */
public class Car extends Vehicle {
    
    private int numDoors;

    public Car(int numDoors, int vehicleNumber, String ownerName, double currentSpeed) {
        super(vehicleNumber, ownerName, currentSpeed);
        this.numDoors = numDoors;
    }

    public void lockDoors(){
        System.out.println("The Door is Locked");
    }
    public void unlockDoors(){
        System.out.println("The door is Unlocked");
    }
    
}
