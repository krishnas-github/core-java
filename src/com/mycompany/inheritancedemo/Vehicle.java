package com.mycompany.inheritancedemo;

public class Vehicle {//Vehicle is the super class
    private String vehicleType;

    public Vehicle(){
        System.out.println("Default class of super class Vehicle");
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
