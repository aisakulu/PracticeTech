package com.Peaksoft;

import com.Peaksoft.tech.vechiles.Vehicle;
import com.Peaksoft.tech.vechiles.car.Car;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota",1.5,
                new double[]{2.3,5.6},(byte)4,(byte)2,"Yellow","Winter");
        System.out.println(vehicle);

        Car car = new Car("BMW",1.3,new double[]{2.3,5.6},(byte)4,(byte)2,"Black","LeftSide",
                new String[]{"Universal"},new String[]{"Manual"},"Diesel");
        System.out.println(car);
    }
}
