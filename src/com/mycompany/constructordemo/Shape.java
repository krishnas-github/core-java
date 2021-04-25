package com.mycompany.constructordemo;

public class Shape {
    int length;
    int breadth;
    String shapeType;
    //Default constructor gets called during the time of object creation and its job is to initialize the member
    //variable with default values of the data type eg: default value of int is 0 and for string is null

    public Shape(){//Default constructor is a special method as the name as class name. It can have parameter list,
        //it can also have return type but we generally don't specify return type
        System.out.println("Default constructor");
        System.out.println(length);//in the default constructor JVM initialises the default value of datatype
        System.out.println(breadth);
        System.out.println(shapeType);
    }

    public Shape(int length,String shapeType){
        this.length = length;// the length local function parameter is getting assigned to current object's length
        //property.The current object is being pointed by "this" keyword
        this.shapeType = shapeType;
        System.out.println("Two parameterized overloaded constructor ");
        System.out.println(this.length);
        System.out.println(this.shapeType);
        System.out.println(this.breadth);//Here JVM will initialize the breadth variable.
    }

    public Shape(int length,String shapeType, int breadth){
        this.length = length;// the length local function parameter is getting assigned to current object's length
        //property.The current object is being pointed by "this" keyword
        this.shapeType = shapeType;
        this.breadth = breadth;
        System.out.println("Three parameterized overloaded constructor ");
        System.out.println(this.length);
        System.out.println(this.shapeType);
        System.out.println(this.breadth);
        this.test();//Calls the current object's test method.
    }
    public void test(){
        System.out.println("I am test method");
    }

    class Xyz{
        int a = 8;
        public void testData(){

            System.out.println(a);
        }
    }

}
