package com.mycompany.accessmodifier;

public class Bird {
    public void display(){
        Animal animal = new Animal();
        //System.out.println(animal.animalName);//private variable "animalName" can only be accessed only in the animal class
        System.out.println(animal.getAnimalName() );//public members can be accessed within same package and outside with a different package
        System.out.println(animal.animalType);//default member variables and function can be accessed within the same class, outside the class but in same package
        System.out.println(animal.canFly);//protected members(method/variables) can be accessed within the same class and within the same package
    }
}
