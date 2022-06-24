package com.syntax.class20;

public class Vehicle {
    int engineHP;
    String make;
    String model;

}
class Car extends Vehicle{
    String steeringType;
    boolean autoPilot;
    int noOfWindows;
}
class BMW extends Car{
    int topSpeed;
    void printBasicInfo(){
        engineHP=100;
        System.out.println(engineHP);
    }
}