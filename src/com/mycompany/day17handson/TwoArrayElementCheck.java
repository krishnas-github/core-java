package com.mycompany.day17handson;

import java.util.Scanner;

public class TwoArrayElementCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int a = sc.nextInt();
        sc.nextLine();
        int ar1[] = new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the value at pos: "+(i+1));
            ar1[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter the size of Second array");
        int b = sc.nextInt();
        sc.nextLine();
        int ar2[] = new int[b];
        for(int i=0;i<b;i++){
            System.out.println("Enter the value at pos: "+(i+1));
            ar2[i]=sc.nextInt();
            sc.nextLine();
        }

        int m=0;
        for(int i=0;i<a;i++){
            int k=0;
            for(int j=0;j<b;j++){
                if(ar1[i]!=ar2[j]){
                    k++;
                    if(k==b){
                        m++;
                        break;
                    }
                }
            }
        }
        //System.out.println(m);
        for(int i=0;i<b;i++){
            int k=0;
            for(int j=0;j<a;j++){
                if(ar2[i]!=ar1[j]){
                    k++;
                    if(k==a){
                        m++;
                        break;
                    }
                }
            }
        }

        /*int k=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(ar1[i]!=ar2[j]){
                    k++;
                }
            }
        }
        System.out.println(k);

        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                if(ar2[i]!=ar1[j]){
                    k++;
                }
            }
        }*/
        //System.out.println(m);
        if(m>=1){
            System.out.println("Both the array does not contains same element");
        }
        else{
            System.out.println("Both the array contains same element");
        }



    }
}
