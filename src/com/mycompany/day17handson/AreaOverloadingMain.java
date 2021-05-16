package com.mycompany.day17handson;

import java.util.Scanner;

public class AreaOverloadingMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("Enter the length");
        int l = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the breadth");
        int b = sc.nextInt();
        sc.nextLine();
        int squareArea = a.calculateArea(l);
        int rectangleArea = a.calculateArea(l,b);
        System.out.println("Area of square is: "+squareArea+ " and Area of rectangle is: "+rectangleArea);

    }
}
