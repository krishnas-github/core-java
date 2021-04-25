package com.mycompany.accessmodifier2;

import com.mycompany.accessmodifier.Animal;

public class Tiger {
    public void display(){
        Animal animal = new Animal();
        //System.out.println(animal.animalName);//animalName private variable cannot be accessed outside the class
        //System.out.println(animal.animaltype);//animaltype default variable cannot be accessed outside the package.
        System.out.println(animal.getAnimalName());//animal.getanimalName public method can be accessed outside the package.
        //System.out.println(animal.canFly);//protected members cannot be accessed outside the package

    }

}
