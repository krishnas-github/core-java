package com.mycompany.accessmodifier;

public class Animal {
    private String animalName ="Fox";
    String animalType;
    protected boolean canFly;
    public String getAnimalName()
    {
        System.out.println(this.animalName);//private members can be accessed within the same class
        System.out.println(this.canFly);////protected members can be accessed within the same class
        System.out.println(this.animalType);////default members can be accessed within the same class
        return this.animalName;//private members can be accessed within same class
    }
}
