package com.mycompany.inheritancedemo;

public class Car extends Vehicle {//Car is a subclass
    private long buildNumber;
    public Car(){
        super("Car is four Wheeler");
        System.out.println("Default constructor of child class car");
        //super.setVehicleType("Car is four Wheeler");
    }
    public  Car(long buildNumber){
        this();//Called the default constructor of Car class(which is line number 5
        this.buildNumber =buildNumber;


    }
    public void display(){
        System.out.println(super.getVehicleType());
        System.out.println("Build number of this car is: "+buildNumber);
    }
    public void Show(){
        System.out.println("I am child class Car");
    }
}
