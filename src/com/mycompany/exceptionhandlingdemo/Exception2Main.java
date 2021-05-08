package com.mycompany.exceptionhandlingdemo;

public class Exception2Main extends Exception {
    Exception2Main(String e){
        super(e);
    }

}

class TestCustomException1{
    static void validate(int age) throws Exception2Main{
        if (age<18){
            Exception2Main ia = new Exception2Main("Not valid age");
            throw ia;
        }
        else
            System.out.println("Welcome to vote");
    }

    public static void main(String args[]){
        try{
            //validate(1);//If exception occur program will not go to else block in line 16 and it will directly go to catch statement
            validate(19);
        }
        catch (Exception2Main m){
            System.out.println("You are not allowed to vote" +m);//When this line is printed?
        }
        catch (Exception m){//Parent exception catch should always be at the last otherwise we will get the compilation error
            System.out.println("Exception Occurred" +m);
        }
        System.out.println("rest of the code");
    }
}