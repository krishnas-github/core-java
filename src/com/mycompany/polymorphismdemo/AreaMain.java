package com.mycompany.polymorphismdemo;

public class AreaMain {
    public static void main (String[] args){
        Area aa = new Area();
        double area = aa.calculateArea(9.8);
        System.out.println("Area of circle is: " +area);
        System.out.println("Area of rectangle is: " +aa.calculateArea(25, 30));
        System.out.println("Area of rectangle is: " +aa.calculateArea("String1",25,24));
        System.out.println("Area of rectangle is: " +aa.calculateArea(25,24,"String2"));
        System.out.println("Area of square is: " +aa.calculateArea(25));
    }

}
