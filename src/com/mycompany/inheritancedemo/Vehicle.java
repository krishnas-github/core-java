package com.mycompany.inheritancedemo;

public class Vehicle {//Vehicle is the super class
    private String vehicleType;

    public Vehicle(){
        System.out.println("Default constructor of super class Vehicle");
    }
    public Vehicle(String vehicleType){
        this.vehicleType =vehicleType;
        System.out.println("parametrized constructor of super class Vehicle");
    }
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void Show(){
        System.out.println("I am parent class vehicle");
    }
}
