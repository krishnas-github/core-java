package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemoTwo {
    public static void main(String[] args){
        //List Maintain the order of insertion
        //ArrayList<String> fruitList = new ArrayList<>();
        List<String> fruitList = new ArrayList<>(); // List is a interface whose object cannot be created directly. Hence
        //it is created with the help of its reference class ArrayList()
        fruitList.add("Mango");         //Add String to the list
        fruitList.add("Apple");
        fruitList.add("Papaya");
        //fruitList.add(123);          //Since it is set generic to string, it wont allow to add other value other than string
        fruitList.add(null);            //Allows to add null values
        System.out.println(fruitList.get(1));       //Get the list item at index 1
        fruitList.add(1 , "Grapes");    //Add new elements at index 1. It does not override it.
        System.out.println(fruitList.get(2));
        System.out.println(fruitList.size());
        fruitList.remove("Apple");                 //It removes the element Apples
        fruitList.set(2, "Orange");                   //Replace element in the index 2 with orange

        for( String a : fruitList){
            System.out.println(a);
        }
        if(fruitList.contains("Mango")){
            System.out.println("Its present");
        }
        else{
            System.out.println("Its not present");
        }
        if(fruitList.isEmpty()){
            System.out.println("Its empty");
        }
        else{
            System.out.println("Its not empty");
        }
        fruitList = new LinkedList<>();//Dynamic Polymorphism


    }
}
