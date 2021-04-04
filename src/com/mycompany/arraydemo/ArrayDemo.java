package com.mycompany.arraydemo;

import sun.font.TrueTypeFont;

public class ArrayDemo {
    public static void main (String[] args){
        int arrayofAadhar[] = new int[5];
        System.out.println(arrayofAadhar[3]);
        arrayofAadhar[3]=624359;
        //displaying adhaar array using for loop
        for(int i=0;i<arrayofAadhar.length;i++){
            System.out.println(arrayofAadhar[i]);
        }
       /* for (int a:arrayofAadhar){//Advance for loop
            System.out.println(a);
        }*/
        boolean arrayempId[] = new boolean[5];
        System.out.println(arrayempId[3]);
        arrayempId[3]= true;
        arrayempId[8]= true;//Runtime exception ArrayIndexOutOfBoundsException will come as size was defined as 5
        //displaying emp array using for loop
        for(int i=0;i<arrayempId.length;i++){
            System.out.println(arrayempId[i]);
        }

    }
}
