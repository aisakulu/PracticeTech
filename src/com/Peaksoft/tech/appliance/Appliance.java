package com.Peaksoft.tech.appliance;

import com.Peaksoft.tech.Tech;

public class Appliance extends Tech {
    private int voltage;
    private boolean useElectric;

    public Appliance() {

    }

    public Appliance(String brand, double weight, double[] sizes, int voltage, boolean useElectric) {
        super(brand, weight, sizes);
        this.voltage = voltage;
        this.useElectric = useElectric;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public boolean isUseElectric() {
        return useElectric;
    }

    public void setUseElectric(boolean useElectric) {
        this.useElectric = useElectric;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "voltage=" + voltage +
                ", useElectric=" + useElectric +
                "} " + super.toString();
    }
}
