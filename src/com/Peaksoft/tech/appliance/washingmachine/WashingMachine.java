package com.Peaksoft.tech.appliance.washingmachine;

import com.Peaksoft.tech.appliance.Appliance;

public class WashingMachine extends Appliance {

    private int capacity;
    private double speed;

    public WashingMachine() {

    }

    public WashingMachine(String brand, double weight, double[] sizes, int voltage, boolean useElectric, int capacity, double speed) {
        super(brand, weight, sizes, voltage, useElectric);
        this.capacity = capacity;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "capacity=" + capacity +
                ", speed=" + speed +
                '}';
    }
}
