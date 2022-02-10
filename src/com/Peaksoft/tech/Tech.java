package com.Peaksoft.tech;

import java.util.Arrays;

public class Tech {
    private String brand;
    private double weight;
    private double[] sizes;

    public Tech() {

    }

    public Tech(String brand, double weight, double[] sizes) {
        this.brand = brand;
        this.weight = weight;
        this.sizes = sizes;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double[] getSizes() {
        return sizes;
    }

    public void setSizes(double[] sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", sizes=" + Arrays.toString(sizes) +
                '}';
    }
}
