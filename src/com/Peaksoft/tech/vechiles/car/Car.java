package com.Peaksoft.tech.vechiles.car;

import com.Peaksoft.tech.vechiles.Vehicle;

import java.util.Arrays;

public class Car extends Vehicle {
    private String[] bodyType;
    private String[] karobka;
    private String fuelType;

    public Car() {

    }

    public Car(String brand, double weight, double[] sizes, byte doorType, byte motorType, String color, String steeringType, String[] bodyType, String[] karobka, String fuelType) {
        super(brand, weight, sizes, doorType, motorType, color, steeringType);
        this.bodyType = bodyType;
        this.karobka = karobka;
        this.fuelType = fuelType;
    }

    public String[] getBodyType() {
        return bodyType;
    }

    public void setBodyType(String[] bodyType) {
        this.bodyType = bodyType;
    }

    public String[] getKarobka() {
        return karobka;
    }

    public void setKarobka(String[] karobka) {
        this.karobka = karobka;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType=" + Arrays.toString(bodyType) +
                ", karobka=" + Arrays.toString(karobka) +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
