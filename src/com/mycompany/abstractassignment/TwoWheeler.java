package com.mycompany.abstractassignment;

public class TwoWheeler extends Vehicle{

    @Override
    public float CalculateMileage(String vehicleType) {
        float Mileage =0;
        if (vehicleType.equalsIgnoreCase("TwoWheeler")){
        Mileage = (100/2);
    }
    return Mileage;
    }
}
