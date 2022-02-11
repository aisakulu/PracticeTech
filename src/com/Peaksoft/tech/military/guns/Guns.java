package com.Peaksoft.tech.military.guns;

import com.Peaksoft.tech.military.Military;

public class Guns extends Military {

    private int atackPerSecond;
    private double atackArea;
    private String soundLevel;

    public Guns() {

    }

    public Guns(String brand, double weight, double[] sizes, String useArea, String harmness, int atackPerSecond, double atackArea, String soundLevel) {
        super(brand, weight, sizes, useArea, harmness);
        this.atackPerSecond = atackPerSecond;
        this.atackArea = atackArea;
        this.soundLevel = soundLevel;
    }

    public int getAtackPerSecond() {
        return atackPerSecond;
    }

    public void setAtackPerSecond(int atackPerSecond) {
        this.atackPerSecond = atackPerSecond;
    }

    public double getAtackArea() {
        return atackArea;
    }

    public void setAtackArea(double atackArea) {
        this.atackArea = atackArea;
    }

    public String getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(String soundLevel) {
        this.soundLevel = soundLevel;
    }

    @Override
    public String toString() {
        return "Guns{" +
                "atackPerSecond=" + atackPerSecond +
                ", atackArea=" + atackArea +
                ", soundLevel='" + soundLevel + '\'' +
                "} " + super.toString();
    }
}
