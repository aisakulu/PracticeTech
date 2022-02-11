package com.Peaksoft.tech.vechiles.truck;

import com.Peaksoft.tech.vechiles.Vehicle;

public class Truck extends Vehicle {
    private String cartType;
    private String wheelSize;
    private String motorPower;

    public Truck() {

    }

    public Truck(String brand, double weight, double[] sizes, byte doorType, byte motorType, String color, String steeringType, String cartType, String wheelSize, String motorPower) {
        super(brand, weight, sizes, doorType, motorType, color, steeringType);
        this.cartType = cartType;
        this.wheelSize = wheelSize;
        this.motorPower = motorPower;
    }

    public String getCartType() {
        return cartType;
    }

    public void setCartType(String cartType) {
        this.cartType = cartType;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(String motorPower) {
        this.motorPower = motorPower;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cartType='" + cartType + '\'' +
                ", wheelSize='" + wheelSize + '\'' +
                ", motorPower='" + motorPower + '\'' +
                "} " + super.toString();
    }
}
