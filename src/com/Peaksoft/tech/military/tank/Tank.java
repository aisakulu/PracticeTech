package com.Peaksoft.tech.military.tank;

import com.Peaksoft.tech.military.Military;

public class Tank extends Military {

    private String tankType;
//    private String tank

    public Tank() {

    }

    public Tank(String brand, double weight, double[] sizes, String useArea, String harmness, String tankType) {
        super(brand, weight, sizes, useArea, harmness);
        this.tankType = tankType;
    }

    public String getTankType() {
        return tankType;
    }

    public void setTankType(String tankType) {
        this.tankType = tankType;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "tankType='" + tankType + '\'' +
                "} " + super.toString();
    }
}
