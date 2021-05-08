package com.mycompany.finaldemo;

public class FinalDemoMain {

    int count = 5;
    //count = 7; //Why this error? Static reference error should come

    public static void main(String[] args){
        final int count = 5;//Final variable value cannot be changed. Final keyword is used to create constant in java.
        //count = 7;

        FinalDemoMain f  = new FinalDemoMain();
        f.show();
        System.out.println(count);

        Fruit a = new Apple();
        a.display();
    }
    public int show(){
        count = 99;
        System.out.println(count);
        return count;
    }
}
