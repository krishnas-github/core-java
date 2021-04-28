package com.mycompany.inheritancedemo;

public class Bike extends Vehicle{//Bike is sub class
    public Bike(){
        //super();similar to calling //Vehicle();If we don't call explicitly, JVM will will call automatically
        System.out.println("Default constructor of child class Bike");
        super.setVehicleType("Bike is two wheelers");
    }
    public void display(){
        System.out.println(getVehicleType());
    }
    public void Show(){
        System.out.println("I am child class Bike");
    }
}
