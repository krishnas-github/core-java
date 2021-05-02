package com.mycompany.inheritancedemo;

public class InheritanceMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        /*Bike bike = new Bike();
        bike.display();
        Car car = new Car(7386);
        car.display();
        System.out.println("-----------------------------------");
        // The concept of making decision to which objets method should be called at run time
        //is called dynamic polymorphism
        //whose object that particular class method gets called
        Vehicle vehicle = new Vehicle();
        vehicle.Show();
//method is overriding
        vehicle = new Bike();//Vehicle reference is point to the bike object according to the line 12 rule
        //bike class show is called.
        vehicle.Show();
//method is overriding(modifying the definition of show inherited from the parent class)
        vehicle = new Car();//The child class car is overloading the logic of the parent class function show().
        vehicle.Show();*/
    }
}