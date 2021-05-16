package com.mycompany.collectiondemo.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemoOne {
    public static void main(String[] args){

        //It does not maintain teh order of teh insertion
        Map<Integer,String> mapOfEmployee = new HashMap<>();
        mapOfEmployee.put(111,"Krishna");  //This is one Map.Entry of <Integer,String>
        mapOfEmployee.put(555,"Pabitra");  //This is another Map.Entry
        mapOfEmployee.put(333,"Ranjan");
        mapOfEmployee.put(333,"Ranjan1");//Duplicate value is overriden
        mapOfEmployee.put(444,"Java");
        mapOfEmployee.put(null,null);
        mapOfEmployee.put(null,null);//If Key is same in two entry, then value of last entry overrides the whole entry of the map
        mapOfEmployee.put(null,"Ram"); //Null value can be put in the key as well as value
        mapOfEmployee.put(777,null);
        for(Map.Entry<Integer,String> m:mapOfEmployee.entrySet()){ //map.Entry is the interface. And <Integer.String> is generic
            System.out.println(m.getKey()+ " "+m.getValue());
            if(m.getValue()!= null && m.getValue().equals("Pabitra")){
                System.out.println("Found pabitra at Key "+m.getKey());
            }
        }
        System.out.println(mapOfEmployee.get(333));// If you pass the key it will give the value. This will print the value
        System.out.println(mapOfEmployee.size()); //Similarly there are other function like contains value, Key, remove
        //remove,replace,remove all etc
    }
}
