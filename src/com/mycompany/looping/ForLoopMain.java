package com.mycompany.looping;

public class ForLoopMain {

    public static void main(String[] a){

        for(int i = 1; i<=10; i++){
            System.out.println(i);
            System.out.println("=====ODD/Even Numbers====");
            if(i%2 != 0){
                System.out.println("Odd number");
            }else{
                System.out.println("Even number");
            }
        }
    }
}
