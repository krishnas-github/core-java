package com.mycompany.collectiondemo.setdemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args){
        //Set does not maintain order of insertion
        Set<Integer> rolls1= new HashSet<>();        //Allows to add null values
        //TreeSet implements the sorted set interface
        Set<Integer> rolls = new TreeSet<>();     //TreeSet helps us to sort the set in teh ascending order
        //If we give null value then it will give NullPointer Exception at the runTime
        rolls.add(1);
        rolls.add(3);
        rolls.add(5);
        rolls.add(99);

       // rolls.add(null);      //TreeSet doesnot allow NULL value but hash set allow null values
        for(Integer r: rolls){
            System.out.println(r);
        }
        System.out.println(rolls.size());
        rolls.add(3);
        rolls.add(99);

        System.out.println(rolls.size());  //Size remains same as the duplicates are overridden
        rolls.remove(99);
        System.out.println(rolls.size());
        rolls.clear();                      //Clears the whole set
        System.out.println(rolls.size());
    }
}
