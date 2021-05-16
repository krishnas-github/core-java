package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;

public class ListDemoOne {
    public static void main(String[] args){
        //List allows duplicate value
        //List maintain order of insertion.
        //This is a RAW list coz it allows us to add all different kind of datatype
        //ArrayList will automatically grow in size as we add mew element to it.

        ArrayList numberList = new ArrayList();
        numberList.add("YELLOW Ball");
        numberList.add("BLUE Ball");
        numberList.add("YELLOW Ball");
        numberList.add("PINK Ball");
        numberList.add("PURPLE Ball");
        numberList.add(88.975);
        numberList.add("BLUE Ball");
        numberList.add(2005);
        numberList.add(null); //List allow to add the null value

        for(int i =0;i<numberList.size();i++){
            System.out.println("COLOR BALLS: "+numberList.get(i));
        }
    }
}
