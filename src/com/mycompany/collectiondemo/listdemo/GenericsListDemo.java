package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;

public class GenericsListDemo {
    public static void main(String[] args){

        ArrayList<Integer> empIdList = new ArrayList<Integer>();
        ArrayList<String> nameList = new ArrayList<>();   //Why string is mot written in second part

        empIdList.add(123);
        //empIdList.add("Apple"); //Generic enforces Strict DataType Constraint on the List
        nameList.add("Amit");
        //nameList.add(123);    //Generic enforces Strict DataType Constraint on the List

    }
}
