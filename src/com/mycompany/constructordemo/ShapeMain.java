package com.mycompany.constructordemo;

public class ShapeMain {
    public static void main(String[] args){
        Shape s = new Shape();//default or zero parameter constructor.Here "this" keyword and "s" reference
        // points to same object where the object variables(length,breadth,shapeType) are initialized by default
        //values by JVM
        Shape s1 = new Shape(20,"Square");
        //Here "this" and "s1" are pointing to same object and JVM will initialise the object variable "breadth"
        //And we are initializing the length and shapeType variables.
        Shape s2 = new Shape(20,"Rectangle",30);//Example of static polymorphism because
        //decision is made at the compile time which overloaded constructor to call
        //Here this" and "s2" are pointing to same object and we are initializing all the object's variable

        Shape.Xyz xyz = s.new Xyz();
        xyz.testData();
    }
}
