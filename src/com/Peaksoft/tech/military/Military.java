package com.Peaksoft.tech.military;

import com.Peaksoft.tech.Tech;

public class Military extends Tech {

    private String useArea;
    private String harmness;

    public Military() {

    }

    public Military(String brand, double weight, double[] sizes, String useArea, String harmness) {
        super(brand, weight, sizes);
        this.useArea = useArea;
        this.harmness = harmness;
    }

    public String getUseArea() {
        return useArea;
    }

    public void setUseArea(String useArea) {
        this.useArea = useArea;
    }

    public String getHarmness() {
        return harmness;
    }

    public void setHarmness(String harmness) {
        this.harmness = harmness;
    }

    @Override
    public String toString() {
        return "Military{" +
                "useArea='" + useArea + '\'' +
                ", harmness='" + harmness + '\'' +
                '}';
    }
}
