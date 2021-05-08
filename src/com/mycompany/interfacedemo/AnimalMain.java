package com.mycompany.interfacedemo;

import com.mycompany.accessmodifier2.Tiger;

public class AnimalMain {
    public static void main (String[] args){
        //Bird b = new Bird();
        Animal b = new Bird();//method overriding. (jiska object uska method call hoga)
        b.speak();
        //Lion l = new Lion();
        Animal l = new Lion();
        l.speak();
        /*Animal A = new Animal() {
            @Override
            public void speak() {

            }
        }*/

    }
}
