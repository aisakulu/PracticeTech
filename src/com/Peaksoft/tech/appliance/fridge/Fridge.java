package com.Peaksoft.tech.appliance.fridge;

import com.Peaksoft.tech.appliance.Appliance;

public class Fridge extends Appliance {

    private String doorCount;
    private boolean caryable;

    public Fridge(){

    }

    public Fridge(String brand, double weight, double[] sizes, int voltage, boolean useElectric, String doorCount, boolean caryable) {
        super(brand, weight, sizes, voltage, useElectric);
        this.doorCount = doorCount;
        this.caryable = caryable;
    }

    public String getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(String doorCount) {
        this.doorCount = doorCount;
    }

    public boolean isCaryable() {
        return caryable;
    }

    public void setCaryable(boolean caryable) {
        this.caryable = caryable;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "doorCount='" + doorCount + '\'' +
                ", caryable=" + caryable +
                "} " + super.toString();
    }
}
