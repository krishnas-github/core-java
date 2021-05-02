package com.mycompany.abstractassignment;

public class FourWheeler extends Vehicle{
    @Override
    public float CalculateMileage(String vehicleType) {
        float Mileage =0;
        if(vehicleType.equalsIgnoreCase("FourWheeler")){
            Mileage =(100/4);

        }
        return Mileage;
    }
}
