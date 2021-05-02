package com.mycompany.interfacedemo;

public class Bird implements Animal,SuperAnimal{//Example of multiple inheritance that is achived by interface.
    // The same is not achived by class

    @Override
    public void speak() {
        System.out.println("Hello i am a bird");
        System.out.println("I chirp");
    }
}
