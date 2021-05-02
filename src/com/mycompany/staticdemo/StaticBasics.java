package com.mycompany.staticdemo;

public class StaticBasics {
    static int a = 10;
    static int b;
    int empid= 555;

    //Static block
    static{
        System.out.println("Static block initialized");
        b=a*4;
    }
    {
        System.out.println("I am a non static block");
    }
    public StaticBasics(){
        System.out.println("Default constructor called");
    }
    public void show(){
        //static members are allowed to be accessed inside a non static method
        System.out.println("Vale of a is: " +this.a);
        System.out.println("Vale of empid is: " +this.empid);
    }
    public static void display(){
    //public void display(){
        //System.out.println("Vale of a is: " +this.a);//object creation happens late first static block gets initialized
        System.out.println("Vale of a is: " +a);//object creation happens late first static block gets initialized
        //this cannot be used inside static context
        //System.out.println("Vale of empid is: " +this.empid);
       // System.out.println("Vale of empid is: " +this.empid);
        //System.out.println("Vale of empid is: " +empid);//nonstatic members cannot be refernced from static context
        System.out.println("Vale of a is: " +a);
    }

    public static void main(String[] args){
        System.out.println("From main");
        System.out.println("Value of a " +a);
        System.out.println("Value of a " +b);
        //creating an object of  StaticBasic class
        StaticBasics sb1 = new StaticBasics();
        sb1.a =99;//class level static variable a is modified, which means from now on we will see only the updated value of a
        sb1.empid =666;
        StaticBasics sb2 = new StaticBasics();
        System.out.println("value od sb1.a is "+sb1.a);
        System.out.println(StaticBasics.a);
        //System.out.println(StaticBasics.display());
        StaticBasics.display();//????????????????????
        System.out.println("value od sb1.empid is "+sb1.empid);


    }

}
