package com.mycompany.polymorphismdemo;

public class Area {
    public double calculateArea(double radius){
        return(3.14*radius*radius);
    }
    public double calculateArea(double lenght, double width) {
        return (lenght * width);
    }
    public double calculateArea(double lenght, double width, String name) {
        return (lenght * width);
    }
    public double calculateArea(String name,double lenght, double width) {
        return (lenght * width);
    }
  /*  public double calculateArea(long length) {
        return (int)(length * length);
    }
    public double calculateArea(int length) {
        return (int)(length * length);
    }
    public double calculateArea(int length) {
        return (long)(length * length);
    }*/

    //Overload function can have same name and differ in number of parameter,,data typ of teh parameter
    //but if two function have same name and same parameter format and only differ in return type or sequence of parameter,
    // then they are not considered as overloaded function)

    public double calculateAreaOfRectangle(double lenght, double width){
        return(lenght*width);
    }
    public double calculateAreaOfSquare(long lenght) {
        return (lenght * lenght);
    }
}
