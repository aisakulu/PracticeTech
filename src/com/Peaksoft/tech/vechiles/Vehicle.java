package com.Peaksoft.tech.vechiles;

import com.Peaksoft.tech.Tech;

public class Vehicle extends Tech {
    private byte doorType;
    private byte motorType;
    private String color;
    private String steeringType;

    public Vehicle() {
    }

    public Vehicle(String brand, double weight, double[] sizes, byte doorType, byte motorType, String color, String steeringType) {
        super(brand, weight, sizes);
        this.doorType = doorType;
        this.motorType = motorType;
        this.color = color;
        this.steeringType = steeringType;
    }

    public byte getDoorType() {
        return doorType;
    }

    public void setDoorType(byte doorType) {
        this.doorType = doorType;
    }

    public byte getMotorType() {
        return motorType;
    }

    public void setMotorType(byte motorType) {
        this.motorType = motorType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "doorType=" + doorType +
                ", motorType=" + motorType +
                ", color='" + color + '\'' +
                ", steeringType='" + steeringType + '\'' +
                "} " + super.toString();
    }
}
