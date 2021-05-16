package com.mycompany.day17handson;

import java.util.Random;

public class Shuffle {
    public static void main(String[] args){
        //Random rdm = new Random();
        int a[] = new int[5];
        for(int i = 0;i<5;i++){
            //a[i] = new int();
            a[i] = i+1;
        }
        for(int i =0;i<5;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("------------");

        for(int i =0;i<5;i++){
            Random rdm = new Random();
            int radom = rdm.nextInt(5);
           // a[i]=rdm;

            //System.out.println(rdm.setSeed(a[i]));
            System.out.print(a[radom]);
        }

    }
}


