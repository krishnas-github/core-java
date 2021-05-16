package com.mycompany.day17handson;


import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int a[] = new int[size];
        sc.nextLine();
        for(int i=0;i<size;i++){
            //a[i] = new int();
            System.out.println("Enter the number at pos: "+(i+1));
            a[i]= sc.nextInt();
            sc.nextLine();
        }
        //System.out.println(a[2]);

        //To find the largest number
        int temp =0;
        for(int i=0;i<size-1;i++){
            if(a[i]>a[i+1]){
                if(a[i]>temp){
                    temp = a[i];
                }
            }
        }
        //If the largest number is present at last location
        if(a[size-1]>temp){
            temp=a[size-1];
        }
        //Storing the largest value
        for(int i =0;i<size;i++){
            if(a[i]==temp){
                a[i]=0;
            }
        }

// Making the largest number 0and finding the largest number again
        temp =0;
        for(int i=0;i<size-1;i++){
            if(a[i]>a[i+1]){
                if(a[i]>temp){
                    temp = a[i];
                }
            }
        }
        if(a[size-1]>temp){
            temp=a[size-1];
        }


        //System.out.println();



        /*for(int i=0;i<size-1;i++){
            for(int j =1;j<size;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                }
            }
        }*/
        /*for (int i=0;i<size;i++){
            if(a[i]==temp){
                i++;
            }
            for(int j =1;j<size;j++){
                if(a[j]==temp){
                    j++;
                }
                else if(a[i]>a[j]){
                    temp = a[i];
                }
            }
        }*/
        System.out.println("Second highest number in your int array is: " +temp);
    }
}
