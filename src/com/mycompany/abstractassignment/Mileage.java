package com.mycompany.abstractassignment;

public class Mileage {
    public static void main(String[] args) {
        FourWheeler fourwheeler = new FourWheeler();
        float mileageOfFourWheeler = fourwheeler.CalculateMileage("fourwheeler");
        TwoWheeler twowheeler = new TwoWheeler();
        float mileageOfTwoWheeler = twowheeler.CalculateMileage("twowheeler");
        System.out.println("Mileage of FourWheeler is: "+mileageOfFourWheeler);
        System.out.println("Mileage of TwoWheeler is:) "+mileageOfTwoWheeler);


    }
}
