package com.mycompany.finaldemo;

public class Apple extends Fruit{

    //@Override// What is this?
    public int display(String name){
        System.out.println("Apple class");
        return 0;
    }

    @Override
    public void display(){
        System.out.println("Child class Apple");
    }

}
