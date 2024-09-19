/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab;

/**
 *
 * @author Gcl
 */
public class Lab {

    public static void main(String[] args) {
       Car c1 = new Car(1234, 14,"Tom", 2);
       c1.accelerate(40.0);
       //c1.break(20.0);
       c1.lockDoors();
       c1.unlockDoors();
       
       Truck T1 = new Truck(23.0, 2, "John", 0.1);
       T1.accelerate(30.0);
       T1.brake(10.0);
       T1.loadCargo(10.0);
       T1.unloadCargo(5.0);
       
       
       Vehicle v1 = new Car(2365,30, "Jim", 20.0);
       v1.accelerate(40.0);
       //v1.break(10.0);
       
       v1 = new Truck(2885,80, "Jack", 15.0);
       v1.accelerate(30.0);
       //v1.break(20.0);
    }
}
